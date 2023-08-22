public class Saludo {
    public static void main(String[] args) {
        System.out.println("Por favor, escriba su nombre");
        String nombre = System.console().readLine();

        System.out.println("Bienvenido, " + nombre + ", es un gusto saludarte.");
    }
}
