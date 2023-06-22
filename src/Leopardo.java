public class Leopardo extends Felinos{
    private String sigilo;
    private int velocidad;
    private String equilibrio;
    private String manchas;
    //constructor
    public Leopardo(String raza, String tamano, String edad, String habitat, String sigilo, int velocidad, String equilibrio, String manchas) {
        super(raza, tamano, edad, habitat);
        this.sigilo = sigilo;
        this.velocidad = velocidad;
        this.equilibrio = equilibrio;
        this.manchas = manchas;
    }
    public Leopardo() {
        super();
    }
    //setters and getters
    public String getSigilo() {
        return sigilo;
    }

    public void setSigilo(String sigilo) {
        this.sigilo = sigilo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getEquilibrio() {
        return equilibrio;
    }

    public void setEquilibrio(String equilibrio) {
        this.equilibrio = equilibrio;
    }

    public String getManchas() {
        return manchas;
    }

    public void setManchas(String manchas) {
        this.manchas = manchas;
    }
    //metodos
    public void caza_nocturna(){
        System.out.println("Este es el metodo caza nocturna que pertenece a Leopardo");
    }
    public void emboscada_acuatica(){
        System.out.println("Este es el metodo emboscada avuatica que pertenece a Leopardo");
    }
    public void emboscada_arboles(){
        System.out.println("Este es el metodo emboscada desde los arboles que pertenece a Leopardo");
    }
}