package com.tencent.open.utils;

import java.util.HashMap;
/* loaded from: classes.dex */
public class TemporaryStorage {

    /* renamed from: a */
    private static HashMap<String, Object> f32013a = new HashMap<>();

    public static Object get(String str) {
        return f32013a.remove(str);
    }

    public static void remove(String str) {
        f32013a.remove(str);
    }

    public static Object set(String str, Object obj) {
        return f32013a.put(str, obj);
    }
}
