package Auto;

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
//        categories = Arrays.copyOf(categories, categories.length + 1); // Option2
//        categories[categories.length - 1] = categori;
    }

    private int isIndex(String category) {
        if (category == null) return -1;
        for (int i = 0; i < categories.length; i++) { //перебираем массив
            if (category.equals(categories[i])) {
                return i; //
            }
        }
        return -1;
    }


    public void removeCategories(String category) {
        int index = isIndex(category);
        if (index != -1) {
            String[] temp = new String[categories.length - 1]; // создаем новый массив на 1 короче
            for (int i = 0, j = 0; i < categories.length; i++) {// перебираем массив
//                если не равно искомому индексу - переписываем значение, или пропускаем
                if (i != index) {
                    temp[j] = categories[i];
                    j++; // индекс нового массива
                }
            }
            categories = temp;
        }
    }

    /*
        Альтернатива:

        public boolean removeCategories(String category){
            int idx = isIndex(category);
            if (idx == -1) return false; //  если строка не найдена ничего не делаем


            String[] temp = new String[categories.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if (i < idx) {
                    temp[i] = categories[i];
                } else {
                    temp[i] = categories[i + 1];
                }
            }
            categories = temp;
            return true;
        }*/
    public void removeAllCategories() {
        categories = new String[0];
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