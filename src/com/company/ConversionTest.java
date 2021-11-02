package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void givesCmforCm(){
    double cm =1;
    double expectedCm=1;

    Conversion bar=new Conversion();
    double actualcm=bar.CmtoCm(cm);

    assertEquals(expectedCm,actualcm);


    }
    @Test
    void OneMeterGivesHundredCm(){
        double actualM=1;
        double expectedCm=100;
        Conversion bar=new Conversion();
       double actual=bar.MToCm(actualM);
       double expected = bar.CmtoCm(100);


assertEquals(expected,actual);
    }
    @Test
    void HundredCmtoKm(){
        double actualCm=100;
        double expectedKm=0.001;
        Conversion bar=new Conversion();

        double actual=bar.CmtoCm(100);
        double expected=bar.KmtoCm(expectedKm);


        assertEquals(expected,actual);

    }

    @Test
    void oneMPlusHundredCmGivesTwoMeters(){
    double actualM=1;
        double actualCm = 100;
        double expectedM = 2;
    }
}