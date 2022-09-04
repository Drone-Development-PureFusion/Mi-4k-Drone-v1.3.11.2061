package com.google.android.gms.common.internal;

import java.util.Iterator;
/* renamed from: com.google.android.gms.common.internal.ak */
/* loaded from: classes2.dex */
public class C4583ak {

    /* renamed from: a */
    private final String f17037a;

    private C4583ak(String str) {
        this.f17037a = str;
    }

    /* renamed from: a */
    public static C4583ak m23640a(String str) {
        return new C4583ak(str);
    }

    /* renamed from: a */
    CharSequence m23641a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: a */
    public final String m23642a(Iterable<?> iterable) {
        return m23639a(new StringBuilder(), iterable).toString();
    }

    /* renamed from: a */
    public final StringBuilder m23639a(StringBuilder sb, Iterable<?> iterable) {
        Iterator<?> it2 = iterable.iterator();
        if (it2.hasNext()) {
            sb.append(m23641a(it2.next()));
            while (it2.hasNext()) {
                sb.append(this.f17037a);
                sb.append(m23641a(it2.next()));
            }
        }
        return sb;
    }
}
