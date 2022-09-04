package com.p120c.p121a.p138c;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import com.p120c.p121a.p129b.p130a.C1300e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.c.a.c.e */
/* loaded from: classes.dex */
public final class C1357e {

    /* renamed from: a */
    private static final String f3535a = "_";

    /* renamed from: b */
    private static final String f3536b = "x";

    private C1357e() {
    }

    /* renamed from: a */
    public static String m35601a(String str, C1300e c1300e) {
        return str + f3535a + c1300e.m35911a() + f3536b + c1300e.m35908b();
    }

    /* renamed from: a */
    public static Comparator<String> m35603a() {
        return new Comparator<String>() { // from class: com.c.a.c.e.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(String str, String str2) {
                return str.substring(0, str.lastIndexOf(C1357e.f3535a)).compareTo(str2.substring(0, str2.lastIndexOf(C1357e.f3535a)));
            }
        };
    }

    /* renamed from: a */
    public static List<Bitmap> m35602a(String str, AbstractC1283c abstractC1283c) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : abstractC1283c.mo35965a()) {
            if (str2.startsWith(str)) {
                arrayList.add(abstractC1283c.mo35964a(str2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m35600b(String str, AbstractC1283c abstractC1283c) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : abstractC1283c.mo35965a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m35599c(String str, AbstractC1283c abstractC1283c) {
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : abstractC1283c.mo35965a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        for (String str3 : arrayList) {
            abstractC1283c.mo35961b(str3);
        }
    }
}
