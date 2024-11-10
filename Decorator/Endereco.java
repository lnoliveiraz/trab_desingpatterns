package com.mycompany.designpatterns_decorator;
public class Endereco {
    //Atributos
    protected String rua;
    protected int num;
    protected String complemento;
    protected String cep;
    protected boolean ap;
    
    //Métodos
    public Endereco(String rua, int num, String complemento, String cep, boolean ap) {
        super();
        this.rua = rua;
        this.num = num;
        this.complemento = complemento;
        this.cep = cep;
        this.ap = ap;
    }
}
