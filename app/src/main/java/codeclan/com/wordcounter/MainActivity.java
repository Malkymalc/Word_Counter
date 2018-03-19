package codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText questionEditText;
    private Button wordcount_button;
    private TextView answerTextView;
    private TextView wordsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "oncreate");
        questionEditText = findViewById(R.id.input_text);
        wordcount_button = findViewById(R.id.wordcount_button);
        answerTextView = findViewById(R.id.display_answer);
        wordsCount = findViewById(R.id.wordsCount);
    }

    public void onAnswerButtonClicked(View clickedView) {
        Log.d("MainActivity", "Answer button clicked");
        String inputText = questionEditText.getText().toString();
        Log.d("MainActivity", inputText);

        WordCounter wordCounter = new WordCounter();
        String answer = "The answer: " + wordCounter.getWordCount(inputText);
        answerTextView.setText(answer);

        String answer2 = "" + wordCounter.getPrettyWordsCountSorted(answer) + "";
        wordsCount.setText(answer2);
    }
}
