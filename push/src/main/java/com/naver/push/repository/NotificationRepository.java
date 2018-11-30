package com.naver.push.repository;

import com.naver.push.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findNotificationsByGrade_GradeInfo(String grade);

}
