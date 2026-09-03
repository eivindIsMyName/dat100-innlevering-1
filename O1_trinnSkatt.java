import java.util.Scanner;

public class O1_trinnSkatt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hva er inntekten din i kroner?");
        double inntekt = input.nextInt();

        double trinn5Skatt = 0.178;
        double trinn4Skatt = 0.168;
        double trinn3Skatt = 0.137;
        double trinn2Skatt = 0.04;
        double trinn1Skatt = 0.017;

        double trinn4 = 1467200 - 980101;
        double trinn3 = 980100 - 725051;
        double trinn2 = 725050 - 318301;
        double trinn1 = 318300 - 226101;

        if (inntekt >= 1467201) {
            double trinn5 = inntekt - 1467200;
            double totalSkatt = (trinn5*trinn5Skatt)+(trinn4*trinn4Skatt)+(trinn3*trinn3Skatt)+(trinn2*trinn2Skatt)+(trinn1*trinn1Skatt);
            System.out.print(totalSkatt);

        } else if(inntekt >= 980101){
            trinn4 = inntekt - 980101;
            double totalSkatt =(trinn4*trinn4Skatt)+(trinn3*trinn3Skatt)+(trinn2*trinn2Skatt)+(trinn1*trinn1Skatt);
            System.out.print(totalSkatt);

        }else if(inntekt >= 725051){
            trinn3 = inntekt - 725051;
            double totalSkatt = (trinn3*trinn3Skatt)+(trinn2*trinn2Skatt)+(trinn1*trinn1Skatt);
            System.out.print(totalSkatt);

        }else if(inntekt >= 318301){
            trinn2 = inntekt - 318301;
            double totalSkatt = (trinn2*trinn2Skatt)+(trinn1*trinn1Skatt);
            System.out.print(totalSkatt);

        }else if(inntekt >= 226101){
            trinn1 = inntekt - 226101;
            double totalSkatt = trinn1*trinn1Skatt;
            System.out.print(totalSkatt);

        }else{
            System.out.println("Du skal ikke betale skatt");
        }
    }
}
