package Estacionamento;

import padroes.Orcamento;
import padroes.CalculaValorAluguel;

public class Moto implements Veiculo {
    private double imposto = 0.1;
    private double valor = 30;
    
    @Override
    public double calcular(Orcamento orcamento) {
    
       return orcamento.getHoras() * valor;
    }
    
    /**
     *
     * @return
     */
   
    
    @Override
    public String toString() {
        return "Moto";
    }
    
}
