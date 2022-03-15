package com.dzqc.demo3.service;

import com.sun.istack.internal.Interned;
import org.springframework.data.relational.core.sql.In;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author jzh
 * @date 2022/3/14 16:27
 */
public interface BaseService<T> {
    //    通用查询
    List<T> select(T t);

    T selectById(Integer id);


    //    通用新增
    boolean add(T t);

    //    通用修改
    int update(T t, String conditiorField, Object fieldValue);

    boolean updateById(T t, Integer id);

    //    通用删除
    int deleteById(Integer id);

    int deleteByIds(Collection ids);

    int deleteByOther(Map<String, Object> conditionMap);


}
