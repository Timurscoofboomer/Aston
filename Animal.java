public class Animal {
    String name;
    static int animalCount = 0;
    { animalCount++; }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }
    public void swim(int distance2) {
        System.out.println(name + " проплыл " + distance2 + " м");
    }
    }

class Dog extends Animal {
    static int dogCount = 0;
    public Dog(String name) {
        this.name = name;
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " столько не пробежит");
        }
    }
    @Override
    public void swim(int distance2) {
        if (distance2 <= 10) {
            System.out.println(name + " проплыл " + distance2 + " м");
        } else {
            System.out.println(name + " утонул");
        }
    }
}


class Cat extends Animal {
    int catAppetite;
    boolean satiety;
    static int catCount = 0;

    public Cat(String name){
        this.name = name;
        this.satiety = false;
        catCount++;
    }
    public Cat(String name, int catAppetite) {
    this.name = name;
    this.satiety = false;
    this.catAppetite = catAppetite;
    catCount++;
    }
    @Override
    public void swim(int distance2) {
        System.out.println("Коты не умеют плавать");
    }
@Override
public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " отказался столько бежать");
        } else {
            System.out.println(name + " пробежал " + distance + " м");;
        }
}

    public void eat(Bowl bowl) {

        if (bowl.food >= catAppetite) {
            bowl.food = bowl.food - catAppetite; // кот ест
            satiety = true; // кот становится сытым
            System.out.println(name + " поел и теперь сыт!");
        } else {
            System.out.println(name + " не поел! В миске мало еды.");
        }
    }
}

 class Bowl {
     int food;

     Bowl(int food) {
         if (food < 0) {
             this.food = 0;
             System.out.println("Нельзя положить в миску отрицательную еду");
         } else {
             this.food = food;
         }
         System.out.println("В миске " + food + " еды");
     }

     public void addFood(int moreFood) {
         food = food + moreFood;
         System.out.println(moreFood + " еды добавлено в миску. Теперь в миске " + food + " еды");
     }
 }

class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик", 15);
        Cat catBarsik = new Cat("Барсик", 20);

        dogBobik.run(500);
        catMurzik.run(253);
        dogBobik.swim(15);
        catMurzik.swim(1);

        Bowl bowl = new Bowl(20);

        catMurzik.eat(bowl);

        bowl.addFood(30);

        // массив котов

        Cat[] cats = {
                new Cat("Рыжик", 15),
                new Cat( "Персик", 8),
                new Cat( "Маркиз", 70) };

        Bowl commonBowl = new Bowl(80); // общая миска

        for (Cat cat : cats) {
            cat.eat(commonBowl);
        }

        for (Cat cat : cats) {
            if (cat.satiety) {
                System.out.println(cat.name + " - сыт");
            } else {
                System.out.println(cat.name + " - голоден");
            }
        }


        System.out.println("Создано животных: " + Animal.animalCount);
        System.out.println("Cоздано котов: " + Cat.catCount);
        System.out.println("Создано собак: " + Dog.dogCount);
    }
}















