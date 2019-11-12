package br.com.carros;

/**
 * Classe que representa um carro automatico
 * @author Breno Vinicius
 */
public class CarroAutomatico extends Carro {

    private int marchaAtual = 0;
    private int quantidadeDeMarchas = 5;

    public CarroAutomatico(String modelo) {
        super.modelo = modelo;
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando...");
        while (marchaAtual < quantidadeDeMarchas) {
            passarMarcha();
            aumentarVelocidade();
            super.atualizarVelocimetro();
        }
    }

    @Override
    protected void desacelerar() {
        System.out.println("Acionando os freios...");
        while (marchaAtual > 0) {
            reduzirMarcha();
            diminuirVelocidade();
            super.atualizarVelocimetro();
        }
    }

    @Override
    public String toString() {
        return "Carro Automatico {" +
                "modelo=" + super.modelo +
                ", marchaAtual=" + marchaAtual +
                ", velocidade=" + velocidade +
                '}';
    }

    private void aumentarVelocidade() {
        this.velocidade += 30;
    }

    private void diminuirVelocidade() {
        this.velocidade -= 30;
    }

    private void passarMarcha() {
        this.marchaAtual++;
    }

    private void reduzirMarcha() {
        this.marchaAtual--;
    }
}
