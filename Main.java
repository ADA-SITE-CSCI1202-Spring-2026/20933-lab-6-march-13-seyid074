public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Mestan", "Ali", 3);
        Animal a2 = new Animal("Mestan", "Ali", 3);

        System.out.println(a1);
        System.out.println(a1.equals(a2));

        Dog d1 = new Dog("Toplan", "Nigar", 5, "German Shepherd");
        Dog d2 = new Dog("Toplan", "Nigar", 5, "German Shepherd");

        System.out.println(d1);
        System.out.println(d1.equals(d2));

        try {
            Animal a3 = new Animal("Cat", "Samir", -2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Account acc = new Account(1001, "Ali", 500);

        System.out.println(acc);

        acc.deposit(200);
        System.out.println(acc);

        try {
            acc.withdraw(1000);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        acc.withdraw(300);
        System.out.println(acc);
    }
}
