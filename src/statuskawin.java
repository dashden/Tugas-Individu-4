import java.util.Scanner;

public class statuskawin {

    public double tistri(int golongan){
        Scanner input = new Scanner(System.in);
        System.out.print("Status Perkawinan (y/n) : ");
        String status = input.nextLine();
        switch(status){
            case "y":
            double tistri;
            tistri = (0.2*golongan);
            return tistri;
            case "n":
            tistri = (0*golongan);
            return tistri;
        }
        return golongan;
        
    }
}