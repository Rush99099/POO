package POO.Aula3;

public class Triangulo {
    private Ponto a;
    private Ponto b;
    private Ponto c;
    private double ladoAB;
    private double ladoBC;
    private double ladoCA;

    public Triangulo(){
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
        this.ladoAB = this.a.distancia(this.b);
        this.ladoBC = this.b.distancia(this.c);
        this.ladoCA = this.c.distancia(this.a);
    }

    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.ladoAB = this.a.distancia(this.b);
        this.ladoBC = this.b.distancia(this.c);
        this.ladoCA = this.c.distancia(this.a);
    }

    public Triangulo(Triangulo triangulo){
        this.a = triangulo.getA();
        this.b = triangulo.getB();
        this.c = triangulo.getC();
        this.ladoAB = this.a.distancia(this.b);
        this.ladoBC = this.b.distancia(this.c);
        this.ladoCA = this.c.distancia(this.a);
    }

    public Ponto getA(){
        return this.a;
    }

    public void setA(Ponto a){
        this.a = a;
    }

    public Ponto getB(){
        return this.b;
    }

    public void setB(Ponto b){
        this.b = b;
    }

    public Ponto getC(){
        return this.c;
    }

    public void setC(Ponto c){
        this.c = c;
    }

    public double calcularArea() {
        double s = this.calcularPerimetro() / 2;
        return Math.sqrt(s * (s - this.ladoAB) * (s - this.ladoBC) * (s - this.ladoCA));
    }

    public double calcularPerimetro() {
        return this.ladoAB + this.ladoBC + this.ladoCA;
    }

    public double calcularAltura(){
        double minY = Math.min(this.a.getY(), Math.min(this.b.getY(), this.c.getY()));
        double maxY = Math.max(this.a.getY(), Math.max(this.b.getY(), this.c.getY()));
        return maxY - minY;
    }

}
