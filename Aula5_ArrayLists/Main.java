/** 1. Uma Stack (ou pilha) é uma estrutura linear do tipo LIFO ("last in first
out”), ou seja, o último elemento a ser inserido é o primeiro a ser removido.
Uma stack possui assim apenas um extremo para inserção e para remoção.
Implemente uma Stack de Strings, com as usuais operações sobre stacks:
(a) String top(): que determina o elemento no topo da stack;
(b) void push(String s): insere no topo;
(c) void pop(): remove o elemento do topo da stack, se esta não estiver
vazia;
(d) boolean empty(): determina se a stack está vazia;
(e) int length(): determina o comprimento da stack;

2. Considere o exercício da Encomenda que realizou na Ficha 3. Crie
agora uma nova implementação dessa classe, EncEficiente, que exiba o
mesmo comportamento e que tenha como estrutura de dados interna um
ArrayList<LinhaEncomenda>.
Considere também que queremos que nesta nova implementação tenha
em atenção que o número de encomenda deva ser atribuído de forma
sequencial (e não necessita de ser enviado como parâmetro do construtor
de Encomenda). Recorda-se o enunciado do exercício:
Para uma Encomenda guardam-se os seguintes atributos:
4*/
package POO.Aula5_ArrayLists;

import java.util.List;
import java.util.Stack;

public class Main{
    private Iterator Iterator(){
        return new iterator();
    }
    /**1.a) */
    public static String top(Stack<String> stack){
        return stack.peek();
    }
}