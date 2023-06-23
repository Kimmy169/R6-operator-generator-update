package com.mycompany.r6_update;

public class Operator {
    
    private String name;
    private int id;
    private String specializace;
    //private String[] zbrane;
    private String bio;
    private String gadget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecializace() {
        return specializace;
    }

    public void setSpecializace(String specializace) {
        this.specializace = specializace;
    }

//    public String[] getZbrane() {
//        return zbrane;
//    }

//    public void setZbrane(String[] zbrane) {
//        this.zbrane = zbrane;
//    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGadget() {
        return gadget;
    }

    public void setGadget(String gadget) {
        this.gadget = gadget;
    }

    @Override
    public String toString() {
        return "Operator{" + "specializace=" + specializace + ", bio=" + bio + ", gadget=" + gadget + '}';
    }

    public Operator(int id, String specializace, String bio, String gadget) {
        this.id = id;
        this.specializace = specializace;
        this.bio = bio;
        this.gadget = gadget;
    }
    
    
}