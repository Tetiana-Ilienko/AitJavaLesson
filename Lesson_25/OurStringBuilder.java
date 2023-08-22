package Lesson_25;

public class OurStringBuilder {

//    конструкторы:
//    StringBuilder()
//    StringBuilder(String str)
//    StringBuilder(int capacity)
    public static void main(String[] args) {
        String str = " abcd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str = " frtu"; // при переписании значения String str ссылка на первое значение теряется
//        и создается новая, чтобы этого избежать используют класс StringBuilder
/*
StringBuilder - это класс в Java, который представляет собой изменяемую последовательность символов (строку).
 В отличие от класса String, объекты StringBuilder могут изменяться без создания новых экземпляров.
 Это делает StringBuilder более эффективным при частых операциях конкатенации или модификации строк.
Основные характеристики StringBuilder:
Мутабельность (изменяемость): Объекты StringBuilder можно изменять, добавлять, удалять или заменять символы
внутри строки без создания новых объектов.
Эффективность: При конкатенации строк с помощью StringBuilder не создаются новые строки на каждой операции,
 что уменьшает накладные расходы на память и производительность.
Потокобезопасность: StringBuilder не является потокобезопасным (thread-safe), в отличие от StringBuffer,
который предоставляет такие же методы, но с синхронизацией для использования в многопоточных сценариях.
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//append(String s) - используется для добавления  строки к уже имеющейся. Метод может также добавлять целые числа,
//    float, double etc
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Hello
        sb.append("Java"); //аppend(String)  добавляет строку  к имеющийся ( есть перегрузки)
        System.out.println(sb); // HelloJava
        sb.append(" ").append("Java");
        System.out.println(sb);// HelloJava Java
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // insert() - вставляет строку в исходную начиная с указанной позиции

        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(1,"World");
        System.out.println(sbInsert); //       HWorldello
//  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // replace() - заменяет исходную строку с указанной позиции заканчивая указанной позицией

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1,3,"Java"); // HJavalo индекс 3 не включается
        System.out.println(sbReplace);
//  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // delete() -  удаляет строку между указанными индексами

        StringBuilder sbDelete = new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete); // Hlo
//  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // reverse() - разворачивает строку
        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println(sbReverse); // olleH
    }
}
