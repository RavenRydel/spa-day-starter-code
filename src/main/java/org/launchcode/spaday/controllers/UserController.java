package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")

    public Object displayAddUserForm(Model model){
        model.addAttribute("add");
        return model;
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (model.addAttribute("add.password") == model.addAttribute("add.verify")) {
            return "User/index";
        } else {
            return "User/add";
        }
    }
}
