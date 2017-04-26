package Estacionamento;

import padroes.Orcamento;


public class CarroCategoriaA implements Veiculo {
    
    private double imposto = 0.15;
    private double valor = 50;
    

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
  

    @Override
    public String toString() {
        return "Carro Categoria A";
    }

}
