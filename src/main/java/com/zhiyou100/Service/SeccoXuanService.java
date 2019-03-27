package com.zhiyou100.Service;

import com.zhiyou100.pojo.SeccoXuan;
import com.zhiyou100.pojo.SeccoXuanExample;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 4:03
 */
public interface SeccoXuanService {
    List<SeccoXuan> findAllSeccoXuan(SeccoXuanExample example);
}
