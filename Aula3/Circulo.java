package POO.Aula3;

public class Circulo {
    private double x;
    private double y;
    private double raio;

    // Construtor vazio (Inicializa as variáveis de instância)
    public Circulo(){
        this.x = 0.0;
        this.y = 0.0;
        this.raio = 0.0;
    }

    // Construtor parametrizado
    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    //Construtor de cópia
    public Circulo(Circulo circulo){
        this.x = circulo.getX();
        this.y = circulo.getY();
        this.raio = circulo.getRaio();
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * this.getRaio();
    }

    public Circulo clone(){
        return new Circulo(this);
    }

}
