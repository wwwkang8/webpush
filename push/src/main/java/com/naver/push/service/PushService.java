package com.naver.push.service;

import com.naver.push.domain.Member;
import com.naver.push.domain.Notification;
import com.naver.push.repository.GradeRepository;
import com.naver.push.repository.MemberRepository;
import com.naver.push.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class PushService {

    @Autowired
    GradeRepository gradeRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    NotificationRepository notificationRepository;

    public String login(String userId, String pwd, HttpSession session){
        Member member=memberRepository.findByMemId(userId);
        String result="";

        if(member == null){
            result="redirect:/login";
        }
        if(!member.matchPassword(pwd)){
            result="redirect:/login";
        }

        session.setAttribute("sessionedMember", member);
        Member sessionedMember=(Member)session.getAttribute("sessionedMember");

        if(sessionedMember.getMemId().equals("admin")){
            result="redirect:/admin";
        }else{
            result="redirect:/index";
        }

        return result;

    }

    public List<Notification> getNotifications(String grade){
        System.out.println(grade);

        List<Notification> notificationList=notificationRepository.findNotificationsByGrade_GradeInfo(grade);
        System.out.println("노티 내용 : "+notificationList.get(0).getNotiContent());
        return notificationList;

    }



}
