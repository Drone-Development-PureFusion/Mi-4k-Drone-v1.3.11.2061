package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public interface ajr {

    /* renamed from: com.google.android.gms.internal.ajr$a */
    /* loaded from: classes2.dex */
    public static class C6416a {

        /* renamed from: a */
        private final long f22038a;

        /* renamed from: b */
        private final Map<String, String> f22039b;

        /* renamed from: c */
        private final int f22040c;

        /* renamed from: d */
        private final List<AnalyticsUserProperty> f22041d;

        /* renamed from: com.google.android.gms.internal.ajr$a$a */
        /* loaded from: classes2.dex */
        public static class C6417a {

            /* renamed from: a */
            private long f22042a = 43200;

            /* renamed from: b */
            private Map<String, String> f22043b;

            /* renamed from: c */
            private int f22044c;

            /* renamed from: d */
            static /* synthetic */ List m17093d(C6417a c6417a) {
                return null;
            }

            /* renamed from: a */
            public C6417a m17099a(int i) {
                this.f22044c = i;
                return this;
            }

            /* renamed from: a */
            public C6417a m17098a(long j) {
                this.f22042a = j;
                return this;
            }

            /* renamed from: a */
            public C6417a m17096a(String str, String str2) {
                if (this.f22043b == null) {
                    this.f22043b = new HashMap();
                }
                this.f22043b.put(str, str2);
                return this;
            }

            /* renamed from: a */
            public C6416a m17100a() {
                return new C6416a(this);
            }
        }

        private C6416a(C6417a c6417a) {
            this.f22038a = c6417a.f22042a;
            this.f22039b = c6417a.f22043b;
            this.f22040c = c6417a.f22044c;
            this.f22041d = C6417a.m17093d(c6417a);
        }

        /* renamed from: a */
        public long m17103a() {
            return this.f22038a;
        }

        /* renamed from: b */
        public Map<String, String> m17102b() {
            return this.f22039b == null ? Collections.emptyMap() : this.f22039b;
        }

        /* renamed from: c */
        public int m17101c() {
            return this.f22040c;
        }
    }

    /* renamed from: com.google.android.gms.internal.ajr$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6418b extends AbstractC4502m {
        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        Status mo7645a();

        /* renamed from: a */
        byte[] mo17092a(String str, byte[] bArr, String str2);

        /* renamed from: b */
        long mo17091b();

        /* renamed from: c */
        Map<String, Set<String>> mo17090c();
    }

    /* renamed from: a */
    AbstractC4494i<AbstractC6418b> mo17104a(AbstractC4489g abstractC4489g, C6416a c6416a);
}
