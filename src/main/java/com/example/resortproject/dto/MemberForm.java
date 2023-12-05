package com.example.resortproject.dto;
import com.example.resortproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class MemberForm {
    private String name;
    private String email;
    private String pwd;
    private String tel;


    public Member toEntity(){
        return new Member(null,name,email,pwd,tel);
    }
}
