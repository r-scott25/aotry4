package org.launchcode.aotry4.controllers;

import org.launchcode.aotry4.models.Reservation;
import org.launchcode.aotry4.models.data.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationDao reservationDao;
    // Request path: /reservation
    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("reservations", ReservationData.getAll());
        model.addAttribute("title", "My Reservations");

        return "reservation/index";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayAddReservationForm(Model model) {
        model.addAttribute("title", "Add Reservation");
        return "reservation/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddReservationForm(@ModelAttribute Reservation newReservation) {
        ReservationData.add(newReservation);
        return "redirect:";
    }


    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveReservationForm(Model model) {
        model.addAttribute("reservations", ReservationData.getAll());
        model.addAttribute("title", "Remove Reservation");
        return "reservation/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveReservationForm(@RequestParam int[] reservationIds) {

        for (int reservationId : reservationIds) {
            ReservationData.remove(reservationId);
        }

        return "redirect:";
    }

}