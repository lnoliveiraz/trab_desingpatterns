package com.mycompany.designpatterns_decorator;
public class DesignPatterns_Decorator {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av. Dr. Adolpho Pinto", 109, "ao lado da estação barra funda", "01156-050", false);
        
        EnderecadorSimples enderecador = new EnderecadorSimples();
        EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecador);
        
        String enderecoFormatado = enderecadorCaixaAlta.preparaEndereco(endereco);
        
        System.out.println(enderecoFormatado);
    }
}
