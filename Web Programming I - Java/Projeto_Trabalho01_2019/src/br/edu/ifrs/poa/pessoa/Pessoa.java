package br.edu.ifrs.poa.pessoa;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public abstract class Pessoa {
    private String nome;
    private String dataNascimento;

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/YYYY");


    //getters & setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    public String getDateFormat(){
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        String dataFormat = formato.format(dataNascimento);
//        return dataFormat;
//    }
    //constructor
    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
