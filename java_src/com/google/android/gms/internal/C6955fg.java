package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.fg */
/* loaded from: classes2.dex */
public class C6955fg {

    /* renamed from: e */
    static HashMap<String, String> f23371e;

    /* renamed from: g */
    private static Object f23373g;

    /* renamed from: a */
    public static final Uri f23367a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f23368b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f23369c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f23370d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: f */
    static HashSet<String> f23372f = new HashSet<>();

    /* renamed from: a */
    public static long m15875a(ContentResolver contentResolver, String str, long j) {
        String m15876a = m15876a(contentResolver, str);
        if (m15876a != null) {
            try {
                return Long.parseLong(m15876a);
            } catch (NumberFormatException e) {
                return j;
            }
        }
        return j;
    }

    /* renamed from: a */
    public static String m15876a(ContentResolver contentResolver, String str) {
        return m15874a(contentResolver, str, (String) null);
    }

    /* renamed from: a */
    public static String m15874a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C6955fg.class) {
            m15877a(contentResolver);
            Object obj = f23373g;
            if (f23371e.containsKey(str)) {
                String str3 = f23371e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                Iterator<String> it2 = f23372f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Cursor query = contentResolver.query(f23367a, null, null, new String[]{str}, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    String string = query.getString(1);
                                    synchronized (C6955fg.class) {
                                        if (obj == f23373g) {
                                            f23371e.put(str, string);
                                        }
                                    }
                                    if (string != null) {
                                        str2 = string;
                                    }
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                            } catch (Throwable th) {
                                if (query != null) {
                                    query.close();
                                }
                                throw th;
                            }
                        }
                        f23371e.put(str, null);
                        if (query != null) {
                            query.close();
                        }
                    } else if (str.startsWith(it2.next())) {
                        break;
                    }
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static Map<String, String> m15873a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f23368b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.fg$1] */
    /* renamed from: a */
    private static void m15877a(final ContentResolver contentResolver) {
        if (f23371e == null) {
            f23371e = new HashMap<>();
            f23373g = new Object();
            new Thread("Gservices") { // from class: com.google.android.gms.internal.fg.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Looper.prepare();
                    contentResolver.registerContentObserver(C6955fg.f23367a, true, new ContentObserver(new Handler(Looper.myLooper())) { // from class: com.google.android.gms.internal.fg.1.1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
                            synchronized (C6955fg.class) {
                                C6955fg.f23371e.clear();
                                Object unused = C6955fg.f23373g = new Object();
                                if (!C6955fg.f23372f.isEmpty()) {
                                    C6955fg.m15871b(contentResolver, (String[]) C6955fg.f23372f.toArray(new String[C6955fg.f23372f.size()]));
                                }
                            }
                        }
                    });
                    Looper.loop();
                }
            }.start();
        }
    }

    /* renamed from: b */
    public static void m15871b(ContentResolver contentResolver, String... strArr) {
        Map<String, String> m15873a = m15873a(contentResolver, strArr);
        synchronized (C6955fg.class) {
            m15877a(contentResolver);
            f23372f.addAll(Arrays.asList(strArr));
            for (Map.Entry<String, String> entry : m15873a.entrySet()) {
                f23371e.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
