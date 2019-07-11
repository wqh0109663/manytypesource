package com.example.manytypesource.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-11 下午10:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJdbcTemplate {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        String sql = "select * from t_user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map.get("user_name"));
        }

    }

}
