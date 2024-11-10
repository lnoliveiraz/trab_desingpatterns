package com.mycompany.designpatterns_command;
public class Luz {
    private String local;

    public Luz(String local) {
        this.local = local;
    }

    public void ligar() {
        System.out.println("A luz da " + local + " foi ligada.");
    }

    public void desligar() {
        System.out.println("A luz da " + local + " foi desligada.");
    }
}
