import java.util.Scanner;
public class O3_fakultet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn et heltall, så regnes fakultetet ut");

        int tall = input.nextInt();
        int fakultet = 1;

        if(tall < 0){
            System.out.println("Tallet kan ikke være under 0");
        }else{
            for (int i=tall; i > 0; i--){
                fakultet = fakultet * i;
            }
            System.out.println(fakultet);
        }
    }
}
