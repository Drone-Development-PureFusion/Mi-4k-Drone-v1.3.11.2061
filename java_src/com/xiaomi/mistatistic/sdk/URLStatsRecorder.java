package com.xiaomi.mistatistic.sdk;

import com.facebook.common.util.UriUtil;
import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.controller.C10534o;
import com.xiaomi.mistatistic.sdk.controller.HttpEventFilter;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes2.dex */
public class URLStatsRecorder {

    /* renamed from: a */
    private static final Map f32612a = new HashMap();

    /* renamed from: b */
    private static final List f32613b = new ArrayList();

    /* renamed from: c */
    private static final List f32614c = new ArrayList();

    /* renamed from: d */
    private static final List f32615d = new ArrayList();

    /* renamed from: e */
    private static final List f32616e = new ArrayList();

    static {
        f32613b.add("file");
        f32613b.add("ftp");
        f32613b.add(UriUtil.HTTP_SCHEME);
        f32613b.add(UriUtil.HTTPS_SCHEME);
        f32613b.add("jar");
        f32614c.add(UriUtil.HTTP_SCHEME);
    }

    public static void addHttpEvent(HttpEvent httpEvent) {
        C10529j.m4837a().m4834a(httpEvent);
    }

    public static void dump() {
        for (HttpEvent httpEvent : C10529j.m4837a().m4831b()) {
            try {
                System.out.println("EVENT: " + httpEvent.getUrl() + ": " + httpEvent.toJSON().toString());
            } catch (JSONException e) {
            }
        }
    }

    public static boolean enableAutoRecord() {
        try {
            for (String str : f32613b) {
                new URL(str, "www.xiaomi.com", "");
            }
            Field declaredField = URL.class.getDeclaredField("streamHandlers");
            declaredField.setAccessible(true);
            Hashtable hashtable = (Hashtable) declaredField.get(null);
            for (String str2 : f32613b) {
                f32612a.put(str2, (URLStreamHandler) hashtable.get(str2));
            }
            URL.setURLStreamHandlerFactory(new C10507c());
            return true;
        } catch (Throwable th) {
            new C10534o().m4822a("failed to enable url interceptor", th);
            return false;
        }
    }

    public static void setEventFilter(HttpEventFilter httpEventFilter) {
        C10529j.m4837a().m4836a(httpEventFilter);
    }
}
