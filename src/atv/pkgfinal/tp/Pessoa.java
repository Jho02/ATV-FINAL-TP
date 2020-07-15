
package atv.pkgfinal.tp;

import java.util.Scanner;


public class Pessoa {
    private String nome ;
    private String sobrenome;
    private int cpf;
    private int telefone;
    private String endereco;
    Scanner objScanner = new Scanner (System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastroPessoa(){
        System.out.println(" Digite seu Nome : ");
        this.nome = objScanner.next();
        System.out.println(" Digite seu Sobrenome :");
        this.sobrenome = objScanner.next();
        System.out.println(" Digite seu CPF :");
        this.cpf = objScanner.nextInt();
        System.out.println(" Digite seu Telefone :");
        this.telefone = objScanner.nextInt();
        System.out.println(" Digite seu Endereço :");
        this.endereco = objScanner.next();
    }
    public void dadosPessoa(){
        System.out.println(" NOME : " + this.nome);
        System.out.println(" SOBRENOME : " + this.sobrenome);
        System.out.println(" CPF : " + this.cpf);
        System.out.println(" TELEFONE : " + this.telefone);
        System.out.println(" ENDEREÇO : " + this.endereco);
    }
}
   