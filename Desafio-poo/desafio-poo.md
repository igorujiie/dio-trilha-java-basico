## Autores
- [Igor Ujiie](https://github.com/igorujiie)

## POO - Desafio

### Modelagem e Diagramação do Desafio do README
A partir do Desafio, foi montado este diagrama UML para representar a classe Iphone 

```mermaid
classDiagram
    class MP3 {
  - titulo: String
  - artista: String
  - genero: String
  - duracao: int
    }

    class Telefone {
    - nome: String
    - numero: String
    }

    class Internet {
    - url: String
    - titulo: String
    }

    class Iphone{
        - modelo: String
        - cor: String
        - memoria: int
        - sistemaOperacional: String
    }
    class AparelhoTelefonico
    <<interface>> AparelhoTelefonico 
    AparelhoTelefonico: ligar(String numero)
    AparelhoTelefonico: atender()
    AparelhoTelefonico: iniciarCorreioVoz()

    class ReprodutorMusical
    <<interface>> ReprodutorMusical  
    ReprodutorMusical: tocar()
    ReprodutorMusical: pausar()
    ReprodutorMusical: selecionarMusica(String musica)
    
    class NavegadorInternet
    <<interface>> NavegadorInternet
    NavegadorInternet: exibirPagina(String url)
    NavegadorInternet: adicionarNovaAba()
    NavegadorInternet: atualizarPagina()
    

    

    Iphone *--* ReprodutorMusical
    Iphone *--* AparelhoTelefonico
    Iphone *--* NavegadorInternet

    ReprodutorMusical *--* MP3
    AparelhoTelefonico *--* Telefone
    NavegadorInternet *--* Internet

```