package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }
    public static String[] table_unites={"I","II","III","IV","V","VI","VII","VIII","IX","X"};

    /* public String en_romain() {
	String[] chiffresRomain = new String [10];
	
	chiffresRomain[0]="";
	chiffresRomain[1]="I";
	chiffresRomain[2]="II";
	chiffresRomain[3]="III";
	chiffresRomain[4]="IV";
	chiffresRomain[5]="V";

	return chiffreRomain[this.valeur];
	}*/

    public String en_romain(int n){
	return table_unites[n];

}

