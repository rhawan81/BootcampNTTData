package Hheranca.tests;

import Hheranca.dominio.Empregado;
import Hheranca.dominio.Manager;

public class Managertest01 {
public static void main(String[] args) {
    Empregado empregado = new Empregado();
    Manager manager = new Manager();

    empregado.setName("Michel");
    empregado.setAddress("Rua 1");
    empregado.setSalary(5000);
    empregado.setAge(22);
    empregado.setCode("EMP001");

    manager.setName("Maria");
    manager.setAddress("Rua 2");
    manager.setSalary(8000);
    manager.setAge(30);
    manager.setCode("MGR001");
    manager.setLogin("maria123");
    manager.setPassword("230423940234");
    manager.setComission(1500);


    empregado.exibir();
    System.out.println("-------------------------");


    manager.exibir();







}
}
