package com.blundell.facebook.mosaiccreator.ui.login;

import static com.blundell.facebook.mosaiccreator.ui.login.FacebookAppCredentials.APP_ID;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blundell.facebook.mosaiccreator.logging.Log;

public class FacebookOAuthWebView extends WebView {

	private static final String FACEBOOK_OAUTH_URL = "https://graph.facebook.com/oauth/authorize?";
	private static final String OAUTH_CALLBACK_URL = "//blundell-apps//friend/mosaic/creator/authd";

	public FacebookOAuthWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
		loadUrl(FACEBOOK_OAUTH_URL +
				"client_id" + "=" + APP_ID + "&" +
				"redirect" + "=" + OAUTH_CALLBACK_URL + "&" +
				"response_type" + "=" + "token" + "&" +
				"response_type" + "=" + "code%20token");

		setWebViewClient(new FacebookWebViewClient());
	}

	private static final class FacebookWebViewClient extends WebViewClient {
		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			super.onPageStarted(view, url, favicon);
			Log.d(url);
		}

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			Log.d(url);
			return super.shouldOverrideUrlLoading(view, url);
		}
	}
}
