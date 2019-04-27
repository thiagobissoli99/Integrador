package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessoresAdjuntos professorAdjunto;
    private ProfessoresTitulares professoresTitulares;
    private Integer quantidadeMaximaAlunos;
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, Integer codigoCurso, Integer quantidadeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public ProfessoresAdjuntos getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessoresAdjuntos professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessoresTitulares getProfessoresTitulares() {
        return professoresTitulares;
    }

    public void setProfessoresTitulares(ProfessoresTitulares professoresTitulares) {
        this.professoresTitulares = professoresTitulares;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public List getAlunos() {
        return alunos;
    }

    public void setAlunos(List alunos) {
        alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoCurso, curso.codigoCurso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoCurso);
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (alunos.size() < quantidadeMaximaAlunos) {
            alunos.add(umAluno);
            return true;
        } else {
            return false;
        }


    }

    public void excluirAluno(Aluno umAluno){
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).equals(umAluno)){

                alunos.remove(i);
                break;
            }
            }
    }
    List<Aluno> alunosMatriculados = new ArrayList<>();


}
