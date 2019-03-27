package com.zhiyou100.realm;

import com.zhiyou100.Service.UserService;
import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm{

	@Autowired
	UserService userService;
	
	
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		System.out.println("授权======");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//获取登录时查询到的用户对象
		User user = (User) arg0.getPrimaryPrincipal();
		//获取用户名
		String userName = user.getUserName();
		//获取用户
		user = userService.findUserByName(userName);
		//把用户的所有权限添加到info中
		for (Permission permission : user.getPermissions()) {
			info.addStringPermission(permission.getResourceUrl());
		}
		return info;
		

	}

	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
	
		System.out.println("用户认证");
		
		//从controller中传递过来的token
		UsernamePasswordToken nameToken = (UsernamePasswordToken) token;
		// nameToken.getUsername() 获取用户名
		User user = userService.findUserByName(nameToken.getUsername());
		if(user == null) {
			System.out.println("查询为空！！！！！！！！！！！");
			return null;
		}
		//param1: object 用户认证的信息,此数据要交给subject使用
		//param2: object 凭证  密码
		//param3: string 当前realm名称

		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		return info;
	}

	
}
