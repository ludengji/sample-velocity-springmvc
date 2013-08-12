package com.sample.web.controller.login;

import com.sample.bean.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: MEISEI
 * Date: 13-8-9
 * Time: 下午5:17
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {

    @RequestMapping(value="html/login",method = RequestMethod.POST)
    public String login(User user,Model model){
        model.addAttribute("title","personal page");
        model.addAttribute("userName",user.getUserName());
        user.setAddress("new york");  // set a default city
        model.addAttribute("address",user.getAddress());

        return "template/profile";
    }
}
