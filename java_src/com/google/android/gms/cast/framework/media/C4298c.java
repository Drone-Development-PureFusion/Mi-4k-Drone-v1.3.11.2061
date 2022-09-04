package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
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
import com.google.android.gms.common.internal.C4588d;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.cast.framework.media.c */
/* loaded from: classes.dex */
public class C4298c implements C4201a.AbstractC4216e {

    /* renamed from: a */
    public static final String f16328a = C4441n.f16672g;

    /* renamed from: b */
    public static final int f16329b = 0;

    /* renamed from: c */
    public static final int f16330c = 1;

    /* renamed from: d */
    public static final int f16331d = 2;

    /* renamed from: e */
    public static final int f16332e = 0;

    /* renamed from: f */
    public static final int f16333f = 2100;

    /* renamed from: g */
    public static final int f16334g = 2103;

    /* renamed from: j */
    private final C4441n f16337j;

    /* renamed from: l */
    private final C4201a.AbstractC4204b f16339l;

    /* renamed from: m */
    private AbstractC4489g f16340m;

    /* renamed from: q */
    private AbstractC4324c f16344q;

    /* renamed from: i */
    private final Handler f16336i = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final List<AbstractC4322a> f16341n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private final Map<AbstractC4325d, C4332h> f16342o = new ConcurrentHashMap();

    /* renamed from: p */
    private final Map<Long, C4332h> f16343p = new ConcurrentHashMap();

    /* renamed from: h */
    private final Object f16335h = new Object();

    /* renamed from: k */
    private final C4326e f16338k = new C4326e();

    /* renamed from: com.google.android.gms.cast.framework.media.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4322a {
        /* renamed from: a */
        void mo17753a();

        /* renamed from: b */
        void mo17744b();

        /* renamed from: c */
        void mo17741c();

        /* renamed from: d */
        void mo17739d();

