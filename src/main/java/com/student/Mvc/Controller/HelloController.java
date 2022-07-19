package com.student.Mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author promise
 * @version 1.0
 */

@Controller
public class HelloController {


    @RequestMapping("/testParam")
    public String getparam(
            @RequestParam(value = "user_name",required = false) String username,
            String password,
            String like
    ){
        System.out.println(username);
        System.out.println(password);
        System.out.println(like);

        return "success";
    }

    @RequestMapping(value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET, RequestMethod.POST},
            params = {"username", "password=123456"})
    public String testRequestMapping() {

        return "success";
    }

    @RequestMapping(value = "/testModel")
    public String TestModel(Model model) {
        model.addAttribute("TestModel","Test,MModel");
        return "success";
    }

    @RequestMapping(value = "/testModelandView")
    public ModelAndView testModelandView() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("testrequestScop","hello,ModelandVie");
        modelAndView.setViewName("success");

        return modelAndView;
    }


    @RequestMapping(value = "/target")
    public String target() {
        return "target";
    }

}
