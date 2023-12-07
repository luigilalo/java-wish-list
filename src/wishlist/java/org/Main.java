package wishlist.java.org;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> presentsList = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Vuoi dei regali? (y/n)");
            String presentsYesOrNo = scan.nextLine();
            if (presentsYesOrNo.equalsIgnoreCase("y")) {
                System.out.println("Che regalo vuoi?");
                String present = scan.nextLine().toLowerCase();
                boolean isAlreadyAdded = presentsList.add(present);
                if(!isAlreadyAdded){
                    System.out.println("Questo regalo è già incluso");
                }
                if (presentsList.size() == 1) {
                    System.out.println("La tua lista ha un solo regalo");
                } else {
                    System.out.println("La tua lista ha " + presentsList.size() + " regali");
                }
            }
                else if (presentsYesOrNo.equalsIgnoreCase("n")){
                    stop = true;
                }
                else {System.out.println("Risposta non valida");}
            }
            System.out.println("La tua lista di regali è composta da " + presentsList);
        }
    }
