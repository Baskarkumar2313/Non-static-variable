/*
autour name:Baskar.K
Program name:Non sttaic variable
Date :17-08-2022
*/
class J
{
 static int value1;
 static float value2;
 static double value3;
 static long value4;
 public static void main(String[]args)
 {
  int i=5;
  System.out.println("print the:"+J.value1);
  System.out.println("print the:"+J.value2);
  System.out.println("print the:"+J.value3);
  System.out.println("print the:"+J.value4);
  J obj=new J(); 
  System.out.println("print the:"+i);
  }
}