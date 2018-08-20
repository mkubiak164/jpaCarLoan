package com.capgemini.service;


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
   // @Sql({"data-hsqldb.sql"})
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
    @Sql({"data-hsqldb.sql"})
    public void shouldRemoveOffice() {
        //given
        List<OfficeTO> allOffices = officeService.findAllOffices();
        final int sizeBefore = allOffices.size();

        //when
        officeService.removeOffice(1);

        //then
        List<OfficeTO> allOfficesAfter = officeService.findAllOffices();
        Assertions.assertThat(allOfficesAfter.size()).isEqualTo(sizeBefore-1);
    }

    @Test
    public void shouldUpdateOffice() {

    }

    @Test
    public void shouldAddEmployeeToOffice() {

    }

    @Test
    public void shouldRemoveEmployeeFromOffice() {

    }

    @Test
    public void shouldShowOfficeEmployees() {

    }






}
