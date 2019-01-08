package com.lifan.dubbo.consumer.controller;

import com.lifan.common.utils.JSONResult;
import com.lifan.member.pojo.Member;
import com.lifan.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.Map;

/**
 * @author LIFAN
 * 2018/12/27 13:42
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    //获得用户车信息
    @RequestMapping(value = "/get_car_info",method = {RequestMethod.GET})
    public Member getMemberCarInfo(@RequestParam("username") String username) {
        return memberService.getMemberByUsername(username);
    }

    //修改用户车信息
    @RequestMapping(value = "/change_car_info",method = {RequestMethod.POST})
    public JSONResult changeMemberCarInfo(@RequestParam("username") String username,
                                          @RequestParam("carType") String carType,
                                          @RequestParam("carNum") String carNum) {
        memberService.changeCarInfo(username,carType,carNum);
        return JSONResult.ok();
    }

    //登录验证
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String login(@RequestParam("username") String username,
                      @RequestParam("password") String password,
                        HttpServletResponse response) {
        Map<String, Object> map = memberService.login(username, password);

        //存入用户ticket到cookie中
        if (map.containsKey("ticket")) {
            Cookie cookie = new Cookie("ticket", map.get("ticket").toString());
            //System.out.println(cookie);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        return map.get("msg").toString();
    }

    @RequestMapping(value = "/ifTicket",method = {RequestMethod.POST})
    public String ifTicket(@RequestParam("ticket") String ticket) {
        String ifTicket = memberService.ifTicket(ticket);
        return ifTicket;
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    public String logout(@CookieValue("ticket") String ticket) {
        memberService.logout(ticket);
        return "1";
    }

}
