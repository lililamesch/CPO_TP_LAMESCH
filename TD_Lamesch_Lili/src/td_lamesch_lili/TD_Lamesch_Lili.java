public class SaisieDeuxEntiers {
    public static void main(String[] args) {
        // Créer un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le premier entier
        System.out.print("Entrez le premier entier : ");
        int premierEntier = scanner.nextInt();

        // Demander à l'utilisateur de saisir le deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();

        // Fermer le Scanner une fois la saisie terminée
        scanner.close();

        // Afficher les entiers saisis par l'utilisateur
        System.out.println("Vous avez saisi le premier entier : " + premierEntier);
        System.out.println("Vous avez saisi le deuxième entier : " + deuxiemeEntier);

        // Faites ici ce que vous voulez avec les deux entiers saisis...
    }
