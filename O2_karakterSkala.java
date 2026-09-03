import java.util.Scanner;
public class O2_karakterSkala {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //for (initialization; condition; update){}
        for(int i=1; i<=10; i++){
            System.out.println("Hvilken score fikk student " + i + "?");
            int karakterSum = input.nextInt();

            //fiks ny innlesnin
            while((karakterSum < 0) || (karakterSum > 100)) {
                System.out.println("Den verdien er ikke gydlig, prøv å skrive inn på nytt for Student " + i);
                karakterSum = input.nextInt();
            }

            if(karakterSum >= 90){
                System.out.println("Student " + i + " fikk en A!");

            }else if(karakterSum >= 80){
                System.out.println("Student " + i + " fikk en B!");

            }else if(karakterSum >= 60){
                System.out.println("Student " + i + " fikk en C!");

            }else if(karakterSum >= 50){
                System.out.println("Student " + i + " fikk en D!");

            }else if(karakterSum >= 40){
                System.out.println("Student " + i + " fikk en E!");

            }else{
                System.out.println("Student " + i + " fikk en F!");

            }
        }
    }
}
