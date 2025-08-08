package com.example.demo3.repository;

import com.example.demo3.entity.Bildirim;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BildirimRepository extends JpaRepository<Bildirim, Long> {
    List<Bildirim> findByAktiflikDurumu(String durum);
}// SELECT * FROM bildirim WHERE aktiflik_durumu = ?;