public class EjercicioTema9 {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Maria");
        System.out.println(" El nombre del la cliente es: " + cliente.getNombre());
        cliente.setEdad(20);
        System.out.println("La edad del cliente es: " +cliente.getEdad());
        cliente.setTelefono(31567890);
        System.out.println("El telefono de la cliente es " + cliente.getTelefono());
        cliente.setCredito(2);
        System.out.println("Los creditos de la cliente son: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Carlos");
        System.out.println("El nombre del Trabajador es : " + trabajador.getNombre());
        trabajador.setEdad(30);
        System.out.println("La edad del trabajador es: " + trabajador.getEdad());
        trabajador.setTelefono(324567);
        System.out.println("El telefono del trabajador es: " + trabajador.getTelefono());
        trabajador.setSalario(1800000);
        System.out.println("El salario del trabajador es : " + trabajador.getSalario());



    }
}
class Persona1{
    int edad;
    String nombre;
    int telefono;

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
class Cliente extends Persona1{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona1{
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
