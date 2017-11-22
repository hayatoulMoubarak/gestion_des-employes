/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**
 *
 * 
 */
public class particular_production extends Production implements prime_risque_mensuelle{

    public particular_production(String x, String y, String m, int a, int D) {
        super(x, y, m, a, D);
    }

    //puisqu'il herite d'Employe donc ses constucteurs egalement
    @Override
    public double calculerSalaire(){
        return super.calculerSalaire()+prime;
    }
    }
    
