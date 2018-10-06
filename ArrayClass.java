import java.util.*;
class ArrayClass 
{
  public static void main(String [] args)
 {
  
   
    
  String [] hi = new String [5];
  String x = "Hi";
  String y = "My";
  String z = "Name";
  String o = "Is";
  String t = "Minseo";
  hi[0] = x;
  hi[1] = y;
  hi[2] = z;
  hi[3] = o;
  hi[4] = t;
  System.out.println (Arrays.toString(hi));
  for (int loopval2 = 0; loopval2 < 5; loopval2++) {
    System.out.println ("Array value: " +hi[loopval2]);}
  int [] num = new int [10];
  int a = 10;
  int b = 11;
  int c = 12;
  int d = 13;
  int e = 14;
  int f = 15;
  int g = 16;
  int h = 17;  
  int i = 18;
  int j = 19;
  num[0] = a;
  num[1] = b;
  num[2] = c;
  num[3] = d;
  num[4] = e;
  num[5] = f;
  num[6] = g;
  num[7] = h;
  num[8] = i;
  num[9] = j;
  System.out.println (Arrays.toString(num));
  for (int loopVal = 0; loopVal < 10; loopVal++) {
    System.out.println("Array Value: " + num[loopVal]);}
 }
}
