public class Rectángulo {
    public static void main(String[] args) {
        System.out.println("Por favor, ingrese la medida de la base del rectángulo:");
        String baseMódulo = System.console().readLine();
        double base = Double.parseDouble(baseMódulo);

        System.out.println("Por favor, ingrese la medida de la altura del rectángulo:");
        String alturaMódulo = System.console().readLine();
        double altura = Double.parseDouble(alturaMódulo);

        double área = base * altura;
        double perímetro = 2 * (base+altura);

        System.out.println("El área del rectángilo es de: " + área);
        System.out.println("El perímetro del rectángulo es de: " + perímetro);
    }
}
