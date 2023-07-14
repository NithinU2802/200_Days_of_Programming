/******************************************************************************

    CharArrayReader implementation by read input and deliver each and every 
character with their ASCII value.

Input:
Nithin

Output:
N : 78 
i : 105
t : 116
h : 104
i : 105
n : 110

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main{  
  public static void main(String[] ag) throws Exception {  
    Scanner x=new Scanner(System.in);
    char[] s=x.nextLine().toCharArray();
    CharArrayReader array = new CharArrayReader(s);  
    
    int k = 0;
    while ((k = array.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
    }
    
  }  
}  
