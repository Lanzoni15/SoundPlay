# 🎧 Projeto Java: Aplicação de Música e Podcast

Este é um projeto simples feito com Java para aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**. A ideia foi desenvolver uma estrutura que permita gerenciar áudios, músicas e podcasts de maneira organizada e reutilizável.

## 🚀 Tecnologias utilizadas

- Java 17+
- Programação Orientada a Objetos (POO)
- IDE: IntelliJ IDEA

## 📌 Objetivo

Simular uma aplicação onde é possível:

- Reproduzir áudios
- Curtir conteúdos
- Verificar popularidade para recomendar ou favoritar
- Organizar músicas e podcasts com suas respectivas informações

## 🧱 Estrutura do projeto

- **`Audio`**  
  Classe base com atributos comuns a todos os tipos de áudio (título, duração, curtidas, total de reproduções) e métodos como `reproduzir()`, `curtir()` e `favoritar()`.

- **`Musica`**  
  Herda de `Audio` e adiciona atributos específicos como artista, álbum e gênero.

- **`Podcast`**  
  Também herda de `Audio` e traz atributos como apresentador, canal, número de episódios e convidado.

- **`Principal`**  
  Classe com o método `main` para testar e simular o funcionamento da aplicação com músicas e podcasts.

## 🧠 Conceitos aplicados

- ✅ Herança  
- ✅ Encapsulamento  
- ✅ Getters e Setters  
- ✅ Reutilização de código  
- ✅ Simulação de comportamentos em tempo de execução

## 👨‍💻 Autor

Feito com dedicação por [Arthur Lanzoni].  
Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/arthur-lanzoni-a838b721a/) 🚀

---

> Este projeto faz parte do meu aprendizado contínuo em Java. Estou compartilhando aqui para registrar minha evolução e, quem sabe, ajudar outras pessoas que estão começando na programação! 😊
