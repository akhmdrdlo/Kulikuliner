package com.kulikuliner.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "makanan")
public class Makanan {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_makanan;

    @Column
    private String asal;

    @Column
    private String deskripsi;

    @Column
    private String harga;
  
    public Makanan(String nama_makanan, String asal, String deskripsi, String harga) {
      this.nama_makanan = nama_makanan;
      this.asal = asal;
      this.deskripsi = deskripsi;
      this.harga = harga;
    }
  
    public Long getId() {
      return id;
    }
  
    public void setId(Long id) {
      this.id = id;
    }
  
    public String getNamaMakanan() {
      return nama_makanan;
    }
  
    public void setNamaMakanan(String nama_makanan) {
      this.nama_makanan = nama_makanan;
    }
  
    public String getAsal() {
      return asal;
    }
  
    public void setAsal(String asal) {
      this.asal = asal;
    }
  
    public String getDeskripsi() {
      return deskripsi;
    }
  
    public void setDeskripsi(String deskripsi) {
      this.deskripsi = deskripsi;
    }
  
    public String getHarga() {
      return harga;
    }
  
    public void setHarga(String harga) {
      this.harga = harga;
    }
  
    @Override
    public String toString() {
      return "Makanan [id=" + id + ", nama_makanan=" + nama_makanan + ", asal=" + asal + ", deskripsi=" + deskripsi
          + ", harga=" + harga + "]";
    }
  
}
