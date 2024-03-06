public class Cat extends Animal implements Land, Greet {
    public Cat(Mood mood) {
        super(true, true, mood);
    }

    @Override
    public String actOnMood() {
        switch (getMood()) {
            case HAPPY -> {
                return "purr, purr";
            }
            case SCARED -> {
                return "hiss";
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public String greet() {
        return "meow~";
    }
}
