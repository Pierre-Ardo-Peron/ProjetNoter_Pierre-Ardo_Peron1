package projetnoter_pierre.ardo_peron;

//Class Personne
    public abstract class Personne {
    private String nom;/* String Nom */
    private String prenom; /* String Prenom */

/* Personne(String nom, string prenom) */
public Personne(String nom, String prenom) {
    this.nom = validate(nom, 50);
    this.prenom = validate(prenom, 30);
}
/* String validate(string chaine, integer taille */
private String validate (String chaine, Integer taille){
// VÃ©rifie la taille et renvoie une chaÃ®ne tronquÃ©e
// si la taille est supÃ©rieure Ã  taille
return chaine; }

/* String to string */
public String toString() {return this.nom + " " + this.prenom; }


} //END OF Personne

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Classe Deposant
public class Deposant extends Personne {
    private String Civilite;
    private String AdresseMessagerie;
    private Adresse adresse;
/* NE PAS PRENDRE EN COMPTE STOCKER */

public Deposant(String nom, String prenom, Adresse adresse){

}//END Deposant

public String toString(String chaine, Integer taille){
    
}//END toString


}//END OF Deposant

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Classe Adresse
public class Adresse extends Deposant {
    private String numero; 
    private String voie;
    private String ville;
    private String CodePostal;
    private String bp;
    private String lieuDit; 
    private String cedex;

public Adresse(){
    
}//END Adresse

public Adresse(String numero, String voie, String ville, String CodePostal, String bp, String lieuDit, String cedex){
    
}//END Adresse

public String Validate(){
    
}//END Validate


}//END OF Adresse

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Classe Architecte
public class Architecte extends Personne {
private String conseilRegional;
private boolean inscriptionOrdre;
private String telephone;

public Architecte(String nom, String prenom, String conseilRegional, boolean
inscriptionOrdre, Adresse adresse, String telephone){

super(nom, prenom);
this.conseilRegional = /*.....................*/ ;
this.inscriptionOrdre = inscriptionOrdre;
this.adresse = adresse;
if (telephoneValide(telephone))
{ this.telephone = telephone; }
else
{ this.telephone = ""; }
Maj_conseilRegional();
}//END Architecte

private boolean telephoneValide(String telephone) {/*.....................*/

}//END boolean telephoneValide

public void Maj_conseilRegional() { /*.....................*/
// renvoie une chaine contenant le nom, le prenom, le conseil regional et
// le numero de telephone de l'architecte ainsi que la mention "inscrit"
// s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire
    
    
    
    
}//Void Maj_conseilRegional

public String getconseilregional() {
    
}//END getConseilRegional

public void setConseilRegional(String conseilRegional)() {
    
}//END void setConseilRegional

public boolean isinscriptionOrdre() {
    
}//END boolean isinscription

public void setInscriptionOrdre(boolean inscriptionOrdre) {
    
}//END void setInscriptionOrdre

public Adresse getAdresse(Adresse adresse) {
    
}//Adresse getAdresse

public void setAdresse(Adresse adresse) {
    
    
}//END void setAdresse

public getTelephone() {



    
}//END getTelephone1

public getTelephone(String telephone) {
    
}//END getTelephone2

public String toString () {
String chaine = "";
/*.....................*/
chaine = chaine + this.conseilRegional + " ";
/*.....................*/
/*.....................*/
}//END ToString


}//END OF Architecte
