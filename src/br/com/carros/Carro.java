package br.com.carros;

/**
 * Classe que representa um carro
 * @author Breno Vinicius
 */
public abstract class Carro {

    protected String modelo = "Não identificado";

    protected double velocidade = 0.0;

    protected abstract void acelerar();

    protected abstract void desacelerar();


    public void andar() {
        System.out.println("Ligando o carro...");
        acelerar();
        System.out.println("Carro andando...");

    }

    public void parar() {
        System.out.println("Parando o carro...");
        desacelerar();
        System.out.println("Carro parado...");

    }

    protected void atualizarVelocimetro() {
        System.out.println(toString());
    }

}
