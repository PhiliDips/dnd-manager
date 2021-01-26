import java.io.*;

public class Main {

    private static String CHARACTER_DATA = "characters.txt";

    public static void main(String[] args) {
        
        Character test = new Character("Test", "Wizard", "Human");
        
        copyCharacterToText(test);

        String[] readTest = getCharacters();

        Character test2 = new Character(readTest[0]);

        System.out.println(test2.toString());
    }

    // test for Character.getExperience()
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

    public static void copyCharacterToText(Character character) {
        
        FileWriter fw;
        
        try {
            fw = new FileWriter(CHARACTER_DATA);
            fw.write(character.toString());
            fw.close();
        }
        catch(IOException io) {
            System.out.println("Cannot write to file " + CHARACTER_DATA);
        }

    }

    public static String[] getCharacters() {
        BufferedReader br;

        String[] characterData = new String[99]; //arbitrary limit

        try {
            br = new BufferedReader(new FileReader(CHARACTER_DATA));

            String nextLine = br.readLine();

            int i = 0;

            while( nextLine != null) {
                characterData[i] = nextLine;
                i++;
                nextLine = br.readLine();
            }

            br.close();

            return characterData;
        }
        catch (IOException io) {
            System.out.println("Cannot read file " + CHARACTER_DATA + ". It might not exist.");

            return null;
        }
    }
}