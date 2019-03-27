package com.zhiyou100.pojo;

import java.util.List;

public class Role {
    private Integer id;

    private String roleNum;

    private String roleName;
    
    private int statuss;

    private int del;

    private int pId;
    
    private List<Permission> permissions;

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleNum='" + roleNum + '\'' +
                ", roleName='" + roleName + '\'' +
                ", statuss=" + statuss +
                ", del=" + del +
                ", pId=" + pId +
                ", permissions=" + permissions +
                '}';
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleNum() {
        return roleNum;
    }

    public void setRoleNum(String roleNum) {
        this.roleNum = roleNum == null ? null : roleNum.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

	public int getStatuss() {
		return statuss;
	}

	public void setStatuss(int statuss) {
		this.statuss = statuss;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	
    
    
}