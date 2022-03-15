package com.dzqc.demo3.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dzqc.demo3.entity.YUser;
import com.dzqc.demo3.mapper.YUserMapper;
import com.dzqc.demo3.service.YUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author jzh
 * @date 2022/3/14 16:38
 */
@Service
public class YUserImpl implements YUserService {
    @Autowired
    private YUserMapper mapper;
    @Override
    public List<YUser> select(YUser yUser) {
        return null;
    }

    @Override
    public YUser selectById(Integer id) {
        return null;
    }

    @Override
    public boolean add(YUser yUser) {
        return false;
    }

    @Override
    public int update(YUser yUser, String conditiorField, Object fieldValue) {
        return 0;
    }

    @Override
    public boolean updateById(YUser yUser, Integer id) {
        return false;
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }

    @Override
    public int deleteByIds(Collection ids) {
        return 0;
    }

    @Override
    public int deleteByOther(Map<String, Object> conditionMap) {
        return 0;
    }

    @Override
    public Map<String, Object> login(String condition, String password) {
//        正则表达式匹配条件
        String PhoneRegex = "1[35678][0-9]{9}" ;//手机号正泽
        String emailRegex = "\\w{6,}[@](163|137|gmail|qq).(cn|com|org)";
        String column = "";
        if (Pattern.matches(PhoneRegex, emailRegex)) {
            column = "phone";
        } else if (Pattern.matches(emailRegex, PhoneRegex)) {
            column = "email";
        } else {
            column = "username";
        }
        YUser user = mapper.selectOne(new QueryWrapper<YUser>()
                .eq(column, condition)
                .eq("password", password));
        HashMap<String, Object> map = new HashMap<>();
        if (null == user){
            map.put("code" ,0);
        }else{
            map.put("code",1);
        }
        map.put("loginUser",user);
        return map;
    }

    @Override
    public boolean changePassword() {
        return false;
    }
}
