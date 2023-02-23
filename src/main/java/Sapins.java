/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author Raphael Bar
 */
public class Sapins
{
    /**
     * permet de retourner une chaîne de caractères avec nb caractères car identiques
     * @param nb  nombre de caractères de la chaîne
     * @param car caractère constituant la chaîne
     * @return la chaîne de caractères de nb caractères car
     */
    public static String genererStringLigne (int nb, char car){
        String chaine;
        int compte;
        
        chaine = "";
        compte = 0;
        
        while (compte < nb){
            compte = compte + 1;
            chaine = chaine + car;
        }

        return chaine; // A modifier
    }
     /**
     * permet de retourner une chaîne de caractères représentant le sapin plein demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin plein
     */
    public static String genererSapinPlein (int h){
        String chaineFinale;
        int compteCaracteres, compteLignes, compteEspaces;
        
        chaineFinale = "";
        compteCaracteres = 1;
        compteLignes = 0;
        compteEspaces = h-1;
        
        while (compteLignes < h){
            chaineFinale = chaineFinale + genererStringLigne(compteEspaces, ' ') + genererStringLigne(compteCaracteres, '*') + "\n";
            compteLignes = compteLignes + 1;
            compteEspaces = compteEspaces - 1;
            compteCaracteres = compteCaracteres + 2;
        }
        return chaineFinale;
    }
    public static String genererSapinVide (int h){
        String chaineFinale;
        int compteVide, compteLignes, compteEspaces;
        
        chaineFinale = "";
        
        compteVide = 1;
        compteLignes = h;
        
        chaineFinale = genererStringLigne(compteLignes + 1, '0') + genererStringLigne(compteVide, '*') + "\n";
        while (compteLignes > 0){
            chaineFinale = chaineFinale + genererStringLigne(compteLignes, '0') + "*" + genererStringLigne(compteVide, ' ') + "*" + "\n";
            
            compteLignes = compteLignes - 1;
            compteVide = compteVide + 2;
        }
        chaineFinale = chaineFinale + genererStringLigne(compteVide + 2, '*');
        return chaineFinale;
    }
    public static String genererSapinCouche (int h){
        String chaineFinale;
        chaineFinale = "";

        int compte = 1;
        while (compte < h){
            chaineFinale = chaineFinale + genererStringLigne(compte, '*') + "\n";
            compte = compte + 1;
        }
        while( compte > 0 ){
            chaineFinale = chaineFinale + genererStringLigne(compte, '*') + "\n";
            compte = compte - 1;
        }
        System.out.println(chaineFinale);
        return chaineFinale;

    }

	public static void main(String[] args){
		System.out.println(genererSapinPlein(5));
	}
}
