<%--
  Created by IntelliJ IDEA.
  User: JiaQi
  Date: 2018/4/11
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/sapar.css"/>
    <link rel="stylesheet" href="css/index_inner.css"/>

    <title>系统</title>
</head>

<body>
<div id="container">
    <div id="bd">
        <div class="wrap clearfix">
            <div class="sidebar">
                <h2 class="sidebar-header"><p>功能导航</p></h2>
                <ul class="nav">
                    <li class="office current">
                        <div class="nav-header">
                            <a href="javascript:;" data-src="User_toMainTable" class="clearfix">
                                <span>系统首页</span><i class="icon"></i>
                            </a>
                        </div>
                    </li>
                    <li class="gongwen">
                        <div class="nav-header">
                            <a href="javascript:;" data-src="Standard_toAddStandard" class="clearfix">
                                <span>添加信息</span>
                                <i class="icon"></i>
                            </a>
                        </div>
                    </li>

                    <li class="konwledge">
                        <div class="nav-header">
                            <a href="javascript:;" data-src="main_table_detailed.html" class="clearfix">
                                <span>详细信息</span>
                                <i class="icon"></i>
                            </a>
                        </div>
                    </li>

                </ul>
            </div>
            <div class="content">
                <iframe src="User_toMainTable" id="iframe" width="100%" height="100%" frameborder="0"></iframe>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/sapar.js"></script>
<script type="text/javascript" src="js/index_inner.js"></script>

</html>
