package com.lera.controller;

import com.lera.entity.Flower;
import com.lera.entity.FlowerBank;
import com.lera.service.FlowerBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by panser on 5/10/14.
 */
@Controller
@RequestMapping(value = "/flowerBank")
@SessionAttributes({"flower"})
public class FlowerBankController {
    @Autowired
    FlowerBankService flowerBankService;

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String listFlowerBank(Model model){
        model.addAttribute("flowerBanks", flowerBankService.findAll());
        return "flowerBank/listFlowerBanks";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String addFlowerBank(Model model){
        model.addAttribute("flower", new Flower());
        return "flowerBank/addFlower";
    }
    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String addFlower(@ModelAttribute("flower") Flower flower){
        FlowerBank flowerBank = new FlowerBank(flower,1);
        flowerBankService.save(flowerBank);
        return "redirect:/flowerBank/listFlowerBanks";
    }

}
