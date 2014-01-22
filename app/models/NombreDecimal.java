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


	public String en-romain(){
		String[] chiffresRomain = new String [11];
		
		chiffresRomain[0]="";
		chiffresRomain[1]="I";
		chiffresRomain[2]="II";
		chiffresRomain[3]="III";
		chiffresRomain[4]="IV";
		chiffresRomain[5]="V";
		chiffresRomain[6]="VI";
		chiffresRomain[7]="VII";
		chiffresRomain[8]="VIII";
		chiffresRomain[9]="IX";
		chiffresRomain[10]="X";
		
		return chiffresRomain[this.valeur];
		
	}
}

