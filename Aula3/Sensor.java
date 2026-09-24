package POO.Aula3;

public class Sensor {
    // Atributos
    private double pressao;
    
    // Construtor vazio
    public Sensor(){
        this.pressao = 0.0;
    }

    // Construtor parametrizado
    public Sensor(double pressao){
        this.pressao = pressao;
    }

    // Construtor de cópia
    public Sensor(Sensor sensor){
        this.pressao = sensor.getPressao();
    }
    
    public double getPressao(){
        return this.pressao;
    }

    public boolean setPressao(double pressao){
        if(pressao < 0.0){
            return false;
        }
        this.pressao = pressao;
        return true;
    }

}
