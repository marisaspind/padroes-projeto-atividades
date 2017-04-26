package padroes;

import Formularios.OpcaoVeiculo;
import Estacionamento.Veiculo;


public class CalculaValorAluguel {

    private double horas;
    
    private Veiculo veiculo;
    
    public CalculaValorAluguel(double horas, Veiculo veiculo) {
        this.horas = horas;
        this.veiculo = veiculo;
    }
    
    public Double realizarCalculo(Orcamento orcamento, Veiculo valorQualquer) {
        return valorQualquer.calcular(orcamento);
    }
    
    public Double execute() {
        
        Orcamento orcamento = new Orcamento(this.horas);
        
        return this.realizarCalculo(orcamento, this.veiculo);
    }
    
   

   

    
}
