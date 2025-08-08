package com.example.demo3.controller;

import com.example.demo3.repository.BildirimRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller html sayfası döndürür
// websayfası üretir
@Controller
public class BildirimController {

    private final BildirimRepository repo;
    public BildirimController(BildirimRepository repo) { this.repo = repo; }

    // internet sitesi döndürür
    // http://localhost:8080/bildirimler
    @GetMapping("/bildirimler")
    public String listele(Model model) {
        // sadece aktif üyeleri çekiyor
        var list = repo.findByAktiflikDurumu("A");
        model.addAttribute("bildirimler", list);
        // html döndürüyor burası bildirimler.html yi açar
        return "bildirimler";
    }
}