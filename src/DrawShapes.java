import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to draw in the stars: 1 - Square, 2 - Triangle, 3 - Pentagon ");
        int shape = sc.nextInt();
        int size;

        if(shape == 1) {
            System.out.println("Enter the size of the square:");
            size = sc.nextInt();
            drawSquare(size);
        } else if(shape == 2) {
            System.out.println("Give the height of the triangle:");
            size = sc.nextInt();
            drawTriangle(size);
        } else if(shape == 3) {
            System.out.println("Enter the size of the pentagon:");
            size = sc.nextInt();
            drawPentagon(size);
        }
    }

    public static void drawSquare(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawPentagon(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = size - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
