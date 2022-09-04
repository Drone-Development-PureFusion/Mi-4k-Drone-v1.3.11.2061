package com.p120c.p121a.p138c;

import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import java.io.File;
/* renamed from: com.c.a.c.a */
/* loaded from: classes.dex */
public final class C1351a {
    private C1351a() {
    }

    /* renamed from: a */
    public static File m35627a(String str, AbstractC1255a abstractC1255a) {
        File mo35979a = abstractC1255a.mo35979a(str);
        if (mo35979a == null || !mo35979a.exists()) {
            return null;
        }
        return mo35979a;
    }

    /* renamed from: b */
    public static boolean m35626b(String str, AbstractC1255a abstractC1255a) {
        File mo35979a = abstractC1255a.mo35979a(str);
        return mo35979a != null && mo35979a.exists() && mo35979a.delete();
    }
}
