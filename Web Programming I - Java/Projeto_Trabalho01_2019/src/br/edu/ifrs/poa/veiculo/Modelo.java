package br.edu.ifrs.poa.veiculo;

public final class Modelo {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
