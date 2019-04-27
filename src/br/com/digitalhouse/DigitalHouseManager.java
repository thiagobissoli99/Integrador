package br.com.digitalhouse;


import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professor = new ArrayList<>();
    List<Curso> curso = new ArrayList<>();
    List<Matricula> matricula = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        curso.add(new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos));

    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < curso.size(); i++) {
            if (curso.get(i).equals(codigoCurso)) {
                curso.remove(i);
                break;
            }

        }
    }
}