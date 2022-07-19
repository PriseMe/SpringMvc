package com.student.Mvc.Controller;

import com.student.Mvc.Bean.Employee;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author promise
 * @version 1.0
 */
@Controller
public class HttpContronller {

    //    @RequestMapping(value = "/testTequestBody",method = RequestMethod.POST)
//    public String testTequestBody(@RequestBody String requestBody){
//        System.out.println(requestBody);
//        return "success";
//    }
    @RequestMapping(value = "/testTequestBody", method = RequestMethod.POST)
    public String testTequestBody(RequestEntity<String> requestEntity) {
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public Employee testResponseUser() {
        return new Employee(1001, "admin", "123456", 0);
    }
}
