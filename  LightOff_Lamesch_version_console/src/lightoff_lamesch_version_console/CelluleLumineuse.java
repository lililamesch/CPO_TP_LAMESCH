/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lamesch_version_console;

/**
 *
 * @author Lili
 */
public class CelluleLumineuse {

    // Attribut privé pour l'état de la cellule
    private boolean etat;

    // Constructeur par défaut : éteint la cellule
    public CelluleLumineuse() {
        this.etat = false;
    }

    // Méthode pour inverser l'état de la cellule
    public void activerCellule() {
        this.etat = !this.etat;
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        this.etat = false;
    }

    // Méthode pour obtenir l'état de la cellule
    public boolean estAllumee() {
        return this.etat;
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return !this.etat;
    }

    // Méthode pour obtenir l'état de la cellule
    public boolean getEtat() {
        return this.etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O";
    }

    public static void main(String[] args) {
        CelluleLumineuse cellule = new CelluleLumineuse();
        System.out.println("La cellule est : " + cellule); // O

        cellule.activerCellule();
        System.out.println("La cellule est : " + cellule); // X

        cellule.eteindreCellule();
        System.out.println("La cellule est : " + cellule); // O
    }
}


