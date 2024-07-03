package com.kulikuliner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.kulikuliner.data.entity.Makanan;
import com.kulikuliner.service.MakananService;


@Controller
public class MakananController {
    private MakananService makananService;
    public MakananController(MakananService makananService){
        this.makananService = makananService;
    }

    @GetMapping("/")
    public String showMakanan(Model model){
        model.addAttribute("makanan", makananService.getAllMakanan());
        return "index";
    }
    
    @GetMapping("/makanan/add")
    public String showMakananForm(Model model){
        Makanan makanan = new Makanan();
        model.addAttribute("makanan", makanan);
        return "addMakanan";
    }

    @PostMapping("/makanan/save")
    public String addMakanan(@ModelAttribute("makanan") Makanan makanan,
                           BindingResult result,
                           Model model) {
        makananService.saveMakanan(makanan);
        return "redirect:/";
    }

    @GetMapping("/makanan/ubahMakanan/{id}")
    public String updateMakananForm(@PathVariable("id") Long id, Model model) {
        Makanan makanan = makananService.getMakananById(id);
        model.addAttribute("makanan", makanan);
        return "editMakanan";
    }

    @PostMapping("/makanan/update/{id}")
    public String updateMakanan( @ModelAttribute("makanan") Makanan makanan, @ModelAttribute("id") Long id,
                           BindingResult result,
                           Model model) {
        makananService.updateMakanan(makanan, id);
        return "redirect:/";
    }

    @GetMapping("/makanan/deleteMakanan/{id}")
    public String deleteMakanan(@PathVariable("id") Long id, Model model) {
        Makanan makanan = makananService.getMakananById(id);

        makananService.deleteMakanan(id);
        return "redirect:/";
    }

}
