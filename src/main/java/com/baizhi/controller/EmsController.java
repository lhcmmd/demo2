package com.baizhi.controller;

import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ems")
public class EmsController {


    @Autowired
    EmsMapper emsMapper;

    @RequestMapping("queryAll")
    public void test() {
        List<Ems> list = emsMapper.selectAll();
        for (Ems e : list) {
            System.out.println(e);
        }
    }

    @RequestMapping("test")
    public List<Ems> test2() {
        List<Ems> list = emsMapper.queryAll();
        for (Ems e : list) {
            System.out.println(e);
        }
        return list;
    }

}
