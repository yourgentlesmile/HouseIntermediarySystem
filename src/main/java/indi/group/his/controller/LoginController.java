package indi.group.his.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import indi.group.his.model.UserInformation;
import indi.group.his.services.IUserInformationService;
import indi.group.his.services.IUserServices;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("")
public class LoginController {
	
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private IUserServices userServices = null;
    @Autowired
    private IUserInformationService userInformationService= null;
    public static String safecode="";
    /**
     * Describle:
     * This function use for recv null args (doesn't include "/" ) and return main page to user browse
     * 此方法接受0参数url请求，value="",并返回Index给用户，即重定向到主页
     */
   
    @GetMapping("/Index")
    public String Index(){
        return "Index";
    }
    @GetMapping("/loginsuccess")
    public String LoginSuccess(){
        return "loginsuccess";
    }
    /**
     * Describle:
     * This function use for push verification code to user browse 
     * 此方法用于前端获取验证码的String形式
     */
    @GetMapping("/Login/getsafecode")
    @ResponseBody
    public String getSafeCode() {
        logger.debug("getSafeCode hes been invoked");
        return safecode;
    }
    /**
     * Describle:
     * This function use for validate user submitted username and password
     * When check passed this function will redirct to......(doesn't realization)
     */
    @PostMapping("/Login/LoginCheck")
    @ResponseBody
    public String loginCheck(@RequestBody String value, HttpServletResponse response,HttpServletRequest request) {
        JSONObject jobject = JSONObject.parseObject(value);
        int result = userServices.UserLogin((String)jobject.get("username"), (String)jobject.get("password"));
        String username = (String)jobject.get("username");
        if(result == 1||result == 100){
            int userid = userServices.getUserId(username);
            Cookie ck = new Cookie("token", username + "/" + (result == 1?result:0));
            ck.setMaxAge(86400);
            logger.debug(ck.toString());
            logger.debug("token"+ username + "/" + userid);
            response.addCookie(ck);
            UserInformation userInformation = new UserInformation();
            userInformation.setUserId(userid);
            String realname = userInformationService.getUserInformation(userInformation, 0)[0].getRealName();
            logger.debug("[realname]: " + realname);
            request.getSession().setAttribute("username",realname);
        }
        return result+"";   //1:登录成功 0：登录失败 -1：用户名不存在
    }
    /**
     * Describle:
     * 获取request中的客户端IP地址
     */
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("http_client_ip");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        // 如果是多级代理，那么取第一个ip为客户ip
        if (ip != null && ip.indexOf(",") != -1) {
            ip = ip.substring(ip.lastIndexOf(",") + 1, ip.length()).trim();
        }
        return ip;
    }
}
