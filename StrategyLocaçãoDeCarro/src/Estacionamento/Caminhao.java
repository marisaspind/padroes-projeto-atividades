package Estacionamento;

import padroes.Orcamento;


public class Caminhao implements Veiculo {
    
    private double imposto = 0.3;
    private double valor = 150;
    private Orcamento orcamento;
   
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras() * valor;
    }
    

    @Override
    public String toString() {
        return "Caminhão";
    }

   
}
