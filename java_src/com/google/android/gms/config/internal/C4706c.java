package com.google.android.gms.config.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C4532k;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.AbstractC4718i;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aie;
import com.google.android.gms.internal.ajq;
import com.google.android.gms.internal.ajr;
import com.google.android.gms.internal.ajs;
import com.google.firebase.iid.C9909b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.config.internal.c */
/* loaded from: classes2.dex */
public class C4706c implements ajr {

    /* renamed from: a */
    private static final Charset f17335a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Pattern f17336b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: c */
    private static final Pattern f17337c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: com.google.android.gms.config.internal.c$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractBinderC4708a extends AbstractC4718i.AbstractBinderC4719a {
        AbstractBinderC4708a() {
        }

        @Override // com.google.android.gms.config.internal.AbstractC4718i
        /* renamed from: a */
        public void mo23029a(Status status) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.config.internal.AbstractC4718i
        /* renamed from: a */
        public void mo23028a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.config.internal.AbstractC4718i
        /* renamed from: a */
        public void mo23027a(Status status, Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.config.internal.AbstractC4718i
        /* renamed from: a */
        public void mo23026a(Status status, byte[] bArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.gms.config.internal.c$b */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4709b<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C4714e> {
        public AbstractC4709b(AbstractC4489g abstractC4489g) {
            super(ajq.f22036c, abstractC4489g);
        }

        /* renamed from: a */
        protected abstract void mo23044a(Context context, AbstractC4721j abstractC4721j);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public final void mo7809a(C4714e c4714e) {
            mo23044a(c4714e.B(), (AbstractC4721j) c4714e.G());
        }
    }

    /* renamed from: com.google.android.gms.config.internal.c$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4710c extends AbstractC4709b<ajr.AbstractC6418b> {

        /* renamed from: c */
        protected AbstractC4718i f17340c = new AbstractBinderC4708a() { // from class: com.google.android.gms.config.internal.c.c.1
            @Override // com.google.android.gms.config.internal.C4706c.AbstractBinderC4708a, com.google.android.gms.config.internal.AbstractC4718i
            /* renamed from: a */
            public void mo23028a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
                if (fetchConfigIpcResponse.m23060b() == 6502 || fetchConfigIpcResponse.m23060b() == 6507) {
                    AbstractC4710c.this.b((AbstractC4710c) new C4712d(C4706c.m23047b(fetchConfigIpcResponse.m23060b()), C4706c.m23046b(fetchConfigIpcResponse), fetchConfigIpcResponse.m23058d()));
                } else {
                    AbstractC4710c.this.b((AbstractC4710c) new C4712d(C4706c.m23047b(fetchConfigIpcResponse.m23060b()), C4706c.m23046b(fetchConfigIpcResponse)));
                }
            }
        };

        public AbstractC4710c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.config.internal.c$d */
    /* loaded from: classes2.dex */
    public static class C4712d implements ajr.AbstractC6418b {

        /* renamed from: a */
        private final Map<String, TreeMap<String, byte[]>> f17342a;

        /* renamed from: b */
        private final Status f17343b;

        /* renamed from: c */
        private final long f17344c;

        public C4712d(Status status, Map<String, TreeMap<String, byte[]>> map) {
            this(status, map, -1L);
        }

        public C4712d(Status status, Map<String, TreeMap<String, byte[]>> map, long j) {
            this.f17343b = status;
            this.f17342a = map;
            this.f17344c = j;
        }

        @Override // com.google.android.gms.internal.ajr.AbstractC6418b, com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17343b;
        }

        /* renamed from: a */
        public boolean m23042a(String str, String str2) {
            if (this.f17342a == null || this.f17342a.get(str2) == null) {
                return false;
            }
            return this.f17342a.get(str2).get(str) != null;
        }

        @Override // com.google.android.gms.internal.ajr.AbstractC6418b
        /* renamed from: a */
        public byte[] mo17092a(String str, byte[] bArr, String str2) {
            return m23042a(str, str2) ? this.f17342a.get(str2).get(str) : bArr;
        }

        @Override // com.google.android.gms.internal.ajr.AbstractC6418b
        /* renamed from: b */
        public long mo17091b() {
            return this.f17344c;
        }

        @Override // com.google.android.gms.internal.ajr.AbstractC6418b
        /* renamed from: c */
        public Map<String, Set<String>> mo17090c() {
            HashMap hashMap = new HashMap();
            if (this.f17342a != null) {
                for (String str : this.f17342a.keySet()) {
                    TreeMap<String, byte[]> treeMap = this.f17342a.get(str);
                    if (treeMap != null) {
                        hashMap.put(str, treeMap.keySet());
                    }
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Status m23047b(int i) {
        return new Status(i, ajs.m17089a(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static HashMap<String, TreeMap<String, byte[]>> m23046b(FetchConfigIpcResponse fetchConfigIpcResponse) {
        DataHolder m23059c;
        if (fetchConfigIpcResponse == null || (m23059c = fetchConfigIpcResponse.m23059c()) == null) {
            return null;
        }
        PackageConfigTable packageConfigTable = (PackageConfigTable) new C4532k(m23059c, PackageConfigTable.CREATOR).mo9715a(0);
        fetchConfigIpcResponse.m23057e();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap<>();
        for (String str : packageConfigTable.m23055b().keySet()) {
            TreeMap<String, byte[]> treeMap = new TreeMap<>();
            hashMap.put(str, treeMap);
            Bundle bundle = packageConfigTable.m23055b().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ajr
    /* renamed from: a */
    public AbstractC4494i<ajr.AbstractC6418b> mo17104a(AbstractC4489g abstractC4489g, final ajr.C6416a c6416a) {
        if (abstractC4489g == null || c6416a == null) {
            return null;
        }
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4710c(abstractC4489g) { // from class: com.google.android.gms.config.internal.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public ajr.AbstractC6418b mo7807b(Status status) {
                return new C4712d(status, new HashMap());
            }

            @Override // com.google.android.gms.config.internal.C4706c.AbstractC4709b
            /* renamed from: a */
            protected void mo23044a(Context context, AbstractC4721j abstractC4721j) {
                String str;
                String str2;
                DataHolder.C4519a m23832h = C4532k.m23832h();
                for (Map.Entry<String, String> entry : c6416a.m17102b().entrySet()) {
                    C4532k.m23833a(m23832h, new CustomVariable(entry.getKey(), entry.getValue()));
                }
                DataHolder m23875a = m23832h.m23875a(0);
                String m17250a = aie.m17249a(context) == Status.f16786a ? aie.m17250a() : null;
                try {
                    str = C9909b.m6576a().m6575b();
                } catch (IllegalStateException e) {
                    e = e;
                    str = null;
                }
                try {
                    str2 = C9909b.m6576a().m6574c();
                } catch (IllegalStateException e2) {
                    e = e2;
                    if (Log.isLoggable("ConfigApiImpl", 3)) {
                        Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                    }
                    str2 = null;
                    abstractC4721j.mo23024a(this.f17340c, new FetchConfigIpcRequest(context.getPackageName(), c6416a.m17103a(), m23875a, m17250a, str, str2, null, c6416a.m17101c(), C4705b.m23050b(context)));
                    m23875a.close();
                }
                abstractC4721j.mo23024a(this.f17340c, new FetchConfigIpcRequest(context.getPackageName(), c6416a.m17103a(), m23875a, m17250a, str, str2, null, c6416a.m17101c(), C4705b.m23050b(context)));
                m23875a.close();
            }
        });
    }
}
