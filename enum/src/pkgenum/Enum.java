/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    	Scanner in =new Scanner(System.in);
		String s=in.next();
		Month mon=Month.JANUARY;
		Month mon2=mon.parse(s);
		if(mon2!=null)
		{
			System.out.println(mon2.getTitle().substring(0,1).toUpperCase()+mon2.getTitle().substring(1,mon2.getTitle().length())+" has "+mon2.getDays()+" days ");
		}
		else
		{
			System.out.println("sorry no such month");
		}

	}

    
}
    
    

