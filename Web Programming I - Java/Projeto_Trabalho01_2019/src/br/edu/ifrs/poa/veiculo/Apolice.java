package br.edu.ifrs.poa.veiculo;

import java.time.LocalDate;
import java.util.Date;

public class Apolice {
    private long numero;
    private LocalDate data, dataValidade;
    private int situacao;
    private String seguradora;
    private SituacaoApolice situacaoApolice;

    //Constructor
    public Apolice(long numero, LocalDate data, LocalDate dataValidade, int situacao, String seguradora, SituacaoApolice situacaoApolice) {
        this.numero = numero;
        this.data = data;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
        this.seguradora = seguradora;
        this.situacaoApolice = situacaoApolice;
    }

    public Apolice() {
    }

    public Apolice(long numero, LocalDate data, LocalDate dataValidade, String seguradora) {
        this.numero = numero;
        this.data = data;
        this.dataValidade = dataValidade;
        this.seguradora = seguradora;
    }

    //Getters & setters
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public void addDtApolice(int ano, int mes, int dia){
        LocalDate addDataApolice = LocalDate.of(ano, mes, dia);
        setDataValidade(addDataApolice);
    }

    @Override
    public String toString() {
        return "Apolice{" + + '\n' +
                "numero=" + numero +
                ", data=" + data +
                ", dataValidade=" + dataValidade +
                ", situacao=" + situacao +
                ", seguradora='" + seguradora + '\'' +
                ", situacaoApolice=" + situacaoApolice +
                '}';
    }
}
