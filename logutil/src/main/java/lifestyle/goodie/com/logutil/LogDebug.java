package lifestyle.goodie.com.logutil;

import android.util.Log;

/**
 * Created by asep.surahman on 02/01/2019.
 */

public class LogDebug {

    public static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
