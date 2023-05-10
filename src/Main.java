public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Jack";
        dog1.type = "Borzaya";
        dog1.speed = 7;

        dog1.run();

        String info = dog1.info();
        System.out.println(info);
    }
}
