package POO.Aula3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private String nome;
    private String nif;
    private String morada;
    private String numenc;
    private LocalDateTime data;
    private List<LinhaEncomenda> linhas;

    // Constructor por omissão para inicializar as variáveis de instância
    public Encomenda() {
        this.nome = "";
        this.nif = "";
        this.morada = "";
        this.numenc = "";
        this.data = LocalDateTime.now();
        this.linhas = new ArrayList<>();
    }

    public Encomenda(String nome, String nif, String morada, String numenc, LocalDateTime data, LinhaEncomenda[] linhas) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numenc = numenc;
        this.data = data;
        this.linhas = new ArrayList<>();
        for (LinhaEncomenda l : linhas) {
            this.linhas.add(l);
        }
    }

    public Encomenda(Encomenda a) {
        this.nome = a.getNome();
        this.nif = a.getNif();
        this.morada = a.getMorada();
        this.numenc = a.getNumenc();
        this.data = a.getData();
        this.linhas = a.getLinhas();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNumenc() {
        return this.numenc;
    }

    public void setNumenc(String numenc) {
        this.numenc = numenc;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public List<LinhaEncomenda> getLinhas() {
        return this.linhas;
    }

    public void setLinhas(List<LinhaEncomenda> linhas) {
        this.linhas = linhas;
    }

    public double calculaValorTotal() {
        double total = 0;
        for (LinhaEncomenda l : this.linhas) {
            total += l.calculaValorLinhaEnc();
        }
        System.out.println("Valor total da encomenda: " + total);
        return total;
    }
}