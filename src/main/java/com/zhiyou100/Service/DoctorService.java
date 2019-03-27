package com.zhiyou100.Service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.CertificateType;
import com.zhiyou100.pojo.Doctor;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 4:02
 */
public interface DoctorService {
    Doctor findDoctorById(Integer id);

    List<CertificateType> findAllCertificateType();

    void updateDoctor(Doctor doctor);

    void addDoctor(Doctor doctor);

    PageInfo<Doctor> vagueFindDoctor(Doctor doctor, int pageNum, int pageSize);

    PageInfo<Doctor> findAllDoctor(int pageNum, int pageSize);

    int findDoctorCount();
}
