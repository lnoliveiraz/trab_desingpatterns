package com.mycompany.designpatterns_builder;
public class Endereco {
    //Atributos
    private String rua;
    private int num;
    private String complemento;
    private String cep;
    private boolean ap;
    
    //Métodos
    public static Endereco builder(){
        return new Endereco();
    }
    
    public Endereco rua(String rua){
        this.rua = rua;
        return this;
    }
    
    public Endereco num(int num){
        this.num = num;
        return this;
    }
    
    public Endereco complemento(String complemento){
        this.complemento = complemento;
        return this;
    }
    
    public Endereco cep(String cep){
        this.cep = cep;
        return this;
    }
    
    public Endereco ap(boolean ap){
        this.ap = ap;
        return this;
    }
    
    //Getters
    public String getRua() {
        return rua;
    }

    public int getNum() {
        return num;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public boolean getAp() {
        return ap;
    }
    
    //toString

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", num=" + num + ", complemento=" + complemento + ", cep=" + cep + ", ap=" + ap + '}';
    }
    
}
