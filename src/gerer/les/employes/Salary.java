/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerer.les.employes;

/**
 *
 * @author hayatoul moubarak
 */
public class Salary {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Personnel P =new Personnel();
       
    P.ajouterEmploye(new particular_manutention("x","mamouduo","15223bab",22,2017));
P.ajouterEmploye(new Manutention("ahamdou","sani","11aab55c",12,2005));
P.ajouterEmploye(new Production("adam","mamoud","15xx233s",25,2017));
P.ajouterEmploye(new particular_manutention("bello","mamouduo","15a412fs",30,2017));
P.ajouterEmploye(new Manutention("salihou","mallam","11a4254412fs",32,2015));
P.ajouterEmploye(new Production("moussa","mamoud","15a41hj",11,2017));
P.ajouterEmploye(new particular_production ("ali","baba","40aqq3",40,1999));
      

System.out.println("Les salaire moyen de cette Entreprise est :" + P.Salaire_moyen());
}   
    }
