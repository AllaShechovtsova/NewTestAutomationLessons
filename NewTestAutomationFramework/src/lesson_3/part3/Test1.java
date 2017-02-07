package lesson_3.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);

        for (int i = 0; i < c.length - 1; i++)
        {
            if (c[i] == ' ')
                c[i+1] = Character.toUpperCase(c[i+1]);

        }
        char[] ñ = null;
		System.out.print( ñ );
    }

	        
	        
	        
	        
	    
	}

