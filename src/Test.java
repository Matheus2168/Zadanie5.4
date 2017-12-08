import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj X: ");
        int x = sc.nextInt();
        System.out.println("Podaj Y: ");
        int y = sc.nextInt();

        String result;

        if (x>0 && y>0)
            result = "I";

        else if (x<0 && y>0)
            result = "II";

        else if (x<0 && y<0)
            result = "III";

        else if (x>0 && y<0)
            result = "IV";

        else result = " 0 ";

        System.out.printf("Punkt(%d,%d) lezy w %s cwiartce ukladu wspolrzednych",x,y,result);
    }
}
