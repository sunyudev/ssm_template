package com.zhiyou100.pojo.vo;

import java.util.Date;

public class VagueInHospital {
	
	private String medicalRecord;
	
	private String doctorName;
	
	private String seccoName;
	
	private String time1;
	
	private String time2;

	public String getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(String medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSeccoName() {
		return seccoName;
	}

	public void setSeccoName(String seccoName) {
		this.seccoName = seccoName;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	@Override
	public String toString() {
		return "VagueInHospital [medicalRecord=" + medicalRecord + ", doctorName=" + doctorName + ", seccoName="
				+ seccoName + ", time1=" + time1 + ", time2=" + time2 + "]";
	}

	

	
	
	
	
}
