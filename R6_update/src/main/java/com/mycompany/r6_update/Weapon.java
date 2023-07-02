package com.mycompany.r6_update;

public class Weapon implements Cloneable{

    WeaponTypes weaponType;
    private String name;
    private int id;
//    private String[] sights;
//    private String[] barrels;
//    private String[] grips;
//    private boolean underBarrel;

    //Primary
    public Weapon(WeaponTypes weaponType, String name, int id/*String[] sights, String[] barrels, String[] grips, boolean underBarrel*/) {
        this.weaponType = weaponType;
        this.name = name;
        this.id = id;
//        this.sights = sights;
//        this.barrels = barrels;
//        this.grips = grips;
//        this.underBarrel = underBarrel;
    }

    //Secondary
//    public Weapon(WeaponTypes weaponType, String name, String[] barrels, boolean underBarrel) {
//        this.weaponType = weaponType;
//        this.name = name;
//        this.barrels = barrels;
//        this.underBarrel = underBarrel;
//    }

    //Shield
//    public Weapon(WeaponTypes weaponType, String name) {
//        this.weaponType = weaponType;
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponTypes getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponTypes weaponType) {
        this.weaponType = weaponType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

//    public String[] getSights() {
//        return sights;
//    }
//
//    public void setSights(String[] sights) {
//        this.sights = sights;
//    }
//
//    public String[] getBarrels() {
//        return barrels;
//    }
//
//    public void setBarrels(String[] barrels) {
//        this.barrels = barrels;
//    }
//
//    public String[] getGrips() {
//        return grips;
//    }
//
//    public void setGrips(String[] grips) {
//        this.grips = grips;
//    }
//
//    public boolean isUnderBarrel() {
//        return underBarrel;
//    }
//
//    public void setUnderBarrel(boolean underBarrel) {
//        this.underBarrel = underBarrel;
//    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponType=" + weaponType + ", name=" + name + ", id=" + id + '}';
    }

}
