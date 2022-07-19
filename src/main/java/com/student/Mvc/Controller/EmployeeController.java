package com.student.Mvc.Controller;

import com.student.Mvc.Bean.Employee;
import com.student.Mvc.Dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author promise
 * @version 1.0
 */

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee_select",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("employeeList" ,employees);
        return "Employee";

    }
    @RequestMapping(value ="/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmplouee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee_select";
    }
    @RequestMapping(value = "/employee_add",method = RequestMethod.POST)
    public String addemployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee_select";
    }



}
