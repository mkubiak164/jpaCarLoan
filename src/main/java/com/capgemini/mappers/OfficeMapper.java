package com.capgemini.mappers;

import com.capgemini.domain.OfficeEntity;
import com.capgemini.types.OfficeTO;

public class OfficeMapper {

    public static OfficeEntity toOfficeEntity(OfficeTO officeTO) {

        if(officeTO == null)
            return null;

        OfficeEntity officeEntity = new OfficeEntity();
        officeEntity.setAdress(officeTO.getAdress());
        officeEntity.setTelephone(officeTO.getTelephone());
        officeEntity.setEmail(officeTO.getEmail());

        return officeEntity;
    }


    public static OfficeTO toOfficeTO(OfficeEntity officeEntity) {

        if(officeEntity == null)
            return null;

        OfficeTO officeTO = new OfficeTO();
        officeTO.setAdress(officeEntity.getAdress());
        officeTO.setTelephone(officeEntity.getTelephone());
        officeTO.setEmail(officeEntity.getTelephone());

        return officeTO;
    }




}
