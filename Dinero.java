public class Dinero {
    public static void main(String[] args) {
        System.out.println("Por favor, ingrese la cantidad de billetes de 10 Bs. que posee:");
        int billetes10 = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, ingrese la cantidad de monedas de 5 Bs. que posee:");
        int monedas5 = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, ingrese la cantidad de monedas de 2 Bs. que posee:");
        int monedas2 = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, ingrese la cantidad de monedas de 1 Bs. que posee:");
        int monedas1 = Integer.parseInt(System.console().readLine());

        int totalDinero = (billetes10*10)+(monedas5*5)+(monedas2*2)+(monedas1);
        System.out.println("El total de dinero que posee es de: " + totalDinero);
    }
}
