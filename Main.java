package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        // Menjalankan objek awal
        Character char1 = new Character("Arthur", CharacterType.WARRIOR, 1, 150, 50);

        System.out.println("=== DATA KARAKTER AWAL ===");
        System.out.println(char1);

        // Poin 5: Di Main.java, buat 1 karakter baru, set mana-nya, panggil isAlive(), cetak hasilnya ke console
        System.out.println("\n=== PENGUJIAN FITUR BARU (BAGIAN B) ===");
        Character newHero = new Character();
        
        newHero.setName("Zoe");
        newHero.setType(CharacterType.MAGE);
        newHero.setHealth(75); // Menggunakan setHealthPoints yang benar
        newHero.setMana(120);

        // Menampilkan data karakter baru
        System.out.println(newHero);

        // Memanggil method isAlive() dan mencetaknya ke konsol
        boolean statusHidup = newHero.isAlive();
        System.out.println("Apakah " + newHero.getName() + " masih hidup? " + statusHidup);
    }
}