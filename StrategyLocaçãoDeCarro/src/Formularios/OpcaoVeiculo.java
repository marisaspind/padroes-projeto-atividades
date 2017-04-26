package Formularios;

import Estacionamento.CarroCategoriaB;
import Estacionamento.Moto;
import Estacionamento.Veiculo;
import Estacionamento.Caminhao;
import Estacionamento.CarroCategoriaA;
import Estacionamento.CarroCategoriaC;


public enum OpcaoVeiculo {
     Moto(new Moto()), 
     CarroCategoriaA(new CarroCategoriaA()), 
     CarroCategoriaB(new CarroCategoriaB()), 
     CarroCategoriaC(new CarroCategoriaC()),
     Caminhão(new Caminhao());

    private final Veiculo imposto;

    private OpcaoVeiculo(Veiculo opcao) {
        this.imposto = opcao;
    }

    public Veiculo getImposto() {
        return this.imposto;
    }
    
    @Override
    public String toString() {
        return this.imposto.toString();
    }

}
