/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lamesch_version_console;

import java.util.Random;

/**
 *
 * @author Lili
 */
public class GrilleDeJeu {
    // Attributs de la classe
    public CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    private Random rand = new Random();

    // Constructeur de la classe
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;

        // Initialisation de la matrice
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Remplissage de la matrice avec de nouvelles instances de CelluleLumineuse
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = rand.nextInt(3);
        switch (choix) {
            case 0:
                activerLigneDeCellules(rand.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(rand.nextInt(nbColonnes));
                break;
            case 2:
                if (rand.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        // Affichage des indices des colonnes
        builder.append("    ");  // Pour aligner avec les indices des lignes
        for (int j = 0; j < nbColonnes; j++) {
            builder.append(j).append(" ");
        }
        builder.append("\n");

        // Ligne de séparation
        builder.append("  +");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append("--");
        }
        builder.append("\n");

        // Affichage de chaque ligne avec indice et état des cellules
        for (int i = 0; i < nbLignes; i++) {
            builder.append(i).append(" | ");
            for (int j = 0; j < nbColonnes; j++) {
                builder.append(matriceCellules[i][j]).append(" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    public void melangerMatriceAleatoirement(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
 