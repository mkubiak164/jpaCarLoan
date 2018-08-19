package com.capgemini.dao.impl;

import com.capgemini.dao.EmployeeDAO;
import com.capgemini.domain.EmployeeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeDAOImpl extends AbstractDao<EmployeeEntity, Integer> implements EmployeeDAO {
    @Override
    public List<EmployeeEntity> findAllOfficeEmployees(Integer officeId) {
        TypedQuery<EmployeeEntity> query = entityManager.createQuery(
            "select employee from EmployeeEntity employee where upper(employee.office) like concat(upper(:office), '%')", EmployeeEntity.class);
        query.setParameter("office", officeId);
        return query.getResultList();
    }



    @Override
    public List<EmployeeEntity> findAllOfficeEmployeesByKeepCarId(Integer carId) {
        TypedQuery<EmployeeEntity> query = entityManager.createQuery(
                "select employee from EmployeeEntity employee where upper(employee.keeper) like concat(upper(:keeper), '%')", EmployeeEntity.class);
        query.setParameter("keepCarId", carId);
        return query.getResultList();
    }










}
