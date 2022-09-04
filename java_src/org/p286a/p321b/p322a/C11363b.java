package org.p286a.p321b.p322a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.p286a.p321b.AbstractC11361a;
/* renamed from: org.a.b.a.b */
/* loaded from: classes2.dex */
public class C11363b implements Serializable {

    /* renamed from: d */
    private static Map<Class<? extends AbstractC11361a>, Map<?, C11363b>> f36449d = new HashMap();

    /* renamed from: a */
    public final String f36450a;

    /* renamed from: b */
    public final byte f36451b;

    /* renamed from: c */
    public final C11364c f36452c;

    public C11363b(String str, byte b, C11364c c11364c) {
        this.f36450a = str;
        this.f36451b = b;
        this.f36452c = c11364c;
    }

    /* renamed from: a */
    public static void m1284a(Class<? extends AbstractC11361a> cls, Map<?, C11363b> map) {
        f36449d.put(cls, map);
    }
}
