package br.com.carros;

import java.util.Scanner;
/**
 * Classe que representa um carro manual
 * @author Breno Vinicius
 */
public class CarroManual extends Carro {

    private int marchaAtual = 0;
    private int quantidadeDeMarchas = 5;

    public CarroManual(String modelo) {
        super.modelo = modelo;
    }

    @Override
    protected void acelerar() {
        String valorEntrada = "";
        while (marchaAtual != quantidadeDeMarchas) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Pressione ENTER para passar a marcha: \n");
            valorEntrada = scanner.nextLine();
            passarMarcha();
            aumentarVelocidade();
            super.atualizarVelocimetro();
        }
    }


    @Override
    protected void desacelerar() {
        String valorEntrada = "";
        while (marchaAtual > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Pressione ENTER para reduzir a marcha: \n");
            valorEntrada = scanner.nextLine();
            reduzirMarcha();
            diminuirVelocidade();
            super.atualizarVelocimetro();
        }

    }

    @Override
    public String toString() {
        return "Carro Manual {" +
                "modelo=" + super.modelo +
                ", marchaAtual=" + marchaAtual +
                ", velocidade=" + velocidade +
                '}';
    }

    private void aumentarVelocidade() {
        this.velocidade += 50;
    }

    private void diminuirVelocidade() {
        this.velocidade -= 50;
    }

    private void passarMarcha() {
        this.marchaAtual++;
    }

    private void reduzirMarcha() {
        this.marchaAtual--;
    }
}
