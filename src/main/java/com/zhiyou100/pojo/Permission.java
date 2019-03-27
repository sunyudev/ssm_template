package com.zhiyou100.pojo;

public class Permission {
    private Integer id;

    private String resourceName;

    private String resourceUrl;

    private Integer superResourceId;
    
    private int status;

    private  int del;

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", resourceName='" + resourceName + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", superResourceId=" + superResourceId +
                ", status=" + status +
                ", del=" + del +
                '}';
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public Permission() {
    }


    public Permission(Integer id, String resourceName, String resourceUrl, Integer superResourceId, int status) {
        this.id = id;
        this.resourceName = resourceName;
        this.resourceUrl = resourceUrl;
        this.superResourceId = superResourceId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public Integer getSuperResourceId() {
        return superResourceId;
    }

    public void setSuperResourceId(Integer superResourceId) {
        this.superResourceId = superResourceId;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
    

}