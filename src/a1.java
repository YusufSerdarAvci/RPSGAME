import java.util.Random;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        int user = 0;
        int pc = 0;
        String sonuc1 = "";
        String pcchoice1 = "";

        System.out.println("***********************************************************************************************************************\n" +
                "Welcome to the Rock-Paper-Scissor game. In this game you need to select a number that reference rock, paper or scissor.\n" +
                "And I am gonna choose one too. Rock wins against scissor, scissor wins against paper and paper wins against rock.\n" +
                "That's all you need to know. Let's begin our game.\n" +
                "***********************************************************************************************************************");
        Scanner veri = new Scanner(System.in);
        Random veri1 = new Random();

        while (pc != 5 && user != 5) {

            System.out.print("\nYour score= " + user + "      My score= " + pc +
                    "\n1=rock " + "2=paper " + "3=scissor\n" +
                    "Please enter a number:");

            int sonuc = veri.nextInt();
            int pcchoice = veri1.nextInt(3);

            if (sonuc == 1 || sonuc == 2 || sonuc == 3) {

                if (sonuc == 1) {
                    sonuc1 = "rock";
                } else if (sonuc == 2) {
                    sonuc1 = "paper";
                } else {
                    sonuc1 = "scissor";
                }

                if (pcchoice == 0) {
                    pcchoice1 = "rock";
                } else if (pcchoice == 1) {
                    pcchoice1 = "paper";
                } else {
                    pcchoice1 = "scissor";
                }
                if ((sonuc == 1 && pcchoice == 2) || (sonuc == 2 && pcchoice == 0) || (sonuc == 3 && pcchoice == 1)) {
                    System.out.print("YOU WON!\n");
                    user++;
                } else if ((sonuc == 1 && pcchoice == 1) || (sonuc == 2 && pcchoice == 2) || (sonuc == 3 && pcchoice == 0)) {
                    System.out.print("YOU LOST!\n");
                    pc++;
                } else {
                    System.out.print("TIE!\n");
                }
                System.out.println("Your chose: " + sonuc1 + "  My Chose: " + pcchoice1 +
                        "\n-------------------------------------------------------------------------------");
            } else {
                System.out.print("\nPLEASE ENTER A VALID NUMBER!!");
            }
        }
        System.out.println("Your score: " + user + "    My score:" + pc);

        if (user > pc) {
            System.out.println("YOU WON THE GAME CONGRATS!!");
        } else {
            System.out.println("YOU LOST THE GAME BETTER LUCK NEXT TIME!!");
        }
    }
}