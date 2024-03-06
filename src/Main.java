public class Main {
    public static boolean testDog() {
        Dog dog = new Dog(Mood.SCARED);

        if (!dog.isMammals()) {
            System.out.println("Error: Dog should be a mammal");
            return false;
        }
        if (!dog.isCarnivorous()) {
            System.out.println("Error: Dog should be a carnivore");
            return false;
        }

        if (!dog.actOnMood().equals("Whooping")) {
            System.out.println("Error: Scared dog should be Whooping");
            return false;
        }

        dog.setMood(Mood.COMFORTABLE);
        if (!dog.actOnMood().equals("Bark Loudly")) {
            System.out.println("Error: Comfortable dog should be Bark loudly");
            return false;
        }

        return true;
    }
    public static boolean testCat() {
        Cat cat = new Cat(Mood.SCARED);

        if (!cat.isMammals()) {
            System.out.println("Error: Cat should be a mammal");
            return false;
        }
        if (!cat.isCarnivorous()) {
            System.out.println("Error: Cat should be a carnivore");
            return false;
        }

        if (!cat.greet().equals("meow~")) {
            System.out.println("Error: Cat should greet meow~");
            return false;
        }

        cat.setMood(Mood.COMFORTABLE);
        if (cat.actOnMood() != null) {
            System.out.println("Error: Comfortable cat should'nt act");
            return false;
        }

        return true;
    }
    public static boolean testFrog() {
        Frog frog = new Frog(Mood.SCARED);

        if (frog.isMammals()) {
            System.out.println("Error: Frog should'nt be a mammal");
            return false;
        }
        if (frog.isCarnivorous()) {
            System.out.println("Error: Frog should'nt be a carnivore");
            return false;
        }

        if (!frog.actOnMood().equals("plop into the water")) {
            System.out.println("Error: Scared Frog should plop into the water");
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Testing Dog...");
        if (!testDog()) {
            System.out.println("Dog tests failed!");
        } else {
            System.out.println("Dog tests passed!");
        }

        System.out.println("Testing Cat...");
        if (!testCat()) {
            System.out.println("Cat tests failed!");
        } else {
            System.out.println("Cat tests passed!");
        }

        System.out.println("Testing Frog...");
        if (!testFrog()) {
            System.out.println("Frog tests failed!");
        } else {
            System.out.println("Frog tests passed!");
        }
    }
}