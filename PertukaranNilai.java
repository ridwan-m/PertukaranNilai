public class PertukaranNilai{
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        
        System.out.println("A adalah "+a);
        System.out.println("B adalah "+b);

        a = a+b;
        System.out.println("Nilai A adalah " +a);
        b = a-b;
        System.out.println("Sekarang Nilai B adalah " +b);
        a = a-b;
        System.out.println("Sekarang Nilai A adalah " +a);
    }
}