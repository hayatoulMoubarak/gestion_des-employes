/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**les commerciaux héritent de Employe donc tout ses methodes abstraites
 *
 * @author hayatoum ùoubarak
 */
public abstract class Commercial extends Employe {
protected double Chiffreaffaire;
int Cadeau;
protected final double pourcentage=0.2;

    public Commercial(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }
 
    public double getChiffreaffaire(){
        return Chiffreaffaire;
    }
    public double calculsalaire(){
        return (Chiffreaffaire*0.2)+Salairebase+Cadeau;
    }

}
