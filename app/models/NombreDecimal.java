package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {this.valeur = n; }
    public static String[] table_unites={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    public static String[] table_dizaines={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    
    
    public String en_romain(){
	return en_romain_unite(valeur);
    }

    public String en_romain_unite(int n){
		int unite= n%10;
		int dizaine = n- unite;
		String chiffreR = table_dizaines[dizaine/10]+table_unites[unite];
		
		return chiffreR;
    }

}

