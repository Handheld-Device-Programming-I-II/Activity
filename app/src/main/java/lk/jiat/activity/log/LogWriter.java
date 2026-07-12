package lk.jiat.activity.log;

import android.content.Context;
import android.util.Log;

public class LogWriter {

    public static void writerInfoLog(Context context, String message){
        Log.i(context.getClass().getSimpleName(), message);
    }
}
