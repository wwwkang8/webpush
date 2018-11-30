package com.naver.push.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="grade")
@Getter
@Setter
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gradeName;

    @Lob
    private String gradeInfo;

    @OneToOne(mappedBy = "grade")
    private Member member;

    @OneToMany(mappedBy = "grade")
    private List<Notification> notification;


}
