package Estacionamento;

import padroes.Orcamento;


public interface Veiculo {

    public double calcular(Orcamento orcamento);
    
    
    @Override
    public String toString();

    

}


