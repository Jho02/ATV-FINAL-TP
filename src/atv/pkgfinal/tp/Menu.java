
package atv.pkgfinal.tp;

import java.util.Scanner;

public class Menu {
    Menu  objMenu;
    Aluno objAluno;
    Professor objProfessor;
    Scanner objScanner;
    
    public void listaMenu() throws InterruptedException{
        System.out.println("DESEJA ACESSAR A ÁREA DE ALUNO OU PROFESSOR ?");
        System.out.println("==============================================");
        System.out.println(" DIGITE 1 - ALUNO");
        System.out.println(" DIGITE 2 - PROFESSOR");
        System.out.println(" DIGITE 3 - SAIR");    
    }
    public void opcMenu(int opc) throws InterruptedException{
                                                 // ACESSO A ÁREA ALUNO
        if(opc == 1){
            System.out.println("VOCÊ ACESSOU A ÁREA DE ALUNO");
            System.out.println("============================");
            System.out.println("O que deseja Realizar ?");
            System.out.println("DIGITE 1 - PARA CADASTRAR ");
            System.out.println("DIGITE 2 - PARA EXIBIR DADOS ");
            objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
                                                
                                                  // ACESSO A ÁREA CADASTRO ALUNO
            if(opc == 1){
                objAluno = new Aluno();
                objAluno.cadastroAluno();
                listaMenu();
                Scanner objScanner = new Scanner(System.in);
                opc = objScanner.nextInt();
                opcMenu(opc);
                
                                                     // ACESSO A ÁREA EXIBIR DADOS ALUNO
            }else if(opc == 2){
                if(objAluno == null){
                    System.out.println(" Nenhum aluno foi cadastrado! ");
                    Thread.sleep(3000);
                    objMenu = new Menu();
                    listaMenu();
                    Scanner objScanner = new Scanner(System.in);
                    opc = objScanner.nextInt();
                    opcMenu(opc);
                }else if(objAluno != null){
                    objAluno.dadosAluno();
                    Thread.sleep(3000);
                    listaMenu();
                    Scanner objScanner = new Scanner(System.in);
                    opc = objScanner.nextInt();
                    opcMenu(opc);    
                }
            }else{
                System.out.println("OPÇÃO INVÁLIDA!");
                Thread.sleep(3000);
                System.exit(0);
            }
                                                // ACESSO A ÁREA DE PROFESSOR
                                                
        }else if(opc == 2){
                System.out.println("VOCÊ ACESSOU A ÁREA DE PROFESSOR");
            System.out.println("===================================");
            System.out.println("O que deseja Realizar ?");
            System.out.println("DIGITE 1 - PARA CADASTRAR ");
            System.out.println("DIGITE 2 - PARA EXIBIR DADOS ");
            objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
                                        
                                             // ACESSO A ÁREA CADASTRO PROFESSOR
            if(opc == 1){
                objProfessor = new Professor();
                objProfessor.cadastroProfessor();
                listaMenu();
                Scanner objScanner = new Scanner(System.in);
                opc = objScanner.nextInt();
                opcMenu(opc);
                
                                              // ACESSO A ÁREA EXIBIR DADOS PROFESSOR
            }else if(opc == 2){
                if(objProfessor == null){
                    System.out.println(" Nenhum Professor foi cadastrado! ");
                    Thread.sleep(3000);
                    objMenu = new Menu();
                    listaMenu();
                    Scanner objScanner = new Scanner(System.in);
                    opc = objScanner.nextInt();
                    opcMenu(opc);
                }else if(objProfessor != null){
                    objProfessor.dadosProfessor(); 
                     Thread.sleep(3000);
                     listaMenu();
                    Scanner objScanner = new Scanner(System.in);
                    opc = objScanner.nextInt();
                    opcMenu(opc);
                }
            }
            
                                                // SAIR DO PROGRAMA
        }else if (opc == 3){
                System.out.println(" ATÉ LOGO! ");
                Thread.sleep(3000);
                System.exit(0);
        }else{
            System.out.println("OPÇÃO INVÁLIDA");
            Thread.sleep(3000);
            System.exit(0);
        }           
    }
}
