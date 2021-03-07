package hero;

public class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
