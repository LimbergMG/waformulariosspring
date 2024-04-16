package pe.edu.cibertec.warformulariosspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.warformulariosspring.model.LoginModel;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @PostMapping("/login")
    public String validarLogin(@ModelAttribute("loginModel")
                                   LoginModel loginModel, Model model){
        if(loginModel.getUsuario().equals("lsalvatierra") &&
                loginModel.getPassword().equals("123")){
            return"home";
        }
        return "login";

    }
}
