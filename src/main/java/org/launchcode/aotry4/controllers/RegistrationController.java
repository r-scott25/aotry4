package org.launchcode.aotry4.controllers;

import org.launchcode.aotry4.models.Registration;
import org.launchcode.aotry4.models.data.RegistrationDao;
import org.launchcode.aotry4.models.data.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
@RequestMapping("registration")
public class RegistrationController {


//static ArrayList<Registration> registrations = new ArrayList<>();

    @Autowired
    private RegistrationDao registrationDao;

@RequestMapping("")
public String index (Model model) {
    HashMap<String, String> registrations = new HashMap<>();
    model.addAttribute("registration", registrationDao.findAll());
    model.addAttribute("title", "Adventurers");

    return "registration/index";
}
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayRegistrationForm(Model model) {

        model.addAttribute(new Registration());
        return "registration/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processRegistrationForm(@ModelAttribute Registration newRegistration) {
        registrationDao.save(newRegistration);
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
        model.addAttribute("registrations", registrationDao.findAll());
        model.addAttribute("title", "Remove Reservation");
        return "registration/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveRegistrationForm(@RequestParam int[] userIds) {

        for (int userId : userIds) {
            registrationDao.delete(userId);
        }

        return "redirect:";
    }
}

