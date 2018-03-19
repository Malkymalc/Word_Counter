package codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;
    String words1;

    @Before
    public void before(){
        wordCounter = new WordCounter();
        words1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity,";

    }

    @Test
    public void canGetWordCount(){
        int answer = wordCounter.getWordCount(words1);
        assertEquals(36, answer);
    }
}
