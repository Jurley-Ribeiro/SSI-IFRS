package br.edu.ifrs.poa.pessoa;

import br.edu.ifrs.poa.veiculo.VeiculoSegurado;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public class Cliente extends Pessoa{
    private String endereco;
    private String telefone;
    private LinkedList<VeiculoSegurado> veiculosSegurados = new LinkedList<>();

    //Constructor


    public Cliente(String nome, LocalDate dataNascimento, String endereco, String telefone, LinkedList<VeiculoSegurado> veiculosSegurados) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculosSegurados = veiculosSegurados;
    }

    public Cliente(){

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
        return veiculosSegurados;
    }

    public void setVeiculosSegurados(LinkedList<VeiculoSegurado> veiculosSegurados) {
        this.veiculosSegurados = veiculosSegurados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Pessoa: " + super.toString() + '\'' +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculosSegurados=" + veiculosSegurados +
                '}';
    }
}
