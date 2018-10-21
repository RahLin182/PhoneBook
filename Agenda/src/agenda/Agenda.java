package Agenda;

import java.util.ArrayList;
import java.util.Scanner;


    /**
     * @author Rafael Felipe Cardoso Lino
     * RA: 221181829
     */
        public class Agenda {

        /**
         * @param args
         */
      public static void main(String[] args) {

           //Gerando o ArrayList
          ArrayList <PhoneBook> ag = new ArrayList<>();

          while (true) {

              //Menu
              System.out.println("Entre a opção desejada:\n");
              System.out.println("  1 - Criar Novo Contato");
              System.out.println("  2 - Apagar um contato");
              System.out.println("  3 - Exibir todos os contatos cadastrados");
              System.out.println("  0 - Sair");
              System.out.println(" ");

              Scanner buffer = new Scanner(System.in);
              String in = buffer.next();

              switch (in){

                  case ("1"):
                      System.out.println("Insira o Nome:");
                      String nome = buffer.next(); //buffer do input nome
                      System.out.println("Insira o tel:");
                      Integer tel = buffer.nextInt(); //buffer do input tel
                      ag.add(new PhoneBook(nome, tel));
                      break;

                  case ("2"):
                      System.out.println("Insira o contato a ser apagado(nome): \n");
                      nome = buffer.next();

                      for(int i = ag.size() - 1; i >= 0; i--){

                         final PhoneBook f = ag.get(i);
                          System.out.println("\tChecando <" + ag.get(i).nome + ">");

                          if(f.nome.equals(nome)){
                              System.out.println("Contato de Numero: " + i);
                              ag.remove(i);
                              System.out.println("Contato Apagado.");

                          }

                      }
                      break;

                  case ("3"):
                          for(int i = 0; i < ag.size(); i++){

                              System.out.println(ag.get(i).getNome());
                              System.out.println(ag.get(i).gettel());
                          }
                      break;

                  case ("0"):
                      System.exit(0);
              }
          }
      }
  }
  // GLORIA DEUX
