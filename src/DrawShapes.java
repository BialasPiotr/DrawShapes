import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz kształt do narysowania w gwiazdach: 1 - Kwadrat, 2 - Trójkąt, 3 - Pięciokąt");
        int shape = sc.nextInt();
        int size;

        if(shape == 1) {
            System.out.println("Podaj rozmiar kwadratu:");
            size = sc.nextInt();
            drawSquare(size);
        } else if(shape == 2) {
            System.out.println("Podaj wysokość trójkąta:");
            size = sc.nextInt();
            drawTriangle(size);
        } else if(shape == 3) {
            System.out.println("Podaj rozmiar pięciokąta:");
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