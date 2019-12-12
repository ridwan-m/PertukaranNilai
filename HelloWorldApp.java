public class HelloWorldApp{
    public static void main(String[] args){
        //tipe data sederhana
        char grade = 'A'; //Variabel dgn tipe data char
        int angka1 = 7; //Variabel dgn tipe data integer/bilangan bulat
        final double phi = 3.14; //tipe data double/bilangan desimal
        boolean IsAvail = true;
        System.out.println(grade);
        System.out.println(angka1);
        System.out.println(phi); 
    
        //tipe data referrance
        String nama = args[2];

        System.out.println("Hi,"+nama.toUpperCase()); //obj.toUppercase(); adalah method dari class String
        int a = Integer.parseInt(args[0]); //convert form String args to Integer
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
        }
}