import java.util.Scanner;


public class HolaMundo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.next();
        for(int i = 0; i < 3; i++) {
            System.out.println("Hola " + nombre + "!");
        }
        System.out.println("¿Cuál es tu edad?");
        int edad = scanner.nextInt();
        System.out.println("Felicidades por esos " + edad + " años");
    }

}
