import java.util.Scanner;

public class gajipenghasilan {
    public static void main(String[] args) throws Exception {
        
    statuskawin g = new statuskawin();
    anak h = new anak();
    Scanner inputg = new Scanner(System.in);

    int golongan1 = 3000000;
    int golongan2 = 4000000;
    int golongan3 = 5000000;
    int golongan4 = 6000000;

    System.out.print("Masukkan golongan : ");
    int golongan = inputg.nextInt();
    if (golongan == 1){
        double tunjanganistri = g.tistri(golongan1);
        System.out.print("Masukkan Jumlah Anak : ");
        int jmlanak = inputg.nextInt();
        double tunjangananak = h.jumlahanak(jmlanak);
        System.out.print("Total Gaji = "+(tunjangananak+tunjanganistri+golongan1));
    }else if (golongan == 2){
        double tunjanganistri = g.tistri(golongan2);
        System.out.print("Masukkan Jumlah Anak : ");
        int jmlanak = inputg.nextInt();
        double tunjangananak = h.jumlahanak(jmlanak);
        System.out.print("Total Gaji = "+(tunjangananak+tunjanganistri+golongan2));
    }else if (golongan == 3){
        double tunjanganistri = g.tistri(golongan3);
        System.out.print("Masukkan Jumlah Anak : ");
        int jmlanak = inputg.nextInt();
        double tunjangananak = h.jumlahanak(jmlanak);
        System.out.print("Total Gaji = "+(tunjangananak+tunjanganistri+golongan3));
    }else if (golongan == 4){
        double tunjanganistri = g.tistri(golongan4);
        System.out.print("Masukkan Jumlah Anak : ");
        int jmlanak = inputg.nextInt();
        double tunjangananak = h.jumlahanak(jmlanak);
        System.out.print("Total Gaji = "+(tunjangananak+tunjanganistri+golongan4));
    }else{
        System.out.print("HANYA ADA GOLONGAN 1, 2, 3, 4 SAJA!!!");
    }
}
}

