package br.edu.ifrs.poa.pessoa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    //constructor
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {
    }

    //getters & setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String formataDataNascimento(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formato = formato.withResolverStyle(ResolverStyle.STRICT);
        String dataFormatada = (dataNascimento.format(formato));
        return dataFormatada;
    }

    @Override
    public String toString() {
        return " " +
                "Nome= '" + nome + '\'' +
                ", Data nascimento= '" + formataDataNascimento() +
                "'" +
                ' ';
    }

}
