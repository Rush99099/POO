package POO;

public class Contador{

    private int c;

    public Contador(){
        this.c = 0;

    }

    public Contador(int c){
        this.c = 0;
    }

    public void increment(){
        this.c = this.c + 1;
    }

    public int getC(){
        return this.c;
    }
}
