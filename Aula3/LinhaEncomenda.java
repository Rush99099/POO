package POO.Aula3;

public class LinhaEncomenda{
    private String ref;
    private String descricao;
    private double preco;
    private double quant;
    private double taxa;
    private double desconto;

    public LinhaEncomenda(){
        this.ref = "";
        this.descricao = "";
        this.preco = 0;
        this.quant = 0;
        this.taxa = 0;
        this.desconto = 0;
    }

    public LinhaEncomenda(String ref, String descricao, double preco, double quant, double taxa, double desconto){
        this.ref = ref;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
        this.taxa = taxa;
        this.desconto = desconto;
    }

    public LinhaEncomenda(LinhaEncomenda linha){
        this.ref = linha.getRef();
        this.descricao = linha.getDescricao();
        this.preco = linha.getPreco();
        this.quant = linha.getQuant();
        this.taxa = linha.getTaxa();
        this.desconto = linha.getDesconto();
    }

    public String getRef(){
        return this.ref;
    }

    public void setRef(String ref){
        this.ref = ref;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getQuant(){
        return this.quant;
    }

    public void setQuant(double quant){
        this.quant = quant;
    }

    public double getTaxa(){
        return this.taxa;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    @Override
    public boolean equals(Object a){
        if(this == a) return true;
        if(!(a instanceof LinhaEncomenda)) return false;
        LinhaEncomenda that = (LinhaEncomenda) a;
        return this.getRef().equals(that.getRef()) && this.getDescricao().equals(that.getDescricao()) && this.getPreco() == that.getPreco() && this.getQuant() == that.getQuant() && this.getTaxa() == that.getTaxa() && this.getDesconto() == that.getDesconto();
    }

    public double calculaValorLinhaEnc(){
        return this.getQuant() * this.getPreco() * (1 - this.getDesconto()) * (1 + this.getTaxa());
    }

    public double calculaValorDesconto(){
        return this.getQuant() * this.getPreco() * (1 - this.getDesconto()) * (1 + this.getTaxa());
    }
}
