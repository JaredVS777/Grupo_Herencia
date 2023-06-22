public class Tigre extends Felinos {
    private int fuerza;
    private String agilidad;
    private String camuflaje;
    private String paciencia;
    // constructor
    public Tigre() {
        super();
    }
    public Tigre(String raza, String tamano, String edad, String habitat, int fuerza, String agilidad, String camuflaje, String paciencia) {
        super(raza, tamano, edad, habitat);
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.camuflaje = camuflaje;
        this.paciencia = paciencia;
    }
    //setters and getters
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(String agilidad) {
        this.agilidad = agilidad;
    }

    public String getCamuflaje() {
        return camuflaje;
    }

    public void setCamuflaje(String camuflaje) {
        this.camuflaje = camuflaje;
    }

    public String getPaciencia() {
        return paciencia;
    }

    public void setPaciencia(String paciencia) {
        this.paciencia = paciencia;
    }
    //metodos
    public void dominio_territorial(){
        System.out.println("Este es el metodo dominio territorial que pertenece a Tigre");
    }
    public void poder_colmillos(){
        System.out.println("Este es el metodo poder de colmillos que pertenece a Tigre");
    }
    public void poder_garras(){
        System.out.println("Este es el metodo poder de garras que pertenece a Tigre");
    }
}
