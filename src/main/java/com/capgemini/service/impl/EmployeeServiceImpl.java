package com.capgemini.service.impl;

import com.capgemini.dao.EmployeeDAO;
import com.capgemini.mappers.EmployeeMapper;
import com.capgemini.service.EmployeeService;
import com.capgemini.types.EmployeeSearchCriteria;
import com.capgemini.types.EmployeeTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.ParameterExpression;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeTO> findEmployeeBy(EmployeeSearchCriteria employeeSearchCriteria) {

       return EmployeeMapper.map2TOs(employeeDAO.findEmployeeBy(employeeSearchCriteria));
    }
}
