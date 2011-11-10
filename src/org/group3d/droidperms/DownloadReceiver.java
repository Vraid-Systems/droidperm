package org.group3d.droidperms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * more on hidden android.provider.Downloads and
 * DOWNLOAD_COMPLETED_ACTION --> http://goo.gl/zium0
 **/

public class DownloadReceiver extends BroadcastReceiver {
	public static final String myClassName = "DownloadReceiver";
	public static final String DOWNLOAD_COMPLETED_ACTION = "android.intent.action.DOWNLOAD_COMPLETED";

	@Override
	public void onReceive(Context theContext, Intent theIntent) {
		Log.d(myClassName,
				theIntent.getAction() + " - " + theIntent.getDataString());
		if (theIntent.getAction().equals(DOWNLOAD_COMPLETED_ACTION)) {
			Toast.makeText(theContext,
					"finished downloading " + theIntent.getDataString(),
					Toast.LENGTH_LONG).show();
		}
	}

}
