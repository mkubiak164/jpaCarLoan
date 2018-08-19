package com.capgemini.dao.impl;

import com.capgemini.dao.CarDAO;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.KeeperEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDAOImpl extends AbstractDao<CarEntity, Integer> implements CarDAO {

   public List<CarEntity> findByTypeAndMark(String type, String mark) {
       TypedQuery<CarEntity> query = entityManager.createQuery(
               "select car from CarEntity car where upper(car.carType)" +
                       " like upper(:type) AND upper(car.mark)" +
                       " like upper(:mark)", CarEntity.class);
       query.setParameter("type", type);
       query.setParameter("mark", mark);
       return query.getResultList();
    }

    @Override
    public List<CarEntity> findByKeeper(Integer keeperId) {

        TypedQuery<CarEntity> query = entityManager.createQuery(
                "select car from CarEntity car where :keeperId in :car.keepers.id", CarEntity.class);
        query.setParameter("keeperId", keeperId);
        return query.getResultList();
    }

    public void assignCarToKeeper(Integer keepCarId, Integer employeeId) {

    }




}
