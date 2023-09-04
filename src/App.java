import java.time.LocalDate;

import Uniderp.poo.escola.dominio.Aluno;
import Uniderp.poo.escola.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor();
        Aluno a1 = new Aluno();

        p1.setNome("Luizao");
        p1.setRegistro("Registro: ...");

        a1.setNome("Diogo");
        a1.setMatricula("094.891.251-05");

        System.out.println("O nome do aluno  e matricula, e nome do professor e registro: ");
        System.out.printf("Aluno: %s e matricula: %s\n", a1.getNome(), a1.getMatricula());
        System.out.printf("Professor: %s e registro: %s\n", p1.getNome(), p1.getRegistro());
    }
}
