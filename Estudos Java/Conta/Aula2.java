package Conta;

public class Aula2 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Letícia");
        p1.abrirConta("CC");
        p1.estadoAtual();
    }
}
