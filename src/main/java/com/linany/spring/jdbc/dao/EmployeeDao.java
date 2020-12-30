package com.linany.spring.jdbc.dao;

import com.linany.spring.jdbc.entity.Employee;
import lombok.Data;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Data
public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public Employee findById(Integer eno){
        String sql = "select * from employee where eno=?";
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{eno}, new BeanPropertyRowMapper<Employee>(Employee.class));
        return employee;
    }
}
