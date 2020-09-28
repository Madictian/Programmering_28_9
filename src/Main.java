import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elev stdnt1 = new Elev();
        stdnt1.alder = 24;
        stdnt1.by ="Nykøbing Falster";
        stdnt1.navn = "Fredrik";

        Elev stdnt2 = new Elev();
        stdnt2.navn = "Lasse";
        stdnt2.by = "skuderløse";
        stdnt2.alder = 22;

        /*Elev stdnt3 = new Elev();
        stdnt2.navn = "Deniz";
        stdnt2.by = "vordingborg";
        stdnt2.alder = ;*/

        Elev stdnt4 = new Elev();
        stdnt4.navn = "Simon";
        stdnt4.by = "Faxe";
        stdnt4.alder = 24;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("hvem leder du efter?\n");
            String opslag = scanner.next();
            switch (opslag){
                case "Fredrik":
                    System.out.println(stdnt1.alder);
                    break;
                case "Lasse":
                    System.out.println(stdnt2.alder);
                    break;
                case "Simon":
                    System.out.println(stdnt4.alder);
                    break;
                default:
                    System.out.print(opslag + "no idea bro");
            }
        }

    }

}
