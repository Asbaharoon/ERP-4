/**
 * 
 */
package erp;

/**
 * @author sirde
 *
 */
public class LinkedList {

	
  //----------------------------------------------------------------------------
  /**
    * Class Cellule interne de la class List
    */
	
  class Cellule
  {
    private Object contenu;
    private Cellule suivant;

    protected Cellule(Object value, Cellule next)
    {
      contenu = value;
      suivant = next;
    }
  }
  //----------------------------------------------------------------------------

  // Donn�es priv�es -----------------------------------------------------------
  
  private Cellule celluleTete;

  // M�thodes publiques --------------------------------------------------------	  
  /**
    * Constructeur.
    */
  public LinkedList()
  {
    celluleTete = null;
  }

  /**
    * Predicat : Retourne true si la liste est vide, false sinon.
    */
  public boolean estVide()
  {
    return (celluleTete == null);
  }

  /**
    * Mutateur : Ajoute l'�l�ment elem en t�te de liste.
    */
  public void ajouterEnTete(Object elem)
  {
    Cellule nlleCellule = new Cellule(elem, celluleTete);
    celluleTete = nlleCellule;
  }

  /**
    * Mutateur : Recherche et supprime (la premi�re occurence de) l'�l�ment
    * elem s'il est dans la liste. Ne fait rien si l'�l�ment elem n'est pas
    * dans la liste.
    */
  public void rechercherSupprimer(Object elem)
  {
    Cellule a = celluleTete;  
  
    if (a != null)
    {
      if ( a.contenu.equals(elem) )
        celluleTete = celluleTete.suivant;
      else
      {
        Cellule b = a ;
        while (b.suivant != null && !b.suivant.contenu.equals(elem) )
          b = b.suivant;
        if (b.suivant != null)
          b.suivant = b.suivant.suivant;
      }
    }
  }

  /**
    * Parcourt et affiche la liste.
    * Pr�condition : Liste non-vide.
    */
  public void afficherListe()
  {
    Cellule a = celluleTete;
    
    while (a != null)
    {
      System.out.println("Element : " + a.contenu.toString());
      a = a.suivant;
    }
  }
  
  public void delete(int index)
  {
	  Cellule a = celluleTete;
	  int i = 0;
	  while(index != i && a.suivant !=null)
	  {
		  a = a.suivant;
	  }
  }
}

