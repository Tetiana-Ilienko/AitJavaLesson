public class MainLesson_18 {
    public static void main(String[] args) {
          RubberArray ra = new RubberArray();  // новый массив
          ra.printArray();

          ra.add(10); // создаем еще одну ячейку массива и присваиваем значение
          ra.add(25);
          ra.add(-20);

          ra.printArray();  // обращаемся к нашему методу и распечатываем массив

        int raSize = ra.size();
        System.out.println(raSize + "");
        System.out.println(ra.sumOfValues());

        ra.add(7,17,21);
        ra.printArray();
        Dog dog = new Dog("Rex", 2);

    }
}
/*
+ количество элементов в массиве
+ сумма элементов массива
+ добавления сразу нескольких значений в массив
+ найти мин, макс
+ получить RubberArray в виде обычного массива
+ удалить элемент по индексу
- поиск элемента по значению
- сортировать ???
- заменить по индексу значение в массиве
- среднее значение ???
- распечатать в обратной последовательности -> ???
- удалить элемент по значению

 */