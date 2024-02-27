package POO;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ficha1{

    public Ficha1(){
    }

    public double celsiusParaFahrenheit(double graus){
        return graus*1.8 + 32; 
    }

    public int maximoNumeros(int a, int b){
        if (a >= b) {
            return a;
        }
        else return b;
    }

    public String criaDescricaoConta(String nome, double saldo){
        return nome+"; "+saldo;
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        taxaConversao = taxaConversao / 100;
        return valor + valor*taxaConversao;
    }

    public double media(int a, int b){
        return (a + b)/2;
    }

    public String ordemDecrescente(int a, int b){
        String res;
        if (a >= b) {
            res = a+", "+b;
        }
        else res = b+", "+a;
        return res;
    }

    public long factorial(int num){
        long res = num;
        for(int i = num; i > 2; i--){
            res = res * (i - 1);
        }
        return res;
    }

    public long tempoGasto(LocalDateTime a, LocalDateTime b){
        Duration duration = Duration.between(a, b);
        long res = duration.toMillis();
        return res;
    }
}