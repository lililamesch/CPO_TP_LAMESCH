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

    // Attribut priv� pour l'�tat de la cellule
    private boolean etat;

    // Constructeur par d�faut : �teint la cellule
    public CelluleLumineuse() {
        this.etat = false;
    }

    // M�thode pour inverser l'�tat de la cellule
    public void activerCellule() {
        this.etat = !this.etat;
    }

    // M�thode pour �teindre la cellule
    public void eteindreCellule() {
        this.etat = false;
    }

    // M�thode pour obtenir l'�tat de la cellule
    public boolean estAllumee() {
        return this.etat;
    }

    // M�thode pour v�rifier si la cellule est �teinte
    public boolean estEteint() {
        return !this.etat;
    }

    // M�thode pour obtenir l'�tat de la cellule
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


