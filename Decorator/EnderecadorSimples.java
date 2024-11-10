package com.mycompany.designpatterns_decorator;
public class EnderecadorSimples {
    public String preparaEndereco(Endereco endereco) {
    StringBuilder sb = new StringBuilder();
    sb.append(endereco.rua);
    sb.append("\n");
    sb.append(endereco.num);
    sb.append("\n");
    sb.append(endereco.complemento);
    sb.append('/');
    sb.append(endereco.cep);
    sb.append("\n");
    sb.append(endereco.ap);
    return sb.toString();
    }
}   
