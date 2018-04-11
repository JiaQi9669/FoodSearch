<%--
  Created by IntelliJ IDEA.
  User: JiaQi
  Date: 2018/4/10
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/login.css" />
    <title>移动办公自动化系统</title>
</head>
<body>
<div id="container">
    <div id="bd">
        <div class="login">
            <div class="login-top"><h1 class="logo"></h1></div>

                <form action="User_login" method="post">
                    <div class="login-input">
                        <p class="user ue-clear">
                            <label>用户名</label>
                            <input type="text" name="userName"/>
                        </p>
                        <p class="password ue-clear">
                            <label>密&nbsp;&nbsp;&nbsp;码</label>
                            <input type="password" name="password"/>
                        </p>
                    </div>
                    <div class="login-btn ue-clear">
                        <input type="submit" class="btn" value="登陆">
                    </div>
                </form>
        </div>
    </div>
</div>
<div id="ft">CopyRight&nbsp;2018&nbsp;&nbsp;版权所有&nbsp;&nbsp;zzuli&nbsp;&nbsp;豫ICP备12345678号</div>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
    var height = $(window).height();
    $("#container").height(height);
    $("#bd").css("padding-top",height/2 - $("#bd").height()/2);

    $(window).resize(function(){
        var height = $(window).height();
        $("#bd").css("padding-top",$(window).height()/2 - $("#bd").height()/2);
        $("#container").height(height);

    });

    $('#remember').focus(function(){
        $(this).blur();
    });

    $('#remember').click(function(e) {
        checkRemember($(this));
    });

    function checkRemember($this){
        if(!-[1,]){
            if($this.prop("checked")){
                $this.parent().addClass('checked');
            }else{
                $this.parent().removeClass('checked');
            }
        }
    }
</script>
</html>