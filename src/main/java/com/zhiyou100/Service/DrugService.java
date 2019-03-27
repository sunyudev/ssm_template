package com.zhiyou100.Service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.Drug;
import com.zhiyou100.pojo.DrugExample;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 4:06
 */
public interface DrugService {
    PageInfo<Drug> findAllDrug(DrugExample example, int pageNum, int pageSize);

    Drug findDrugByDrudNum(String drugNum);

    void updateDrug(Drug drug, MultipartFile file, HttpSession session, HttpServletRequest request);

    void insert(Drug drug);

    void insertDrug(Drug drug, HttpSession session, MultipartFile file, HttpServletRequest request);

    void updateDrugAdds(Drug drug);

    PageInfo<Drug> vagueFindDrug(Drug drug, int pageNum, int pageSize);
}
