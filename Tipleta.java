/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 *
 * @author RAGUEX
 * @param <I>
 * @param <P>
 * @param <S>
 */
class Tripleta<I, P, S> {
private final I i; /* Atributo que identifica el primer elemento de la
tripleta */
private final P p; /* Atributo que identifica el segundo elemento de
la tripleta */
private final S s;

    public Tripleta(I valor1, P valor2, S valor3) {
    i = valor1;
    p = valor2;
    s = valor3;
    }
    
@Override
    public String toString() 
    {
         return String.format(i + " - "+ p + " - " + s);
    } 
     
    public static void main(String[] args) 
    {
        System.out.println("Datos de la persona");
       Tripleta<String,String, Integer> tripleta1 = new Tripleta<String,String, Integer>
        ("Jeronimo", "Raguex", 20);
        System.out.println(tripleta1);
        // Crea una tripleta conformada por tres String
        Tripleta<String, String, Integer> tripleta2 = new Tripleta<String,String, Integer> 
        ("Joselyn", "Zamora", 25);
        System.out.println(tripleta2);
        // Crea una tripleta conformada por dos String y un Integer
        Tripleta<String, String, Integer> tripleta3 = new Tripleta<String,String, Integer> 
        ("Laura","Guzman",65);
        System.out.println(tripleta3);
        }
    }


        
