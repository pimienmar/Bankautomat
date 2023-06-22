import java.util.Scanner;

public class Projekt_018_GuthabenundAuszahlung {
    public static void main(String[] args) {

        double Guthaben = 1000;
        double Betrag;
        double gebühr = 0.10;
        double Kreditlimit = 200;
        // double überzugszinsen = 12.0/100;   (oder 0.12)

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Willkommen im Hauptmenü");
        System.out.println("1: Geld einzahlen. ");
        System.out.println("2: Geld Abheben. ");
        System.out.println("3: Beenden");

        while (true) {  // Guthaben < 1001 ist hier immer wahr -> true
            // while (true) wäre auch möglich

        int Hauptmenü = eingabe.nextInt();
        switch (Hauptmenü) {
            case 1: //mehrere cases möglich
                System.out.println("Ihr Kontostand beträgt: " + Guthaben);
                System.out.println(" Wie viel möchten Sie einzahlen? ");
                double Einzahlung = eingabe.nextDouble();
                Guthaben = Guthaben + Einzahlung;
                System.out.println("Danke für die Einzahlung. Ihr neuer Kontostand beträgt: " + Guthaben);
                System.out.println("1: Geld einzahlen. ");
                System.out.println("2: Geld Abheben. ");
                System.out.println("3: Beenden");
                break;

            case 2:
                    System.out.println("Ihr Kontostand beträgt: " + Guthaben);
                    System.out.println("Wie viel möchten Sie abheben? ");
                    Betrag = eingabe.nextDouble();
                    if (Betrag == 0) break;

                    if (Betrag < 0) {
                        System.out.println("Ins Minus geht nicht!");
                        continue; //beenden und weiter
                    }

                    if (Betrag <= Guthaben + Kreditlimit) {
                        System.out.println("Erfolg, bitte entnehmen Sie Ihr Geld.");
                        Guthaben = Guthaben - Betrag;
                        if ( Guthaben < 0) {
                            Guthaben = Guthaben - gebühr;
                        }
                    } else {
                        System.out.println("Auszahlung nicht möglich, nicht genug Guthaben vorhanden. Ihr Kreditlimit beträgt: " + Kreditlimit);
                    }
                    //double NeuesGuthaben = Guthaben - Betrag;
                    System.out.println("Ihr neuer Kontostand ist: " + Guthaben);
                System.out.println("1: Geld einzahlen. ");
                System.out.println("2: Geld Abheben. ");
                System.out.println("3: Beenden");

                break;

            case 3:
                System.out.println("Auf Wiedersehen! Bitte entnehmen Sie Ihre Karte.");
                break;
        }
        }


    }
}
