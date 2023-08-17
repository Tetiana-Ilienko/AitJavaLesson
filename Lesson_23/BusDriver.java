package Lesson_23;

import java.util.Arrays;

public class BusDriver {
    private final int id;
    private String name;
    private String[] categories;
    private int age;

    static private int counter;


    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    //____________________________________________________________
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategories() {
        return categories;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    //  ________________________________________
//    добавление и удаление категорий
    public void addCategories(String categori) {
        String[] temp = Arrays.copyOf(categories,
                categories.length + 1);
        temp[temp.length - 1] = categori;
        categories = temp;

    }


    public void removeCategories(String category) {
        int index = 0;            // сщдаем переренную, куда запишем искомый индекс
        for (int i = 0; i < categories.length; i++) { //перебираем массив
            if (category ==categories[i]) {
                index = i; // присваеваем индексу номер ячейки, которую нужно удалить
            }
        }
            String[] temp = new String[categories.length - 1]; // создаем новый массив на 1 короче
            for (int i = 0, j = 0; i < categories.length; i++) {
                if (i != index) {
                    temp[j] = categories[i];
                    j++;
                }
            }
            categories = temp;
        }



    public String toString() {
        return "{ id:" + id + "; name: " + name + "; categories: " + Arrays.toString(categories) + "}";
    }

    public void driveBus(AutoBus bus) { // метод запускающий управление автобусом
//        в параметр приходит ссылка на конкретный автобус, которым управляет сейчас водитель
        System.out.println("Вадитель id:" + id + " ," + name + "  управляет автобусом id:" + bus.getId()
                + " " + bus.getModel());
    }

}