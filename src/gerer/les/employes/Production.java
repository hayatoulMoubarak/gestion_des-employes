/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**ceux affectés à la production sont aussi des Employes donc ils héritent ses methodes abstract.
 *les producteurs sont dans une classe concrete et non abstraite.
 */
public class Production extends Employe {
    int Unite_produite;
final int evalue=5;

    public Production(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }
// calcul salaire prduction
    @Override
    public double calculerSalaire(){
        return Salairebase+(Unite_produite*evalue);
    }
    }
   
    

