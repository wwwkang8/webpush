package com.naver.push.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="member")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memId;

    private String memPwd;

    private String memSex;

    private String memName;

    private Date createdDate;

    @Column(nullable = true)
    private Date deletedDate;

    private int notiAct;

    @OneToOne
    @JoinColumn(name="grade_idx")
    private Grade grade;

    public boolean matchId(String newMemId) {
        if (newMemId == null) {
            return false;
        }

        return memId.equals(newMemId);
    }

    public boolean matchPassword(String newPassword) {
        if (newPassword == null) {
            return false;
        }

        return memPwd.equals(newPassword);

    }



}
