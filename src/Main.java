public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Nicolas");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(23);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(56789273);
        System.out.println("Mi numero  de telefono es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}