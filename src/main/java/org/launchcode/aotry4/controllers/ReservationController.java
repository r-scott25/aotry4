package org.launchcode.aotry4.controllers;

import org.launchcode.aotry4.models.Reservation;
import org.launchcode.aotry4.models.data.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import org.launchcode.aotry4.persistent.models.Reservation;
//import org.launchcode.aotry4.persistent.models.data.ReservationDao;


@Controller
@RequestMapping("")
public class ReservationController {

    @Autowired
    private ReservationDao reservationDao;


    // Request path: /reservation
//    @RequestMapping("")
//    @GetMapping
//    public String index(Model model) {
//
//        model.addAttribute("reservations", reservationDao.findAll());
//        model.addAttribute("title", "My Reservations");
//
//        return "reservation/index";
//    }


    @GetMapping("/reservation")
    public String displayAddReservationForm() {
//        model.addAttribute("title", "Add Reservation");
        return "reservation/index";
    }

//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String processAddReservationForm(@ModelAttribute Reservation newReservation) {
//        reservationDao.save(newReservation);
//        return "redirect:";
//    }
//
//
//    @RequestMapping(value = "remove", method = RequestMethod.GET)
//    public String displayRemoveReservationForm(Model model) {
//        model.addAttribute("reservations", reservationDao.findAll());
//        model.addAttribute("title", "Remove Reservation");
//        return "reservation/remove";
//    }
//
//    @RequestMapping(value = "remove", method = RequestMethod.POST)
//    public String processRemoveReservationForm(@RequestParam int[] reservationIds) {
//
//        for (int reservationId : reservationIds) {
//            reservationDao.delete(reservationId);
//        }
//
//        return "redirect:";
//    }

}