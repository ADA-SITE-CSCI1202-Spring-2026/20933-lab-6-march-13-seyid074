public class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "Dog -> " + super.toString() + ", Breed: " + breed;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Dog)) return false;

        Dog d = (Dog) obj;
        return super.equals(d) && breed.equals(d.breed);
    }
}
