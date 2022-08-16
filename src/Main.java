

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(32);
        persona.setNombre("Julian");
        persona.setTelefono(132343434);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());


    }
 }

