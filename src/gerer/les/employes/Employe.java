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
public abstract class Employe {
    String nom,prenom,matricule;
    int age,dateS;
    int Salairebase=110000;
    // declaration du contructeur d'Employe afin d'Initialiser les valeurs 
    public Employe(String x,String y,String m,int a,int D ){
        nom=x;
        prenom=y;
        age=a;
        matricule=m;
        dateS=D;
    }
    public abstract double calculerSalaire();
    public String getNom(){
    return this.nom+" "+this.prenom;
}
    
}
