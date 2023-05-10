public class Dog {
    String name;
    String type;
    int speed;

    void run() {
        String message = "";
        for (int i = 0; i < speed; i++) {
            if (i == (speed - 1)) {
                message += "run!";
            } else {
                message += "run, ";
            }
        }
        System.out.println(message);
    }
    String info() {
        String dog_param = "Name: " + name + "\nType: " + type + "\nSpeed: " + speed;
        return dog_param;
    }
}
