/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.app;

import java.util.List;

/**
 *
 * @author CAL16830135
 */
public class TestApp {

    String longestString = null;

    public static String longestString(String[] array) {
    int maxLength = 0;
    
    for (String s : array) {
    if (s.length() > maxLength) {
        maxLength = s.length();
        longestString = s;
}
}
return longestString;
}    
    public static void solver() {
        String[] testStringArray = {"Good", "Morning"};

        

        char[][] test2DArray = new char[2][longestString];

        for (int index = 0; index < testStringArray; index++) {
            test2DArray = [index][testStringArray[index].toCharArray()];    
        }
        System.out.println(test2DArray[1][1]);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        longestString();
        solve();

    }
    
}
