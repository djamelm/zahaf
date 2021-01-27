//cette fenetre est responsable de afficher les information de caractère 
package ex03;
public class infomation {
    private String nom, sexe, age, cheveux, taille;
    //declaration de tout les element
    public infomation(){}
    public infomation(String nom, String sexe, String age, String cheveux, String taille){
    this.nom = nom;
    this.sexe = sexe;
    this.age = age;
    this.cheveux = cheveux;
    this.taille = taille;
}
public String toString(){
    String resultat="Aucune information !";
    if(this.nom != null && this.sexe != null && this.taille != null && this.cheveux != null &&(this.age!=null||this.age==null) ){
            if(this.age==null){
                this.age = "null";
            }
            resultat = "Description de votre caractère est:\n";
            resultat += "Nom : " + this.nom + "\n";
            resultat += "Sexe : " + this.sexe + "\n";
            resultat += "Sexe : " + this.taille + "\n";
            resultat += "Cheveux : " + this.cheveux + " cm\n";
            resultat += "Age : " + this.age + "\n";
            //obtenire les information de joueur est stocker dans un channe de caractére nommé "resultat" qui va afficher les information donnée par l'utilisateur
        }else{
            resultat = "Aucune information !"; 
            //on cas les le l'utilisateur n'est pas entre les information par clicker sur "Annuller" la resultat est de afficher un message qui dit "Aucune information !"
        }
    return resultat;  
    }
}
