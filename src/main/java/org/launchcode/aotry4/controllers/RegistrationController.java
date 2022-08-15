package org.launchcode.aotry4.controllers;

import org.launchcode.aotry4.models.Registration;
import org.launchcode.aotry4.models.RegistrationData;
import org.launchcode.aotry4.models.ReservationData;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;


@Controller
@RequestMapping("registration")
public class RegistrationController {

//static ArrayList<Registration> registrations = new ArrayList<>();

@RequestMapping("")
public String index (Model model) {
    HashMap<String, String> registrations = new HashMap<>();
    model.addAttribute("registration", RegistrationData.getAll());
    model.addAttribute("title", "Adventurers");

    return "registration/index";
}
    @RequestMapping("add")
    public String displayRegistrationForm(Model model) {

        model.addAttribute(new Registration());
        return "registration/add";
    }

    @RequestMapping("add")
    public String processRegistrationForm(@RequestParam String firstName, @RequestParam String lastName,
                                          @RequestParam("birthdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date birthdate, @RequestParam String password,
                                          @RequestParam String confirmPassword) {
    Registration newRegistration = new Registration(firstName, lastName, birthdate, password, confirmPassword);
        RegistrationData.add(newRegistration);
    return "redirect:";
    }

//    @RequestMapping("view")
//    public String displayViewRegisteredUser(Model model, @PathVariable int userId) {
//
////    model.addAttribute("registration", registration);
////    return "registration/view";
//
//        return "redirect:../";
//    }


    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveRegistrationForm(Model model) {
        model.addAttribute("registrations", RegistrationData.getAll());
        model.addAttribute("title", "Remove Reservation");
        return "registration/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveRegistrationForm(@RequestParam int[] userIds) {

        for (int userId : userIds) {
            RegistrationData.remove(userId);
        }

        return "redirect:";
    }
}

