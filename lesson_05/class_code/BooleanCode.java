public class BooleanCode {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b);
        System.out.println(b1); // false

        boolean b2 = a != b;
        System.out.println(b2); // true
        System.out.println(b != 10); // false

        boolean b3 = a > b;
        boolean b4 = a < b;
        System.out.println("b3: " + b3 + "  b4: " + b4);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = b >= 10;
        System.out.println(b8); // true

        boolean bol = !true;
        System.out.println(bol);
        boolean bol1 = !(2 > 5);
        System.out.println(bol1);
        // logik andi
        System.out.println("***********");
        boolean var = true & false;
        //  boolean var1  = "Rom is capital of Itali" & "Berlin is capitale of Germani"; // true
        boolean varr1 = (2 < 5) & (10 != 11);
        System.out.println(varr1);
        boolean var1 = (2 < 5) & (10 == 11);
        //логическое ИЛИ
        //  boolean var1  = "Rom is capital of Itali"  | "Berlin is capitale of Brasilia"; // true
        boolean var2 = true | false;
        var2 = (2 < 5) | (10 != 11);// true
        boolean var3 = (2 > 5) | (10 != 11);// true
        // логическое исключвющее или
        boolean varr3 = true ^ false; // true
        boolean var4 = false ^ false;
        System.out.println(var4);

        System.out.println("***************");
        boolean var11 = true && true;
        // логическое сокращенное и
        var11 = (5 > 6) && (4 > 4);
        System.out.println(var11);

        int x = 1;
        int y = 5;
        boolean b9 = (x != 0) && (y / x < 24);
        System.out.println("b9: " + b9);

        System.out.println(true ^ true & false);
        System.out.println(true ^ true && false);

        boolean aa = true;
        boolean bb = false;
        int c=25;
        int qq= 2;
        System.out.println((aa|bb)|(c<100)&!(true) ^(qq==5));
        System.out.println((aa|bb)|(c<100)& false ^(qq==5));
        System.out.println((aa|bb)|false ^(qq==5));
        System.out.println((aa|bb)|false);
        System.out.println(true|false);




    }
}
