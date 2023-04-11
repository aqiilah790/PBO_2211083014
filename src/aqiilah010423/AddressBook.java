/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah010423;

/**
 *
 * @author User
 */
public class AddressBook {
    public static void main(String[] args) {
        // contoh penggunaan class BukuAlamat
        AddressBookEntry[] daftarAlamat = new AddressBookEntry[100];
        AddressBookEntry[] aqiil = new AddressBookEntry[100];
        
        aqiil[0] = new AddressBookEntry();
        aqiil[0].setName("aqiil");
        aqiil[0].setAddress("Padang");
        aqiil[0].setPhoneNumber("082134567890");
        aqiil[0].setEmail("aqill@gmail.com");
        
        aqiil[1] = new AddressBookEntry();
        aqiil[1].setName("Sri");
        aqiil[1].setAddress("Bukittinggi");
        aqiil[1].setPhoneNumber("081234567890");
        aqiil[1].setEmail("Sri@gmail.com");
        
        aqiil[1] = null;
        
        for (AddressBookEntry alamat : aqiil) {
            if (alamat != null) {
                System.out.println("Nama            : " + alamat.getName());
                System.out.println("Alamat          : " + alamat.getAddress());
                System.out.println("Nomor Telepon   : " + alamat.getPhoneNumber());
                System.out.println("Alamat Email    : " + alamat.getEmail());
                System.out.println();
            }
        }
        
        aqiil[0].setPhoneNumber("081234567891");
        System.out.println("Nomor Telepon " + aqiil[0].getName() + " telah diupdate");
        System.out.println("Nomor Telepon terbaru: " + aqiil[0].getPhoneNumber());
        System.out.println();
    }
}
        
        /*
        // memasukkan data
        daftarAlamat[0] = new AddressBookEntry("John Doe", "Jl. Merdeka No. 10", "081234567890", "johndoe@gmail.com");
        daftarAlamat[1] = new AddressBookEntry("Muhammad", "Jl. Sudirman No. 15", "081234567891", "Muhammad@yahoo.com");
        
        // menghapus data
        daftarAlamat[1] = null;
        
        // menampilkan seluruh data
        for (AddressBookEntry alamat : daftarAlamat) {
            if (alamat != null) {
                System.out.println("Nama: " + alamat.getName());
                System.out.println("Alamat: " + alamat.getAddress());
                System.out.println("Nomor Telepon: " + alamat.getPhoneNumber());
                System.out.println("Alamat Email: " + alamat.getEmail());
                System.out.println();
            }
        }
        
        // update data
        daftarAlamat[0].setPhoneNumber("081234567891");
        System.out.println("Nomor Telepon " + daftarAlamat[0].getName() + " telah diupdate");
        System.out.println("Nomor Telepon terbaru: " + daftarAlamat[0].getPhoneNumber());
    }*/



