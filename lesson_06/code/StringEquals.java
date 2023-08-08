public class StringEquals {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a == b);//false
        String str1 = "Java 9";
        String str2 = "Java 9";
        String str3 = new String("Java 9");


        boolean b1 = str1 == str2;//true
        System.out.println(b1);

        System.out.println(str1);//Java 9
        System.out.println(str3);//Java 9
        boolean b2 = str1 == str3;
        System.out.println(b2);// false


        boolean b3 = str1.equals(str3);
        System.out.println("str1.equals(str3)" + b3);
        boolean b4 = str2.equalsIgnoreCase(str3);
        System.out.println("str1.equalsIgnoreCase(str3)" + b4);


    }
}
