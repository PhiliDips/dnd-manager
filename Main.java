import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        testExperience(0);
        
    }

    public static void testExperience(int xpToAdd) {
        Character test = new Character("Phil", "Fighter", "Human");

        System.out.println("------TESTING XP------");
        System.out.println(test.getName() + " XP: " + test.getExperience());
        System.out.println(test.getName() + " LEVEL: " + test.getLevel());
        System.out.println("ADDING " + xpToAdd + " EXPERIENCE");

        test.gainExperience(xpToAdd);

        System.out.println(test.getName() + " XP: " + test.getExperience());
        System.out.println(test.getName() + " LEVEL: " + test.getLevel());
        
    }
}