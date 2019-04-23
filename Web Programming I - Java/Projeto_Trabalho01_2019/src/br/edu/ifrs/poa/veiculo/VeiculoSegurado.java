package br.edu.ifrs.poa.veiculo;

import br.edu.ifrs.poa.pessoa.Cliente;

import java.util.Date;
import java.util.LinkedList;

public class VeiculoSegurado {
    private double kilometragem;
    private String placa;
    private static int cont = 0;
    private Apolice apolice;
    private Cliente cliente;
    private LinkedList<Modelo> modelos = new LinkedList<>();

    //Constructor
    public VeiculoSegurado(double kilometragem, String placa) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        cont++;
    }

    public VeiculoSegurado(double kilometragem, String placa,
                           Apolice apolice, Cliente cliente,
                           LinkedList<Modelo> modelos) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.apolice = apolice;
        this.cliente = cliente;
        this.modelos = modelos;
    }

    //Getter & setters
    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LinkedList<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(LinkedList<Modelo> modelos) {
        this.modelos = modelos;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public static int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        return "VeiculoSegurado{" +
                "kilometragem=" + kilometragem +
                ", placa='" + placa + '\'' +
                ", apolice=" + apolice +
                ", modelos=" + modelos +
                '}';
    }
}
