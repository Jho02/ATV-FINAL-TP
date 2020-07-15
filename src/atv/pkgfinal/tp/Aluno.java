
package atv.pkgfinal.tp;

import java.util.Scanner;

public class Aluno extends Pessoa{
      private int ra;
      private String curso;
      Scanner objScanner = new Scanner(System.in);
      Pessoa objPessoa;
      Menu objMenu;
      

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void cadastroAluno() throws InterruptedException{
        super.cadastroPessoa();
        System.out.println(" Digite seu RA : ");
        this.ra = objScanner.nextInt();
        System.out.println(" Digite seu Curso : ");
        this.curso = objScanner.next();
        System.out.println("------------------------------");
        System.out.println(" ALUNO CADASTRADO COM SUCESSO ");
        Thread.sleep(3000);
    }

    public void dadosAluno(){
        super.dadosPessoa();
        System.out.println(" RA : " + this.ra);
        System.out.println(" CURSO : " + this.curso);
    }
}