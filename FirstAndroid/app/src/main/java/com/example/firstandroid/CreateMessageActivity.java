package com.example.firstandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.message);
        String messageToSend = messageView.getText().toString();
//        explicit intent location
//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageToSend);
//        startActivity(intent);

//        implicit intent (multiple locations)
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, messageToSend);
//        startActivity(intent);


        // remove "Complete action using" statement to choose which platform to send
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageToSend);
        String titleToChoose = getString(R.string.send_message_via);
        Intent chosenIntent = Intent.createChooser(intent, titleToChoose);
        startActivity(chosenIntent);

    }
}
