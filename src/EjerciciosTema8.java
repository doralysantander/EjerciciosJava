public class EjerciciosTema8 {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Luisa");
        persona.setEdad(20);
        persona.setTelefono(317267890);
        System.out.println("Mi nombre es " + persona.getNombre());
        System.out.println("Mi edad es " + persona.getEdad());
        System.out.println("Mi telefono es " + persona.getTelefono());


    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
