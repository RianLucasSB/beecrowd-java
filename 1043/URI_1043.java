import java.util.Scanner;

public class URI_1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a,b,c;
    
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            float perimeter = a+b+c;
            System.out.println(String.format("Perimetro = %.1f", perimeter));
        }else{
            float area = (a + b)* c/ 2;
            System.out.println(String.format("Area = %.1f", area));
        }
    }
}
