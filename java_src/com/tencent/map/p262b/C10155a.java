package com.tencent.map.p262b;
/* renamed from: com.tencent.map.b.a */
/* loaded from: classes2.dex */
public final class C10155a {

    /* renamed from: a */
    private static C10155a f31355a = null;

    /* renamed from: com.tencent.map.b.a$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C101561 {
        private C101561() {
        }

        /* synthetic */ C101561(C10155a c10155a, byte b) {
            this();
        }

        /* renamed from: a */
        public boolean m6040a(String str, String str2) {
            int m6042a = C10155a.m6042a(C10155a.this, str);
            if (str2.charAt(4) != C10184i.f31499a.charAt(((((m6042a * 9) + 10) / 3) + 36) & 31)) {
                return false;
            }
            if (str2.charAt(7) != C10184i.f31499a.charAt((((m6042a * 5) + 11) / 5) & 31)) {
                return false;
            }
            if (str2.charAt(12) != C10184i.f31499a.charAt((((m6042a + 10) / 3) << 3) & 31)) {
                return false;
            }
            if (str2.charAt(14) != C10184i.f31499a.charAt((((m6042a * 3) + 19) / 9) & 31)) {
                return false;
            }
            if (str2.charAt(19) != C10184i.f31499a.charAt((((m6042a * 3) + 39) / 8) & 31)) {
                return false;
            }
            if (str2.charAt(21) != C10184i.f31499a.charAt((((m6042a / 23) + 67) / 7) & 31)) {
                return false;
            }
            if (str2.charAt(26) != C10184i.f31499a.charAt(((((m6042a + 23) / 6) + 3) * 7) & 31)) {
                return false;
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                i = C10184i.f31500b[(i ^ C10184i.m5927a(str.charAt(i2))) & 255] ^ ((i >> 8) & 255);
            }
            if (str2.charAt(0) != C10184i.f31499a.charAt(i & 31)) {
                return false;
            }
            return str2.charAt(1) == C10184i.f31499a.charAt((i >> 5) & 31);
        }
    }

    private C10155a() {
    }

    /* renamed from: a */
    static /* synthetic */ int m6042a(C10155a c10155a, String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += C10184i.m5927a(str.charAt(i2));
        }
        return ((length << 7) + length) ^ i;
    }

    /* renamed from: a */
    public static synchronized C10155a m6043a() {
        C10155a c10155a;
        synchronized (C10155a.class) {
            if (f31355a == null) {
                f31355a = new C10155a();
            }
            c10155a = f31355a;
        }
        return c10155a;
    }

    /* renamed from: a */
    public final boolean m6041a(String str, String str2) {
        if (C10184i.m5920a(str) && C10184i.m5918b(str2) && new C101561(this, (byte) 0).m6040a(str, str2)) {
            int i = 0;
            for (int i2 = 0; i2 < 27; i2++) {
                i = C10184i.f31500b[(i ^ C10184i.m5927a(str2.charAt(i2))) & 255] ^ ((i >> 8) & 255);
            }
            return str2.charAt(27) != C10184i.f31499a.charAt(i & 31) ? false : str2.charAt(28) == C10184i.f31499a.charAt((i >> 5) & 31);
        }
        return false;
    }
}
