public class Leon extends Felinos{
    private String melena;
    private String rugido;
    private String liderazgo;
    private int longevidad;
    //constructor
    public Leon() {
        super();
    }
    public Leon(String raza, String tamano, String edad, String habitat, String melena, String rugido, String liderazgo, int longevidad) {
        super(raza, tamano, edad, habitat);
        this.melena = melena;
        this.rugido = rugido;
        this.liderazgo = liderazgo;
        this.longevidad = longevidad;
    }
    //setters and getters
    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public String getRugido() {
        return rugido;
    }

    public void setRugido(String rugido) {
        this.rugido = rugido;
    }

    public String getLiderazgo() {
        return liderazgo;
    }

    public void setLiderazgo(String liderazgo) {
        this.liderazgo = liderazgo;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }
    //metodos
    public void acecho(){
        System.out.println("Este es el metodo acecho que pertenece a Leon");
    }
    public void emboscada(){
        System.out.println("Este es el metodo emboscada que pertenece a Leon");
    }
    public void socializacion(){
        System.out.println("Este es el metodo socializacion que pertenece a Leon");
    }
}
