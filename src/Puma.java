public class Puma extends Felinos{
    private String dieta;
    private double velocidad;
    private String tipo_puma;
    private double fuerza_mordedura;
    //Metodo super
    public Puma() {super();
    }
    //Constructores
    public Puma(String raza, String tamano, String edad, String habitat,String dieta, double velocidad, String tipo_puma, double fuerza_mordedura) {
        this.dieta = dieta;
        this.velocidad = velocidad;
        this.tipo_puma = tipo_puma;
        this.fuerza_mordedura = fuerza_mordedura;
    }
    //Setters and Getters

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo_puma() {
        return tipo_puma;
    }

    public void setTipo_puma(String tipo_puma) {
        this.tipo_puma = tipo_puma;
    }

    public double getFuerza_mordedura() {
        return fuerza_mordedura;
    }

    public void setFuerza_mordedura(double fuerza_mordedura) {
        this.fuerza_mordedura = fuerza_mordedura;
    }

    public void reproduccion (){
        System.out.println("Este es el metodo reproduccion que pertenece a Puma");

    }

    public void mitologia(){
        System.out.println("Este es el metodo mitologia que pertenece a Puma");
    }
}
