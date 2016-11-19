<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>实验室后台管理</title>
    <link href="<%=request.getContextPath()%>/css/admin_login.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="admin_login_wrap">
    <h1>后台管理</h1>
    <div class="adming_login_border">
        <div class="admin_input">
            <form action="<%=request.getContextPath() %>/admin/login.do" method="post">
                <ul class="admin_items">
                    <li>
                        <label for="user">用户名：</label>
                        <input type="text" name="uName" value="" id="uName" size="40" class="admin_input_style" />
                    </li>
                    <li>
                        <label for="pwd">密码：</label>
                        <input type="password" name="uPassword" value="" id="uPassword" size="40" class="admin_input_style" />
                    </li>
                    <li>
                    	<label><font color="red">${msg}</font></label>
                    </li>
                    <li>
                    	<label><input type="radio" name="uVersion" value="ZN">中文版管理</label>
                    	<label><input type="radio"  name="uVersion" value="US">英文版管理</label>
                    </li>
                    <li>
                        <input type="submit" tabindex="3" value="提交" class="btn btn-primary" />
                    </li>
                </ul>
            </form>
        </div>
    </div>
    <p class="admin_copyright"><a tabindex="5" href="<%=request.getContextPath() %>/index.do" target="_blank">返回首页</a></p>
    <!--  &copy; 2016 Powered by <a href="http://www.mycodes.net/" target="_blank">源码之家</a> -->
</div>
</body>
</html>