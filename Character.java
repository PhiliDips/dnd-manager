public class Character { 

    // xp points per level
    // note: level 0 is invalid so value is -1
    private int[] LEVELS = {-1, 0, 300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000};

    private String name;
    private int level;
    private int experience;

    private String charClass;
    private String charRace;

    Character(String name, String charClass, String charRace) {
        setName(name);
        setClass(charClass);
        setRace(charRace);

        setExperience(0);
        setLevel(1);
    }

    // for leveling up
    public void gainExperience(int xpGained) {
        experience += xpGained;

        // increase level until experience is in appropriate range
        while (experience > LEVELS[level]) {
            level++;
        }
    }

    // mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setClass(String charClass) {
        this.charClass = charClass;
    }

    public void setRace(String charRace) {
        this.charRace = charRace;
    }

    // accessors
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public String getCharClass() {
        return charClass;
    }

    public String getRace() {
        return charRace;
    }
}