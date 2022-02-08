
import java.util.Scanner;

public class URI_1042 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            int x,y,z, pos1, pos2, pos3;

            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();

            pos1 = Math.min(x, Math.min(y, z));

            if(pos1 == x){
                pos2 = Math.min(y, z);
                pos3 = Math.max(y, z);
            }else if(pos1 == y){
                pos2 = Math.min(x, z);
                pos3 = Math.max(x, z);
            }else{
                pos2 = Math.min(y, x);
                pos3 = Math.max(y, x);
            }

            System.out.println(pos1 + "\n" + pos2 + "\n" + pos3 + "\n");
            System.out.println(x + "\n" + y + "\n" + z);

    }
}
