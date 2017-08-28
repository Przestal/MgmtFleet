package org.project;


import com.sun.org.apache.bcel.internal.generic.SWITCH;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args )

    {

        List<String> list = new ArrayList<String>();
        int Kr123Po = 0;
        list.add( Kr123Po,"Volvo Cx90");
        list.add("Renault");
        list.add("Mercedes");

        String [] type = new String[8];
        type[0] = "Volvo";
        list.size();
        list.set(Kr123Po,"Vos");
        System.out.println(list);

        System.out.println(type[0]);

        System.out.println(list);



    }

}
