# ocajavase8
Repositório para exercícios do livro para o exame OCA 1Z0-808

## Capítulo 1 - Empacotamento, Compilação e Interpretação
P - I - C (Package - Import - Class)
- package: 0 ~ 1 por arquivo
- packages java.* e javax.* são reservados
- package names letras minúsculas. palavras individuais separadas por _

### Compilando
javac
- usando javac -d . NomeArquivo.java, faz com que o package que foi informado no pacote tenha sua estrutura de diretórios
criada a partir do diretório corrente ("."). Ou seja, se a primeira linha
do arquivo for _package com.oca.tutorial_, o bytecode será criado  seguindo
a estrtura de diretórios com/oca/tutorial a partir do diretório atual em que o comando foi executado.
Quando o -d não é informado, o package é ignorado. O bytecode é criado. Ao interpretar o arquivo, vai haver um erro
pois a estrutura de diretórios não foi criada.

```
java GreetingsUniverse 
Erro: Não foi possível localizar nem carregar a classe principal GreetingsUniverse
Causada por: java.lang.NoClassDefFoundError: com/ocajexam/tutorial/GreetingsUniverse (wrong name: GreetingsUniverse)
```

### Interpretando
java
- usando java -cp . _com.oca.tutorial.NomeArquivo_, faz com que a aplicação seja executada
a partir do bytecode existente no caminho informado.
Se só houver uma classe, o uso do -cp . é opcional
