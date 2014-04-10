package com.tagworld.customfontdemo;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Typeface typeface = Typeface.createFromAsset(getAssets(),
				"JennaSue.ttf");
		((TextView) findViewById(R.id.textView1)).setTypeface(typeface);

	}
}
