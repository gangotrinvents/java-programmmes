/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Iterator;
import java.util.*;
public class JavaApplication7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        HashMap<String,Integer> a = new HashMap<String,Integer>();
        int n=5;
        for(int i=0;i<n;i++)
        {
            String Name= s.next();
            int r = rand.nextInt(2);
            a.put(Name,r);
        }
        
        for (String name: a.keySet()){

            String key = name.toString();
            String value = a.get(name).toString();  
            System.out.println(key + " " + value);  

       Iterator it = a.entrySet().iterator(); 
  
        while(it.hasNext())
        {
        Map.Entry me = (Map.Entry)it.next();    
        System.out.println(me.getKey()+ "  " + me.getValue());
        }
        }
    }   
}
