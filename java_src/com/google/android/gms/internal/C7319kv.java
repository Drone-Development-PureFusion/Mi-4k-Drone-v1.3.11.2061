package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.kv */
/* loaded from: classes2.dex */
public class C7319kv implements Comparable<C7319kv> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24483a;

    /* renamed from: c */
    private static final C7319kv f24484c;

    /* renamed from: d */
    private static final C7319kv f24485d;

    /* renamed from: e */
    private static final C7319kv f24486e;

    /* renamed from: f */
    private static final C7319kv f24487f;

    /* renamed from: b */
    private final String f24488b;

    /* renamed from: com.google.android.gms.internal.kv$a */
    /* loaded from: classes2.dex */
    private static class C7321a extends C7319kv {

        /* renamed from: b */
        private final int f24489b;

        C7321a(String str, int i) {
            super(str);
            this.f24489b = i;
        }

        @Override // com.google.android.gms.internal.C7319kv, java.lang.Comparable
        public /* synthetic */ int compareTo(C7319kv c7319kv) {
            return super.compareTo(c7319kv);
        }

        @Override // com.google.android.gms.internal.C7319kv
        /* renamed from: g */
        protected boolean mo14821g() {
            return true;
        }

        @Override // com.google.android.gms.internal.C7319kv
        /* renamed from: h */
        protected int mo14820h() {
            return this.f24489b;
        }

        @Override // com.google.android.gms.internal.C7319kv
        public String toString() {
            String str = super.f24488b;
            return new StringBuilder(String.valueOf(str).length() + 20).append("IntegerChildName(\"").append(str).append("\")").toString();
        }
    }

    static {
        f24483a = !C7319kv.class.desiredAssertionStatus();
        f24484c = new C7319kv("[MIN_KEY]");
        f24485d = new C7319kv("[MAX_KEY]");
        f24486e = new C7319kv(".priority");
        f24487f = new C7319kv(".info");
    }

    private C7319kv(String str) {
        this.f24488b = str;
    }

    /* renamed from: a */
    public static C7319kv m14830a() {
        return f24484c;
    }

    /* renamed from: a */
    public static C7319kv m14828a(String str) {
        Integer m14603d = C7392mk.m14603d(str);
        if (m14603d != null) {
            return new C7321a(str, m14603d.intValue());
        }
        if (str.equals(".priority")) {
            return f24486e;
        }
        if (!f24483a && str.contains("/")) {
            throw new AssertionError();
        }
        return new C7319kv(str);
    }

    /* renamed from: b */
    public static C7319kv m14827b() {
        return f24485d;
    }

    /* renamed from: c */
    public static C7319kv m14825c() {
        return f24486e;
    }

    /* renamed from: d */
    public static C7319kv m14824d() {
        return f24487f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C7319kv c7319kv) {
        if (this == c7319kv) {
            return 0;
        }
        if (this == f24484c || c7319kv == f24485d) {
            return -1;
        }
        if (c7319kv == f24484c || this == f24485d) {
            return 1;
        }
        if (!mo14821g()) {
            if (!c7319kv.mo14821g()) {
                return this.f24488b.compareTo(c7319kv.f24488b);
            }
            return 1;
        } else if (!c7319kv.mo14821g()) {
            return -1;
        } else {
            int m14611a = C7392mk.m14611a(mo14820h(), c7319kv.mo14820h());
            return m14611a == 0 ? C7392mk.m14611a(this.f24488b.length(), c7319kv.f24488b.length()) : m14611a;
        }
    }

    /* renamed from: e */
    public String m14823e() {
        return this.f24488b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7319kv)) {
            return false;
        }
        if (this != obj) {
            return this.f24488b.equals(((C7319kv) obj).f24488b);
        }
        return true;
    }

    /* renamed from: f */
    public boolean m14822f() {
        return this == f24486e;
    }

    /* renamed from: g */
    protected boolean mo14821g() {
        return false;
    }

    /* renamed from: h */
    protected int mo14820h() {
        return 0;
    }

    public int hashCode() {
        return this.f24488b.hashCode();
    }

    public String toString() {
        String str = this.f24488b;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }
}
