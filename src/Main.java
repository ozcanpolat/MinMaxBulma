import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,totalNumber, max=0, min=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        totalNumber=input.nextInt();

        for(int i=1; i<=totalNumber;i++){
            System.out.print(i+". Sayıyı Girin :");
            number=input.nextInt();

            if(i==1){
                max=number;
                min=number;
            }
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println("En Büyük Sayı :"+max);
        System.out.println("En Küçük Sayı :"+min);
    }
}
