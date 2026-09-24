package POO.Aula3;

public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto ponto){
        this.x = ponto.getX();
        this.y = ponto.getY();
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

    public double distancia(Ponto umPonto) {
        return Math.sqrt(Math.pow(this.x- umPonto.getX(), 2) + Math.pow(this.y- umPonto.getY(), 2));
    }
}
