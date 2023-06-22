public class Gato extends Felinos {
    private String pelaje;
    private double peso;
    private String color;
    private String nivel_actividad;
    //Metodo super
    public Gato() {super();
    }
    //Constructores
    public Gato(String raza, String tamano, String edad, String habitat,String pelaje, double peso, String color, String nivel_actividad) {
        this.pelaje = pelaje;
        this.peso = peso;
        this.color = color;
        this.nivel_actividad = nivel_actividad;
    }

    //Getters and Setters
    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNivel_actividad() {
        return nivel_actividad;
    }

    public void setNivel_actividad(String nivel_actividad) {
        this.nivel_actividad = nivel_actividad;
    }

    public void sentidos(){
        System.out.println("Este es el metodo sentido que pertenece a Gato");
    }
    public void comunicacion(){
        System.out.println("Este es el metodo comunicacion que pertenece a Gato");
    }

}
