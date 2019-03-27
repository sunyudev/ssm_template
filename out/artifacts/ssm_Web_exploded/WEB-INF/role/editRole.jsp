


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
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="Js/jquery.js"></script>
    <!-- <script type="text/javascript" src="Js/jquery-1.42.min.js"></script> -->
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
</head>
<body>
<form  class="definewidth m20" >
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">角色名称</td>

        <td><input hidden="hidden" id="roleId" value="${role.id }"><input id="roleName" type="text" name="roleName" value="${role.roleName }"/></td>
    </tr>
    <tr>
        <td class="tableleft">状态</td>
        <td>
            <input type="radio" id="statu1" name="statu" value="1" ${role.statuss == 1? 'checked':'' } /> 启用
           <input type="radio" id="statu2" name="statu" value="0"  ${role.statuss == 0? 'checked':'' }/> 禁用
        </td>
    </tr>
    <tr>
        <td class="tableleft">权限</td>
        <td>
        	<c:forEach items="${permissionList }" var="p" varStatus="status">
	        	<ul><label class='checkbox inline'><input id="input${status.count }" type='checkbox'  name='group[]' value='${p.id }'/>${p.resourceName }</label></ul>            	            
			</c:forEach>
		</td>
    </tr>
    <tr>
        <td class="tableleft"></td>
        <td>
            <button  class="btn btn-primary" type="button" onclick="update()">更新</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
        </td>
    </tr>
</table>
</form>

     <script>
     
    $(function () {
        $(':checkbox[name="group[]"]').click(function () {
            $(':checkbox', $(this).closest('li')).prop('checked', this.checked);
        });

		$('#backid').click(function(){
				window.location.href="roles/forward.do                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
		 });

    });
    
    
      var pids = "${pids }"
      //将字符串通过,分开
      var  idList = pids.split(",")
    $(function( ) {	
    	 for(var i=0;i<idList.length;i++){

    	   if (idList[i] == 1) {
    		   $("#input1").prop("checked",true)
			 }
    	   if (idList[i] == 2) {
    		   $("#input2").prop("checked",true)
			}
    	   if (idList[i] == 3) {
    		   $("#input3").prop("checked",true)
			}
    	   if (idList[i] == 4) {
    		   $("#input4").prop("checked",true)
			}
    	   if (idList[i] == 5) {
    		   $("#input5").prop("checked",true)
			}
    	   if (idList[i] == 6) {
    		   $("#input6").prop("checked",true)
			}
    	   if (idList[i] == 7) {
    		   $("#input7").prop("checked",true)
			}
    	   if (idList[i] == 8) {
    		   $("#input8").prop("checked",true)
			}
    	   if (idList[i] == 9) {
    		   $("#input9").prop("checked",true)
			}
    	   if (idList[i] == 10) {
    		   $("#input10").prop("checked",true)
			}
    	   if (idList[i] == 11) {
    		   $("#input11").prop("checked",true)
			}
    	   if (idList[i] == 12) {
    		   $("#input12").prop("checked",true)
			}
    	   if (idList[i] == 13) {
    		   $("#input13").prop("checked",true)
			}
    	   
    	}   
	}) 
    
	function update() {
    	  var status = ""
    	  if ($("#statu1").prop("checked") == true) {
    		  status =  $("#statu1").val()
		}else {
			status =  $("#statu2").val()
		}
    	  
    	 
    	var idsStr = ""; 
    	var roleId = $("#roleId").val() 
    	var roleName = $("#roleName").val() 
		var  len = document.getElementsByName("group[]");


		for (var i = 1; i <= len.length; i++) {
			
			if ($("#input"+i).prop("checked") == true) {
	            idsStr += i +","
			}
		}
	

		    
	
		 $.ajax({
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            url: "roles/updatePermiddion" ,//url
            data: {

            	"idsStr": idsStr,
        		"roleName" : roleName,
        		"status" : status,
        		"roleId" : roleId
            },
            success: function (data) {
            	window.location.href="roles/roleIndex";
            },
            error : function() {
                alert("异常！");
            }
        });
	
		 
	}
	
</script>


                                                                                       
</body>
</html>
