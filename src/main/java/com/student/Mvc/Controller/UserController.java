package com.student.Mvc.Controller;

import com.student.Mvc.Bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author promise
 * @version 1.0
 */
@Controller
public class UserController {




    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("getAllUser");
        return "success";
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("getUserById");
        return "success";
    }

    @RequestMapping(value ="/user" ,method = RequestMethod.POST)
    public String inserUser(String username, String password){
        System.out.println(username+""+password);
        System.out.println("POSTUserById");
        return "success";
    }
    @RequestMapping(value ="/user" ,method = RequestMethod.PUT)
    public String PutUser(String username, String password){
        System.out.println(username+""+password);
        System.out.println("PUTUserById");
        return "success";
    }
}
