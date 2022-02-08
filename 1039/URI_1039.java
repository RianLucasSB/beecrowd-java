import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class URI_1039 {
    
    private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double average = ((n1*2) + (n2*3) + (n3*4) + (n4)) / 10; 

        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Media: " + df.format(average));

        if(average >= 7.0) {
            System.out.println("Aluno aprovado");
        }else if(average < 5.0){
            System.out.println("Aluno reprovado");
        }else{
            System.out.println("Aluno em exame");
            double examScore = scan.nextDouble();
            System.out.println("Nota do exame: " + df.format(examScore));
            double newAverage =  (average + examScore) / 2;
            if(newAverage >= 5.0){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno reprovado");
            }
            System.out.println("Media final: " + df.format(newAverage));
        }   
        
    }
}
