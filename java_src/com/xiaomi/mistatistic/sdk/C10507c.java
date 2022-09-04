package com.xiaomi.mistatistic.sdk;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Map;
/* renamed from: com.xiaomi.mistatistic.sdk.c */
/* loaded from: classes2.dex */
final class C10507c implements URLStreamHandlerFactory {
    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        Map map;
        Map map2;
        map = URLStatsRecorder.f32612a;
        if (map.containsKey(str)) {
            map2 = URLStatsRecorder.f32612a;
            return new C10546d((URLStreamHandler) map2.get(str));
        }
        return null;
    }
}
