package com.sys.controller;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sys.entity.Member;
import com.sys.entity.Photo;
import com.sys.service.MemberService;
import com.sys.service.PhotoService;
import com.sys.util.Page;
@RequestMapping("/member")
@Controller
public class MemberController{

	@Autowired
	private MemberService memberService;
	@Autowired
	private PhotoService photoService;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/admin/list.do")
	public String show(Model model){
		List<Member> members = memberService.showMember();
		for(Member m:members){
			System.out.println(m.getName());
		}
		model.addAttribute("members", members);
		return "/admin/list_member";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_member";
	}
	
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Member member,Model model){
//		System.out.println("123");
//		System.out.println(member.getImgUrl());
//		System.out.println(member.getInfo());
//		System.out.println(member.getName());
//		System.out.println(member.getPosition());
		int i = memberService.insertMember(member);
		model.addAttribute("url", "/member/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	@RequestMapping("/admin/uploadPic")  
	@ResponseBody  
	public String uploadPic(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {  
	    String path = request.getSession().getServletContext().getRealPath("/upload/");
	    System.out.println(path);
	    String fileName = file.getOriginalFilename();
	    System.out.println(fileName);
	    String prefix=fileName.substring(fileName.lastIndexOf("."));
	    String fileNameStr = (new Date().getTime())+prefix; 
	    System.out.println(fileNameStr);
	    File targetFile = new File(path, fileNameStr);  
	    if(!targetFile.exists()){  
	    	targetFile.mkdirs();  
	    } 
	    if(fileName.contains(".mp4")||fileName.contains(".wmv")||fileName.contains(".3gp")
	    		||fileName.contains(".mov")||fileName.contains(".avi")||fileName.contains(".flv")){
	    	try {  
	    		file.transferTo(targetFile);  
	    	} catch (Exception e) {  
	    		e.printStackTrace();  
	    	}  
	    	 System.out.println("视频文件");
	    	 String webroot = request.getSession().getServletContext().getRealPath("/tool");
	    	 System.out.println(webroot+"/ffmpeg.exe");
	    	 File f = new File(webroot+"/ffmpeg.exe");
	    	String url =new Date().getTime()+".jpg";
	    	String vurl = path+fileNameStr;
	    	List<String> cmd = new java.util.ArrayList<String>();
	    	cmd.add(webroot+"/ffmpeg.exe");
	    	cmd.add("-i");
	    	cmd.add(vurl);
	    	cmd.add("-y");
	    	cmd.add("-f");
	    	cmd.add("image2");
	    	cmd.add("-ss");
	    	cmd.add("8");
	    	cmd.add("-t");
	    	cmd.add("0.001");
	    	cmd.add("-s");
	    	cmd.add("350*240");
	    	cmd.add(path+url);
	    	System.out.println(path+fileNameStr);
	    	System.out.println(path+new Date().getTime()+".jpg");
	    	try{
	    		ProcessBuilder builder = new ProcessBuilder();
	    		builder.command(cmd);
	    		builder.redirectErrorStream(true);
	    		System.out.println("截图开始");
	    		Process process = builder.start();
	    		InputStream inputStream = process.getInputStream();
	    		byte[] re = new byte[1024];
	    		
	    		System.out.println("正在进行截图");
	    		while(inputStream.read(re)!=-1){
	    			System.out.println(".");
	    		}
	    		System.out.println("");
	    		inputStream.close();
	    		System.out.println("截图完成");
 	    	}catch (Exception e) {
				// TODO: handle exception
 	    		System.out.println("截图失败");
			}
//	    	String a = "{url:"+url+",vurl:"+fileNameStr+"}";
	    	String a =url+","+fileNameStr;
	    	return a;
	    }else{
	    	try {  
	    		file.transferTo(targetFile);  
	    	} catch (Exception e) {  
	    		e.printStackTrace();  
	    	}  
	    	 return fileNameStr;
	    }
//	    System.out.println(targetFile.getPath());
//	    FileOutputStream fs=new FileOutputStream(path + "/"+ fileName);
//	    System.out.println(file.getSize());
//	    InputStream inputStream = file.getInputStream();
//	    byte[] buffer =new byte[1024*1024];
//        int bytesum = 0;
//        int byteread = 0; 
//        while ((byteread=inputStream.read(buffer))!=-1)
//        {
//           bytesum+=byteread;
//           fs.write(buffer,0,byteread);
//           fs.flush();
//        } 
//        fs.close();
//        inputStream.close();
	    
         
	    //保存  
//	    try {  
//	        file.transferTo(targetFile);  
//	    } catch (Exception e) {  
//	        e.printStackTrace();  
//	    }  
	     
	}  
	
	@RequestMapping("/admin/{id}/show")
	public String show(@PathVariable Integer id,Model model){
		Member member = memberService.getById(id);
		model.addAttribute("member", member);
		return "/admin/show_member";
		
	}
	
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		Member member = memberService.getById(id);
		String oldfile = path+member.getImgUrl();
		File oldFile = new File(oldfile);
		if(oldFile.exists()&&oldFile.isFile()){
			oldFile.delete();
		}
		int i = memberService.deleteById(id);
		model.addAttribute("url", "/member/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
		
	}
	
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Member member = memberService.getById(id);
		model.addAttribute("member", member);
		return "/admin/update_member";
	}
	
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Member member,Model model,String oldImage){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(member.getImgUrl())){
			String oldfile = path+oldImage;
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
		}
		int i = memberService.updateMember(member);
		model.addAttribute("url", "/member/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Model model,Integer searchSort,String keywords){
		Page page = new Page(5, pageNo);
		List<Member> members = memberService.getByPage(page,searchSort,keywords);
		model.addAttribute("searchSort", searchSort);
		model.addAttribute("keywords", keywords);
		model.addAttribute("members", members);
		model.addAttribute("page", page);
	    return "/admin/list_member";
		
	}
	
	@RequestMapping("/admin/dels.do")
	public String dels(String ids,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		String[] dels = ids.split(",");
		System.out.println("==="+dels.length);
		List<Integer> betchdel = new ArrayList<Integer>();
		for(int i = 0; i < dels.length;i++){
			betchdel.add( Integer.parseInt(dels[i]));
		}
		for(int i = 0;i<betchdel.size();i++){
			Member member = memberService.getById(betchdel.get(i));
			String oldfile = path+member.getImgUrl();
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
		}
		int i = memberService.delBatch(betchdel);
		model.addAttribute("url", "/member/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	@RequestMapping("/people.do")
	public String people(Model model){
		List<Member> members_1 = memberService.getByPo(1);
		List<Member> members_2 = memberService.getByPo(2);
		List<Member> members_3 = memberService.getByPo(3);
		List<Member> members_4 = memberService.getByPo(4);
		List<Member> members_5 = memberService.getByPo(5);
		List<Member> members_6 = memberService.getByPo(6);
		List<String> list = photoService.countByYear();
		List<List<Photo>> list2 = new ArrayList<List<Photo>>();
 		for(int i = 0;i<list.size();i++){
			List<Photo> phtotos = photoService.getPhtotos(list.get(i), 1);
			list2.add(phtotos);
		}
		List<Photo> lab = photoService.getPhtotos(null, 0);
		model.addAttribute("list", list);
		model.addAttribute("members1", members_1);
		model.addAttribute("members2", members_2);
		model.addAttribute("members3", members_3);
		model.addAttribute("members4", members_4);
		model.addAttribute("members5", members_5);
		model.addAttribute("members6", members_6);
		model.addAttribute("lab", lab);
		model.addAttribute("list2", list2);
		return "/front/people";
	}
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		
		List<Member> members_1 = memberService.getByPo(1);
		List<Member> members_2 = memberService.getByPo(2);
		List<Member> members_3 = memberService.getByPo(3);
		List<Member> members_4 = memberService.getByPo(4);
		List<Member> members_5 = memberService.getByPo(5);
		List<Member> members_6 = memberService.getByPo(6);
		model.addAttribute("members1", members_1);
		model.addAttribute("members2", members_2);
		model.addAttribute("members3", members_3);
		model.addAttribute("members4", members_4);
		model.addAttribute("members5", members_5);
		model.addAttribute("members6", members_6);
		
		
		Member member = memberService.getById(id);
		model.addAttribute("member", member);
		return "/front/peopleDetail";
	}
	
}
