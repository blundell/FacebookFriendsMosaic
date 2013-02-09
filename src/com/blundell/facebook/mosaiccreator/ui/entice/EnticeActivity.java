package com.blundell.facebook.mosaiccreator.ui.entice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blundell.facebook.mosaiccreator.R;
import com.blundell.facebook.mosaiccreator.ui.BlundellActivity;
import com.blundell.facebook.mosaiccreator.ui.login.LoginActivity;

public class EnticeActivity extends BlundellActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entice);
	}

	public void onLoginClick(View button) {
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
	}

}
