/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**ceux affectés à la Manutention héritent de Employe 
 *
 * @author adamou
 */
public class Manutention extends Employe {
int Nbre_H_travail;
final int Cout_heure=65;

    public Manutention(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }
    //calcul salire manutentionnaire
    @Override
    public double calculerSalaire() {
        return(Nbre_H_travail*Cout_heure)+Salairebase;
           
    }
    
}
