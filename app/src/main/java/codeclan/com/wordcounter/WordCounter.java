package codeclan.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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

    public HashMap<String, Integer> getWordsCount(String words){
        String[] wordArray = words.split("[,\\s]+");
        ArrayList<String> wordsArray = new ArrayList<>(Arrays.asList(wordArray));
        HashMap<String, Integer> wordHash = new HashMap<>();
        for (String word: wordsArray) {
            if (wordHash.containsKey(word)){
                int count = wordHash.get(word);
                wordHash.remove(word);
                wordHash.put(word, count + 1);
            } else {
                wordHash.put(word, 1);
            }
        }
        return wordHash;
    }

    public ArrayList<String[]> getWordCountSorted(String words){
        HashMap<String, Integer> wordHash = getWordsCount(words);
        ArrayList<String[]> wordsArraySorted = new ArrayList<>();

//       empty to array
        for (Map.Entry<String, Integer> wordEntry: wordHash.entrySet()) {
            String[] word = {wordEntry.getKey(), wordEntry.getValue().toString()};
            wordsArraySorted.add(word);
        }

//        Sort the array
        Collections.sort(wordsArraySorted, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return a[1].compareTo(b[1]);
            }
        });

        Collections.reverse(wordsArraySorted);
        return wordsArraySorted;
    }

    public String getPrettyWordsCountSorted(String words) {
        ArrayList<String[]> answer = getWordCountSorted(words);
        Integer rank = 0;
        String prettyAnswer = "| Rank |  Word    | Count | \n ====================== \n";
        for (String[] array : answer) {
            rank++;
            String rank1 = String.valueOf(rank);
            String word = array[0];
            String count = array[1];
            String pretty = "|     " + rank1 + "   |   \"" + word + "\"    |   " + count + "     | \n";
            prettyAnswer = prettyAnswer.concat(pretty);
        }
        return prettyAnswer;
    }

}

