import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Leon Feli1 = new Leon();
        Feli1.setRaza("Leon");
        System.out.println("Raza: " + Feli1.getRaza());
        Feli1.setTamano("Grande");
        System.out.println("Tamaño: " + Feli1.getTamano());
        Feli1.setHabitat("Sabana");
        System.out.println("Habitat: " + Feli1.getHabitat());
        Feli1.setEdad("4 años");
        System.out.println("Edad: " + Feli1.getEdad());
        Feli1.setMelena("Si posee melena");
        System.out.println("Melena: " + Feli1.getMelena());
        Feli1.setRugido("Fuerte");
        System.out.println("Rugido: " + Feli1.getRugido());
        Feli1.setLiderazgo("Amplio");
        System.out.println("Liderazgo: " + Feli1.getLiderazgo());
        Feli1.setLongevidad(15);
        System.out.println("Longevidad: " + Feli1.getLongevidad());
        Feli1.acecho();
        Feli1.emboscada();
        Feli1.socializacion();

        Scanner scanner = new Scanner(System.in);
        Leopardo Feli2 = new Leopardo();
        System.out.print("Ingrese la raza del Felino: ");
        String raza = scanner.nextLine();
        Feli2.setRaza(raza);
        System.out.println("Raza: " + Feli2.getRaza());
        System.out.print("Ingrese el tamaño del Felino: ");
        String tamano = scanner.nextLine();
        Feli2.setTamano(tamano);
        System.out.println("Tamaño: " + Feli2.getTamano());
        System.out.print("Ingrese el hábitat del Felino: ");
        String habitat = scanner.nextLine();
        Feli2.setHabitat(habitat);
        System.out.println("Hábitat: " + Feli2.getHabitat());
        System.out.print("Ingrese la edad del Felino: ");
        String edad = scanner.nextLine();
        Feli2.setEdad(edad);
        System.out.println("Edad: " + Feli2.getEdad());
        System.out.print("¿El felino es sigiloso?: ");
        String tieneMelena = scanner.nextLine();
        Feli2.setSigilo(tieneMelena);
        System.out.println("Sigilo: " + Feli2.getSigilo());
        System.out.print("Ingrese la velocidad del felino: ");
        int velocidad = scanner.nextInt();
        Feli2.setVelocidad(velocidad);
        System.out.println("Velocidad: " + Feli2.getVelocidad());
        System.out.print(":");
        String longevidadf = scanner.nextLine();
        Feli2.setManchas(longevidadf);
        System.out.println(":" + Feli2.getManchas());
        System.out.print("¿El felino posee manchas?: ");
        String longevidad = scanner.nextLine();
        Feli2.setManchas(longevidad);
        System.out.println("Manchas: " + Feli2.getManchas());
        Feli2.caza_nocturna();
        Feli2.emboscada_acuatica();
        Feli2.emboscada_arboles();

        Tigre Feli3 = new Tigre();
        System.out.print("Ingrese la raza del Felino: ");
        String razaf = scanner.nextLine();
        Feli3.setRaza(razaf);
        System.out.println("Raza: " + Feli3.getRaza());
        System.out.print("Ingrese el tamaño del Felino: ");
        String tamanof = scanner.nextLine();
        Feli3.setTamano(tamanof);
        System.out.println("Tamaño: " + Feli3.getTamano());
        System.out.print("Ingrese el hábitat del Felino: ");
        String habitatf = scanner.nextLine();
        Feli3.setHabitat(habitatf);
        System.out.println("Hábitat: " + Feli3.getHabitat());
        System.out.print("Ingrese la edad del Felino: ");
        String edadf = scanner.nextLine();
        Feli3.setEdad(edadf);
        System.out.println("Edad: " + Feli3.getEdad());
        System.out.print("¿El felino es paciente?: ");
        String tieneMelenaf = scanner.nextLine();
        Feli3.setPaciencia(tieneMelenaf);
        System.out.println("Paciente: " + Feli3.getPaciencia());
        System.out.print("Ingrese la fuerza del felino: ");
        int velocidadf = scanner.nextInt();
        Feli3.setFuerza(velocidadf);
        System.out.println("Fuerza: " + Feli3.getFuerza());
        System.out.print(":");
        String longevidad4 = scanner.nextLine();
        Feli3.setCamuflaje(longevidad4);
        System.out.println(":" + Feli3.getCamuflaje());
        System.out.print("¿El tiene agilidad?: ");
        String longevidadf2 = scanner.nextLine();
        Feli3.setAgilidad(longevidadf2);
        System.out.println("Agilidad: " + Feli3.getAgilidad());
        Feli3.dominio_territorial();
        Feli3.poder_garras();
        Feli3.poder_colmillos();

        Gato Feli4 = new Gato();
        System.out.print("Ingrese la raza del Felino: ");
        String razag = scanner.nextLine();
        Feli4.setRaza(razag);
        System.out.println("Raza: " + Feli4.getRaza());
        System.out.print("Ingrese el tamaño del Felino: ");
        String tamanog = scanner.nextLine();
        Feli4.setTamano(tamanog);
        System.out.println("Tamaño: " + Feli4.getTamano());
        System.out.print("Ingrese el hábitat del Felino: ");
        String habitatg = scanner.nextLine();
        Feli4.setHabitat(habitatg);
        System.out.println("Hábitat: " + Feli4.getHabitat());
        System.out.print("Ingrese la edad del Felino: ");
        String edadg = scanner.nextLine();
        Feli4.setEdad(edadg);
        System.out.println("Edad: " + Feli4.getEdad());
        System.out.print("Color del pelage: ");
        String tieneMelenag = scanner.nextLine();
        Feli4.setPelaje(tieneMelenag);
        System.out.println("Pelage: " + Feli4.getPelaje());
        System.out.print("Ingrese el peso del felino: ");
        double velocidadg = scanner.nextInt();
        Feli4.setPeso(velocidadg);
        System.out.println("Peso: " + Feli4.getPeso());
        System.out.print(":");
        String longevida4d = scanner.nextLine();
        Feli4.setNivel_actividad(longevida4d);
        System.out.println(":" + Feli4.getNivel_actividad());
        System.out.print("El color es: ");
        String longevidadg = scanner.nextLine();
        Feli4.setColor(longevidadg);
        System.out.println("Color: " + Feli4.getColor());

        Feli4.sentidos();
        Feli4.comunicacion();

        Puma Feli5 = new Puma();
        Feli5.setRaza("Puma");
        System.out.println("Raza: " + Feli5.getRaza());
        Feli5.setTamano("Mediano");
        System.out.println("Tamaño: " + Feli5.getTamano());
        Feli5.setHabitat("Jungla");
        System.out.println("Habitat: " + Feli5.getHabitat());
        Feli5.setEdad("2 años");
        System.out.println("Edad: " + Feli5.getEdad());
        Feli5.setVelocidad(120);
        System.out.println("Velocidad: " + Feli5.getVelocidad());
        Feli5.setDieta("Variada");
        System.out.println("Dieta: " + Feli5.getDieta());
        Feli5.setTipo_puma("Agresivo");
        System.out.println("Tipo  de puma: " + Feli5.getTipo_puma());
        Feli5.setFuerza_mordedura(15);
        System.out.println("Fuerza de mordedura: " + Feli5.getFuerza_mordedura());
        Feli5.reproduccion();
        Feli5.mitologia();

    }
}