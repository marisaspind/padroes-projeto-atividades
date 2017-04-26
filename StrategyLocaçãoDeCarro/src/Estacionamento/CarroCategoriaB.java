package Estacionamento;

import padroes.Orcamento;


public class CarroCategoriaB implements Veiculo {
    
    private double imposto = 0.2;
    private double valor = 60;
    
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
   

    @Override
    public String toString() {
        return "Carro  Categoria B";
    }

}
