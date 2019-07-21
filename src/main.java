import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int x = 10;
        int y = 100;
        int z = 1000;

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number == x | number == y | number == z) {
            System.out.println("Данное значение имеется в константах");
        }
            else

                System.out.println("Такой константы нет!");
        }
    }

