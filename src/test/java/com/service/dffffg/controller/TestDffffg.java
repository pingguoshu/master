package com.service.dffffg.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDffffg {

        DffffgDelegate dffffgDelegate = new DffffgDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dffffgDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}