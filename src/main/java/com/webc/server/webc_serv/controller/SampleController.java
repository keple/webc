package com.webc.server.webc_serv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webc.server.webc_serv.model.SampleVO;


@RestController
public class SampleController{

    @RequestMapping("/sample")
    public void sample(HttpServletRequest req,HttpServletResponse res){
        ObjectMapper obm = new ObjectMapper();
        SampleVO svo = new SampleVO();
        svo.setA("hi");
        svo.setB("samp");
        String returnValue;
        try{
            returnValue = obm.writeValueAsString(svo);
            res.getWriter().write(returnValue);
        }catch(Exception e){
            e.printStackTrace();
            res.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        
    }
}