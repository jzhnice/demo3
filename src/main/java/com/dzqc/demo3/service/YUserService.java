package com.dzqc.demo3.service;

import com.dzqc.demo3.entity.YUser;
import com.fasterxml.jackson.databind.ser.Serializers;

import java.util.Map;

/**
 * @author jzh
 * @date 2022/3/14 16:27
 */
public interface YUserService extends BaseService<YUser> {
    Map<String, Object> login(String condition,String password);

    boolean changePassword();

}
