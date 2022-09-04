package org.p328c;
/* renamed from: org.c.i */
/* loaded from: classes2.dex */
public class C11688i extends AssertionError {

    /* renamed from: a */
    private static final int f36834a = 20;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private String f36835b;

    /* renamed from: c */
    private String f36836c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.c.i$a */
    /* loaded from: classes2.dex */
    public static class C11690a {

        /* renamed from: a */
        private static final String f36837a = "...";

        /* renamed from: b */
        private static final String f36838b = "]";

        /* renamed from: c */
        private static final String f36839c = "[";

        /* renamed from: d */
        private final int f36840d;

        /* renamed from: e */
        private final String f36841e;

        /* renamed from: f */
        private final String f36842f;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: org.c.i$a$a */
        /* loaded from: classes2.dex */
        public class C11691a {

            /* renamed from: b */
            private final String f36844b;

            /* renamed from: c */
            private final String f36845c;

            private C11691a() {
                this.f36844b = C11690a.this.m294a();
                this.f36845c = C11690a.this.m290b(this.f36844b);
            }

            /* renamed from: a */
            private String m285a(String str) {
                return C11690a.f36839c + str.substring(this.f36844b.length(), str.length() - this.f36845c.length()) + C11690a.f36838b;
            }

            /* renamed from: a */
            public String m286a() {
                return m285a(C11690a.this.f36841e);
            }

            /* renamed from: b */
            public String m284b() {
                return m285a(C11690a.this.f36842f);
            }

            /* renamed from: c */
            public String m283c() {
                return this.f36844b.length() <= C11690a.this.f36840d ? this.f36844b : C11690a.f36837a + this.f36844b.substring(this.f36844b.length() - C11690a.this.f36840d);
            }

            /* renamed from: d */
            public String m282d() {
                return this.f36845c.length() <= C11690a.this.f36840d ? this.f36845c : this.f36845c.substring(0, C11690a.this.f36840d) + C11690a.f36837a;
            }
        }

        public C11690a(int i, String str, String str2) {
            this.f36840d = i;
            this.f36841e = str;
            this.f36842f = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public String m294a() {
            int min = Math.min(this.f36841e.length(), this.f36842f.length());
            for (int i = 0; i < min; i++) {
                if (this.f36841e.charAt(i) != this.f36842f.charAt(i)) {
                    return this.f36841e.substring(0, i);
                }
            }
            return this.f36841e.substring(0, min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public String m290b(String str) {
            int i = 0;
            int min = Math.min(this.f36841e.length() - str.length(), this.f36842f.length() - str.length()) - 1;
            while (i <= min && this.f36841e.charAt((this.f36841e.length() - 1) - i) == this.f36842f.charAt((this.f36842f.length() - 1) - i)) {
                i++;
            }
            return this.f36841e.substring(this.f36841e.length() - i);
        }

        /* renamed from: a */
        public String m293a(String str) {
            if (this.f36841e == null || this.f36842f == null || this.f36841e.equals(this.f36842f)) {
                return C11565c.m705e(str, this.f36841e, this.f36842f);
            }
            C11691a c11691a = new C11691a();
            String m283c = c11691a.m283c();
            String m282d = c11691a.m282d();
            return C11565c.m705e(str, m283c + c11691a.m286a() + m282d, m283c + c11691a.m284b() + m282d);
        }
    }

    public C11688i(String str, String str2, String str3) {
        super(str);
        this.f36835b = str2;
        this.f36836c = str3;
    }

    /* renamed from: a */
    public String m296a() {
        return this.f36836c;
    }

    /* renamed from: b */
    public String m295b() {
        return this.f36835b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new C11690a(20, this.f36835b, this.f36836c).m293a(super.getMessage());
    }
}
