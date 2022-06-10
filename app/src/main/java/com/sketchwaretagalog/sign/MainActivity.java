package com.sketchwaretagalog.sign;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {
	
	private Context ctx;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		String str = "";
    }
}
