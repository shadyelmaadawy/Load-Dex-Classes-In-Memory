package com.shadudiix.dexinstance;

import android.os.Build;

public class DexInstance {
    public String getSDKVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }
}
