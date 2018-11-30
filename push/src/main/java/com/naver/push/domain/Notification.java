package com.naver.push.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="notification")
@Getter
@Setter
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String notiContent;

    private Timestamp notiTime;

    @ManyToOne
    @JoinColumn(name="grade_idx")
    private Grade grade;


}
