package com.swyp.peach.Stduy.Service;

import com.swyp.peach.Stduy.DTO.StudyDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyService {

    private final List<StudyDTO> studies = new ArrayList<>();

    public List<StudyDTO> getDummyData() {
        studies.add(new StudyDTO(1, 1, "code2", "code2", "code2", "2024-11-11", "2024-11-30"));

        return studies;
    }

    public void addStudy() {
        int s_no = 2;   // 스터디 번호
        int id = 2;     // 사용자 아이디
        String s_code = "code2";  // 스터디 코드
        String s_name = "code2";  // 스터디 이름
        String s_password = "cod2";  // 스터디 비밇번호
        String s_start = "2024-11-11";   // 스터디 시작일
        String s_end = "2024-11-30";    // 스터디 종료일

        StudyDTO study = new StudyDTO();
        study.setSNo(s_no);
        study.setId(id);
        study.setSCode(s_code);
        study.setSName(s_name);
        study.setSPassword(s_password);
        study.setSStart(s_start);
        study.setSEnd(s_end);

        studies.add(study);
    }
}
