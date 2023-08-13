package homeWork_19;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private int heightJump;
    private int maxHeightJump;


    public Dog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void setHeightJump(int height) {
        if (height >= 0) {
            this.heightJump = height;
            this.maxHeightJump = heightJump * 2;
        } else {
            heightJump = 0;
        }
    }

    public int getHeightJump() {
        return heightJump;
    }


    public void whoAmI() {
        System.out.println("\nIch bin Hund " + breed + ". My name ist " + name +
                ". Ich bin " + age + " Jahre Alt. Ich kann " + heightJump + " Zm hoch springen.\n");
    }

    void jump(int xHeight) {
        System.out.println("Ich kann " + xHeight + " hoch springen.");
    }
    void jump() {
        System.out.println("Ich kann " + heightJump + " hoch springen.");
        System.out.println("Wenn ich trainiere, kann ich " + maxHeightJump + " hoch springen.\n");
    }


    void training() {
        System.out.println("Der Trainingsbeginn. ");
        if (heightJump + 10 <= maxHeightJump) {
            heightJump += 10;
            System.out.println("Der Trainingsend. Die Sprunghöhe ist :  " + heightJump);
            System.out.println("Ich kann weiter trainieren.\n");
        } else if (maxHeightJump - heightJump < 10) {
            heightJump = maxHeightJump;
            System.out.println("Ich versuche noch ein bisschen trainiren.");
            System.out.println("Der Trainingsend. Die Sprunghöhe ist :  " + heightJump);
            System.out.println("Ich kann nicht weiter trainieren.\n");
        } else {
            System.out.println("Tut mir leid, kann ich nicht höher als " + maxHeightJump + " springen.");
        }
    }

    void getBarrier(int heightBarrier) {
        System.out.println("\nHopp! Barriere ist " + heightBarrier);
        if (heightBarrier <= 0 || heightBarrier > maxHeightJump) {
            System.out.println("Es gibt ein Feller!!!");
            if (heightBarrier > maxHeightJump) {
                System.out.println("Tut mir leid, kann ich nicht höher als " + maxHeightJump + " springen.");
            }
        } else if (heightBarrier > heightJump && heightBarrier < maxHeightJump) {
            System.out.println("Wenn ich trainiere, kann ich " + heightBarrier + " hoch springen.");
            do {
                training();
            }
            while (heightBarrier >= heightJump && heightBarrier <= maxHeightJump);
            jump(heightBarrier);
        } else if (heightBarrier <= heightJump) {
            jump(heightBarrier);
        }
    }


}
