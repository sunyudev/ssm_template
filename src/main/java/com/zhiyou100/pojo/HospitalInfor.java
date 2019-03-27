package com.zhiyou100.pojo;

public class HospitalInfor {
    private String medicalRecord;

    private String caregiver;

    private String bedId;

    private Double payTheDeposit;

    private String stateIllness;
    
    private Doctor doctor;
    
    private RegistrationInfor registrationInfor;
    
    private SeccoXuan seccoXuan;
    
    private CertificateType certificateType;

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public String getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver == null ? null : caregiver.trim();
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId == null ? null : bedId.trim();
    }

    public Double getPayTheDeposit() {
        return payTheDeposit;
    }

    public void setPayTheDeposit(Double payTheDeposit) {
        this.payTheDeposit = payTheDeposit;
    }

    public String getStateIllness() {
        return stateIllness;
    }

    public void setStateIllness(String stateIllness) {
        this.stateIllness = stateIllness == null ? null : stateIllness.trim();
    }

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public RegistrationInfor getRegistrationInfor() {
		return registrationInfor;
	}

	public void setRegistrationInfor(RegistrationInfor registrationInfor) {
		this.registrationInfor = registrationInfor;
	}

	public SeccoXuan getSeccoXuan() {
		return seccoXuan;
	}

	public void setSeccoXuan(SeccoXuan seccoXuan) {
		this.seccoXuan = seccoXuan;
	}

	public CertificateType getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}
    
    
}