package codeclan.com.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounter {

    public int getWordCount(String words){
        String[] wordArray = words.split("[,\\s]+");
        for (String word: wordArray) {
            System.out.println(word);
        }
        return wordArray.length;
    }

}

