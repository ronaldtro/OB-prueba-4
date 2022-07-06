public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNombre("Ronald");
        c1.setEdad(24);
        c1.setTelefono(12345);
        c1.setCredito(9000);

        System.out.println("Nombre: "+c1.getNombre());
        System.out.println("Edad: "+c1.getEdad());
        System.out.println("Telefono: "+c1.getTelefono());
        System.out.println("Credito: "+c1.getCredito());

        Trabajador t1 = new Trabajador();
        t1.setNombre("Fabian");
        t1.setEdad(22);
        t1.setTelefono(0000);
        t1.setSalario(10000000);

        System.out.println("\nNombre: "+t1.getNombre());
        System.out.println("Edad: "+t1.getEdad());
        System.out.println("Telefono: "+t1.getTelefono());
        System.out.println("Salario: "+t1.getSalario());

    }
}

class Persona{
    public String nombre;
    public int edad;
    public int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}
