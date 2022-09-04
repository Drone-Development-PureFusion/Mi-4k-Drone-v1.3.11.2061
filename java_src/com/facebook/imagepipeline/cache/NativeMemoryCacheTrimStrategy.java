package com.facebook.imagepipeline.cache;

import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class NativeMemoryCacheTrimStrategy implements CountingMemoryCache.CacheTrimStrategy {
    private static final String TAG = "NativeMemoryCacheTrimStrategy";

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy
    public double getTrimRatio(MemoryTrimType memoryTrimType) {
        switch (memoryTrimType) {
            case OnCloseToDalvikHeapLimit:
                return C9755a.f30449c;
            case OnAppBackgrounded:
            case OnSystemLowMemoryWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInBackground:
                return 1.0d;
            default:
                FLog.wtf(TAG, "unknown trim type: %s", memoryTrimType);
                return C9755a.f30449c;
        }
    }
}
