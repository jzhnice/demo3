package com.dzqc.demo3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dzqc.demo3.entity.YUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author jzh
 * @date 2022/3/14 16:25
 */

@Repository
@Mapper
public interface YUserMapper  extends BaseMapper<YUser> {
}
