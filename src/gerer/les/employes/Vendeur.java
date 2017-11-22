/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/** les vendurs sont des commerciaux 
 *
 * @author adamou
 */
public abstract class Vendeur extends Commercial {

    public Vendeur(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }
    //calcul du salaire de vendeur
    @Override
    public double calculsalaire(){
        final int Cadeau;
        Cadeau = 100;
        return (Chiffreaffaire*0.2)+Salairebase+Cadeau;
    }
}
