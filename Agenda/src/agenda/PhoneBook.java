/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Agenda;

  /**
   * @author Rafael Lino
   * RA: 221181829
   */
public class PhoneBook {

      /**
       * Class Constructor
     * @param nome
       * @param tel
       */
    
    public PhoneBook(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }

      /**
       * @return Nome
       */

    public String getNome() {
        return nome;
    }

      /**
     * @param nome
       */
    
    public void setNome(String nome) {
        this.nome = nome;
    }

      /**
       * @return tel
       */
    
    public int gettel() {
        return tel;
    }

    /**
     * @param tel
     */
    
    public void settel(int tel) {
        this.tel = tel;
    }

    /**
     * Class Vars
     */

    protected String nome; // Nome dos contatos
    private int tel; // Telefone dos contatos
    // TODO code application logic here

}
