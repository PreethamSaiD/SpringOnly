package org.example;


public class Dev {
    MegaMachine mc;
    Dev(){
        System.out.println("We are in the DEV class currently");
    }
    public void code() {
        System.out.println("This is a new project to learn Spring boot");
        mc.machineCode();

    }

    public MegaMachine getMc() {
        return mc;
    }

    public void setMc(MegaMachine mc) {
        this.mc = mc;
    }
}
