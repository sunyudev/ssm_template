package com.zhiyou100.pojo;

public class Drug {
    private String drugNum;

    private String drugUrl;

    private Double purchasPrice;

    private Double salePrice;

    private String drugName;

    private Integer drugType;

    private String simpleDetail;

    private String dataProdeced;

    private String expirationDate;

    private Integer qualityDate;

    private String detail;

    private String manufacture;

    private String useInfor;

    private Integer totalStock;

    private Integer surplus;

    private Integer status;

    private String noted;
    
    private Integer adds;

    public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum == null ? null : drugNum.trim();
    }

    public String getDrugUrl() {
        return drugUrl;
    }

    public void setDrugUrl(String drugUrl) {
        this.drugUrl = drugUrl == null ? null : drugUrl.trim();
    }

    public Double getPurchasPrice() {
        return purchasPrice;
    }

    public void setPurchasPrice(Double purchasPrice) {
        this.purchasPrice = purchasPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    } 

	public Integer getDrugType() {
		return drugType;
	}

	public void setDrugType(Integer drugType) {
		this.drugType = drugType;
	}

	public String getSimpleDetail() {
        return simpleDetail;
    }

    public void setSimpleDetail(String simpleDetail) {
        this.simpleDetail = simpleDetail == null ? null : simpleDetail.trim();
    }

    public String getDataProdeced() {
        return dataProdeced;
    }

    public void setDataProdeced(String dataProdeced) {
        this.dataProdeced = dataProdeced == null ? null : dataProdeced.trim();
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate == null ? null : expirationDate.trim();
    }

    public Integer getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(Integer qualityDate) {
        this.qualityDate = qualityDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getUseInfor() {
        return useInfor;
    }

    public void setUseInfor(String useInfor) {
        this.useInfor = useInfor == null ? null : useInfor.trim();
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted == null ? null : noted.trim();
    }

	public Integer getAdds() {
		return adds;
	}

	public void setAdds(Integer adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "Drug [drugNum=" + drugNum + ", drugUrl=" + drugUrl + ", purchasPrice=" + purchasPrice + ", salePrice="
				+ salePrice + ", drugName=" + drugName + ", drugType=" + drugType + ", simpleDetail=" + simpleDetail
				+ ", dataProdeced=" + dataProdeced + ", expirationDate=" + expirationDate + ", qualityDate="
				+ qualityDate + ", detail=" + detail + ", manufacture=" + manufacture + ", useInfor=" + useInfor
				+ ", totalStock=" + totalStock + ", surplus=" + surplus + ", status=" + status + ", noted=" + noted
				+ ", adds=" + adds + "]";
	}
    
    
}