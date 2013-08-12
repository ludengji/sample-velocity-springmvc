package com.sample.web.controller.user;



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
public class UserController {

    @RequestMapping(value="html/register",method = RequestMethod.POST)
    public String register(Model model){
        model.addAttribute("title","login");

        return "template/login";
    }
}
