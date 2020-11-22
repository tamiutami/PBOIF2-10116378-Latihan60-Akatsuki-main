/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akatsuki;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program yang berisikan karakter dari dari serial Naruto
 */
class Anggota extends Akatsuki{

  protected String nama;
   protected String ciri;
   protected String desa;
   protected String jutsu;
   protected String cincin;
   protected String posisi;
   protected String partner;

    public Anggota(String nama, String ciri, String desa, String jutsu, 
                   String cincin, String posisi, String partner, 
                   String kostum, String tujuan) {
        super(kostum, tujuan);
        this.nama = nama;
        this.ciri = ciri;
        this.desa = desa;
        this.jutsu = jutsu;
        this.cincin = cincin;
        this.posisi = posisi;
        this.partner = partner;
    }

    

    public String getCiri() {
        return ciri;
    }

    public String getDesa() {
        return desa;
    }

    public String getJutsu() {
        return jutsu;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getPartner() {
        return partner;
    }

    public String getNama() {
        return nama;
    }
    
    
   
   public void tampilAnggota() {
       System.out.println("Nama          : " + getNama());
       System.out.println("Ciri Khas     : " + getCiri());
       System.out.println("Asal Desa     : " + getDesa());
       System.out.println("Jutsu         : " + getJutsu());
       System.out.println("Nama Cincin   : " + getCincin());
       System.out.println("Posisi Cincin : " + getPosisi());
       System.out.println("Rekan Kerja   : " + getPartner());
       System.out.println("");
   }
}
