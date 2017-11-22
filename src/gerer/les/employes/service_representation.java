/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/** ceux qui sont à la representation sont aussi des commerciaux
 *
 * @author adamou
 */
public abstract class service_representation extends Commercial {

    public service_representation(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }

    /**calcul salaire representant
     *
     * @return
     */
    @Override
    public double calculsalaire(){
        final int Cadeau;
        Cadeau = 200;
        return (Chiffreaffaire*0.2)+Salairebase+Cadeau;
    }
}
