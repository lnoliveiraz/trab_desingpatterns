package com.mycompany.designpatterns_command;
public class DesignPatterns_Command {
    public static void main(String[] args) {
        Luz salaLuz = new Luz("Sala");

        Comando LigarLuz = new ComandoLigarLuz(salaLuz);
        Comando DesligarLuz = new ComandoDesligarLuz(salaLuz);

        ControleRemoto controleRemoto = new ControleRemoto();
        
        // Ligar a luz da sala
        controleRemoto.setComando(LigarLuz);
        controleRemoto.executarComando();

        // Desligar a luz da sala
        controleRemoto.setComando(DesligarLuz);
        controleRemoto.executarComando();
    }
}
