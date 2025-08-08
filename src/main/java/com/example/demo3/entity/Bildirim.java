package com.example.demo3.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;


// Entity bir veritabanı tablosuna karşılık gelir
// Table(name = "bildirim") ise direkt veritabanı tablosunun hangisi olduğunu belirler
@Entity
@Table(name = "bildirim")
public class Bildirim {

    //Id-------> Primary key
    // GeneratedValue--------->Serial key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bildirim_id")
    private Long bildirimId;

    @Column(name = "baslik", nullable = false)
    private String baslik;

    @Column(name = "icerik")
    private String icerik;

    @Column(name = "bildirim_turu")
    private String bildirimTuru;

    @Column(name = "kullanici_id")
    private Integer kullaniciId;

    @Column(name = "olusturulma_tarihi", nullable = false)
    private LocalDateTime olusturulmaTarihi;

    @Column(name = "guncellenme_tarihi")
    private LocalDateTime guncellenmeTarihi;

    @Column(name = "aktiflik_durumu", nullable = false)
    private String aktiflikDurumu;

    // Lombok kullanıyorsanız @Data ile getter/setter otomatik olur
    public Long getBildirimId() { return bildirimId; }
    public String getBaslik() { return baslik; }
    public String getIcerik() { return icerik; }
    public String getBildirimTuru() { return bildirimTuru; }
    public Integer getKullaniciId() { return kullaniciId; }
    public LocalDateTime getOlusturulmaTarihi() { return olusturulmaTarihi; }
    public LocalDateTime getGuncellenmeTarihi() { return guncellenmeTarihi; }
    public String getAktiflikDurumu() { return aktiflikDurumu; }

    public void setBildirimId(Long id) { this.bildirimId = id; }
    public void setBaslik(String baslik) { this.baslik = baslik; }
    public void setIcerik(String icerik) { this.icerik = icerik; }
    public void setBildirimTuru(String tur) { this.bildirimTuru = tur; }
    public void setKullaniciId(Integer id) { this.kullaniciId = id; }
    public void setOlusturulmaTarihi(LocalDateTime t) { this.olusturulmaTarihi = t; }
    public void setGuncellenmeTarihi(LocalDateTime t) { this.guncellenmeTarihi = t; }
    public void setAktiflikDurumu(String durum) { this.aktiflikDurumu = durum; }
}