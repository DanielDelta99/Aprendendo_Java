# 📒 Quinta Aula - Introdução a Bibliotecas e Interfaces Gráficas em Java

Nesta aula, exploramos a utilização de bibliotecas adicionais e ferramentas para criar **interfaces gráficas** em Java. Aprendemos sobre o carregamento de pacotes adicionais, a biblioteca **Swing**, e a plataforma mais moderna para desenvolvimento de interfaces gráficas, **JavaFX**.

## 🛠️ Pacotes Adicionais e Instrução `import`

Por ser uma linguagem multiplataforma, o **Java** utiliza pacotes adicionais para evitar a sobrecarga de recursos desnecessários no programa. A instrução `import` é utilizada para carregar bibliotecas de pacotes extras que não são incluídos por padrão.

### 📞 Pacotes Carregados por Padrão:
- Apenas o pacote **`java.lang`** é carregado automaticamente.

Caso precise de bibliotecas adicionais, o pacote deve ser importado com a instrução:
```java
import pacote.biblioteca.Classe;
```

---

## 🎨 Introdução ao Swing e ao JavaFX

### 💻 Swing
- Evolução do antigo **AWT (Abstract Window Toolkit)**.
- Permite criar **interfaces gráficas básicas** para sistemas operacionais baseados em janelas.
- Possui componentes como: **JButton**, **JLabel**, **JTextField**, etc.

#### Exemplo com Swing:
```java
import javax.swing.*; // Importa o pacote necessário para Swing

public class JanelaSwing {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha Janela Swing"); // Janela principal
        JLabel label = new JLabel("Olá, Mundo! Bem-vindo ao Swing."); // Texto na janela
        JButton botao = new JButton("Clique aqui!"); // Botão interativo
        
        // Configurações da janela
        janela.setSize(300, 200); // Tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar o programa ao clicar no "X"
        janela.setLayout(null); // Layout absoluto
        
        // Adicionando componentes
        label.setBounds(50, 30, 200, 20);
        botao.setBounds(100, 80, 100, 30);
        janela.add(label);
        janela.add(botao);
        
        janela.setVisible(true); // Torna a janela visível
    }
}
```

### 🌟 JavaFX
Com o objetivo de substituir o Swing, o **JavaFX**:
- Oferece ferramentas modernas para desenvolver interfaces gráficas interativas.
- Suporta múltiplos dispositivos, como desktops, celulares e navegadores.
- E vou sempre optar em utilizar o javaFx nas futuras aulas pela melhor integração com o InteliJ.

#### Exemplo com JavaFX (XML e Código Java):

- **`src/main/java/classes/javafx`**: Execute a class "HelloApplication.java".

---

## 🌐 Plataforma Multidispositivos com JavaFX
- **Desktop** (Windows, MacOS, Linux).
- **Dispositivos móveis** (como Android).
- Planejado para **videogames, blu-rays e Smart TVs**.

---

## 📦 Organização da Aula

Os exemplos praticados durante a aula foram organizados nas seguintes pastas do projeto:

- **`src/main/java/classes/javafx`**: Contém o programa "HelloApplication.java".

Para executar, compile e rode os arquivos Java utilizando o **JDK** e uma **IDE** compatível, como **NetBeans** ou **IntelliJ**.

---
