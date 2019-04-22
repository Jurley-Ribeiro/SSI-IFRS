package br.edu.ifrs.poa.pessoa;

import br.edu.ifrs.poa.veiculo.VeiculoSegurado;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public class Cliente extends Pessoa{
    private String endereco;
    private String telefone;
    private LinkedList<VeiculoSegurado> veiculoSegurados = new LinkedList<>();

    //Constructor
    public Cliente(String nome, String dataNascimento, String endereco, String telefone) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Getters & setter
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LinkedList<VeiculoSegurado> getVeiculoSegurados() {
        return veiculoSegurados;
    }

    public void setVeiculoSegurados(LinkedList<VeiculoSegurado> veiculoSegurados) {
        this.veiculoSegurados = veiculoSegurados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Pessoa: " + super.toString() + '\'' +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculoSegurados=" + veiculoSegurados +
                '}';
    }
}
