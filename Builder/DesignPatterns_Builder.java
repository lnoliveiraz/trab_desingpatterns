package com.mycompany.designpatterns_builder;
public class DesignPatterns_Builder {
    public static void main(String[] args) {
        var endereco = Endereco.builder()
                .rua("Av. Dr. Adolpho Pinto")
                .num(109)
                .complemento("Ao lado da estação Barra Funda")
                .cep("01156-050")
                .ap(false);
        
        System.out.println(endereco);
    }
}
