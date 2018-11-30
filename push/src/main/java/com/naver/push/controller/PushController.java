package com.naver.push.controller;

import com.naver.push.domain.Notification;
import com.naver.push.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class PushController {

    @Autowired
    PushService pushService;

    @GetMapping("")
    public String main(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String userId, String pwd, HttpSession session){
       String result=pushService.login(userId, pwd, session);
       return result;
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/getNotifications")
    @ResponseBody
    public List<Notification> getNotifications(@RequestParam(name="grade") String grade){
        System.out.println("컨트롤러 : "+grade);
        List<Notification> notificationList=pushService.getNotifications(grade);
        System.out.println("dfdf : "+notificationList.get(0).getNotiContent());
        return notificationList;
    }

}
