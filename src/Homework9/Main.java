package Homework9;

public class Main {
    public static void main(String[] args) {
        // Створюємо домашню тварину (Pet)
        Pet dog = new Pet("dog", "Buddy", 3, 70, new String[]{"fetch", "roll over"});

        // Створюємо людину (Human) з домашньою твариною
        Human person = new Human("John", "Doe", 1990, 120, dog, null, null);

        // Виводимо інформацію про тварину та людину
        System.out.println(dog);
        System.out.println(person);

        // Викликаємо методи привітати тварину та описати тварину
        person.greetPet();
        person.describePet();

        // Створюємо сім'ю
        Human mother = new Human("Jane", "Doe", 1970);
        Human father = new Human("Bob", "Doe", 1965);
        Family family = new Family(mother, father);

        // Додаємо дітей до сім'ї
        Human child1 = new Human("Alice", "Doe", 1995);
        Human child2 = new Human("Charlie", "Doe", 2000);
        family.addChild(child1);
        family.addChild(child2);

        // Виводимо інформацію про сім'ю
        System.out.println(family);

        // Видаляємо одного з дітей з сім'ї
        family.deleteChild(0);

        // Виводимо інформацію про сім'ю після видалення
        System.out.println(family);
    }
}
