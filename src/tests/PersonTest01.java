package tests;

import dominio.Person;

public class PersonTest01 {
   public static void main(String[]args){
       Person pessoa1 = new Person();
       pessoa1.setNome("Maria");
       pessoa1.setIdade(22);
       pessoa1.imprime();

    }
}
