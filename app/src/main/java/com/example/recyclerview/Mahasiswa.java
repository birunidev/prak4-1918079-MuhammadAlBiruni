package com.example.recyclerview;

public class Mahasiswa {
    private String nama,nim,angkatan;
    public Mahasiswa(String nama, String nim, String angkatan){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getAngkatan(){
        return angkatan;
    }
    public void setAngkatan(String angkatan){
        this.angkatan = angkatan;
    }

}
