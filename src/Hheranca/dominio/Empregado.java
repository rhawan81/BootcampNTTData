package Hheranca.dominio;

public class Empregado {
    private String name;
    private String code;
    private String address;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public void exibir(){
        System.out.println("Nome: " + this.name);
        System.out.println("Endereço: " + this.address);
        System.out.println("Salário: " + this.salary);
        System.out.println("Idade: " + this.age);
        System.out.println("Código: " + this.code);
    }
}
