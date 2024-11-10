package com.mycompany.designpatterns_command;
public class ControleRemoto {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando() {}
}
