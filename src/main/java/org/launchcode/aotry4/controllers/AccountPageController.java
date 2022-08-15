package org.launchcode.aotry4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("account")
public class AccountPageController {

    static ArrayList<String> users = new ArrayList<>();

    @RequestMapping("")
    public String account(Model model) {
        ArrayList<String>users = new ArrayList<>();

        model.addAttribute("users", users);
        model.addAttribute("title", "My Account");
        return "account/index";
    }
}


