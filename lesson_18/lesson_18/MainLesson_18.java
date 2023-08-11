public class MainLesson_18 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();  // новый массив
        ra.printArray();
        System.out.println("Min: " + ra.min());

        ra.add(10); // создаем еще одну ячейку массива и присваиваем значение
        ra.add(25);
        ra.add(-20);

        ra.printArray();  // обращаемся к нашему методу и распечатываем массив

        int raSize = ra.size();
        System.out.println("Сейчас в массиве  " + raSize + " элементов");
        System.out.println("Сумма значений элементов массива " + ra.sumOfValues());

        ra.add(7, 2, 17, 21, 3); // добавляем несколько значений в массив
        ra.printArray();
        System.out.println("Min в массиве: " + ra.min());
        System.out.println("Max в массиве: " + ra.max());

        ra.deleteByIndex(3);

        ra.add(7, 3);
        ra.printArray();
        System.out.println("Найдено и удалено: " + ra.deleteAllByValue(3));
        ra.printArray();
        System.out.println(ra.getValueByIndex(0));
        ra.changeValueByIndex(25,15);
        ra.printArray();


    }
}
/*
+ количество элементов в массиве
+ сумма элементов массива
+ добавления сразу нескольких значений в массив
+ найти мин, макс
+ получить RubberArray в виде обычного массива
+ удалить элемент по индексу
+ поиск элемента по значению
- удалить элемент по значению
- сортировать ???
- заменить по индексу значение в массиве
- среднее значение ???
- распечатать в обратной последовательности -> ???


 */