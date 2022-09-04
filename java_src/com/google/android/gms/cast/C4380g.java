package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.internal.AbstractC4418b;
import com.google.android.gms.cast.internal.AbstractC4443o;
import com.google.android.gms.cast.internal.AbstractC4444p;
import com.google.android.gms.cast.internal.C4423e;
import com.google.android.gms.cast.internal.C4441n;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;
@SuppressLint({"MissingRemoteException"})
/* renamed from: com.google.android.gms.cast.g */
/* loaded from: classes2.dex */
public class C4380g implements C4201a.AbstractC4216e {

    /* renamed from: a */
    public static final String f16475a = C4441n.f16672g;

    /* renamed from: b */
    public static final int f16476b = 0;

    /* renamed from: c */
    public static final int f16477c = 1;

    /* renamed from: d */
    public static final int f16478d = 2;

    /* renamed from: e */
    public static final int f16479e = 0;

    /* renamed from: f */
    public static final int f16480f = 2100;

    /* renamed from: g */
    public static final int f16481g = 2101;

    /* renamed from: h */
    public static final int f16482h = 2102;

    /* renamed from: i */
    public static final int f16483i = 2103;

    /* renamed from: j */
    private final Object f16484j;

    /* renamed from: k */
    private final C4441n f16485k;

    /* renamed from: l */
    private final C4409f f16486l;

    /* renamed from: m */
    private AbstractC4406c f16487m;

    /* renamed from: n */
    private AbstractC4407d f16488n;

    /* renamed from: o */
    private AbstractC4405b f16489o;

    /* renamed from: p */
    private AbstractC4408e f16490p;

