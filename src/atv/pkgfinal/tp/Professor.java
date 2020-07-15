package atv.pkgfinal.tp;
import java.util.Scanner;

public class Professor extends Pessoa {
    private String materia;
    private String rm;
    Scanner objScanner = new Scanner(System.in);

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void cadastroProfessor() throws InterruptedException{
        super.cadastroPessoa();
        System.out.println(" Digte sua matéria :");
        this.materia = objScanner.next();
        System.out.println(" Digte seu RM :");
        this.rm = objScanner.next();
        System.out.println("------------------------------");
        System.out.println("PROFESSOR CADASTRADO COM SUCESSO ");
        Thread.sleep(3000);
    }
    public void dadosProfessor(){
        super.dadosPessoa();
        System.out.println("MATÉRIA : " + this.materia);
        System.out.println("RM : " + this.rm);
    }
}
