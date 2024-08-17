# [DIO](www.dio.me) - Trilha Java Básico

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, está modelada e diagramada a representação UML dos componentes de um iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Principais Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    FuncoesIphone <|-- ReprodutorMusical
    FuncoesIphone <|-- AparelhoTelefonico
    FuncoesIphone <|-- NavegadorInternet

    Iphone : -String musicaAtual
    Iphone : -String numeroLigacao
    Iphone : -String urlPagina
    Iphone : -FuncoesIphone iphone
    Iphone : +main()

    namespace funcoes {
        class FuncoesIphone{
        +ligarAparelho()
        +desligarAparelho()
        +abrirReprodutorMusical(String musicaAtual)
        +abrirAparelhoTelefonico(String numeroLigacao)
        +abrirNavegadorInternet(String url)
        }
        class ReprodutorMusical{
            <<Interface>>
            +tocar()
            +pausar()
            +selecionarMusica(String musica)
        }
        class AparelhoTelefonico{
            <<Interface>>
            +ligar(String numero)
            +atender()
            +iniciarCorreioVoz()
        }
        class NavegadorInternet{
            <<Interface>>
            +exibirPagina(String url)
            +adicionarNovaAba()
            +atualizarPagina()
        }
    }
```

### Programa Java

As classes foram modeladas de forma a respeitar os pilares da Programação Orientada a Objetos e atender os requerimentos, além de adicionar métodos que auxiliam na tarefa.