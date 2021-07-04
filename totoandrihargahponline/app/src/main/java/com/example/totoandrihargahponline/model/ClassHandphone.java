package com.example.totoandrihargahponline.model;
public class ClassHandphone {
    private Integer id;
    private String nama;
    private String harga;
    public ClassHandphone() {
        super();
    }
    public ClassHandphone(Integer id, String nama, String harga
    ) {
        super();
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
}