public class Frog extends Animal implements Amphibian, Oviparous {
    public Frog(Mood mood) {
        super(false, false, mood);
    }

    @Override
    public String actOnMood() {
        switch (getMood()) {
            case HAPPY -> {
                return "quack quack quack";
            }
            case SCARED -> {
                return "plop into the water";
            }
            default -> {
                return null;
            }
        }
    }
}
