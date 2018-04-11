<%--
  Created by IntelliJ IDEA.
  User: JiaQi
  Date: 2018/4/11
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/sapar.css"/>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/sapar.js"></script>
    <title>首页表格</title>
</head>

<body>

<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>
                位置:
                <a href="#">首页&nbsp;</a>>&nbsp;新增条目

            </h2>
        </div>
        <div class="subfiled-content">
            <form class="saper-form" action="Standard_addStandard" method="post">

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input name="uuid" type="text" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input name="cl" type="text" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input name="fnl" type="text" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input name="hal" type="text" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="kntl" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="shsl" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="jgwa" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="jlzs" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="dcjq" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="hg" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="pb" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="gyhz" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="hfxyjd" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="xt" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="sz" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="zqw" placeholder="XX信息">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="zz" placeholder="XX信息">
                    </div>
                    <label>XX信息：</label>
                    <div class="kv-item-content">
                        <input type="text" name="jhl" placeholder="XX信息">
                    </div>
                </div>
                <div style="margin-left: 515px">
                    <div class="buttons">
                        <input type="submit" class="sapar-btn sapar-btn-recom">确定</input>
                    </div>
                    <div class="buttons">
                        <a href="#" class="sapar-btn sapar-btn-recom">取消</a>
                    </div>
                </div>

            </form>
        </div>
    </div>
    <!--<div id="saper-ft"></div>-->
</div>

</body>

<script type="text/javascript">
    $('#pagin').pagination(100, {
        callback: function (page) {
            alert(page);
        },
        display_msg: true,
        setPageNo: true
    });

</script>
</html>
