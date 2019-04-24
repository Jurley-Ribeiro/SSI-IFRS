package br.edu.ifrs.poa.pessoa;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public class Usuario extends Pessoa{
    private String identificador;
    private String senha;

    //Constructor
    public Usuario(String nome, LocalDate dataNascimento, String identificador, String senha) {
        super(nome, dataNascimento);
        this.identificador = identificador;
        this.senha = senha;
    }

    public Usuario(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);

    }

    public Usuario() {
    }

    //getters & setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void addDtNasc(int ano, int mes, int dia){
        LocalDate addData = LocalDate.of(ano, mes, dia);
        setDataNascimento(addData);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Pessoa: " + super.toString() + '\'' +
                "identificador='" + identificador + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
