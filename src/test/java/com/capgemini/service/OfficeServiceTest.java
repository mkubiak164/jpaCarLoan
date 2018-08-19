package com.capgemini.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

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
    public void shouldAddOffice() {
        //given




    }





}
