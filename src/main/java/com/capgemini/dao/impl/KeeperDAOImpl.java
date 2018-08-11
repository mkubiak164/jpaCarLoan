package com.capgemini.dao.impl;

import com.capgemini.dao.KeeperDAO;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.KeeperEntity;

import javax.persistence.TypedQuery;
import java.util.List;

public class KeeperDAOImpl extends AbstractDao<KeeperEntity, Integer> implements KeeperDAO {

    @Override
    public void assignCarToKeeper(CarEntity carEntity, Integer keeperId) {
        KeeperEntity keeper = findOne(keeperId);
        keeper.getCars().add(carEntity);
    }

    public List<CarEntity> findByKeeper(Integer keeperId) {
        KeeperEntity keeper = findOne(keeperId);
        return keeper.getCars();
    }

}
