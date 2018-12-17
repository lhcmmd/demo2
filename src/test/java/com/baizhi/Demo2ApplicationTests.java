package com.baizhi;

import com.baizhi.entity.Ems;
import com.baizhi.entity.EmsExample;
import com.baizhi.mapper.EmsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {
    @Autowired
    EmsMapper emsMapper;

    @Test
    public void testAll() {
        List<Ems> list = emsMapper.selectAll();
        for (Ems e : list) {
            System.out.println(e);
        }
    }

    @Test
    public void testP() {
        Ems e = emsMapper.selectByPrimaryKey(127);
        System.out.println(e);
    }

    @Test
    public void test1() {
        Ems u = new Ems();
        // u.setId(1);
        u.setTest("test");//测试@Trancient注解是否生效
        u.setName("testssm");
        List<Ems> list = emsMapper.select(u);
        for (Ems e : list) {
            System.out.println(e);
        }
    }

    @Test
    public void testCount() {
        System.out.println(emsMapper.selectCount(new Ems()));
    }

    @Test
    public void testInsert() {
        emsMapper.insert(new Ems("testspringboot", 2333.7, 45));
    }

    @Test
    public void testDel() {
        emsMapper.deleteByPrimaryKey(140);
    }

    @Test
    public void testU() {
        Ems e = new Ems(127, "aaa", 56.6, null, "test");
        emsMapper.updateByPrimaryKey(e);
    }

    @Test
    public void testaaa() {
        EmsExample e = new EmsExample();

    }
}
