# 📙 Quarta Aula - Criando o Primeiro "Hello, World!"

Nesta aula, criamos o primeiro programa em Java, o famoso **“Olá, Mundo!”**. Além disso, aprendemos sobre a estrutura básica de um programa em Java e as convenções de nomenclatura utilizadas.

## ✍️ Estrutura de um Programa Java

Os aplicativos Java são compostos por **pacotes**. Cada pacote pode conter várias **classes**, e cada classe possui um ou mais **atributos** e **métodos**.

### ⚙️ Regras para Nomeação de Componentes

Seguindo as convenções de **CamelCase**:

- **Pacotes:** nomes em **letras minúsculas**.
- **Classes:** iniciam com **letra maiúscula**.
- **Atributos, Variáveis e Métodos:** iniciam com **letra minúscula**.
- **Constantes:** são escritas em **letras maiúsculas**.

### Exemplo Básico - "Olá, Mundo!"

```java
package com.exemplo.helloworld; // Pacote

public class HelloWorld { // Classe
    public static void main(String[] args) { // Método principal
        System.out.println("Olá, Mundo!"); // Exibição de dados no terminal
    }
}
```

### 🖥️ Detalhes do Código
- **`package com.exemplo.helloworld;`**: define o pacote do programa.
- **`public class HelloWorld {`**: representa a classe principal.
- **`public static void main(String[] args) {`**: método principal onde o programa começa.
- **`System.out.println("Olá, Mundo!");`**: comando para exibir "Olá, Mundo!" no terminal.

---

## 📖 O que foi Aprendido
1. Criar e organizar pacotes e classes na IDE.
2. Utilizar convenções de nomenclatura em **CamelCase**.
3. Escrever dados no terminal com **System.out.print** e **System.out.println**.
4. Configurar a IDE para iniciar a prática de codificação.

## 📦 Organização da Aula

O exemplo praticado durante a aula foi organizado na seguinte pasta do projeto:

- **`src/primeiroprograma/PrimeroPrograma.java`**

Para executar, compile e rode os arquivos Java utilizando o **JDK** e uma **IDE** compatível, como **NetBeans** ou **IntelliJ**.

---
