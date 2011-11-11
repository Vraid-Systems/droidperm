package org.group3d.droidperms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class DownloadReceiver extends BroadcastReceiver implements
		ProgramConstants {
	public static final String myClassName = "DownloadReceiver";

	@Override
	public void onReceive(Context theContext, Intent theIntent) {
		Log.d(myClassName,
				theIntent.getAction() + " - " + theIntent.getDataString());
		if (theIntent.getAction().equals(DOWNLOAD_COMPLETE_ACTION)
				|| theIntent.getAction().equals(DOWNLOAD_COMPLETED_ACTION)) {
			Toast.makeText(theContext,
					"finished downloading " + theIntent.getDataString(),
					Toast.LENGTH_LONG).show();
		}
	}

}
