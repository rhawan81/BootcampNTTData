package tests;

import dominio.Person2;

public class PessoaTest01 {
    public static void main(String[] args) {
        Person2 pessoa2 = new Person2("MICHEL", 22);
        System.out.println(pessoa2.nome());
        System.out.println(pessoa2.age());

    }
}
