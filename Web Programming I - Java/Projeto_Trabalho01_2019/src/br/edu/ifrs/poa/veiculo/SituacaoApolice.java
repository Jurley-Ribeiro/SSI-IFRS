package br.edu.ifrs.poa.veiculo;

public enum SituacaoApolice {
    EM_NEGOCIACAO(1, "Em negociação"),
    CANCELADA(2, "Cancelado"),
    QUITADA(3, "Quitada"),
    PARCELADA(4, "Parcelada");

    private int codSituacaoApolice;
    private String nomeSituacaoApolice;

    SituacaoApolice(int codSituacaoApolice, String nomeSituacaoApolice) {
        this.codSituacaoApolice = codSituacaoApolice;
        this.nomeSituacaoApolice = nomeSituacaoApolice;
    }

    public int getCodSituacaoApolice() {
        return codSituacaoApolice;
    }

    public String getNomeSituacaoApolice() {
        return nomeSituacaoApolice;
    }
}
