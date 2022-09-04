package com.fimi.soul.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;
/* renamed from: com.fimi.soul.utils.aj */
/* loaded from: classes.dex */
public class C3082aj {

    /* renamed from: a */
    public static Gson f11531a = new Gson();

    /* renamed from: a */
    public static <T> T m29329a(String str, Class<T> cls) {
        return (T) f11531a.fromJson(str, (Class<Object>) cls);
    }

    /* renamed from: a */
    public static <T> T m29328a(String str, Type type) {
        return (T) f11531a.fromJson(str, type);
    }

    /* renamed from: a */
    public static String m29330a(Object obj) {
        return f11531a.toJson(obj);
    }
}
