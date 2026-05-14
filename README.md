

# 🚀 BootCamp NTT DATA - Java

> **Repositório de exercícios e aprendizado do BootCamp de Java da NTT DATA**

## 📋 Sobre o Projeto

Este repositório contém todos os exercícios, projetos e conceitos fundamentais estudados durante o **BootCamp NTT DATA de Java**. O material aborda desde os fundamentos da linguagem até conceitos avançados de orientação a objetos.

---

## 📚 Estrutura do Projeto


src/ ├── dominio/ │ ├── Person.java │ └── Person2.java ├── FundamentosdaLinguagemdeProgramação/ │ ├── dominio/ │ │ ├── Hello.java │ │ ├── Quadrado.java │ │ └── Retangulo.java │ └── tests/ │ ├── HelloTest01.java │ ├── QuadradoTest01.java │ └── RetanguloTest01.java ├── EstruturasdControleJava/ │ ├── DivisaoNumeros.java │ ├── Exercicio.java │ ├── IndiceMassaCorporal.java │ ├── IndiceTest01.java │ ├── Numeros.java │ └── Tabuada.java ├── JavaeaArtedaAbstraçãocomClasseseEncapsulamento/ │ ├── dominio/ │ │ ├── Carro.java │ │ └── ContaBancaria.java │ └── tests/ │ ├── CarroTest01.java │ └── ContaBancariaTest01.java ├── Exercicios/ │ └── Pet/ │ ├── PetMachine.java │ └── dominio/ │ └── Pet.java └── tests/ ├── PersonTest01.java └── PessoaTest01.java
---

## 🎯 Tópicos Abordados

### 1️⃣ **Fundamentos da Linguagem Java**
- Variáveis e tipos de dados
- Métodos e funções
- Entrada e saída de dados
- Operadores

### 2️⃣ **Estruturas de Controle**
- Condicionais (`if`, `else`, `switch`)
- Loops (`for`, `while`, `do-while`)
- Exercícios práticos (Tabuada, Divisão de números, IMC)

### 3️⃣ **Orientação a Objetos**
- Classes e Objetos
- Construtores
- Métodos e Atributos
- Encapsulamento
- Getters e Setters

### 4️⃣ **Abstração e Encapsulamento**
- Classes abstratas
- Modificadores de acesso (`private`, `public`, `protected`)
- Boas práticas de design

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java ☕
- **IDE:** IntelliJ IDEA
- **JDK:** 11 ou superior

---

## 📂 Como Usar

### 1. Abrir no IntelliJ IDEA
- Abra o arquivo `BootcampNTTDATA.iml`
- Ou importe como um novo projeto

### 2. Executar os Testes
- Clique com botão direito em qualquer arquivo de teste
- Selecione `Run 'NomeTest'`

### 3. Executar as Classes Principais
- Clique com botão direito na classe
- Selecione `Run 'NomeClass.main()'`

---

## 📝 Exemplos de Código

### Exemplo 1: Classe Person com Encapsulamento
```java
public class Person {
    private String nome;
    private int idade;
    private double salario;
    
    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
}
Exemplo 2: Cálculo de Idade
public class Hello {
    public String nome;
    public int anoNascimento;
    private int anoAtual = 2026;
    
    public void exibir() {
        System.out.println("Meu nome é: " + this.nome);
        System.out.println("Minha idade é: " + (this.anoAtual - this.anoNascimento) + " anos");
    }
}
 
🎓 Conceitos-Chave Aprendidos
✅ Variáveis e tipos de dados
✅ Controle de fluxo
✅ Programação Orientada a Objetos
✅ Encapsulamento e acesso a dados
✅ Métodos e construtores
✅ Testes unitários
✅ Boas práticas de código
 
👨‍💻 Autor
Seu Nome
BootCamp NTT DATA - Java
Data: Maio 2026
 
📧 Contato
Se tiver dúvidas ou sugestões, entre em contato!
 
📄 Licença
Este projeto é parte de um bootcamp educacional. Livre para uso pessoal e educacional.
 
⭐ Se este repositório foi útil, considere dar uma estrela!
---

## ✅ PASSO A PASSO:

1. **Abra o README.md** na pasta raiz do seu projeto
2. **Selecione TUDO** (Ctrl + A)
3. **Delete tudo** (Delete ou Backspace)
4. **Cole o código acima** que comei com `# 🚀 BootCamp...` até o final
5. **Salve** (Ctrl + S)

Pronto! Seu README vai ficar bonitão e bem formatado! 🎉