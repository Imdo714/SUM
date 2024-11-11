package com.swyp.peach.Stduy.Controller;

import com.swyp.peach.Stduy.DTO.StudyDTO;
import com.swyp.peach.Stduy.Service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    private final StudyService studyService;

    public HelloController(StudyService studyService) {
        this.studyService = studyService;
    }

    @GetMapping("/")
    public String home2222(){
        return "Hello";
    }

    @GetMapping("/Study/List") // 스터디 리스트
    public List<StudyDTO> StudyTest(){
        return studyService.getDummyData();
    }

    @PostMapping("/Study/Save") // 스터디 생성
    public String addStudy() {
        studyService.addStudy();

        return "Study added successfully";
    }
}
