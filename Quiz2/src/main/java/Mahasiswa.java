/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private int angkatan;
    private String kode_jurusan;
   
    public Mahasiswa() {
        
    }

    public Mahasiswa(String nim, String nama, int angkatan, String kode_jurusan) {
        super();
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
    }

    public String getnim() {
        return nim;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getnama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = nama;
    }

    public int getangkatan() {
        return angkatan;
    }

    public void setkodejurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
