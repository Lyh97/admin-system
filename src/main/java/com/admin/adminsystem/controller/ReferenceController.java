package com.admin.adminsystem.controller;

import com.admin.adminsystem.entity.ReferenceEntity;
import com.admin.adminsystem.jpa.ReferenceJPA;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReferenceController {

    @Autowired
    ReferenceJPA reference;

    @ResponseBody
    @RequestMapping(value = "api/reference/select")
    public JSONObject selectall(){
        JSONObject list = new JSONObject();
        List<ReferenceEntity> referencelist;
        try{
            referencelist = reference.findAll();
        }catch(Exception e) {
            list.put("code","200");
            list.put("message","ok");
            list.put("data", "");
            return list;
        }
        list.put("code","201");
        list.put("message","ok");
        list.put("data", referencelist);
        return list;
    }
}
