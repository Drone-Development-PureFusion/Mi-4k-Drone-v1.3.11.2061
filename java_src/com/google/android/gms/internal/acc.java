package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.adf;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
@aaa
/* loaded from: classes.dex */
public class acc {

    /* renamed from: b */
    private static ace f21093b;

    /* renamed from: c */
    private static final Object f21094c = new Object();

    /* renamed from: a */
    public static final AbstractC6182a<Void> f21092a = new AbstractC6182a<Void>() { // from class: com.google.android.gms.internal.acc.1
        @Override // com.google.android.gms.internal.acc.AbstractC6182a
        /* renamed from: a */
        public Void mo12729b() {
            return null;
        }

        @Override // com.google.android.gms.internal.acc.AbstractC6182a
        /* renamed from: a */
        public Void mo12728b(InputStream inputStream) {
            return null;
        }
    };

    /* renamed from: com.google.android.gms.internal.acc$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6182a<T> {
        /* renamed from: b */
        T mo12729b();

        /* renamed from: b */
        T mo12728b(InputStream inputStream);
    }

    /* renamed from: com.google.android.gms.internal.acc$b */
    /* loaded from: classes2.dex */
    private static class C6183b<T> extends abd<InputStream> {

        /* renamed from: a */
        private final AbstractC6182a<T> f21101a;

        /* renamed from: b */
        private final adf.AbstractC6209b<T> f21102b;

        public C6183b(String str, final AbstractC6182a<T> abstractC6182a, final adf.AbstractC6209b<T> abstractC6209b) {
            super(0, str, new adf.AbstractC6208a() { // from class: com.google.android.gms.internal.acc.b.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.adf.AbstractC6208a
                /* renamed from: a */
                public void mo18045a(aii aiiVar) {
                    adf.AbstractC6209b.this.mo18044a(abstractC6182a.mo12729b());
                }
            });
            this.f21101a = abstractC6182a;
            this.f21102b = abstractC6209b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.abd
        /* renamed from: a */
        public adf<InputStream> mo18238a(C8092zb c8092zb) {
            return adf.m18046a(new ByteArrayInputStream(c8092zb.f26443b), aol.m16503a(c8092zb));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.abd
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo18236a(InputStream inputStream) {
            this.f21102b.mo18044a(this.f21101a.mo12728b(inputStream));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.acc$c */
    /* loaded from: classes2.dex */
    public class C6185c<T> extends acl<T> implements adf.AbstractC6209b<T> {
        private C6185c() {
        }

        @Override // com.google.android.gms.internal.adf.AbstractC6209b
        /* renamed from: a */
        public void mo18044a(@Nullable T t) {
            super.m18209b((C6185c<T>) t);
        }
    }

    public acc(Context context) {
        m18245a(context);
    }

    /* renamed from: a */
    private static ace m18245a(Context context) {
        ace aceVar;
        synchronized (f21094c) {
            if (f21093b == null) {
                f21093b = C6773bd.m16201a(context.getApplicationContext());
            }
            aceVar = f21093b;
        }
        return aceVar;
    }

    /* renamed from: a */
    public aco<String> m18246a(int i, final String str, @Nullable final Map<String, String> map, @Nullable final byte[] bArr) {
        final C6185c c6185c = new C6185c();
        f21093b.m18230a(new C6175ac(i, str, c6185c, new adf.AbstractC6208a() { // from class: com.google.android.gms.internal.acc.2
            @Override // com.google.android.gms.internal.adf.AbstractC6208a
            /* renamed from: a */
            public void mo18045a(aii aiiVar) {
                String str2 = str;
                String valueOf = String.valueOf(aiiVar.toString());
                abr.d(new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str2).append("\n").append(valueOf).toString());
                c6185c.mo18044a((C6185c) null);
            }
        }) { // from class: com.google.android.gms.internal.acc.3
            @Override // com.google.android.gms.internal.abd
            /* renamed from: g */
            public Map<String, String> mo18240g() {
                return map == null ? super.g() : map;
            }

            @Override // com.google.android.gms.internal.abd
            /* renamed from: o */
            public byte[] mo18239o() {
                return bArr == null ? super.o() : bArr;
            }
        });
        return c6185c;
    }

    /* renamed from: a */
    public <T> aco<T> m18244a(String str, AbstractC6182a<T> abstractC6182a) {
        C6185c c6185c = new C6185c();
        f21093b.m18230a(new C6183b(str, abstractC6182a, c6185c));
        return c6185c;
    }

    /* renamed from: a */
    public aco<String> m18243a(String str, Map<String, String> map) {
        return m18246a(0, str, map, null);
    }
}
