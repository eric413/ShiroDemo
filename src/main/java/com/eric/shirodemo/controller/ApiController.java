package com.eric.shirodemo.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eric.shirodemo.entity.po.WeixinTicket;
import com.eric.shirodemo.entity.vo.Message;
import com.eric.shirodemo.service.impl.WeixinTicketServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName ApiController
 * @Description: TODO ()
 * @Author 金晨
 * @Date 2020/8/23
 * @Package com.eric.shirodemo.controller
 * @Version V1.0
 **/
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    WeixinTicketServiceImpl weixinTicketService;
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public Message test(){
        return new Message().ok(200).addData("data","test");
    }
    @RequestMapping(value = "getTicket",method = RequestMethod.GET)
    public Message getTicket(String appId,String secret){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("app_id",appId);
        WeixinTicket ticket = weixinTicketService.getOne(wrapper);
        if(null==ticket){
            addTicket(appId,secret);
        }
        long times = DateUtil.between(ticket.getCreateTime(), new Date(), DateUnit.SECOND);
        if(times>=7200){
            updateTicket(ticket);
        }
        return new Message().ok(200).addData("data",ticket.getTicket());
    }

    private void addTicket(String appId,String secret) {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appId+"&secret="+secret;
        String s = HttpUtil.get(url);
        JSONObject object = JSON.parseObject(s);
        String token = object.getString("access_token");
        if(StringUtils.isNotEmpty(token)){
            String ticketUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token="+token+"&type=jsapi";
            JSONObject obj = JSON.parseObject(HttpUtil.get(ticketUrl));
            String ticket = obj.getString("ticket");
            if(StringUtils.isNotEmpty(ticket)){
                WeixinTicket weixinTicket = new WeixinTicket();
                weixinTicket.setAppId(appId);
                weixinTicket.setTicket(ticket);
                weixinTicket.setCreateTime(new Date());
                weixinTicketService.save(weixinTicket);
            }
        }
    }

    private void updateTicket(WeixinTicket weixinTicket) {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx76a512fc5ba832a6&secret=0fd3637b248a0e8719f61586f363e055";
        String s = HttpUtil.get(url);
        JSONObject object = JSON.parseObject(s);
        String token = object.getString("access_token");
        if(StringUtils.isNotEmpty(token)){
            String ticketUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token="+token+"&type=jsapi";
            JSONObject obj = JSON.parseObject(HttpUtil.get(ticketUrl));
            String ticket = obj.getString("ticket");
            if(StringUtils.isNotEmpty(ticket)){
                weixinTicket.setTicket(ticket);
                weixinTicket.setCreateTime(new Date());
                weixinTicketService.updateById(weixinTicket);
            }
        }
    }
}
