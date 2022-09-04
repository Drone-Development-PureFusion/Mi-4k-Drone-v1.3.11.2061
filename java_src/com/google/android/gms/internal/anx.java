package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.AbstractC8990c;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.C8987a;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class anx implements AbstractC8990c {

    /* renamed from: a */
    protected static SparseArray<aoc> f22508a;

    /* renamed from: b */
    protected static long f22509b;

    /* renamed from: c */
    private static final String f22510c = anx.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$a */
    /* loaded from: classes2.dex */
    public static class C6664a implements AbstractC8990c.AbstractC8991a {

        /* renamed from: a */
        private final Status f22522a;

        /* renamed from: b */
        private final AttestationData f22523b;

        public C6664a(Status status, AttestationData attestationData) {
            this.f22522a = status;
            this.f22523b = attestationData;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22522a;
        }

        @Override // com.google.android.gms.safetynet.AbstractC8990c.AbstractC8991a
        /* renamed from: b */
        public String mo9427b() {
            if (this.f22523b == null) {
                return null;
            }
            return this.f22523b.m9439a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6665b extends anu<AbstractC8990c.AbstractC8991a> {

        /* renamed from: c */
        protected anv f22524c = new ant() { // from class: com.google.android.gms.internal.anx.b.1
            @Override // com.google.android.gms.internal.ant, com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16584a(Status status, AttestationData attestationData) {
                AbstractC6665b.this.b((AbstractC6665b) new C6664a(status, attestationData));
            }
        };

        public AbstractC6665b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8990c.AbstractC8991a mo7807b(Status status) {
            return new C6664a(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6667c extends anu<AbstractC8990c.AbstractC8994d> {

        /* renamed from: b */
        protected anv f22526b = new ant() { // from class: com.google.android.gms.internal.anx.c.1
            @Override // com.google.android.gms.internal.ant, com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16582a(Status status, boolean z) {
                AbstractC6667c.this.b((AbstractC6667c) new C6675h(status, z));
            }
        };

        public AbstractC6667c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8990c.AbstractC8994d mo7807b(Status status) {
            return new C6675h(status, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6669d extends anu<AbstractC8990c.AbstractC8993c> {

        /* renamed from: b */
        protected final anv f22528b = new ant() { // from class: com.google.android.gms.internal.anx.d.1
            @Override // com.google.android.gms.internal.ant, com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16580a(Status status, List<HarmfulAppsData> list) {
                AbstractC6669d.this.b((AbstractC6669d) new C6673f(status, list));
            }
        };

        public AbstractC6669d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8990c.AbstractC8993c mo7807b(Status status) {
            return new C6673f(status, new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6671e extends anu<AbstractC8990c.AbstractC8992b> {

        /* renamed from: e */
        protected anv f22530e = new ant() { // from class: com.google.android.gms.internal.anx.e.1
            @Override // com.google.android.gms.internal.ant, com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16578a(Status status, SafeBrowsingData safeBrowsingData) {
                DataHolder m9437b = safeBrowsingData.m9437b();
                if (m9437b != null) {
                    try {
                        int m23879g = m9437b.m23879g();
                        if (m23879g != 0) {
                            if (anx.f22508a != null) {
                                anx.f22508a.clear();
                            }
                            anx.f22508a = new SparseArray<>();
                            for (int i = 0; i < m23879g; i++) {
                                aoc aocVar = new aoc(m9437b, i);
                                anx.f22508a.put(aocVar.m16555a(), aocVar);
                            }
                            anx.f22509b = SystemClock.elapsedRealtime();
                        }
                    } finally {
                        if (!m9437b.m23877h()) {
                            m9437b.close();
                        }
                    }
                }
                AbstractC6671e.this.b((AbstractC6671e) new C6674g(status, safeBrowsingData));
            }
        };

        public AbstractC6671e(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8990c.AbstractC8992b mo7807b(Status status) {
            return new C6674g(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$f */
    /* loaded from: classes2.dex */
    public static class C6673f implements AbstractC8990c.AbstractC8993c {

        /* renamed from: a */
        private final Status f22532a;

        /* renamed from: b */
        private final List<HarmfulAppsData> f22533b;

        public C6673f(Status status, List<HarmfulAppsData> list) {
            this.f22532a = status;
            this.f22533b = list;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22532a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$g */
    /* loaded from: classes2.dex */
    public static class C6674g implements AbstractC8990c.AbstractC8992b {

        /* renamed from: a */
        private Status f22534a;

        /* renamed from: b */
        private final SafeBrowsingData f22535b;

        /* renamed from: c */
        private String f22536c;

        public C6674g(Status status, SafeBrowsingData safeBrowsingData) {
            this.f22534a = status;
            this.f22535b = safeBrowsingData;
            this.f22536c = null;
            if (this.f22535b != null) {
                this.f22536c = this.f22535b.m9438a();
            } else if (!this.f22534a.m24018f()) {
            } else {
                this.f22534a = new Status(8);
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22534a;
        }

        @Override // com.google.android.gms.safetynet.AbstractC8990c.AbstractC8992b
        /* renamed from: b */
        public String mo9426b() {
            return this.f22536c;
        }

        @Override // com.google.android.gms.safetynet.AbstractC8990c.AbstractC8992b
        /* renamed from: c */
        public List<C8987a> mo9425c() {
            ArrayList arrayList = new ArrayList();
            if (this.f22536c == null) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONObject(this.f22536c).getJSONArray("matches");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(new C8987a(Integer.parseInt(jSONArray.getJSONObject(i).getString("threat_type"))));
                    } catch (NumberFormatException e) {
                    } catch (JSONException e2) {
                    }
                }
                return arrayList;
            } catch (JSONException e3) {
                return arrayList;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.anx$h */
    /* loaded from: classes2.dex */
    public static class C6675h implements AbstractC8990c.AbstractC8994d {

        /* renamed from: a */
        private final Status f22537a;

        /* renamed from: b */
        private final boolean f22538b;

        public C6675h(Status status, boolean z) {
            this.f22537a = status;
            this.f22538b = z;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22537a;
        }
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public AbstractC4494i<AbstractC8990c.AbstractC8994d> mo9433a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6667c(abstractC4489g) { // from class: com.google.android.gms.internal.anx.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(any anyVar) {
                anyVar.m16576a(this.f22526b);
            }
        });
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public AbstractC4494i<AbstractC8990c.AbstractC8992b> mo9432a(AbstractC4489g abstractC4489g, final String str, final int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (!TextUtils.isEmpty(str)) {
            return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6671e(abstractC4489g) { // from class: com.google.android.gms.internal.anx.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ahl.AbstractC6343a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7809a(any anyVar) {
                    ArrayList arrayList = new ArrayList();
                    for (int i : iArr) {
                        arrayList.add(Integer.valueOf(i));
                    }
                    anyVar.m16575a(this.f22530e, arrayList, 1, str, null);
                }
            });
        }
        throw new IllegalArgumentException("Null or empty uri in lookupUri");
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public AbstractC4494i<AbstractC8990c.AbstractC8992b> mo9431a(AbstractC4489g abstractC4489g, List<Integer> list, String str) {
        return m16591a(abstractC4489g, list, str, null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC8990c.AbstractC8992b> m16591a(AbstractC4489g abstractC4489g, final List<Integer> list, final String str, final String str2) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (!TextUtils.isEmpty(str)) {
            return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6671e(abstractC4489g) { // from class: com.google.android.gms.internal.anx.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ahl.AbstractC6343a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7809a(any anyVar) {
                    anyVar.m16575a(this.f22530e, list, 2, str, str2);
                }
            });
        }
        throw new IllegalArgumentException("Null or empty uri in lookupUri");
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public AbstractC4494i<AbstractC8990c.AbstractC8991a> mo9430a(AbstractC4489g abstractC4489g, final byte[] bArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6665b(abstractC4489g) { // from class: com.google.android.gms.internal.anx.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(any anyVar) {
                anyVar.m16574a(this.f22524c, bArr);
            }
        });
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public boolean mo9434a(Context context) {
        return new aoe(context).m16526a();
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: a */
    public boolean mo9429a(String str, int... iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        if (f22508a == null || f22509b == 0 || SystemClock.elapsedRealtime() - f22509b >= 1200000) {
            return true;
        }
        if (f22508a == null || f22508a.size() == 0) {
            return true;
        }
        List<aoa> m16544b = new aod(str).m16544b();
        if (m16544b == null || m16544b.isEmpty()) {
            return true;
        }
        for (aoa aoaVar : m16544b) {
            for (int i : iArr) {
                aoc aocVar = f22508a.get(i);
                if (aocVar != null && !aocVar.m16553a(aoaVar.m16570a(4).m16571a())) {
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.safetynet.AbstractC8990c
    /* renamed from: b */
    public AbstractC4494i<AbstractC8990c.AbstractC8993c> mo9428b(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6669d(abstractC4489g) { // from class: com.google.android.gms.internal.anx.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(any anyVar) {
                anyVar.m16573b(this.f22528b);
            }
        });
    }
}
