import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        //целые
//        byte b; // 8 бит -128 127
//        short shor; // 16 бит -32768 32767
//        int integ; // 32 бит -2147483648 2147483647
//        long long_L; // 64 бит
//        //дробные
//        float f; //32 бит
//        double d;//64 бит
//        //логический
//        boolean bool; //8 бит в массивах 32 при не использовании в массивах true or false
//        // символьная
//        char ch; // 16 бит 0 65536
//        integ = 100000;
//        bool = true;
//        b = 16;
//        shor = 256;
//        d = 2.7;
////        integ=b;
////        System.out.println(integ);
//
////        shor=(short) integ;
////        System.out.println(shor);
////        integ =(int)d;
////        System.out.println(integ);
//        ch = "!";
//        char cf = "\u0022";
//        ch = "8";
//        integ = 32816;
//        ch = (char) integ;
////        System.out.println(ch);
//        ch = "\u0022";
//        System.out.println(" \"привет" + ch + " Андрей");
//        int chislo = 2 * ((5 + 3) * 4 - 8);
//        //System.out.println(chislo);
//        chislo = 9 / 3;
//        //System.out.println(chislo);
//        chislo = 10 / 3;
//        //System.out.println(chislo);
//        chislo = 10 % 3;
//        //System.out.println(chislo);
//        bool = chislo <= 0;
//        // System.out.println(bool);
//        chislo++;
//        chislo--;
//        String s1 = "bunny";
//        String s2 = "bunny";
//        String s3 = "bu" + "nny";
//        String s4 = new String("bunny");
//        bool = s1.equals(s4);
//        boolean b1 = s1 != s4;
//        System.out.println(bool + "\n" + b1);
//        s2 = "Hello world";
//        System.out.println(s2.substring(4, 8));
//        s2 = String.valueOf(b1);
//        int dilene = 10, dilnik = 3, chastka;
//
//        if (s1.equals(s2)) {
//            System.out.println(dilene / dilnik);
//        } else {
//            System.out.println("khbk");
//        }
        Scanner scan = new Scanner(System.in); // create scan reader from terminal
        System.out.println("vvedite chislo #1");
        int chislo1 = scan.nextInt();
        System.out.println("vvedite chislo #2");
        int chislo2 = scan.nextInt();
        System.out.println("vvedite simvol deystviya");
        String simbol_action = scan.next();
        int result;
        if (!simbol_action.equals("+") && !simbol_action.equals("-") && !simbol_action.equals("/") && !simbol_action.equals("*")) {
            System.out.println("error");
        } else {
            ////////start calc
            if (simbol_action.equals("+")) {
                result = chislo1 + chislo2;
                System.out.println("result:  " + result);
            }


            if (simbol_action.equals("/")) {
                if (chislo2 != 0) {
                    //deystvie
                } else {
                    System.out.println("error");
                }
            }

            ////// end calc
        }
    }
}
