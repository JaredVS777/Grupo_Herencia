public class Felinos {
    //Atributos
    String raza;
    String tamano;

    String edad;
    String habitat;
    //Constructor
    public Felinos(String raza, String tamano, String edad, String habitat) {
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
        this.habitat = habitat;
    }
    //Getters and Setters


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
