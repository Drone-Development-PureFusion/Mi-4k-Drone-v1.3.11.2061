package com.fimi.kernel.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.kernel.utils.j */
/* loaded from: classes.dex */
public class C1667j<T> {

    /* renamed from: com.fimi.kernel.utils.j$a */
    /* loaded from: classes.dex */
    static class C1669a {

        /* renamed from: a */
        String f4127a;

        /* renamed from: b */
        String f4128b;

        C1669a() {
        }

        /* renamed from: a */
        public String m34720a() {
            return this.f4127a;
        }

        /* renamed from: a */
        public void m34719a(String str) {
            this.f4127a = str;
        }

        /* renamed from: b */
        public String m34718b() {
            return this.f4128b;
        }

        /* renamed from: b */
        public void m34717b(String str) {
            this.f4128b = str;
        }
    }

    /* renamed from: a */
    public static Object m34723a(String str, Class cls) {
        try {
            return new GsonBuilder().create().fromJson(str, (Class<Object>) cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34725a(Object obj) {
        try {
            return new GsonBuilder().create().toJson(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34722a(List<?> list) {
        try {
            return new GsonBuilder().create().toJson(list);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static List<?> m34724a(String str, TypeToken typeToken) {
        try {
            return (List) new GsonBuilder().create().fromJson(str, typeToken.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m34721a(String[] strArr) {
        List<?> m34724a = m34724a("[{id:1,name:22},{id:2,name:33}]", new TypeToken<ArrayList<C1669a>>() { // from class: com.fimi.kernel.utils.j.1
        });
        System.out.println(m34724a.size());
        Iterator<?> it2 = m34724a.iterator();
        while (it2.hasNext()) {
            System.out.println(((C1669a) it2.next()).m34718b());
        }
        System.out.println(((C1669a) m34723a("{id:1,name:22}", C1669a.class)).m34718b());
    }
}
