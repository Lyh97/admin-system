package com.admin.adminsystem.controller;

import com.admin.adminsystem.entity.Route_configEntity;
import com.admin.adminsystem.jpa.Route_configJPA;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Route_configController {

    @Autowired
    private Route_configJPA route_configJPA;

    @ResponseBody
    @RequestMapping(value = "/api/route-config/add", method = POST)
    public JSONObject add(@RequestBody String routeInfo) {
        JSONObject list=new JSONObject();

        Route_configEntity route_configEntity = new Route_configEntity();
        route_configEntity = JSON.parseObject(routeInfo,Route_configEntity.class);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh:MM:ss");
        Date date = new Date();ParsePosition pos = new ParsePosition(0);
        Date nowTime = dateFormat.parse(dateFormat.format(date), pos);

        route_configEntity.setINSERT_TIMESTAMP(nowTime);
        route_configEntity.setLAST_UPDATE_TIMESTAMP(nowTime);

        try {
            route_configJPA.save(route_configEntity);
        }catch(Exception e){
            list.put("code", 400);
            list.put("message",e.toString());
            list.put("data","");
            return list;
        }
        list.put("code", 200);
        list.put("message","添加成功");
        list.put("data","");
        return list;
    }

    @RequestMapping(value = "/api/route-config/delete", method = DELETE)
    public JSONObject delete(@RequestBody String routeInfo) {
        JSONObject list=new JSONObject();

        Object id = JSON.parseObject(routeInfo).get("pk_ROUTE");
        try {
            route_configJPA.delete(id.toString());
        } catch(Exception e){
            list.put("code", 400);
            list.put("message",e.toString());
            list.put("data","");
            return list;
        }
        list.put("code", 200);
        list.put("message","删除成功");
        list.put("data","");
        return list;
    }

    @RequestMapping(value = "/api/route-config/update", method = POST)
    public JSONObject update(@RequestBody String route) {
        JSONObject list=new JSONObject();

        Route_configEntity route_configEntity = JSON.parseObject(route,Route_configEntity.class);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        Date date = new Date();
        String nowTime = dateFormat.format(date);
//        ParsePosition pos = new ParsePosition(0);
//        Date nowTime = dateFormat.parse(dateFormat.format(date), pos);
//        route_configEntity.setLAST_UPDATE_TIMESTAMP(nowTime);

        route_configEntity.setINSERT_TIMESTAMP(route_configJPA.findOne(route_configEntity.getPK_ROUTE()).getINSERT_TIMESTAMP());
        route_configEntity.setLAST_UPDATE_TIMESTAMP(Timestamp.valueOf(nowTime));

        try {
            route_configJPA.saveAndFlush(route_configEntity);
        } catch(Exception e){
            list.put("code", 400);
            list.put("message",e.toString());
            list.put("data","");
            return list;
        }
        list.put("code", 200);
        list.put("message","修改成功");
        list.put("data","");
        return list;
    }

    //接受参数变量名：number
    @RequestMapping(value = "/api/route-config/select", method = GET)
    public JSONObject list() {//@RequestBody String info
        JSONObject list=new JSONObject();
        //Page<Route_configEntity> routes;
        // Object number = JSON.parseObject(info).get("nubmer");

        List<Route_configEntity> routes;
        try {
            routes = route_configJPA.findAll();//new PageRequest(Integer.valueOf(number.toString()), 10)
        } catch (Exception e){
            list.put("code", 400);
            list.put("message","ok");
            list.put("data","");
            return list;
        }
        list.put("code", 200);
        list.put("message","ok");
        list.put("data",routes);//.getContent()
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/api/route-config/select-all", method = GET)
    public JSONObject alllist(){
        Iterable<Route_configEntity> route = new ArrayList<Route_configEntity>();
        try {
            route= route_configJPA.findAll();
        }
        catch (Exception e){
            JSONObject list=new JSONObject();
            list.put("code", 400);
            list.put("message",e.toString());
            list.put("data","");
            return list;
        }

        JSONObject list=new JSONObject();
        list.put("code", 200);
        list.put("message","ok");
        list.put("data",route);
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/api/route-config/selectpageamount", method = GET)
    public JSONObject selectPageAmount(){
        JSONObject json = new JSONObject();
        Page<Route_configEntity> routes;

        try {
            routes = route_configJPA.findAll(new PageRequest(0, 10));
        } catch (Exception e){
            json.put("code", 400);
            json.put("message",e.toString());
            json.put("data","");
            return json;
        }
        json.put("code", 200);
        json.put("message","ok");
        json.put("data",routes.getTotalElements());
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/api/route-config/selectbycondition", method = GET)
    public JSONObject listByCondition(HttpServletRequest request) {
        JSONObject list=new JSONObject();
        String key = request.getParameter("key");

        List<Route_configEntity> routes;
        try {
            routes = route_configJPA.findByCondition(key);
        } catch (Exception e){
            list.put("code", 400);
            list.put("message","ok");
            list.put("data","");
            return list;
        }
        list.put("code", 200);
        list.put("message","ok");
        list.put("data",routes);//.getContent()
        return list;
    }
}
