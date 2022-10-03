public class Main {
    public static void main(String[] args) {
        //creo un cliente y le seteo datos
        Cliente cli = new Cliente();
        cli.setNombre("Tony");
        cli.setEdad(29);
        cli.setTelefono("1138499393");
        cli.setCredito(15000);

        System.out.println("el cliente " + cli.getNombre() + " tiene " + cli.getEdad()+ " años, " +
                " su telefono es " + cli.getTelefono() + " y su credito es de " + cli.getCredito());

        //objeto trabajador-----------------------------------------------------------------------
         Trabajador emple = new Trabajador();
         emple.setNombre("Daniela");
         emple.setEdad(23);
         emple.setTelefono("1134546723");
         emple.setSalario(57800);

        System.out.println("la empleada " + emple.getNombre() + " tiene " + emple.getEdad()+ " años, " +
                " su telefono es " + emple.getTelefono() + " y su salario es de " + emple.getSalario());

    }
}