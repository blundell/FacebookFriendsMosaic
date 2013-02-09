package com.blundell.facebook.mosaiccreator.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;

import com.blundell.facebook.mosaiccreator.R;
import com.blundell.facebook.mosaiccreator.ui.BlundellFragment;
import com.blundell.facebook.mosaiccreator.ui.create.CreateActivity;

public class LoginFragment extends BlundellFragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_login, container, false);

		root.findViewById(R.id.fragment_login_button_login).setOnClickListener(this);

		return root;
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(getActivity(), CreateActivity.class);
		startActivity(intent);
		getActivity().finish();
	}

}
