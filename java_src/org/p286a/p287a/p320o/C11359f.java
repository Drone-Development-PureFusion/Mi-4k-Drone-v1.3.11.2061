package org.p286a.p287a.p320o;
/* renamed from: org.a.a.o.f */
/* loaded from: classes2.dex */
public final class C11359f {
    /* renamed from: a */
    public static boolean m1297a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: b */
    public static boolean m1296b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
