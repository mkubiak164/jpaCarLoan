package com.capgemini.dao;

import com.capgemini.domain.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO extends Dao<EmployeeEntity, Integer> {

    List<EmployeeEntity> findAllOfficeEmployees(Integer officeId);

    List<EmployeeEntity> findAllOfficeEmployeesByKeepCarId(Integer carId);
}
