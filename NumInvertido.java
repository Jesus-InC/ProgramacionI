public class NumInvertido {
    public static void main(String[] args) {
        System.out.println("Por favor, ingrese un número de tres cifras:");
        String numIngresado = System.console().readLine();
        int num = Integer.parseInt(numIngresado);
        int numInvertido = 0;

        if (num < 100|| num > 999) {
            System.out.println("El número ingresado no tiene tres cifras.");
        } else {
            while (num > 0 ) {
                int dígito = num % 10;
                numInvertido = numInvertido * 10 + dígito;
                num = num / 10;
            }
            System.out.println("El número ingresado invertido es: " + numInvertido);
        }
    }
}
