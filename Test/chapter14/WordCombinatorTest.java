package chapter14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCombinatorTest {

    WordCombinator wordCombinator;
    @BeforeEach
    void setUp() {
        wordCombinator =new WordCombinator();
    }

    @Test
    void generateThreeLetterCharacterCombinationTest() {
        String word = "bathe";
        var combination = wordCombinator.generateThreeLetterCharacterCombinations(word);
        for (String wrd: combination){
            assertEquals(3, wrd.length());
            assertTrue(wrd.matches("\\w"));
        }
    }
}