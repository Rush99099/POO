package POO;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    /* Exercício de Exemplo
        Contador c = new Contador();
        System.out.println("O meu contador está com o valor:"+c.getC());
        c.increment();
        System.out.println("O meu contador está com o valor:"+c.getC());
    */
    

                    //////////////////////////////////
                    //                              //
                    //    Ficha 1 Exercícios II     //
                    //                              //
                    //////////////////////////////////
    

    /* 1º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Graus a converter: ");
        double g = s.nextDouble();
        double res = obj.celsiusParaFahrenheit(g);
        System.out.println("O resultado é: "+res);
    */

    /* 2º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Primeiro número: ");
        int a = s.nextInt();
        System.out.println("Segundo número: ");
        int b = s.nextInt();
        int res = obj.maximoNumeros(a, b);
        System.out.println("O maior número é: "+res);
    */

    /* 3º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Nome Completo: ");
        String n = s.nextLine();
        System.out.println("Saldo: ");
        double saldo = s.nextInt();
        String res = obj.criaDescricaoConta(n, saldo);
        System.out.println(res);
    */

    /* 4º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Qual a quantidade monetária: ");
        double valor = s.nextDouble();
        System.out.println("Qual a Taxa de Conversão em %: ");
        double taxa = s.nextDouble();
        double res = obj.eurosParaLibras(valor, taxa);
        System.out.println(res+"€");
    */

    /* 5º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Introduza o 1º inteiro: ");
        int a = s.nextInt();
        System.out.println("Introduza o 2º inteiro: ");
        int b = s.nextInt();
        double media = obj.media(a, b);
        String ordem = obj.ordemDecrescente(a, b);
        System.out.println("A média dos 2 números é: "+media+"\n"+"Por ordem decrescente, os números ficam assim: "+ordem);
    */

    /* 6º exercício

        Scanner s = new Scanner(System.in);
        Ficha1 obj = new Ficha1();
        System.out.println("Insere o número cujo fatorial será calculado: ");
        int a = s.nextInt();
        long res = obj.factorial(a);
        System.out.println("O valor do fatorial de "+a+" é: "+res);
    */

    /* 7º exercício

        Ficha1 obj = new Ficha1();
        LocalDateTime antes = LocalDateTime.now();

        System.out.println("Tempo antes do cálculo: "+antes);
        long fat = obj.factorial(5000);
        System.out.println("Fatorial de 5000: "+fat);

        LocalDateTime depois = LocalDateTime.now();
        System.out.println("Tempo depois do cálculo: "+depois);

        long res = obj.tempoGasto(antes, depois);
        System.out.println("Tempo de cálculo em milisegundos: "+res);  
    */


                    //////////////////////////////////
                    //                              //
                    //       Ficha 2 Exercícios     //
                    //                              //
                    //////////////////////////////////


    /* 1º exercício alínea a)
        Scanner s = new Scanner(System.in);
        Ficha2 obj = new Ficha2();
        System.out.println("Indique quantos elementos tem o array: ");
        int n = s.nextInt();
        int [] valores = new int[n];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Inserir este número no array: ");
            valores[i] = s.nextInt();
        }

        int res = obj.minimo(valores);

        System.out.println("O menor valor do array é: "+res);
    */
        
    /* 1º exercício alínea b)
        Scanner s = new Scanner(System.in);
        Ficha2 obj = new Ficha2();
        System.out.println("Indique quantos elementos tem o array: ");
        int n = s.nextInt();
        int [] valores = new int[n];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Inserir este número no array: ");
            valores[i] = s.nextInt();
        }
        System.out.println("Indique o 1º índice: ");
        int pi = s.nextInt();
        System.out.println("Indique o 2º índice: ");
        int si = s.nextInt();

        int[] res = obj.indices(valores, pi, si);

        System.out.println("O array compreendido entre o índice "+pi+" e o índice "+si+" é:"+Arrays.toString(res));  
    */

    /* 1º exercício alínea c)
        Scanner s = new Scanner(System.in);
        Ficha2 obj = new Ficha2();
        System.out.println("Indique quantos elementos tem o array: ");
        int n = s.nextInt();
        int [] valores = new int[n];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Inserir este número no array: ");
            valores[i] = s.nextInt();
        }
        System.out.println("Indique o 1º índice: ");
        int pi = s.nextInt();
        System.out.println("Indique o 2º índice: ");
        int si = s.nextInt();

        int[] res = obj.indices(valores, pi, si);

        System.out.println("O array compreendido entre o índice "+pi+" e o índice "+si+" é:"+Arrays.toString(res));  
    */

    }
}