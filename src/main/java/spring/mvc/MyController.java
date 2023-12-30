package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String first_view(){
        return "first_view";
    }

    @RequestMapping("/asc_details")
    public String askDetails(Model model){
        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setSurname("Smith");
        employee.setSalary(555);
        model.addAttribute("employee", employee);
        return "asc_details";
    }

    @RequestMapping("/show_details")
    public String show_details(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
        /* emp.setName("Mr. " + emp.getName());
        emp.setSurname(emp.getSurname() + "!!!");
        emp.setSalary(emp.getSalary()*10);*/
        if(bindingResult.hasErrors())
            return "asc_details";
        else
            return "show_details";
    }
}
