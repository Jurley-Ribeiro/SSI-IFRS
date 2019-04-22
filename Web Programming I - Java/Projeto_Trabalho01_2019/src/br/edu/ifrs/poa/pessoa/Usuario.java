package br.edu.ifrs.poa.pessoa;

import java.util.Date;

/**
 *
 * @author Jurley C. Ribeiro - Matricula ID: 0751090
 */
public class Usuario extends Pessoa{
    private String identificador;
    private String senha;

    //Constructor
    public Usuario(String nome, String dataNascimento, String identificador, String senha) {
        super(nome, dataNascimento);
        this.identificador = identificador;
        this.senha = senha;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "Pessoa: " + super.toString() + '\'' +
                "identificador='" + identificador + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
