package com.mycompany.r6_update;

import java.util.Arrays;

public class Weapon {

    WeaponTypes weaponType;
    private String name;
    private String[] sights;
    private String[] barrels;
    private String[] grips;
    private boolean underBarrel;

    //Primary
    public Weapon(WeaponTypes weaponType, String name, String[] sights, String[] barrels, String[] grips, boolean underBarrel) {
        this.weaponType = weaponType;
        this.name = name;
        this.sights = sights;
        this.barrels = barrels;
        this.grips = grips;
        this.underBarrel = underBarrel;
    }

    //Secondary
    public Weapon(WeaponTypes weaponType, String name, String[] barrels, boolean underBarrel) {
        this.weaponType = weaponType;
        this.name = name;
        this.barrels = barrels;
        this.underBarrel = underBarrel;
    }

    //Shield
    public Weapon(WeaponTypes weaponType, String name) {
        this.weaponType = weaponType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSights() {
        return sights;
    }

    public void setSights(String[] sights) {
        this.sights = sights;
    }

    public String[] getBarrels() {
        return barrels;
    }

    public void setBarrels(String[] barrels) {
        this.barrels = barrels;
    }

    public String[] getGrips() {
        return grips;
    }

    public void setGrips(String[] grips) {
        this.grips = grips;
    }

    public boolean isUnderBarrel() {
        return underBarrel;
    }

    public void setUnderBarrel(boolean underBarrel) {
        this.underBarrel = underBarrel;
    }

    @Override
    public String toString() {
        return "Weapon{" + "typ"+ weaponType + "name=" + name + ", sights=" + Arrays.toString(sights) + ", barrels=" + Arrays.toString(barrels) + ", grips=" + Arrays.toString(grips) + ", underBarrel=" + underBarrel + '}';
    }

    public String isHandgun() {

        return null;

    }

    public String isAssalutRifle() {

        return null;

    }

    public String isMachinePistol() {
        
        return null;
        
    }
    public String isShotgun() {

        return null;

    }

    public String isSubmachineGun() {

        return null;

    }

    public String isHandCannon() {
        
        return null;
        
    }
    
    public String isMarksmenRifle() {
        
        return null;
        
    }
    
    public String isShield() {
        
        return null;
        
    }
}
