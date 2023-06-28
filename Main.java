import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int hot;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Sıcaklık degeri giriniz:");
        hot= scanner.nextInt();

        if(hot<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(hot>=5 && hot<=15)
        {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (hot>=15 && hot<=25)
        {
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}