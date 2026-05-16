package Hheranca.tests;

import Hheranca.dominio.Empregado;
import Hheranca.dominio.Manager;

public class Test01 {
public static void main(String[] args) {
    Empregado empregado = new Empregado();
    Manager manager = new Manager();

    empregado.setName("Michel");
    empregado.setAddress("Rua 1");
    empregado.setSalary(5000);
    empregado.setAge(22);
    empregado.setCode("EMP001");


    System.out.println("Empregado:");
    System.out.println("Nome: " + empregado.getName());
    System.out.println("Endereço: " + empregado.getAddress());
    System.out.println("Salário: " + empregado.getSalary());
    System.out.println("Idade: " + empregado.getAge());
    System.out.println("Código: " + empregado.getCode());



    System.out.println("_-------------------------");







}
}
