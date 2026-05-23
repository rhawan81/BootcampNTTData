# 🚀 BootCamp NTT DATA - Java

> **Repositório de exercícios do BootCamp de Java da NTT DATA**

## 📋 Sobre o Projeto

Este repositório contém exercícios e projetos desenvolvidos durante o **BootCamp NTT DATA de Java da dio**, abordando desde os fundamentos até conceitos avançados de orientação a objetos.

---

## 📚 Conteúdo do Projeto

| Pasta | Descrição |
|-------|-----------|
| **dominio** | Classes base: Person, Person2 |
| **FundamentosdaLinguagemdeProgramação** | Conceitos básicos: Hello, Quadrado, Retangulo |
| **EstruturasdControleJava** | Estruturas de controle: Tabuada, IMC, Divisão |
| **JavaeaArtedaAbstraçãocomClasseseEncapsulamento** | POO avançada: Carro, ContaBancaria |
| **Exercicios/Pet** | Projeto prático: Sistema de Pets |
| **tests** | Testes unitários de todos os módulos |

---

## 🎯 Tópicos Abordados

✅ **Fundamentos** - Variáveis, tipos, operadores  
✅ **Controle** - iKf/else, loops, switch  
✅ **POO** - Classes, construtores, herança  
✅ **Encapsulamento** - Getters, setters, acesso controlado  


---

## 🛠️ Tecnologias

- **Java** ☕
- **IntelliJ IDEA**
- **JDK 11+**

---

## 📂 Como Usar

1. **Abrir no IntelliJ:** Abra `BootcampNTTDATA.iml`
2. **Executar Testes:** Clique direito no arquivo → `Run`
3. **Executar Classes:** Clique direito → `Run 'ClassName.main()'`

---

## 💡 Exemplos

### Person com Encapsulamento
```java
public class Person {
    private String nome;
    private int idade;
    
    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}