public class VariableApp{
 public static void main(String[] args){
 String a = "merah";
 String b = "biru";

 System.out.println("A adalah "+a);
 System.out.println("B adalah "+b);

String c;
 c = a;
 a = b;
 b = c;
 System.out.println("Sekarang A adalah "+a);
 System.out.println("Dan B adalah "+b);
 }  
}