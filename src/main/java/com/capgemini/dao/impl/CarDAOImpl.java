package com.capgemini.dao.impl;

import com.capgemini.dao.CarDAO;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.KeeperEntity;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarDAOImpl extends AbstractDao<CarEntity, Integer> implements CarDAO {

   public List<CarEntity> findByTypeAndMark(String type, String mark) {
       TypedQuery<CarEntity> query = entityManager.createQuery(
               "select car from CarEntity car where upper(car.type)" +
                       " like concat(upper(:type) AND upper(car.mark)" +
                       " like concat(upper(:mark), '%')", CarEntity.class);
       query.setParameter("type", type);
       query.setParameter("mark", mark);
       return query.getResultList();
    }

    public void assignCarToKeeper(Integer keepCarId, Integer employeeId) {

    }




}
