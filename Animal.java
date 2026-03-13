public class Animal {
    private String animalName;
    private String ownerName;
    private int age;

    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String toString() {
        return "Name: " + animalName + ", Owner: " + ownerName + ", Age: " + age;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Animal)) return false;

        Animal a = (Animal) obj;
        return animalName.equals(a.animalName) &&
               ownerName.equals(a.ownerName) &&
               age == a.age;
    }
}
