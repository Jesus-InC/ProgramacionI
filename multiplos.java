import java.util.Random;

public class multiplos{
    public static void main(String[] args) throws Exception{
        Random rnd = new Random();
        int contador=0;
        int M3=0;
        int M5=0;
        while (contador<11){
            int num = rnd.nextInt(19) + 1;
            System.out.println(num);
            if (num%3==0){
                M3=num+M3;
            }
            if (num%5==0){
                M5=num+M5;
            }
            contador=contador+1;
    }
    System.out.println("La suma de los multiplos de 3 es: " + M3);
    System.out.println("La suma de los multiplos de 5 es: " + M5);
}
}

