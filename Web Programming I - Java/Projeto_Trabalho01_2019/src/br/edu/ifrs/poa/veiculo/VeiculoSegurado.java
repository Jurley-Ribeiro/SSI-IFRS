package br.edu.ifrs.poa.veiculo;

import br.edu.ifrs.poa.pessoa.Cliente;


public class VeiculoSegurado {
    private double kilometragem;
    private String placa;
    private static int cont = 0;
    private Apolice apolice;
    private Cliente cliente;
    private Modelo modelo;

    //Constructor
    public VeiculoSegurado(double kilometragem, String placa) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        cont++;
    }

    public VeiculoSegurado(double kilometragem, String placa, Apolice apolice, Cliente cliente, Modelo modelo) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.apolice = apolice;
        this.cliente = cliente;
        this.modelo = modelo;
        cont++;
    }

    public VeiculoSegurado(double kilometragem, String placa, Apolice apolice, Modelo modelo) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.apolice = apolice;
        this.modelo = modelo;
    }

    public VeiculoSegurado() {
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

    public Apolice getApolice() {
        return apolice;
    }

    public static int getCont() {
        return cont;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "VeiculoSegurado{" +
                "kilometragem=" + kilometragem +
                ", placa='" + placa + '\'' +
                ", apolice=" + apolice.toString() +
                ", cliente=" + cliente +
                ", modelo=" + modelo.toString() +
                '}';
    }
}
