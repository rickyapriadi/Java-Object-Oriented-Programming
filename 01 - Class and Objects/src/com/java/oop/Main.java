package com.java.oop;

// class
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
}

public class Main {
    public static void main(String[] args) {

        // object
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.nama = "ricky";
        mahasiswa.NIM = "2014220038";
        mahasiswa.jurusan = "teknik informatika";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);

        System.out.println();

        mahasiswa.nama = "apriadi";
        mahasiswa.NIM = "2014220039";
        mahasiswa.jurusan = "teknik industri";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);

        System.out.println();

        new Mahasiswa(); // object

        mahasiswa.nama = "galang";
        mahasiswa.NIM = "12345";
        mahasiswa.jurusan = "teknik";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);
    }
}
