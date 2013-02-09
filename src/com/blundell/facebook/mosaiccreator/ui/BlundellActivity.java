package com.blundell.facebook.mosaiccreator.ui;

import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.blundell.facebook.mosaiccreator.R;

public abstract class BlundellActivity extends FragmentActivity {

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
