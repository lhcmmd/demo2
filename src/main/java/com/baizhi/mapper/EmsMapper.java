package com.baizhi.mapper;

import com.baizhi.entity.Ems;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmsMapper extends Mapper<Ems> {
    public List<Ems> queryAll();
}
