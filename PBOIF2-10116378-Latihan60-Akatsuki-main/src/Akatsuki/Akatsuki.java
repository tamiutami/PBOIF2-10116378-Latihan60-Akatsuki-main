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
class Akatsuki {
       protected String kostum;
   protected String tujuan;

    public Akatsuki(String kostum, String tujuan) {
        this.kostum = kostum;
        this.tujuan = tujuan;
    }

    public String getKostum() {
        return kostum;
    }

    public String getTujuan() {
        return tujuan;
    }
   
   public void tampilAkatsuki() {
       System.out.println("====Data Lengkap Anggota Akatsuki====");
       System.out.println("");
       System.out.println("Kostum : " + getKostum());
       System.out.println("Tujuan : " + getTujuan());
       System.out.println("");
   }
}
