<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath() + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=path%>" />
<title>xx市第二人民医院信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="header">

		<div class="dl-title">
			<!--<img src="/chinapost/Public/assets/img/top.png">-->
		</div>

		<div class="dl-log">
			欢迎您，<span class="dl-log-user">${user.realName }</span> <a
				href="/chinapost/index.php?m=Public&a=logout" title="退出系统"
				class="dl-log-quit">[退出]</a>
		</div>
	</div>
	<div class="content">
		<div class="dl-main-nav">
			<div class="dl-inform">
				<div class="dl-inform-title">
					<s class="dl-inform-icon dl-up"></s>
				</div>
			</div>
			<ul id="J_Nav" class="nav-list ks-clear">
				<li class="nav-item dl-selected"><div
						class="nav-item-inner nav-home">医院管理系统</div></li>

			</ul>
		</div>
		<ul id="J_NavContent" class="dl-tab-conten">
		</ul>
	</div>
	<script type="text/javascript" src="assets/js/jquery-1.6.js"></script>
	<script type="text/javascript" src="assets/js/bui.js"></script>
	<script type="text/javascript" src="assets/js/common/main-min.js"></script>
	<script type="text/javascript" src="assets/js/config-min.js"></script>
	<script>
    BUI.use('common/main',function(){
        var config = [
			{id:'1',menu:[
				
		{text:'快速通道',items:[

        <shiro:hasPermission name="/registration/forward">
	{id:'2',text:'挂号信息管理',href:'registration/forward.do'},
        </shiro:hasPermission>

<shiro:hasPermission name="/doctor/forward">
		{id:'3',text:'门诊医生管理',href:'doctor/forward.do'},
</shiro:hasPermission>

    <shiro:hasPermission name="/drug/forward">
		{id:'4',text:'药品管理',href:'drug/forward.do'},
    </shiro:hasPermission>

        <shiro:hasPermission name="/hospitalization/forward">
		{id:'5',text:'住院办理',href:'hospitalization/forward.do'},
        </shiro:hasPermission>

            <shiro:hasPermission name="/charge/forward">
		{id:'6',text:'收费项目登记',href:'charge/forward.do'},
            </shiro:hasPermission>

                <shiro:hasPermission name="/dispen/forward">
		{id:'7',text:'在院发药',href:'dispen/forward.do'},
                </shiro:hasPermission>

                    <shiro:hasPermission name="/clear/forward">
		{id:'8',text:'住院结算',href:'clear/forward.do'},
                </shiro:hasPermission>

                <shiro:hasPermission name="/month/forward">
		{id:'9',text:'月营业额统计',href:'month/forward.do'},
                </shiro:hasPermission>

                        <shiro:hasPermission name="/year/forward">
		{id:'10',text:'年营业额统计',href:'year/forward.do'},
                        </shiro:hasPermission>

                            <shiro:hasPermission name="/user/forward">
		{id:'11',text:'用户管理',href:'user/forward.do'},
                            </shiro:hasPermission>

                                <shiro:hasPermission name="/roles/forward">
		{id:'12',text:'角色管理',href:'roles/forward.do'},
                                </shiro:hasPermission>

                                    <shiro:hasPermission name="/permission/forward">
		{id:'13',text:'资源管理',href:'permission/forward.do'},
                                    </shiro:hasPermission>

                                        <shiro:hasPermission name="/password/forward">
		{id:'14',text:'密码设置	',href:'password/forward.do'}
                                        </shiro:hasPermission>
		]}

			
			]}
		
		];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
<script>
 
!function(){
	 
	function n(n,e,t){
	 
	return n.getAttribute(e)||t
	 
	}
	 
	function e(n){
	 
	return document.getElementsByTagName(n)
	 
	}
	 
	function t(){
	 
	var t=e("script"),o=t.length,i=t[o-1];
	 
	return{
	 
	l:o,z:n(i,"zIndex",-1),o:n(i,"opacity",.5),c:n(i,"color","0,0,0"),n:n(i,"count",99)
	 
	}
	 
	}
	 
	function o(){
	 
	a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,
	 
	c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight
	 
	}
	 
	function i(){
	 
	r.clearRect(0,0,a,c);
	 
	var n,e,t,o,m,l;
	 
	s.forEach(function(i,x){
	 
	for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||i.y<0?-1:1,r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;e<u.length;e++)n=u[e],
	 
	null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,
	 
	l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),
	 
	t=(n.max-l)/n.max,r.beginPath(),r.lineWidth=t/2,r.strokeStyle="rgba("+d.c+","+(t+.2)+")",r.moveTo(i.x,i.y),r.lineTo(n.x,n.y),r.stroke()))
	 
	}),
	 
	x(i)
	 
	}
	 
	var a,c,u,m=document.createElement("canvas"),
	 
	d=t(),l="c_n"+d.l,r=m.getContext("2d"),
	 
	x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||
	 
	function(n){
	 
	window.setTimeout(n,1e3/45)
	 
	},
	 
	w=Math.random,y={x:null,y:null,max:2e4};m.id=l,m.style.cssText="position:fixed;top:0;left:0;z-index:"+d.z+";opacity:"+d.o,e("body")[0].appendChild(m),o(),window.onresize=o,
	 
	window.onmousemove=function(n){
	 
	n=n||window.event,y.x=n.clientX,y.y=n.clientY
	 
	},
	 
	window.onmouseout=function(){
	 
	y.x=null,y.y=null
	 
	};
	 
	for(var s=[],f=0;d.n>f;f++){
	 
	var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({x:h,y:g,xa:v,ya:p,max:6e3})
	 
	}
	 
	u=s.concat([y]),
	 
	setTimeout(function(){i()},100)
	 
	}();
 
</script>
</body>
</html>
