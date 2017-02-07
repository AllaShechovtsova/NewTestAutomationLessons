package lesson_3.part3;

import java.util.TreeMap;

public class RomanNumeral {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

    	map.put(900, "CM");
        map.put(400, "CD");
        map.put(90, "XC");
        map.put(40, "XL");
        map.put(9, "IX");
        map.put(4, "IV");
    	
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(50, "L");
        map.put(5, "V");
        map.put(10, "X");
        map.put(1, "I");

        
        
    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        // map.floorKey(2015)=1000;
        //return  map.get(1000) +toRoman(1015)-->"M";
     // map.floorKey(1015)=1000;
      //return  map.get(1000) +toRoman(15)-->"M";
     // map.floorKey(15)=10;
        //return  map.get(1000) +toRoman(5)-->"X";
     // map.floorKey(5)=5;
        //return  map.get(5) "V";
            
        
        
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

}