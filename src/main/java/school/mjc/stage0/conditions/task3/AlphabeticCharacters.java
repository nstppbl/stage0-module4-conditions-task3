package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 64 && character <= 122) {
            if (character == 'a' || character == 'o' || character == 'i' ||
                    character == 'e' || character == 'y' || character == 'u') {
                System.out.println("Vowel");
            } else {System.out.println("Constant");}
        } else {System.out.println("wrong alphabet!");}
    }
}
