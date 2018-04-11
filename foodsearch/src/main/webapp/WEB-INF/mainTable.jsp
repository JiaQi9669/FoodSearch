<%--
  Created by IntelliJ IDEA.
  User: JiaQi
  Date: 2018/4/11
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

                位置:首页
                <!--<a href="#">&nbsp;</a>>&nbsp;新增条目-->
            </h2>
        </div>
        <div class="subfiled-content">
            <form class="saper-form" action="Standard_findStandard" method="post">
                <div class="kv-item clearfix">
                    <!--<label>名称：</label>-->
                    &nbsp;
                    <div class="kv-item-content" style="margin-left: 20px">
                        <input type="text" name="uuid" placeholder="">

                    </div>
                    <input type="submit" style="margin-left: 20px" class="sapar-btn sapar-btn-recom query-btn">查询</input>

                </div>

            </form>
                <!--表格开始-->
                <div class="table">
                    <!--表格具体内容-->
                    <div class="table-box">
                        <table>
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>序列号</th>
                                    <th style="width: 120px">更多</th>
                                </tr>
                            </thead>
                            <tbody>
                                <s:iterator value="pageBean.recordList" status="indexs">
                                    <tr>
                                        <td>${indexs.index+1}</td>
                                        <td>${uuid}</td>
                                        <td><a href="#">详情</a>
                                            &nbsp;&nbsp;<a href="Standard_delById?id=${id}">删除</a></td>
                                    </tr>
                                </s:iterator>
                            </tbody>
                        </table>
                    </div>
                </div><!--表格结束-->
            <!--<div style="margin-right: 20px;float: right">-->
            <div class="row_right">

                <div>
                    <span>共<span><s:property value="pageBean.pageCount" /></span>页，<span>
				 <s:property value="pageBean.recordCount" /></span>条记录， 当前显示第<span>
					<s:if test="pageBean.currentPage == 0">
                        1
                    </s:if>
					<s:else>
                        <s:property value="pageBean.currentPage" />
                    </s:else>
					</span>页</span>
                </div>
                <ul class="pagination pull-right">
                    <!-- 首页键 -->
                    <li>
                        <s:if test="pageBean.pageCount <= 1">
                            <a aria-label="Previous">
                                <span aria-hidden="true">首页</span>
                            </a>
                        </s:if>
                        <s:else>
                            <a href="admin_teacherList?pageNum=1" aria-label="Previous">
                                <span aria-hidden="true">首页</span>
                            </a>
                        </s:else>
                    </li>
                    <!-- 上页键 -->
                    <li>
                        <s:if test="pageBean.currentPage-1 > 0">
                            <a href="admin_teacherList?pageNum=${pageBean.currentPage-1 }" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </s:if>
                        <s:else>
                            <a aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </s:else>
                    </li>
                    <!-- 分页键 -->
                    <s:iterator begin="pageBean.beginPageIndex" end="pageBean.endPageIndex" var="pageNums">
                        <c:if test="${pageBean.currentPage == pageNums }">
                            <li><a>${pageNums }</a></li>
                        </c:if>
                        <c:if test="${pageBean.currentPage != pageNums }">
                            <li><a href="admin_teacherList?pageNum=${pageNums }">${pageNums }</a></li>
                        </c:if>
                    </s:iterator>
                    <!-- 下页键 -->
                    <li>
                        <s:if test="pageBean.currentPage+1 <= pageBean.pageCount">
                            <a href="admin_teacherList?pageNum=${pageBean.currentPage+1 }" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </s:if>
                        <s:else>
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </s:else>
                    </li>
                    <!-- 尾页键 -->
                    <li>
                        <s:if test="pageBean.pageCount <= 1">
                            <a aria-label="Previous">
                                <span aria-hidden="true">尾页</span>
                            </a>
                        </s:if>
                        <s:else>
                            <a href="admin_teacherList?pageNum=${pageBean.pageCount }" aria-label="Previous">
                                <span aria-hidden="true">尾页</span>
                            </a>
                        </s:else>
                    </li>
                </ul>

                <%--<ul class="pagination" style="float:right; max-height: 26px;min-width: 260px">
                    <!--TODO 让标签横向排列-->
                    <li class="disabled" style="display: inline;"><a href="#">&laquo;</a></li>
                    <li class="active" style="display: inline;"><a href="#">1</a></li>
                    <li><a href="#" style="display: inline;">2</a></li>
                    <li><a href="#" style="display: inline;">3</a></li>
                    <li><a href="#" style="display: inline;">4</a></li>
                    <li><a href="#" style="display: inline;">5</a></li>
                    <li><a href="#" style="display: inline;">&raquo;</a></li>
                </ul>
                --%><!--</div>-->
            </div>


        </div>
    </div>
    <div id="saper-ft"></div>
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
