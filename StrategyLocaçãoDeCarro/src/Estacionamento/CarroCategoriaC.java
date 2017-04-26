package Estacionamento;

import padroes.Orcamento;


public class CarroCategoriaC implements Veiculo {
    
    private double imposto = 0.25;
    private double valor = 70;
    

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getHoras()* valor;
    }
    
  

    @Override
    public String toString() {
        return "Carro  Categoria C";
    }

}