    /* renamed from: com.google.android.gms.cast.g$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4404a extends AbstractC4502m {
        /* renamed from: b */
        JSONObject mo24287b();
    }

    /* renamed from: com.google.android.gms.cast.g$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4405b {
        /* renamed from: a */
        void m24295a();
    }

    /* renamed from: com.google.android.gms.cast.g$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4406c {
        /* renamed from: a */
        void m24294a();
    }

    /* renamed from: com.google.android.gms.cast.g$d */
    /* loaded from: classes2.dex */
    public interface AbstractC4407d {
        /* renamed from: a */
        void m24293a();
    }

    /* renamed from: com.google.android.gms.cast.g$e */
    /* loaded from: classes2.dex */
    public interface AbstractC4408e {
        /* renamed from: a */
        void m24292a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.g$f */
    /* loaded from: classes2.dex */
    public class C4409f implements AbstractC4443o {

        /* renamed from: b */
        private AbstractC4489g f16585b;

        /* renamed from: c */
        private long f16586c = 0;

        /* renamed from: com.google.android.gms.cast.g$f$a */
        /* loaded from: classes2.dex */
        private final class C4410a implements AbstractC4503n<Status> {

            /* renamed from: b */
            private final long f16588b;

            C4410a(long j) {
                this.f16588b = j;
            }

            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7161a(@NonNull Status status) {
                if (!status.m24018f()) {
                    C4380g.this.f16485k.mo17666a(this.f16588b, status.m24015i());
                }
            }
        }

        public C4409f() {
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4443o
        /* renamed from: a */
        public long mo24120a() {
            long j = this.f16586c + 1;
            this.f16586c = j;
            return j;
        }

        /* renamed from: a */
        public void m24291a(AbstractC4489g abstractC4489g) {
            this.f16585b = abstractC4489g;
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4443o
        /* renamed from: a */
        public void mo24119a(String str, String str2, long j, String str3) {
            if (this.f16585b == null) {
                throw new IOException("No GoogleApiClient available");
            }
            C4201a.f16032l.mo24951a(this.f16585b, str, str2).mo13673a(new C4410a(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.cast.g$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4411g extends AbstractC4418b<AbstractC4404a> {

        /* renamed from: h */
        AbstractC4444p f16589h = new AbstractC4444p() { // from class: com.google.android.gms.cast.g.g.1
            @Override // com.google.android.gms.cast.internal.AbstractC4444p
            /* renamed from: a */
            public void mo17629a(long j) {
                AbstractC4411g.this.b((AbstractC4411g) ((AbstractC4404a) AbstractC4411g.this.mo7807b(new Status(2103))));
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4444p
            /* renamed from: a */
            public void mo17628a(long j, int i, Object obj) {
                AbstractC4411g.this.b((AbstractC4411g) new C4414h(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }
        };

        AbstractC4411g(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4404a mo7807b(final Status status) {
            return new AbstractC4404a() { // from class: com.google.android.gms.cast.g.g.2
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.cast.C4380g.AbstractC4404a
                /* renamed from: b */
                public JSONObject mo24287b() {
                    return null;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a */
        public void mo7809a(C4423e c4423e) {
        }
    }

    /* renamed from: com.google.android.gms.cast.g$h */
    /* loaded from: classes2.dex */
    private static final class C4414h implements AbstractC4404a {

        /* renamed from: a */
        private final Status f16593a;

        /* renamed from: b */
        private final JSONObject f16594b;

        C4414h(Status status, JSONObject jSONObject) {
            this.f16593a = status;
            this.f16594b = jSONObject;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f16593a;
        }

        @Override // com.google.android.gms.cast.C4380g.AbstractC4404a
        /* renamed from: b */
        public JSONObject mo24287b() {
            return this.f16594b;
        }
    }

    public C4380g() {
        this(new C4441n(null));
    }

    C4380g(C4441n c4441n) {
        this.f16484j = new Object();
        this.f16485k = c4441n;
        this.f16485k.m24150a(new C4441n.AbstractC4442a() { // from class: com.google.android.gms.cast.g.1
            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: a */
            public void mo24124a() {
                C4380g.this.m24301f();
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: b */
            public void mo24123b() {
                C4380g.this.m24299g();
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: c */
            public void mo24122c() {
                C4380g.this.m24297h();
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: d */
            public void mo24121d() {
                C4380g.this.m24296i();
            }
        });
        this.f16486l = new C4409f();
        this.f16485k.a(this.f16486l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m24353a(int i) {
        MediaStatus m24313c = m24313c();
        for (int i2 = 0; i2 < m24313c.m25040q(); i2++) {
            if (m24313c.m25058b(i2).m25086c() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m24301f() {
        if (this.f16490p != null) {
            this.f16490p.m24292a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m24299g() {
        if (this.f16489o != null) {
            this.f16489o.m24295a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m24297h() {
        if (this.f16488n != null) {
            this.f16488n.m24293a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m24296i() {
        if (this.f16487m != null) {
            this.f16487m.m24294a();
        }
    }

    /* renamed from: a */
    public long m24354a() {
        long m24134d;
        synchronized (this.f16484j) {
            m24134d = this.f16485k.m24134d();
        }
        return m24134d;
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24346a(AbstractC4489g abstractC4489g) {
        return m24328a(abstractC4489g, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24345a(AbstractC4489g abstractC4489g, double d) {
        return m24344a(abstractC4489g, d, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24344a(final AbstractC4489g abstractC4489g, final double d, final JSONObject jSONObject) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException(new StringBuilder(41).append("Volume cannot be ").append(d).toString());
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.14
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24148a(this.f16589h, d, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                        b((C438614) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24343a(final AbstractC4489g abstractC4489g, final int i, final int i2, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.8
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                int i3 = 0;
                synchronized (C4380g.this.f16484j) {
                    int m24353a = C4380g.this.m24353a(i);
                    if (m24353a == -1) {
                        b((C44028) ((AbstractC4404a) mo7807b(new Status(0))));
                    } else if (i2 < 0) {
                        b((C44028) ((AbstractC4404a) mo7807b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(i2))))));
                    } else if (m24353a == i2) {
                        b((C44028) ((AbstractC4404a) mo7807b(new Status(0))));
                    } else {
                        MediaQueueItem m25058b = C4380g.this.m24313c().m25058b(i2 > m24353a ? i2 + 1 : i2);
                        if (m25058b != null) {
                            i3 = m25058b.m25086c();
                        }
                        C4380g.this.f16486l.m24291a(abstractC4489g);
                        try {
                            C4380g.this.f16485k.m24141a(this.f16589h, new int[]{i}, i3, jSONObject);
                            C4380g.this.f16486l.m24291a(null);
                        } catch (IOException e) {
                            b((C44028) ((AbstractC4404a) mo7807b(new Status(2100))));
                            C4380g.this.f16486l.m24291a(null);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24342a(final AbstractC4489g abstractC4489g, final int i, final long j, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.7
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    if (C4380g.this.m24353a(i) == -1) {
                        b((C44017) ((AbstractC4404a) mo7807b(new Status(0))));
                        return;
                    }
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24147a(this.f16589h, i, j, (MediaQueueItem[]) null, 0, (Integer) null, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C44017) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24341a(final AbstractC4489g abstractC4489g, final int i, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.5
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24147a(this.f16589h, 0, -1L, (MediaQueueItem[]) null, 0, Integer.valueOf(i), jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C43995) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24340a(AbstractC4489g abstractC4489g, long j) {
        return m24338a(abstractC4489g, j, 0, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24339a(AbstractC4489g abstractC4489g, long j, int i) {
        return m24338a(abstractC4489g, j, i, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24338a(final AbstractC4489g abstractC4489g, final long j, final int i, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.13
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24146a(this.f16589h, j, i, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438513) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24337a(AbstractC4489g abstractC4489g, MediaInfo mediaInfo) {
        return m24333a(abstractC4489g, mediaInfo, true, 0L, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24336a(AbstractC4489g abstractC4489g, MediaInfo mediaInfo, boolean z) {
        return m24333a(abstractC4489g, mediaInfo, z, 0L, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24335a(AbstractC4489g abstractC4489g, MediaInfo mediaInfo, boolean z, long j) {
        return m24333a(abstractC4489g, mediaInfo, z, j, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24334a(AbstractC4489g abstractC4489g, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return m24333a(abstractC4489g, mediaInfo, z, j, (long[]) null, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24333a(final AbstractC4489g abstractC4489g, final MediaInfo mediaInfo, final boolean z, final long j, final long[] jArr, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.4
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24145a(this.f16589h, mediaInfo, z, j, jArr, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C43984) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24332a(final AbstractC4489g abstractC4489g, final MediaQueueItem mediaQueueItem, final int i, final long j, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.20
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24138a(this.f16589h, new MediaQueueItem[]{mediaQueueItem}, i, 0, 0, j, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439320) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24331a(AbstractC4489g abstractC4489g, MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return m24332a(abstractC4489g, mediaQueueItem, i, -1L, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24330a(AbstractC4489g abstractC4489g, MediaQueueItem mediaQueueItem, JSONObject jSONObject) {
        return m24320a(abstractC4489g, new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24329a(final AbstractC4489g abstractC4489g, final TextTrackStyle textTrackStyle) {
        if (textTrackStyle == null) {
            throw new IllegalArgumentException("trackStyle cannot be null");
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.17
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24144a(this.f16589h, textTrackStyle);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438917) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24328a(final AbstractC4489g abstractC4489g, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.9
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24143a(this.f16589h, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C44039) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24327a(AbstractC4489g abstractC4489g, boolean z) {
        return m24326a(abstractC4489g, z, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24326a(final AbstractC4489g abstractC4489g, final boolean z, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.15
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24142a(this.f16589h, z, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException | IllegalStateException e) {
                        b((C438715) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24325a(final AbstractC4489g abstractC4489g, final int[] iArr, final int i, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.23
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24141a(this.f16589h, iArr, i, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439623) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24324a(final AbstractC4489g abstractC4489g, final int[] iArr, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.22
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24140a(this.f16589h, iArr, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439522) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24323a(final AbstractC4489g abstractC4489g, final long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.12
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24139a(this.f16589h, jArr);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438412) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24322a(final AbstractC4489g abstractC4489g, final MediaQueueItem[] mediaQueueItemArr, final int i, final int i2, final long j, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.18
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24137a(this.f16589h, mediaQueueItemArr, i, i2, j, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439018) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24321a(AbstractC4489g abstractC4489g, MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) {
        return m24322a(abstractC4489g, mediaQueueItemArr, i, i2, -1L, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24320a(final AbstractC4489g abstractC4489g, final MediaQueueItem[] mediaQueueItemArr, final int i, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.19
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24138a(this.f16589h, mediaQueueItemArr, i, 0, -1, -1L, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439119) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4404a> m24319a(final AbstractC4489g abstractC4489g, final MediaQueueItem[] mediaQueueItemArr, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.21
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24147a(this.f16589h, 0, -1L, mediaQueueItemArr, 0, (Integer) null, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C439421) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.C4201a.AbstractC4216e
    /* renamed from: a */
    public void mo17637a(CastDevice castDevice, String str, String str2) {
        this.f16485k.mo17652b(str2);
    }

    /* renamed from: a */
    public void m24352a(AbstractC4405b abstractC4405b) {
        this.f16489o = abstractC4405b;
    }

    /* renamed from: a */
    public void m24351a(AbstractC4406c abstractC4406c) {
        this.f16487m = abstractC4406c;
    }

    /* renamed from: a */
    public void m24350a(AbstractC4407d abstractC4407d) {
        this.f16488n = abstractC4407d;
    }

    /* renamed from: a */
    public void m24349a(AbstractC4408e abstractC4408e) {
        this.f16490p = abstractC4408e;
    }

    /* renamed from: b */
    public long m24318b() {
        long m24133e;
        synchronized (this.f16484j) {
            m24133e = this.f16485k.m24133e();
        }
        return m24133e;
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4404a> m24316b(AbstractC4489g abstractC4489g) {
        return m24314b(abstractC4489g, null);
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4404a> m24315b(final AbstractC4489g abstractC4489g, final int i, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.6
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    if (C4380g.this.m24353a(i) == -1) {
                        b((C44006) ((AbstractC4404a) mo7807b(new Status(0))));
                        return;
                    }
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24140a(this.f16589h, new int[]{i}, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C44006) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4404a> m24314b(final AbstractC4489g abstractC4489g, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.10
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24136b(this.f16589h, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438210) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public MediaStatus m24313c() {
        MediaStatus m24132f;
        synchronized (this.f16484j) {
            m24132f = this.f16485k.m24132f();
        }
        return m24132f;
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4404a> m24311c(AbstractC4489g abstractC4489g) {
        return m24309c(abstractC4489g, null);
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4404a> m24310c(AbstractC4489g abstractC4489g, int i, JSONObject jSONObject) {
        return m24342a(abstractC4489g, i, -1L, jSONObject);
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4404a> m24309c(final AbstractC4489g abstractC4489g, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.11
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24135c(this.f16589h, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438311) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public MediaInfo m24308d() {
        MediaInfo m24131g;
        synchronized (this.f16484j) {
            m24131g = this.f16485k.m24131g();
        }
        return m24131g;
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4404a> m24306d(final AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.16
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24149a(this.f16589h);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C438816) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4404a> m24305d(final AbstractC4489g abstractC4489g, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.2
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24147a(this.f16589h, 0, -1L, (MediaQueueItem[]) null, -1, (Integer) null, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C43922) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public AbstractC4494i<AbstractC4404a> m24302e(final AbstractC4489g abstractC4489g, final JSONObject jSONObject) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4411g(abstractC4489g) { // from class: com.google.android.gms.cast.g.3
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.C4380g.AbstractC4411g, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4380g.this.f16484j) {
                    C4380g.this.f16486l.m24291a(abstractC4489g);
                    try {
                        C4380g.this.f16485k.m24147a(this.f16589h, 0, -1L, (MediaQueueItem[]) null, 1, (Integer) null, jSONObject);
                        C4380g.this.f16486l.m24291a(null);
                    } catch (IOException e) {
                        b((C43973) ((AbstractC4404a) mo7807b(new Status(2100))));
                        C4380g.this.f16486l.m24291a(null);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public String m24304e() {
        return this.f16485k.b();
    }
}
