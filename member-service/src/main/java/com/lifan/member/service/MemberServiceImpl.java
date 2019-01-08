package com.lifan.member.service;

import com.lifan.member.mapper.LoginCookieMapper;
import com.lifan.member.mapper.MemberMapper;
import com.lifan.member.pojo.LoginCookie;
import com.lifan.member.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author LIFAN
 * 2018/12/27 12:57
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private LoginCookieMapper loginCookieMapper;

    @Override
    public Member getMemberById(int id) {
        return memberMapper.selectById(id);
    }

    @Override
    public Member getMemberByUsername(String username) {
        return memberMapper.selectByUsername(username);
    }

    @Override
    public void addMember(Member member) {
        memberMapper.addUser(member);
    }

    @Override
    public void changeCarInfo(String username,  String carType, String carNum) {
        memberMapper.changeCarInfo(username,carType,carNum);
    }

    @Override
    public Map<String, Object> login(String username, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        Member member = memberMapper.selectByUsername(username);
        if(member == null){
            map.put("msg","用户名不存在");
        }else if(!password.equals(member.getPassword())){
            map.put("msg","密码错误");
        }else{
            String ticket = addLoginTicket(member.getId());
            map.put("msg","OK");
            map.put("ticket",ticket);
        }
        return map;
    }

    @Override
    public void logout(String ticket) {
        loginCookieMapper.updateStatus(ticket, 1);
    }

    @Override
    public String ifTicket(String ticket) {
        LoginCookie loginCookie = loginCookieMapper.selectByTicket(ticket);
        if (loginCookie != null && loginCookie.getExpired().after(new Date()) && loginCookie.getStatus() != 1) {
            return "1";
        }
        return "0";
    }

    //添加登录ticket
    private String addLoginTicket(int userId) {
        LoginCookie ticket = new LoginCookie();
        ticket.setUserId(userId);
        Date date = new Date();
        date.setTime(date.getTime() + 1000*3600*24);
        ticket.setExpired(date);
        ticket.setStatus(0);
        ticket.setTicket(UUID.randomUUID().toString().replaceAll("-", ""));
        loginCookieMapper.addTicket(ticket);
        return ticket.getTicket();
    }

}
