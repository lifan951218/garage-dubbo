package com.lifan.member.service;

import com.lifan.member.pojo.Member;

import java.util.Map;

/**
 * @author LIFAN
 * 2018/12/26 16:38
 */
public interface MemberService {

    Member getMemberById(int id);

    Member getMemberByUsername(String username);

    void addMember(Member member);

    void changeCarInfo(String username, String carType , String carNum);

    Map<String,Object> login(String username, String password);

    void logout(String ticket);

    String ifTicket(String ticket);


}
