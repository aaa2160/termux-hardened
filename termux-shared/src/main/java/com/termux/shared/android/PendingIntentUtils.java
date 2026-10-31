package com.termux.shared.android;

import android.app.PendingIntent;
import android.os.Build;

public final class PendingIntentUtils {

    public static int getImmutableFlags(int flags) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            flags |= PendingIntent.FLAG_IMMUTABLE;
        return flags;
    }

    private PendingIntentUtils() {}
}
