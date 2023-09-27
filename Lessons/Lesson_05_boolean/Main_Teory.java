public class Main_Teory {
    /*
    Тип boolean
     Логическое высказывание – это повествовательное предложение, относительно которого можно однозначно сказать,
     истинно оно или ложно

     Условные выражения представляют собой некоторое условие и возвращают значение типа boolean, то есть
     значение true (если условие истинно), или значение false (если условие ложно).
     К условным выражениям относятся операции сравнения и логические операции

    Операции сравнения: В операциях сравнения сравниваются два операнда, и возвращается значение типа boolean - true,
    если выражение верно, и false, если выражение неверно.

    == сравнивает два операнда на равенство
    != сравнивает два операнда на неравенство
    < меньше чем
    > больше чем
    <= меньше или равно
    >= больше или равно
    Логические операции Также в Java есть логические операции, которые также представляют условие и возвращают
    true или false и, как правило, объединяют несколько операций сравнения.

    ! Логическое НЕ (отрицания, NOT) - !x означает “не x”. Меняет значение на противоположное
    & Логическое И (AND) - Возвращает true если оба операнда равны true.
    | Логическое ИЛИ (OR) - Возвращает true если хотя бы один из операндов равен true.
    ^ Логическое исключающее ИЛИ (XOR) - По сути, возвращает true, если операнды — разные.
    && Условное И (сокращенное логическое И) - По возвращаемому результату же самое, что &, но, есть нюансы
    || Условное ИЛИ (сокращенное логическое ИЛИ) - По возвращаемому результату же самое, что и |, но, есть нюансы
    Приоритет логических операций Как и в математике, в программировании у операторов есть определённый порядок
    выполнения, если они встречаются в одном выражении

   !
   &
   ^
   |
   &&
   ||
   Если одинаковые операции стоят по соседству, то раньше выполняется та, что левее.
     */
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
