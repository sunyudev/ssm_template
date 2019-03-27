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
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>

 

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
				window.location.href="index.html";
		 });
    });
</script>
</head>
<body>
<form action="permission/addPerission" method="post" class="definewidth m20">
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">资源名称</td>
            <td><input type="text" onblur="repetition()" id="input1" name="resourceName" /><span style="color: red;" id="spanid"></span></td>
        </tr>
        <tr>
            <td class="tableleft">url</td>
            <td><input type="text" name="resourceUrl"/></td>
        </tr>
        <tr>
            <td class="tableleft">是否有效</td>
            <td>
                <input type="radio" name="status" value="1" checked/> 有效
              <input type="radio" name="status" value="0" /> 无效
            </td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button  class="btn btn-primary" type="button">添加</button>&nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
            </td>
        </tr>
    </table>
</form>

<script type="text/javascript">
//添加权限时失去焦点事件判断权限名是否重复 
function repetition() {  	 
    	 var input1 = $("#input1").val()
    	 alert(1)
    	 alert(input1)
    	    $.ajax({
 			type : 'POST',
 			url : 'permission/repetition',
     		async : true,
 			data : {
 				'resourceName':input1
 			},
 			dataType : 'json',
 			success : function(data) {
 				//alert("预览界面")
				/* if (data.data == 1) {
					//$("#spanid").html("用户名重复")
				}else if (data.data == 0) {
					//$("#spanid").html("")
				} */
 				
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
		alert("ajax")
		$("#spanid").html("")
		 $.ajax({
			type : 'POST',
			url : 'permission/addPermission',
   		async : true,
			data : $("#formed").serialize(),
			dataType : 'json',
			success : function(data) {
				//alert("预览界面")
				if (data.code ==200) {
					window.location.href="permission/forward";
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