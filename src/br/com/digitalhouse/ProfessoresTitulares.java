package br.com.digitalhouse;

public class ProfessoresTitulares extends Professor {

    private String especialidade;

    public ProfessoresTitulares(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
