package com.swyp.peach.Stduy.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StudyDTO {

    private int sNo;            // 스터디 번호
    private int id;             // 사용자 아이디
    private String sCode;       // 스터디 코드
    private String sName;       // 스터디 이름
    private String sPassword;   // 스터디 비밇번호
    private String sStart;      // 스터디 시작일
    private String sEnd;        // 스터디 종료일

    public StudyDTO(){}

    public StudyDTO(int sNo, int id, String sCode, String sName, String sPassword, String sStart, String sEnd) {
        this.sNo = sNo;
        this.id = id;
        this.sCode = sCode;
        this.sName = sName;
        this.sPassword = sPassword;
        this.sStart = sStart;
        this.sEnd = sEnd;
    }
}
