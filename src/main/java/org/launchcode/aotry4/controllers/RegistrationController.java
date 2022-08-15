package org.launchcode.aotry4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("register")
public class RegistrationController {

static ArrayList<String> users = new ArrayList<>();

@RequestMapping("")
public String index (Model model) {

    model.addAttribute("users", users);
    model.addAttribute("title", "Register for Adventure");

    return "register/index";
}
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayRegistrationForm(Model model) {

        model.addAttribute("title", "Register for Adventure");
        return "register/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processRegistrationForm(@RequestParam String firstName) {

        users.add(firstName);
    return "redirect:";
    }
}

