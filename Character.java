package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int health; // atau hitPoints sesuai implementasi sebelumnya
    private int mana;   // 1. Atribut private baru mana (tipe int)

    // Konstruktor Default
    public Character() {
        this.name = "Unknown";
        this.type = CharacterType.WARRIOR;
        this.level = 1;
        this.health = 100;
        this.mana = 50;
    }

    // Konstruktor dengan Parameter
    public Character(String name, CharacterType type, int level, int health, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
        setMana(mana); // Menggunakan setter agar tervalidasi
    }

    // Getter dan Setter standar untuk atribut lain...
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public CharacterType getType() { return type; }
    public void setType(CharacterType type) { this.type = type; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    // 2. Getter getMana() dan setter setMana(int mana) dengan validasi
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Nilai mana tidak boleh negatif!");
        }
        this.mana = mana;
    }

    // 3. Method baru isAlive() -> true jika health / hitPoints > 0[cite: 2]
    public boolean isAlive() {
        return this.health > 0;
    }

    // 4. toString() diperbarui untuk menampilkan mana[cite: 2]
    @Override
    public String toString() {
        return "Character{name='" + name + 
               "', type=" + type + 
               ", level=" + level + 
               ", health=" + health + 
               ", mana=" + mana + "}";
    }
}