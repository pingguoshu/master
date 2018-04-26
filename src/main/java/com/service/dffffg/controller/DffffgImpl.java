package com.service.dffffg.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-26T03:05:29.671Z")

@RestSchema(schemaId = "dffffg")
@RequestMapping(path = "/dffffg", produces = MediaType.APPLICATION_JSON)
public class DffffgImpl {

    @Autowired
    private DffffgDelegate userDffffgDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDffffgDelegate.helloworld(name);
    }

}
