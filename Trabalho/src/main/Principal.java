package main;
import generalizacao.*;

import java.util.*;


public class Principal {
	
    public static void main(String[] args) throws java.util.InputMismatchException{

        Dois.oi();

        Bomba b1 = new Bomba("S&J", "Junior", 1990, (Double)3_500.00, "4''", "5''", 4);
        Dois.print(b1.toString());
        Dois.sp();

        Motor m1 = new Motor("G&G", "4 O", 1998, (Double)4_005.47, "320 rpm", "2015,31 W");
        Dois.print(m1.toString());
        Dois.sp();
        
        
        Dois.sp();
        
    }

}