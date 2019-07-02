/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Petrônio
 */
public class TestaPessoa {
    
    public static void main(String []args){
    
    try {
    
    Pessoa p1 = new Pessoa("Petrônio", 4) {} ;
     Pessoa p2 = new Pessoa("Petrônio", -4) {};
    
    }catch(IdadeInvalidaException exc){
    
        System.out.println(exc.getMessage());
    }
    
    
    }
}
