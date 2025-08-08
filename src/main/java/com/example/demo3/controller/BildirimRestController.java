package com.example.demo3.controller;

import com.example.demo3.entity.Bildirim;
import com.example.demo3.repository.BildirimRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bildirim")
public class BildirimRestController {

    private final BildirimRepository repo;

    public BildirimRestController(BildirimRepository repo) {
        this.repo = repo;
    }

    // eskiden "/X" idi; şimdi "/" getir tüm aktif bildirimleri
    @GetMapping
    public List<Bildirim> hepsi() {
        return repo.findByAktiflikDurumu("A");
    }
}
