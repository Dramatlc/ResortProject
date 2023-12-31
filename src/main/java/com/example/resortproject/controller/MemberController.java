package com.example.resortproject.controller;

import com.example.resortproject.dto.MemberForm;
import com.example.resortproject.entity.Member;
import com.example.resortproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
@Slf4j
@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    @PostMapping("signup")
    public String signupMember(MemberForm form){
        log.info(form.toString());
        Member member = form.toEntity();
        log.info(member.toString());
        Member saved = memberRepository.save(member);
        log.info(saved.toString());
        return "/index";
    }
}
