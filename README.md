# ♈ Calculadora de Signos em Java

## 📌 Sobre o projeto

A **Calculadora de Signos** é um projeto desenvolvido em Java com o objetivo de praticar fundamentos da linguagem e lógica de programação.

O programa recebe o **dia e o mês de nascimento** do usuário e identifica o signo correspondente, apresentando também a possibilidade de realizar uma nova consulta.

O projeto foi desenvolvido como parte dos meus estudos de Java.

---

## 🎯 Objetivos

Este projeto teve como objetivo praticar:

- Estruturas condicionais;
- Estrutura `switch/case`;
- Estrutura de repetição `do while`;
- Entrada de dados com `Scanner`;
- Variáveis;
- Operadores relacionais;
- Operadores lógicos;
- Validação de dados;
- Organização da lógica de programação.

---

## 🛠️ Tecnologias utilizadas

- ☕ Java
- 📦 `Scanner`
- 🔀 `if / else if / else`
- 🎛️ `switch / case`
- 🔁 `do while`

---

## ⚙️ Como funciona

O programa solicita ao usuário:

```text
Digite a data de aniversário: 27
Digite o mês de aniversário: 04
```

Após receber os dados, o programa verifica o período correspondente e apresenta o signo.

Exemplo:

```text
O seu signo é Touro
```

Ao final da consulta, o usuário pode escolher se deseja realizar uma nova consulta.

```text
Deseja continuar o programa?

1 - Sim
2 - Não
```

---

## 🧠 Conceitos praticados

### Entrada de dados

Utilização da classe `Scanner` para receber informações digitadas pelo usuário.

```java
Scanner in = new Scanner(System.in);
```

### Estrutura `switch`

Utilizada para verificar o mês informado:

```java
switch (mes) {
    case 1:
        ...
        break;

    case 2:
        ...
        break;
}
```

### Estruturas condicionais

Utilização de condições para identificar o intervalo correspondente ao signo:

```java
if (data >= 1 && data <= 20) {
    ...
} else if (data >= 21 && data <= 31) {
    ...
}
```

### Estrutura de repetição

O `do while` permite que o usuário execute o programa novamente:

```java
do {
    ...
} while (opcao == 1);
```

---

## 📚 O que aprendi

Durante o desenvolvimento deste projeto, pratiquei principalmente a criação de **estruturas de decisão e repetição em Java**.

Também pude exercitar a organização da lógica necessária para trabalhar com diferentes possibilidades de entrada do usuário.

Este projeto faz parte da minha evolução nos estudos de Java e representa uma das aplicações que estou desenvolvendo para praticar programação.

---

## 🚀 Próximas melhorias

Conforme avanço nos estudos, algumas melhorias podem ser implementadas futuramente:

- [ ] Melhorar a validação das datas;
- [ ] Simplificar a lógica de identificação dos signos;
- [ ] Melhorar a organização do código;
- [ ] Criar métodos para separar responsabilidades;
- [ ] Melhorar a interface do programa;
- [ ] Adicionar novas funcionalidades.

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/yasminalba/calculadora-signos-java.git
```

### 2. Abra o projeto

Abra o projeto em uma IDE compatível com Java, como o **Visual Studio Code** ou outra IDE de sua preferência.

### 3. Execute o arquivo

```text
signo.java
```

---

## 👩‍💻 Autora

**Yasmin Alba**

Estudante de Engenharia de Software e desenvolvedora em formação.

Atualmente estudando Java, HTML, CSS, UX/UI Design e Power BI.

---

<div align="center">

☕ **Learning Java. Building projects.**

</div>
