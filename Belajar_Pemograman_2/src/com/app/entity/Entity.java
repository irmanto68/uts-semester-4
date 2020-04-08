/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

/**
 *
 * @author Lenovo
 */
public class Entity {
    private String nim;
    private String nama;
    private String jurusan;
    private String alamat;
    private String email;
    private String telpon;

    public Entity() {
    }

    public Entity(String nim, String nama, String jurusan, String alamat, String email, String telpon) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.email = email;
        this.telpon = telpon;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
    
    public Object getValue(int index) {
        
        switch (index) {
            case 0:
                return nim;
            case 1:
                return nama;
            case 2:
                return jurusan;
            case 3:
                return alamat;
            case 4:
                return email;
            case 5:
                return telpon;
            default:
                return null;
        }
    }
    
}
