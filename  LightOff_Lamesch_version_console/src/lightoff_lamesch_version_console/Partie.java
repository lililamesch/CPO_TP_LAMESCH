/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lamesch_version_console;

import java.util.Scanner;

/**
 *
 * @author Lili
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        this.grille = new GrilleDeJeu(7, 7); // Pour simplifier, une grille 7x7 est cr��e par d�faut
        this.nbCoups = 0;
    }

    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(10); // Pour simplifier, nous m�langeons 10 fois par d�faut
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");
        System.out.println(grille);

        while (!grille.cellulesToutesEteintes()) {
            System.out.print("Entrez votre coup (format : l5, c3, d1, d2): ");
            String coup = scanner.nextLine();

            jouerCoup(coup);

            System.out.println("Coups jou�s: " + nbCoups);
            System.out.println(grille);
        }

        System.out.println("Bravo! Vous avez termin� le jeu en " + nbCoups + " coups.");
        scanner.close();
    }

    private void jouerCoup(String coup) {
        switch (coup.charAt(0)) {
            case 'l':
                grille.activerLigneDeCellules(Integer.parseInt(coup.substring(1)));
                break;
            case 'c':
                grille.activerColonneDeCellules(Integer.parseInt(coup.substring(1)));
                break;
            case 'd':
                if (coup.charAt(1) == '1') {
                    grille.activerDiagonaleDescendante();
                } else {
                    grille.activerDiagonaleMontante();
                }
                break;
            default:
                System.out.println("Coup non valide! Veuillez r�essayer.");
                return;
        }
        nbCoups++;
    }

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.lancerPartie();
    }
}
