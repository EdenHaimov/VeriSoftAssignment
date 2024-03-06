public class Dog extends Animal implements Land, Greet {
    public Dog(Mood mood) {
        super(true, true, mood);
    }

    @Override
    public String greet() {
        return "Wagging their tail";
    }

    @Override
    public String actOnMood() {
        switch (getMood()) {
            case COMFORTABLE -> {
                return "Bark Loudly";
            }
            case SCARED, UPSET -> {
                return "Whooping";
            }
            default -> {
                return null;
            }
        }
    }
}
