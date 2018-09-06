package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by max on 9/3/18.
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public @ResponseBody
    List<User> getUsers(){
        return userService.getUsres();
    }

    @RequestMapping(value = "/validate",method = RequestMethod.GET)
    public ModelAndView checkUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userfromserver", new User());
        modelAndView.setViewName("checkUser");
        return modelAndView;
    }

    @RequestMapping(value = "/checker",method = RequestMethod.POST)
    public @ResponseBody String checkUser(@ModelAttribute("userfromserver") User user){
        if("admin".equals(user.getName())&&"admin".equals(user.getPassword())){
            return  "Valid";
        }
        return "notValid";
    }
}
