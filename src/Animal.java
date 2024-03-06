public abstract class Animal {
    private final boolean mammals;

    private final boolean carnivorous;

    private Mood mood;

    public Animal(boolean mammals, boolean carnivorous, Mood mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    /**
     * Acts according to the animal's mood
     * @return String response according to mood or null when the animal does not know how to react
     */
    public abstract String actOnMood();

    // Getters and Setters
    public boolean isMammals() {
        return mammals;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}
