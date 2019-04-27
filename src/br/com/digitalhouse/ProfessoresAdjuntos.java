package br.com.digitalhouse;

public class ProfessoresAdjuntos extends Professor {

    public ProfessoresAdjuntos(Integer quantidadeHorasMonitoria) {
        this.quantidadeHorasMonitoria = quantidadeHorasMonitoria;
    }

    private Integer quantidadeHorasMonitoria;

    public Integer getQuantidadeHorasMonitoria() {
        return quantidadeHorasMonitoria;
    }

    public void setQuantidadeHorasMonitoria(Integer quantidadeHorasMonitoria) {
        this.quantidadeHorasMonitoria = quantidadeHorasMonitoria;
    }
}
