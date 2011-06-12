package jp.sharakova.android.emoji;

import android.app.Activity;
import android.os.Bundle;

public class EmojiTextViewSampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EmojiTextView emojiTextView = (EmojiTextView)findViewById(R.id.EmojiTextView1);
        
        String emojiText = "絵文字テスト%%i:3%%、こんどは、%%i:85%%";
        emojiTextView.setEmojiText(emojiText);
    }
}