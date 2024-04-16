package pe.edu.cibertec.warformulariosspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.warformulariosspring.model.LoginModel;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
}
