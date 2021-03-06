<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=path%>" />
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="Css/style.css" />
<script type="text/javascript" src="Js/jquery.js"></script>
<script type="text/javascript" src="Js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="Js/jquery.sorted.js"></script>
<script type="text/javascript" src="Js/bootstrap.js"></script>
<script type="text/javascript" src="Js/ckform.js"></script>
<script type="text/javascript" src="Js/common.js"></script>



<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
<script type="text/javascript">
	$(function() {
		$('#newNav').click(function() {
			window.location.href = "addUser.html";
		});
	});

	function checkall() {
		var alls = document.getElementsByName("check");
		var ch = document.getElementById("checkall");
		if (ch.checked) {
			for (var i = 0; i < alls.length; i++) {
				alls[i].checked = true;
			}
		} else {
			for (var i = 0; i < alls.length; i++) {
				alls[i].checked = false;
			}
		}
	}
	function delAll() {
		var alls = document.getElementsByName("check");
		var ids = new Array();
		for (var i = 0; i < alls.length; i++) {
			if (alls[i].checked) {
				ids.push(alls[i].value);
			}
		}
		if (ids.length > 0) {
			if (confirm("确认删除?")) {
				alert("删除成功!");
			}
		} else {
			alert("请选中要删除的项");
		}
	}
</script>
</head>
<body>
	<form class="form-inline definewidth m20" action="user/vague"
		method="get">
		用户账号： <input type="text" name="userName" id="username"
			class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th width="5%"><input type="checkbox" id="checkall"
					onChange="checkall();"></th>
				<th>用户账户</th>
				<th>真实姓名</th>
				<th>角色</th>
				<th width="10%">操作</th>
			</tr>
		</thead>
		<c:forEach items="${projectList.list }" var="p" varStatus="status">
			<tr>
				<td style="vertical-align: middle;"><input type="checkbox"
					name="check" value="1"></td>
				<td>${p.userName }</td>
				<td>${p.realName }</td>
				<td>${p.roles[0].roleName }</td>
				<td><a href="user/toEditPage?name=${p.userName }&pageNum=${projectList.pageNum}">编辑</a>&nbsp;&nbsp;&nbsp;
				<a href="javascript:void()"	onclick="del(${p.id})">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<table class="table table-bordered table-hover definewidth m10">
		<tr>
			<th colspan="5">
				<div class="inline pull-right page">
					${count }条记录 ${projectList.pageNum }/${projectList.pages } 页
					<c:if test="${projectList.isFirstPage }">
						<a href="javascript:void()" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
						</a>
					</c:if>
					<c:if test="${!projectList.isFirstPage }">
						<a href='user/forward?pageNum=${projectList.pageNum - 1 }'>&laquo;</a>
					</c:if>
					<c:forEach items="${projectList.navigatepageNums }" var="n">
						<!-- 判断是否是当前页,是导航页就是选中状态 -->
						<c:if test="${n==projectList.pageNum }">
							<a class="product-ym_bg" href="user/forward?pageNum=${n }">${n }</a>
						</c:if>
						<!-- 判断是否是当前页,是导航页就是非选中状态 -->
						<c:if test="${n!=projectList.pageNum}">
							<a class="product-ym_bg" href="user/forward?pageNum=${n }">${n }</a>
						</c:if>
					</c:forEach>
					<c:if test="${projectList.isLastPage }">

						<a href="javascript:void()" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
						</a>

					</c:if>
					<!-- 判断是否是最后一页,是就不能点击 -->
					<c:if test="${!projectList.isLastPage }">

						<a class="product-ym_xyy"
							href="user/forward?pageNum=${projectList.pageNum + 1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a>

					</c:if>
				</div>

				<div>
					<button type="button" class="btn btn-success" onclick="addUser()">添加用户</button>
					&nbsp;&nbsp;&nbsp;
					<button type="button" class="btn btn-success" id="delPro"
						onClick="delAll();">删除选中</button>
				</div>
			</th>
		</tr>
	</table>
	
<script type="text/javascript">
/* 物理删除用户 */
	function del(id) {

		var truthBeTold = window.confirm("单击“确定”继续。单击“取消”停止。")
		if (truthBeTold) {
			 window.location.href="user/del?id="+id 
			/* window.location.href="error.jsp" */
		} else
		window.alert("再见啦！");
		
	}
	/* 添加用户页面跳转到添加页面 */
	function addUser() {
		window.location.href="user/toAdd"
	}
</script>
</body>
</html>