        /* renamed from: e */
        void mo17737e();
    }

    /* renamed from: com.google.android.gms.cast.framework.media.c$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4323b extends AbstractC4502m {
        /* renamed from: b */
        JSONObject mo24503b();
    }

    /* renamed from: com.google.android.gms.cast.framework.media.c$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4324c {
        /* renamed from: a */
        boolean m24509a(MediaStatus mediaStatus);

        /* renamed from: b */
        List<AdBreakInfo> m24508b(MediaStatus mediaStatus);
    }

    /* renamed from: com.google.android.gms.cast.framework.media.c$d */
    /* loaded from: classes2.dex */
    public interface AbstractC4325d {
        /* renamed from: a */
        void mo17676a(long j, long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.framework.media.c$e */
    /* loaded from: classes2.dex */
    public class C4326e implements AbstractC4443o {

        /* renamed from: b */
        private AbstractC4489g f16417b;

        /* renamed from: c */
        private long f16418c = 0;

        /* renamed from: com.google.android.gms.cast.framework.media.c$e$a */
        /* loaded from: classes2.dex */
        private final class C4327a implements AbstractC4503n<Status> {

            /* renamed from: b */
            private final long f16420b;

            C4327a(long j) {
                this.f16420b = j;
            }

            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7161a(@NonNull Status status) {
                if (!status.m24018f()) {
                    C4298c.this.f16337j.mo17666a(this.f16420b, status.m24015i());
                }
            }
        }

        public C4326e() {
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4443o
        /* renamed from: a */
        public long mo24120a() {
            long j = this.f16418c + 1;
            this.f16418c = j;
            return j;
        }

        /* renamed from: a */
        public void m24507a(AbstractC4489g abstractC4489g) {
            this.f16417b = abstractC4489g;
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4443o
        /* renamed from: a */
        public void mo24119a(String str, String str2, long j, String str3) {
            if (this.f16417b == null) {
                throw new IOException("No GoogleApiClient available");
            }
            for (AbstractC4322a abstractC4322a : C4298c.this.f16341n) {
                abstractC4322a.mo17737e();
            }
            C4298c.this.f16339l.mo24951a(this.f16417b, str, str2).mo13673a(new C4327a(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.cast.framework.media.c$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4328f extends AbstractC4418b<AbstractC4323b> {

        /* renamed from: g */
        AbstractC4444p f16421g = new AbstractC4444p() { // from class: com.google.android.gms.cast.framework.media.c.f.1
            @Override // com.google.android.gms.cast.internal.AbstractC4444p
            /* renamed from: a */
            public void mo17629a(long j) {
                AbstractC4328f.this.b((AbstractC4328f) ((AbstractC4323b) AbstractC4328f.this.mo7807b(new Status(2103))));
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4444p
            /* renamed from: a */
            public void mo17628a(long j, int i, Object obj) {
                AbstractC4328f.this.b((AbstractC4328f) new C4331g(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }
        };

        AbstractC4328f(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4323b mo7807b(final Status status) {
            return new AbstractC4323b() { // from class: com.google.android.gms.cast.framework.media.c.f.2
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4323b
                /* renamed from: b */
                public JSONObject mo24503b() {
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

    /* renamed from: com.google.android.gms.cast.framework.media.c$g */
    /* loaded from: classes2.dex */
    private static final class C4331g implements AbstractC4323b {

        /* renamed from: a */
        private final Status f16425a;

        /* renamed from: b */
        private final JSONObject f16426b;

        C4331g(Status status, JSONObject jSONObject) {
            this.f16425a = status;
            this.f16426b = jSONObject;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f16425a;
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4323b
        /* renamed from: b */
        public JSONObject mo24503b() {
            return this.f16426b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.framework.media.c$h */
    /* loaded from: classes2.dex */
    public class C4332h {

        /* renamed from: b */
        private final Set<AbstractC4325d> f16428b = new HashSet();

        /* renamed from: c */
        private final long f16429c;

        /* renamed from: d */
        private final Runnable f16430d;

        /* renamed from: e */
        private boolean f16431e;

        public C4332h(long j) {
            this.f16429c = j;
            this.f16430d = new TimerTask() { // from class: com.google.android.gms.cast.framework.media.c.h.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C4298c.this.m24557a(C4332h.this.f16428b);
                    C4298c.this.f16336i.postDelayed(this, C4332h.this.f16429c);
                }
            };
        }

        /* renamed from: a */
        public long m24502a() {
            return this.f16429c;
        }

        /* renamed from: a */
        public void m24501a(AbstractC4325d abstractC4325d) {
            this.f16428b.add(abstractC4325d);
        }

        /* renamed from: b */
        public void m24498b(AbstractC4325d abstractC4325d) {
            this.f16428b.remove(abstractC4325d);
        }

        /* renamed from: b */
        public boolean m24499b() {
            return !this.f16428b.isEmpty();
        }

        /* renamed from: c */
        public void m24496c() {
            C4298c.this.f16336i.removeCallbacks(this.f16430d);
            this.f16431e = true;
            C4298c.this.f16336i.postDelayed(this.f16430d, this.f16429c);
        }

        /* renamed from: d */
        public void m24495d() {
            C4298c.this.f16336i.removeCallbacks(this.f16430d);
            this.f16431e = false;
        }

        /* renamed from: e */
        public boolean m24494e() {
            return this.f16431e;
        }
    }

    public C4298c(@NonNull C4441n c4441n, @NonNull C4201a.AbstractC4204b abstractC4204b) {
        this.f16339l = abstractC4204b;
        this.f16337j = (C4441n) C4588d.m23627a(c4441n);
        this.f16337j.m24150a(new C4441n.AbstractC4442a() { // from class: com.google.android.gms.cast.framework.media.c.1
            /* renamed from: e */
            private void m24510e() {
                MediaStatus m24529g;
                if (C4298c.this.f16344q == null || (m24529g = C4298c.this.m24529g()) == null) {
                    return;
                }
                m24529g.m25061a(C4298c.this.f16344q.m24509a(m24529g));
                List<AdBreakInfo> m24508b = C4298c.this.f16344q.m24508b(m24529g);
                MediaInfo m24527h = C4298c.this.m24527h();
                if (m24527h == null) {
                    return;
                }
                m24527h.m25142b(m24508b);
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: a */
            public void mo24124a() {
                m24510e();
                C4298c.this.m24511x();
                for (AbstractC4322a abstractC4322a : C4298c.this.f16341n) {
                    abstractC4322a.mo17753a();
                }
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: b */
            public void mo24123b() {
                m24510e();
                for (AbstractC4322a abstractC4322a : C4298c.this.f16341n) {
                    abstractC4322a.mo17744b();
                }
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: c */
            public void mo24122c() {
                for (AbstractC4322a abstractC4322a : C4298c.this.f16341n) {
                    abstractC4322a.mo17741c();
                }
            }

            @Override // com.google.android.gms.cast.internal.C4441n.AbstractC4442a
            /* renamed from: d */
            public void mo24121d() {
                for (AbstractC4322a abstractC4322a : C4298c.this.f16341n) {
                    abstractC4322a.mo17739d();
                }
            }
        });
        this.f16337j.a(this.f16338k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m24582a(int i) {
        MediaStatus m24529g = m24529g();
        for (int i2 = 0; i2 < m24529g.m25040q(); i2++) {
            if (m24529g.m25058b(i2).m25086c() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private AbstractC4328f m24562a(AbstractC4328f abstractC4328f) {
        try {
            try {
                this.f16340m.mo17253b((AbstractC4489g) abstractC4328f);
            } catch (IllegalStateException e) {
                abstractC4328f.b((AbstractC4328f) ((AbstractC4323b) abstractC4328f.mo7807b(new Status(2100))));
            }
        } catch (Throwable th) {
        }
        return abstractC4328f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m24557a(Set<AbstractC4325d> set) {
        if (m24521n() || m24522m()) {
            return;
        }
        HashSet<AbstractC4325d> hashSet = new HashSet(set);
        if (m24523l()) {
            for (AbstractC4325d abstractC4325d : hashSet) {
                abstractC4325d.mo17676a(m24534e(), m24531f());
            }
        } else if (!m24520o()) {
            for (AbstractC4325d abstractC4325d2 : hashSet) {
                abstractC4325d2.mo17676a(0L, 0L);
            }
        } else {
            MediaQueueItem m24518q = m24518q();
            if (m24518q == null || m24518q.m25089b() == null) {
                return;
            }
            for (AbstractC4325d abstractC4325d3 : hashSet) {
                abstractC4325d3.mo17676a(0L, m24518q.m25089b().m25138f());
            }
        }
    }

    /* renamed from: w */
    private void m24512w() {
        if (this.f16340m == null) {
            throw new IllegalStateException("No connection");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m24511x() {
        for (C4332h c4332h : this.f16343p.values()) {
            if (m24515t() && !c4332h.m24494e()) {
                c4332h.m24496c();
            } else if (!m24515t() && c4332h.m24494e()) {
                c4332h.m24495d();
            }
            if (c4332h.m24494e() && (m24521n() || m24522m() || m24520o())) {
                m24557a(c4332h.f16428b);
            }
        }
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24585a() {
        return m24556a((JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24584a(double d) {
        return m24583a(d, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24583a(final double d, final JSONObject jSONObject) {
        m24512w();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException(new StringBuilder(41).append("Volume cannot be ").append(d).toString());
        }
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.14
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24148a(this.f16421g, d, jSONObject);
                    } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                        b((C430414) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24581a(final int i, final int i2, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.8
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                int i3 = 0;
                synchronized (C4298c.this.f16335h) {
                    int m24582a = C4298c.this.m24582a(i);
                    if (m24582a == -1) {
                        b((C43208) ((AbstractC4323b) mo7807b(new Status(0))));
                    } else if (i2 < 0) {
                        b((C43208) ((AbstractC4323b) mo7807b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(i2))))));
                    } else if (m24582a == i2) {
                        b((C43208) ((AbstractC4323b) mo7807b(new Status(0))));
                    } else {
                        MediaQueueItem m25058b = C4298c.this.m24529g().m25058b(i2 > m24582a ? i2 + 1 : i2);
                        if (m25058b != null) {
                            i3 = m25058b.m25086c();
                        }
                        try {
                            C4298c.this.f16337j.m24141a(this.f16421g, new int[]{i}, i3, jSONObject);
                        } catch (IOException e) {
                            b((C43208) ((AbstractC4323b) mo7807b(new Status(2100))));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24580a(final int i, final long j, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.7
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    if (C4298c.this.m24582a(i) == -1) {
                        b((C43197) ((AbstractC4323b) mo7807b(new Status(0))));
                        return;
                    }
                    try {
                        C4298c.this.f16337j.m24147a(this.f16421g, i, j, (MediaQueueItem[]) null, 0, (Integer) null, jSONObject);
                    } catch (IOException e) {
                        b((C43197) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24579a(final int i, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.5
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24147a(this.f16421g, 0, -1L, (MediaQueueItem[]) null, 0, Integer.valueOf(i), jSONObject);
                    } catch (IOException e) {
                        b((C43175) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24578a(long j) {
        return m24576a(j, 0, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24577a(long j, int i) {
        return m24576a(j, i, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24576a(final long j, final int i, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.13
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24146a(this.f16421g, j, i, jSONObject);
                    } catch (IOException e) {
                        b((C430313) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24575a(MediaInfo mediaInfo) {
        return m24571a(mediaInfo, true, 0L, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24574a(MediaInfo mediaInfo, boolean z) {
        return m24571a(mediaInfo, z, 0L, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24573a(MediaInfo mediaInfo, boolean z, long j) {
        return m24571a(mediaInfo, z, j, (long[]) null, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24572a(MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return m24571a(mediaInfo, z, j, (long[]) null, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24571a(final MediaInfo mediaInfo, final boolean z, final long j, final long[] jArr, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.4
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24145a(this.f16421g, mediaInfo, z, j, jArr, jSONObject);
                    } catch (IOException | IllegalStateException e) {
                        b((C43164) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24570a(final MediaQueueItem mediaQueueItem, final int i, final long j, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.20
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24138a(this.f16421g, new MediaQueueItem[]{mediaQueueItem}, i, 0, 0, j, jSONObject);
                    } catch (IOException e) {
                        b((C431120) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24569a(MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return m24570a(mediaQueueItem, i, -1L, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24568a(MediaQueueItem mediaQueueItem, JSONObject jSONObject) {
        return m24548a(new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24567a(final TextTrackStyle textTrackStyle) {
        m24512w();
        if (textTrackStyle == null) {
            throw new IllegalArgumentException("trackStyle cannot be null");
        }
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.17
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24144a(this.f16421g, textTrackStyle);
                    } catch (IOException e) {
                        b((C430717) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24556a(final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.9
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24143a(this.f16421g, jSONObject);
                    } catch (IOException e) {
                        b((C43219) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24555a(boolean z) {
        return m24554a(z, (JSONObject) null);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24554a(final boolean z, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.15
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24142a(this.f16421g, z, jSONObject);
                    } catch (IOException | IllegalStateException e) {
                        b((C430515) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24553a(final int[] iArr, final int i, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.23
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24141a(this.f16421g, iArr, i, jSONObject);
                    } catch (IOException e) {
                        b((C431423) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24552a(final int[] iArr, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.22
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24140a(this.f16421g, iArr, jSONObject);
                    } catch (IOException e) {
                        b((C431322) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24551a(final long[] jArr) {
        m24512w();
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.12
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24139a(this.f16421g, jArr);
                    } catch (IOException e) {
                        b((C430212) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24550a(final MediaQueueItem[] mediaQueueItemArr, final int i, final int i2, final long j, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.18
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24137a(this.f16421g, mediaQueueItemArr, i, i2, j, jSONObject);
                    } catch (IOException e) {
                        b((C430818) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24549a(MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) {
        return m24550a(mediaQueueItemArr, i, i2, -1L, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24548a(final MediaQueueItem[] mediaQueueItemArr, final int i, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.19
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24138a(this.f16421g, mediaQueueItemArr, i, 0, -1, -1L, jSONObject);
                    } catch (IOException e) {
                        b((C430919) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4323b> m24547a(final MediaQueueItem[] mediaQueueItemArr, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.21
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24147a(this.f16421g, 0, -1L, mediaQueueItemArr, 0, (Integer) null, jSONObject);
                    } catch (IOException e) {
                        b((C431221) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.C4201a.AbstractC4216e
    /* renamed from: a */
    public void mo17637a(CastDevice castDevice, String str, String str2) {
        this.f16337j.mo17652b(str2);
    }

    /* renamed from: a */
    public void m24566a(AbstractC4322a abstractC4322a) {
        if (abstractC4322a != null) {
            this.f16341n.add(abstractC4322a);
        }
    }

    /* renamed from: a */
    public void m24565a(AbstractC4324c abstractC4324c) {
        this.f16344q = abstractC4324c;
    }

    /* renamed from: a */
    public void m24564a(AbstractC4325d abstractC4325d) {
        C4332h remove = this.f16342o.remove(abstractC4325d);
        if (remove != null) {
            remove.m24498b(abstractC4325d);
            if (remove.m24499b()) {
                return;
            }
            this.f16343p.remove(Long.valueOf(remove.m24502a()));
            remove.m24495d();
        }
    }

    /* renamed from: a */
    public void m24558a(AbstractC4489g abstractC4489g) {
        if (this.f16340m == abstractC4489g) {
            return;
        }
        if (this.f16340m != null) {
            this.f16337j.mo24152a();
            this.f16339l.mo24941d(this.f16340m, m24513v());
            this.f16338k.m24507a(null);
        }
        this.f16340m = abstractC4489g;
        if (this.f16340m == null) {
            return;
        }
        this.f16339l.mo24952a(this.f16340m, m24513v(), this);
        this.f16338k.m24507a(this.f16340m);
    }

    /* renamed from: a */
    public boolean m24563a(AbstractC4325d abstractC4325d, long j) {
        if (abstractC4325d == null || this.f16342o.containsKey(abstractC4325d)) {
            return false;
        }
        C4332h c4332h = this.f16343p.get(Long.valueOf(j));
        if (c4332h == null) {
            c4332h = new C4332h(j);
            this.f16343p.put(Long.valueOf(j), c4332h);
        }
        c4332h.m24501a(abstractC4325d);
        this.f16342o.put(abstractC4325d, c4332h);
        if (m24515t()) {
            c4332h.m24496c();
        }
        return true;
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4323b> m24546b() {
        return m24542b((JSONObject) null);
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4323b> m24545b(final int i, final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.6
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    if (C4298c.this.m24582a(i) == -1) {
                        b((C43186) ((AbstractC4323b) mo7807b(new Status(0))));
                        return;
                    }
                    try {
                        C4298c.this.f16337j.m24140a(this.f16421g, new int[]{i}, jSONObject);
                    } catch (IOException e) {
                        b((C43186) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4323b> m24542b(final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.10
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24136b(this.f16421g, jSONObject);
                    } catch (IOException e) {
                        b((C430010) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m24544b(AbstractC4322a abstractC4322a) {
        if (abstractC4322a != null) {
            this.f16341n.remove(abstractC4322a);
        }
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4323b> m24541c() {
        return m24538c((JSONObject) null);
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4323b> m24540c(int i, JSONObject jSONObject) {
        return m24580a(i, -1L, jSONObject);
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4323b> m24538c(final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.11
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24135c(this.f16421g, jSONObject);
                    } catch (IOException e) {
                        b((C430111) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4323b> m24537d() {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.16
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24149a(this.f16421g);
                    } catch (IOException e) {
                        b((C430616) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4323b> m24535d(final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.2
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24147a(this.f16421g, 0, -1L, (MediaQueueItem[]) null, -1, (Integer) null, jSONObject);
                    } catch (IOException e) {
                        b((C43102) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public long m24534e() {
        long m24134d;
        synchronized (this.f16335h) {
            m24134d = this.f16337j.m24134d();
        }
        return m24134d;
    }

    /* renamed from: e */
    public AbstractC4494i<AbstractC4323b> m24532e(final JSONObject jSONObject) {
        m24512w();
        return m24562a(new AbstractC4328f(this.f16340m) { // from class: com.google.android.gms.cast.framework.media.c.3
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4328f, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C4423e c4423e) {
                synchronized (C4298c.this.f16335h) {
                    try {
                        C4298c.this.f16337j.m24147a(this.f16421g, 0, -1L, (MediaQueueItem[]) null, 1, (Integer) null, jSONObject);
                    } catch (IOException e) {
                        b((C43153) ((AbstractC4323b) mo7807b(new Status(2100))));
                    }
                }
            }
        });
    }

    /* renamed from: f */
    public long m24531f() {
        long m24133e;
        synchronized (this.f16335h) {
            m24133e = this.f16337j.m24133e();
        }
        return m24133e;
    }

    /* renamed from: g */
    public MediaStatus m24529g() {
        MediaStatus m24132f;
        synchronized (this.f16335h) {
            m24132f = this.f16337j.m24132f();
        }
        return m24132f;
    }

    /* renamed from: h */
    public MediaInfo m24527h() {
        MediaInfo m24131g;
        synchronized (this.f16335h) {
            m24131g = this.f16337j.m24131g();
        }
        return m24131g;
    }

    /* renamed from: i */
    public int m24526i() {
        int m25057c;
        synchronized (this.f16335h) {
            MediaStatus m24529g = m24529g();
            m25057c = m24529g != null ? m24529g.m25057c() : 1;
        }
        return m25057c;
    }

    /* renamed from: j */
    public int m24525j() {
        int m25055d;
        synchronized (this.f16335h) {
            MediaStatus m24529g = m24529g();
            m25055d = m24529g != null ? m24529g.m25055d() : 0;
        }
        return m25055d;
    }

    /* renamed from: k */
    public boolean m24524k() {
        MediaInfo m24527h = m24527h();
        return m24527h != null && m24527h.m25141c() == 2;
    }

    /* renamed from: l */
    public boolean m24523l() {
        MediaStatus m24529g = m24529g();
        return m24529g != null && m24529g.m25057c() == 2;
    }

    /* renamed from: m */
    public boolean m24522m() {
        MediaStatus m24529g = m24529g();
        return m24529g != null && (m24529g.m25057c() == 3 || (m24524k() && m24525j() == 2));
    }

    /* renamed from: n */
    public boolean m24521n() {
        MediaStatus m24529g = m24529g();
        return m24529g != null && m24529g.m25057c() == 4;
    }

    /* renamed from: o */
    public boolean m24520o() {
        MediaStatus m24529g = m24529g();
        return (m24529g == null || m24529g.m25044m() == 0) ? false : true;
    }

    /* renamed from: p */
    public MediaQueueItem m24519p() {
        MediaStatus m24529g = m24529g();
        if (m24529g == null) {
            return null;
        }
        return m24529g.m25067a(m24529g.m25045l());
    }

    /* renamed from: q */
    public MediaQueueItem m24518q() {
        MediaStatus m24529g = m24529g();
        if (m24529g == null) {
            return null;
        }
        return m24529g.m25067a(m24529g.m25044m());
    }

    /* renamed from: r */
    public MediaQueueItem m24517r() {
        MediaStatus m24529g = m24529g();
        if (m24529g == null) {
            return null;
        }
        return m24529g.m25067a(m24529g.m25043n());
    }

    /* renamed from: s */
    public void m24516s() {
        int m24526i = m24526i();
        if (m24526i == 4 || m24526i == 2) {
            m24585a();
        } else {
            m24541c();
        }
    }

    /* renamed from: t */
    public boolean m24515t() {
        return m24521n() || m24523l() || m24522m() || m24520o();
    }

    /* renamed from: u */
    public boolean m24514u() {
        MediaStatus m24529g = m24529g();
        return m24529g != null && m24529g.m25039r();
    }

    /* renamed from: v */
    public String m24513v() {
        return this.f16337j.b();
    }
}
