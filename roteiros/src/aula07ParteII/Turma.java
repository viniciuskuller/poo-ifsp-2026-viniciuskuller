package aula07ParteII;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    public void matricular(Aluno aluno){
        alunos.add(aluno);
    }
    public  double calcularMedia(){
        if(alunos.isEmpty()){
            return 0;
        }
        double media = 0;
        for(Aluno a : alunos){
            media += a.getNota();
        }
        media /= alunos.size();
        return media;
    }
    public Aluno encontrarMelhorAluno(){
        Aluno aluno = alunos.getFirst();
        for(Aluno a : alunos){
            if(a.getNota()> aluno.getNota()){
                aluno = a;
            }

        }
        return aluno;
    }
}
