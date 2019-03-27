<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="Js/jquery.js"></script>
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

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        } 


    </style> 
    <script>
        $(function () {
            $('#backid').click(function(){
                window.location.href="user/forward.do?pageNum="+${pageNum};
            });
        });
</script>
</head>
<body>
<form enctype="multipart/form-data" id="formed" class="definewidth m20">

    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">登录名</td>
            <td><input name="userName"  type="text" onblur="repetition()" id="userName"/><span style="color: red;" id="spanid"></span></td>
        </tr>
        <tr>
            <td class="tableleft">密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td class="tableleft">真实姓名</td>
            <td><input type="text" name="realName"/></td>
        </tr>
        <tr>
            <td class="tableleft">邮箱</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td class="tableleft">状态</td>
            <td>
                <input type="radio" name="status" value="1" checked/> 启用
              <input type="radio" name="status" value="0" /> 禁用
            </td>
        </tr>
        <tr>
            <td class="tableleft">角色</td>
            <td>
            	<select name="roleId">
        			<option value="">--请选择--</option>
        			<c:forEach items="${roleList.list }" var="r" varStatus="status">
        				<option value="${r.id }">${r.roleName }</option>
       				</c:forEach>
       			 </select>
        	</td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="button" class="btn btn-primary" onclick="addUser()">添加</button>&nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript">
/* 添加用户是失去焦点事件判断用户名是否重复 */
     function repetition() {  	 
    	 var userName = $("#userName").val()
    	 alert(userName)
    	    $.ajax({
 			type : 'POST',
 			url : 'user/repetition.do',
     		async : true,
 			data : {
 				'userName':userName
 			},
 			dataType : 'json',
 			success : function(data) {
 				//alert("预览界面")
				if (data.data == 1) {
					$("#spanid").html("用户名重复")
				}else if (data.data == 0) {
					$("#spanid").html("")
				}
 				
 			},
 			error : function(msg) {
 				alert("页面加载失败--")
 			}
 		});  
	}	
     
    /*  添加用户 */
     function addUser() {   	
    	 var spanStr = document.getElementById("spanid").innerText;
    	  if (spanStr == "用户名重复") {  		  
    		 $("#spanid").html("用户名重复")
		  }else {
			$("#spanid").html("")
			 $.ajax({
				type : 'POST',
				url : 'user/addUser.do',
	    		async : true,
				data : $("#formed").serialize(),
				dataType : 'json',
				success : function(data) {
					//alert("预览界面")
					if (data.code==1) {
						window.location.href="user/forward.do";
					}
				},
				error : function(msg) {
					alert("页面加载失败")
				}
			});
		}
	}
</script>                                                                                       
</body>
</html>