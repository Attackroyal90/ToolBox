package exerciceTempsCuisson;

import java.util.Scanner;

public class TempsCuisson {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //Demande aux différentes fonctions les paramètres et les rassemblent dans le main
        String typeViande = demanderType();
        System.out.println("Vous avez choisi le : " + typeViande);
        int poidsViande = demanderPoids();
        System.out.println("Il pèse " + poidsViande + "g.");
        String modeCuisson = demanderMode();
        System.out.println("Avec une cuisson de type : " + modeCuisson);

        //Donne à l'utilisateur le temps de cuisson final en fonction des paramètres
        if (typeViande.equals("boeuf")) {
            double tempsCuisson = cuissonBoeuf(poidsViande, modeCuisson);
            System.out.println("Votre boeuf de " + poidsViande + "g aura besoin de " + tempsCuisson + " min de cuisson !");
        } else if (typeViande.equals("porc")) {
            double tempsCuisson = cuissonPorc(poidsViande, modeCuisson);
            System.out.println("Votre porc de " + poidsViande + "g aura besoin de " + tempsCuisson + " min de cuisson !");
        } else if (typeViande.equals("canard")) {
            double tempsCuisson = cuissonCanard(poidsViande, modeCuisson);
            System.out.println("Votre canard de " + poidsViande + "g aura besoin de " + tempsCuisson + " min de cuisson !");
        }

        s.close();
    }

    //Focntion qui demande le type de viande, ne prends en compte que le boeuf, le porc et le canard
    private static String demanderType() {
        System.out.println("Choisissez le type de viande : boeuf, porc, canard");
        String typeViandeChoisi = s.nextLine();
        return typeViandeChoisi.toLowerCase();
    }

    //Fonction qui demande le poids de la viande
    private static int demanderPoids() {
        System.out.println("Saisissez le poids de votre viande en grammes");
        int poidsViandeChoisi = s.nextInt();
        s.nextLine();
        return poidsViandeChoisi;
    }

    //Fonction qui demande le type de cuisson de la viande, ne prends en compte que 3 paramètres avec une exception pour le canard
    private static String demanderMode() {
        System.out.println("Choisissez la cuisson : bleu (rose pour le canard), a point, bien cuit");
        String modeCuissonChoisi = s.nextLine();
        return modeCuissonChoisi.toLowerCase();
    }

    //Calcule le temps de cuisson du boeuf en fonction du poids et du type de cuisson
    private static double cuissonBoeuf(int poids, String mode) {
        double tempsCoeff = 0.0;
        switch (mode) {
            case "bleu":
                tempsCoeff = 0.02;
                break;
            case "a point":
                tempsCoeff = 0.034;
                break;
            case "bien cuit":
                tempsCoeff = 0.05;
                break;
            default:
                System.err.println("Vous avez dû faire une erreur ou une faute en renseignant les informations");
                break;
        }
        return poids * tempsCoeff;
    }

    //Calcule le temps de cuisson du porc en fonction du poids et du type de cuisson
    private static double cuissonPorc(int poids, String mode) {
        double tempsCoeff = 0.0;
        switch (mode) {
            case "bleu":
                tempsCoeff = 0.0375;
                break;
            case "a point":
                tempsCoeff = 0.0625;
                break;
            case "bien cuit":
                tempsCoeff = 0.1;
                break;
            default:
                System.err.println("Vous avez dû faire une erreur ou une faute en renseignant les informations");
                break;
        }
        return poids * tempsCoeff;
    }

    //Calcule le temps de cuisson du canard en fonction du poids et du type de cuisson
    private static double cuissonCanard(int poids, String mode) {
        double tempsCoeff = 0.0;
        switch (mode) {
            case "rose":
                tempsCoeff = 0.04444;
                break;
            case "a point":
                tempsCoeff = 0.05555;
                break;
            case "bien cuit":
                tempsCoeff = 0.06666;
                break;
            default:
                System.err.println("Vous avez dû faire une erreur ou une faute en renseignant les informations");
                break;
        }
        return poids * tempsCoeff;
    }
}
