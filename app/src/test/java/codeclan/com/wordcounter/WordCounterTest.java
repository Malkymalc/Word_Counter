package codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

    @Test
    public void canGetWordsCount(){
        HashMap<String, Integer> answer = wordCounter.getWordsCount(words1);
        System.out.println(answer);
    }

    @Test
    public void canGetWordsCountSorted(){
        ArrayList<String[]> answer = wordCounter.getWordCountSorted(words1);
        for (String[] array : answer) {
            String word = array[0];
            String count =  array[1];
            System.out.println("" + word + ": " + count);
        }

    }

    @Test
    public void canGetPrettyWordsCountSorted(){
        String answer = wordCounter.getPrettyWordsCountSorted(words1);
        System.out.println(answer);
    }

}
