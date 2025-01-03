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

### Distribuindo
jar
- jar -cp libqualquer.jar -C out .

## Capítulo 2 - Programando com Instruções Java
### Instruções de Atribuição

### Instruções Condicionais

### Instruções de Iteração

### Instruções de Transferência de Controle

### Instruções Rotuladas *
- Pode ser utilizada com continue, break
- Só usar ao substituir outras abordagens em algumas ocasiões



### Passos conversão Lambdas
#### Preparação
1) Cria uma Interface (ex.:Printable, que tem a assinatura de 1 método print())
2) Cria uma Classe que implementa Printable (Classe Gato que implementa com um Miau)
3) Cria uma Classe testadora que instancia gato e que chama o método print e exibe em tela o Miau
4) Cria na Classe testadora um método que recebe Printable e executa o único método que a Interface declara (ex.: emiteSom(Printable obj) obj.print())

#### Refatorando
1) Em vez de passar como argumento para o método emiteSom o objeto cachorro, o argumento do método será uma função anônima
2) A função tem a implementação do método print() por parte da classe Cachorro: 
```
@Override
public void print() {
    System.out.println("Auau!");
}
```
3) Após isso, removo o modificador (public), o tipo de retorno (void), o identificador (print)
4) Por último, é incluído o símbolo -> entre o fim do parêntese e o início da chave do bloco com o corpo do método. Esse é resultado:
```
emiteSom(
    () -> {
        System.out.println("Auauafafa!");
    }
);
```
Obs.: Se eu mudar algo na assinatura do método da interface, devo replicar essa alteração na função anônima

### Continuando a refatoração
1) Para refinar ainda mais a função anônima, podemos retirar as chaves que definem o bloco (*No caso de apenas uma instrução no bloco*) e retirar o ponto-e-vírgula ao fim da instrução
2) Podemos subir a instrução para a linha da chamada do método, ficando:
```emiteSom((int num) -> System.out.println("Auauafafa! "+num));```
Obs.: Podemos atribuir a função a uma variável e passar essa variável como argumento do método:
```
Printable lambdaPrintable = (int num) -> System.out.println("Auauafafa! "+num);
emiteSom(lambdaPrintable);
```
Também podemos suprimir o tipo no argumento do método e remover os parênteses desse argumento: ```Printable lambdaPrintable = num -> System.out.println("Auauafafa! "+num);```
3) Por fim, se o método define que há um retorno, essa expressão pode estar sem nada em volta. Sem nem mesmo a palavra return:
```
Printable lambdaPrintable = num -> "Auauafafa! "+num;
```
