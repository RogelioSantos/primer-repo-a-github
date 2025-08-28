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

        System.out.println("Eres mayor de edad? (true/false)");
        boolean mayorDeEdad = scanner.nextBoolean();
        if(mayorDeEdad){
            System.out.println("Adelante con la fiesta");
        } else{
            System.out.println("Aún no puedes entrar a la fiesta");
        }
    }

}
