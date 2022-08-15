package org.launchcode.aotry4.controllers;

import org.launchcode.aotry4.models.data.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.HashMap;

@Controller
@RequestMapping("account")
public class AccountPageController {

    @Autowired
    private AccountDao accountDao;


    @RequestMapping("")
    public String account(Model model) {
        HashMap<String, String> users = new HashMap<>();

        model.addAttribute("users", users);
        model.addAttribute("title", "My Account");
        return "account/index";
    }
}


