/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**cette classe herite de l'interface,pour dire sa methode abstraite
 *
 * @author hayatoul moubarak 16B727FS
 */
public class particular_manutention extends Manutention implements prime_risque_mensuelle {

    public particular_manutention(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }


    @Override
    public double calculerSalaire(){
        return super.calculerSalaire()+prime;
        
    }
}
