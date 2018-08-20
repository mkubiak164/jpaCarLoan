package com.capgemini.service;


import com.capgemini.types.EmployeeTO;
import com.capgemini.types.EmployeeTOBuilder;
import com.capgemini.types.OfficeTO;
import com.capgemini.types.OfficeTOBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "localtest")
public class OfficeServiceTest {

    static {
        System.setProperty("spring.profiles.active", "hsql");
    }

    @Autowired
    private OfficeService officeService;

    @Test
    @Sql({"officeInsert.sql"})
    public void shouldAddOffice() {
        //given
        OfficeTO officeTO = new OfficeTOBuilder().withAdress("Mielno").withEmail("mielno@samochod.pl").build();
        List<OfficeTO> allOffices = officeService.findAllOffices();
        final int sizeBefore = allOffices.size();

        //when
        officeService.addOffice(officeTO);

        //then
        List<OfficeTO> allOfficesAfter = officeService.findAllOffices();
        Assertions.assertThat(allOfficesAfter.size()).isEqualTo(sizeBefore+1);
    }

   @Test
   @Sql({"officeInsert.sql"})
    public void shouldRemoveOffice() {
        //given
        OfficeTO officeTO = new OfficeTOBuilder().withAdress("Mielno").withEmail("mielno@samochod.pl").build();
        officeService.addOffice(officeTO);
        List<OfficeTO> allOffices = officeService.findAllOffices();
        final int sizeBefore = allOffices.size();

        //when
        officeService.removeOffice(officeTO.getId());

        //then
        List<OfficeTO> allOfficesAfter = officeService.findAllOffices();
        Assertions.assertThat(allOfficesAfter.size()).isEqualTo(sizeBefore-1);
    }

    @Test
    public void shouldUpdateOffice() {
        //given
        OfficeTO officeTO = new OfficeTOBuilder().withAdress("lalaland").withEmail("lalaland@auto.pl").build();

        //when
        officeService.editOffice(officeTO);

        //then
        OfficeTO officeTO1 = officeService.findbyId(1);
        Assertions.assertThat(officeTO1.getAdress().equalsIgnoreCase("Lalaland"));

    }

    @Test
    public void shouldAddEmployeeToOffice() {
        //given
        EmployeeTO employeeTO = new EmployeeTOBuilder().withName("Jan").withLastName("Kokos").build();

        //when
        officeService.addEmployeeToOffice(1, 1);

        //then

    }

    @Test
    public void shouldRemoveEmployeeFromOffice() {

    }

    @Test
    public void shouldShowOfficeEmployees() {

    }






}
