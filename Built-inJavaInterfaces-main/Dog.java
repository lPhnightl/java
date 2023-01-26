// Использование встроенного интерфейса Comparable
public class Dog extends Breed implements Comparable<Dog> {
    private String nickName;
    private String breed;
    private String color;
    private int age;
    private int weight;
    public void Foo() {
        System.out.println("Done");
    };

    public Dog(String nickName,
            String breed,
            String color,
            int age,
            int weight) {
        this.nickName = nickName;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    public String dogName() {
        return String.format("%s", nickName);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s порода: %s возраст: %d цвет: %s вес: %d", nickName, breed, age, color, weight);
    }

    @Override
    public int compareTo(Dog o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }

}
