package math_home;

public class IntedgerNun {
    public static void main(String[] args) {
        System.out.println("Hausausgaben. Lektion_03.");
        System.out.println();

        System.out.println("Übung 1.");
        int a = 0 ,  b = 1 , c = 2 , d = 3 , e = 4 , f = 5, g = 6 , h = 7, i = 8, j = 9   ;
        int summ = (a+b+c+d+e+f+g+h+i+j) / 10;
        System.out.println( "Antvort ist gleich " + summ);
        double summ1 = (double)(a+b+c+d+e+f+g+h+i+j) / 10;
        System.out.println( "Aber richtig ist " + summ1);
        System.out.printf("Oder : %.2f", summ1);
        System.out.println();
        System.out.println();

        System.out.println("Übung 2.");
        int warA = 1000;
        int warB = 500;
        int warR = 10;

        int sumRab = (warA + warB) * warR / 100 ;
        int sumWar = (warA + warB) - sumRab;
        System.out.println("Sie haben einen Rabatt " + sumRab + " Euro");
        System.out.println("Ihre Einkaufspreis ist  " + sumWar  + " Euro.");

        System.out.println();
        System.out.println("Übung 3.");
        int mon = 21, din = 20 , mit = 24 , don = 23 , fr = 22, sam = 23 , son = 25;
        double tem = (double) ( mon + din + mit + don + fr + sam + son) / 7;
        System.out.printf("Die durchschnittliche Temperatur in dieser Woche beträgt %.1f " , tem);
        System.out.println("Grad.");
        System.out.println();

        System.out.println("Übung 4.");
        int z = 5;
        int x = 2;
        int y = 3;
        int ss = z / x;
        int mm = z / y;
        System.out.println("Если используем переменную для целих чисел - ответ округляется до целого числа.");
        System.out.println(" 5 / 2 = " + ss );
        System.out.println(" 5 / 3 = " + mm );
        double s = (double) z / x;
        double m =(double) z / y;
        System.out.println("Если используем переменную double для больших чисел и чисел с плавающей запятой - ответ:");
        System.out.println(" 5 / 2 = " + s);
        System.out.println( " 5 / 3 = " + m);
        System.out.println();

        System.out.println("Übung 5.");
        int xx = 3; // yy = 1;
       // xx += yy; // 3+1
       // System.out.println(xx);
       // xx++; // 3+1 + 1
       // System.out.println(xx);
        xx += ++xx; // 3+1+1 + ( 3+1+1)
        System.out.println(xx);










    }
}
