package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4496j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.AbstractC7655ri;
import com.google.android.gms.internal.agz;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahe;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
/* renamed from: com.google.android.gms.clearcut.b */
/* loaded from: classes2.dex */
public final class C4456b {

    /* renamed from: a */
    public static final C4467a.C4478g<aha> f16711a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<aha, C4467a.AbstractC4468a.C4470b> f16712b = new C4467a.AbstractC4473b<aha, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.clearcut.b.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aha mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aha(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: c */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f16713c = new C4467a<>("ClearcutLogger.API", f16712b, f16711a);

    /* renamed from: d */
    public static final AbstractC4462c f16714d = new agz();

    /* renamed from: e */
    private final Context f16715e;

    /* renamed from: f */
    private final String f16716f;

    /* renamed from: g */
    private final int f16717g;

    /* renamed from: h */
    private String f16718h;

    /* renamed from: i */
    private int f16719i;

    /* renamed from: j */
    private String f16720j;

    /* renamed from: k */
    private String f16721k;

    /* renamed from: l */
    private final boolean f16722l;

    /* renamed from: m */
    private int f16723m;

    /* renamed from: n */
    private final AbstractC4462c f16724n;

    /* renamed from: o */
    private final AbstractC4682e f16725o;

    /* renamed from: p */
    private final C4455a f16726p;

    /* renamed from: q */
    private C4461d f16727q;

    /* renamed from: r */
    private final AbstractC4459b f16728r;

    /* renamed from: com.google.android.gms.clearcut.b$a */
    /* loaded from: classes2.dex */
    public class C4458a {

        /* renamed from: b */
        private int f16730b;

        /* renamed from: c */
        private String f16731c;

        /* renamed from: d */
        private String f16732d;

        /* renamed from: e */
        private String f16733e;

        /* renamed from: f */
        private int f16734f;

        /* renamed from: g */
        private final AbstractC4460c f16735g;

        /* renamed from: h */
        private ArrayList<Integer> f16736h;

        /* renamed from: i */
        private ArrayList<String> f16737i;

        /* renamed from: j */
        private ArrayList<Integer> f16738j;

        /* renamed from: k */
        private ArrayList<byte[]> f16739k;

        /* renamed from: l */
        private boolean f16740l;

        /* renamed from: m */
        private final AbstractC7655ri.C7659d f16741m;

        /* renamed from: n */
        private boolean f16742n;

        private C4458a(C4456b c4456b, byte[] bArr) {
            this(bArr, (AbstractC4460c) null);
        }

        private C4458a(byte[] bArr, AbstractC4460c abstractC4460c) {
            this.f16730b = C4456b.this.f16719i;
            this.f16731c = C4456b.this.f16718h;
            this.f16732d = C4456b.this.f16720j;
            this.f16733e = C4456b.this.f16721k;
            this.f16734f = C4456b.m24072e(C4456b.this);
            this.f16736h = null;
            this.f16737i = null;
            this.f16738j = null;
            this.f16739k = null;
            this.f16740l = true;
            this.f16741m = new AbstractC7655ri.C7659d();
            this.f16742n = false;
            this.f16732d = C4456b.this.f16720j;
            this.f16733e = C4456b.this.f16721k;
            this.f16741m.f25417a = C4456b.this.f16725o.mo16434a();
            this.f16741m.f25418b = C4456b.this.f16725o.mo16432b();
            this.f16741m.f25438v = C4456b.this.f16726p.m24083a(C4456b.this.f16715e);
            this.f16741m.f25432p = C4456b.this.f16727q.m24054a(this.f16741m.f25417a);
            if (bArr != null) {
                this.f16741m.f25427k = bArr;
            }
            this.f16735g = abstractC4460c;
        }

        /* renamed from: a */
        public LogEventParcelable m24059a() {
            return new LogEventParcelable(new PlayLoggerContext(C4456b.this.f16716f, C4456b.this.f16717g, this.f16730b, this.f16731c, this.f16732d, this.f16733e, C4456b.this.f16722l, this.f16734f), this.f16741m, this.f16735g, null, C4456b.m24073d((ArrayList<Integer>) null), C4456b.m24071e((ArrayList<String>) null), C4456b.m24073d((ArrayList<Integer>) null), C4456b.m24069f((ArrayList<byte[]>) null), this.f16740l);
        }

        /* renamed from: a */
        public C4458a m24058a(int i) {
            this.f16741m.f25421e = i;
            return this;
        }

        /* renamed from: a */
        public AbstractC4494i<Status> m24057a(AbstractC4489g abstractC4489g) {
            if (this.f16742n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f16742n = true;
            PlayLoggerContext playLoggerContext = m24059a().f16699b;
            return C4456b.this.f16728r.mo17501a(playLoggerContext.f28420h, playLoggerContext.f28416d) ? C4456b.this.f16724n.mo17534a(abstractC4489g, m24059a()) : C4496j.m23954a(Status.f16786a);
        }

        /* renamed from: b */
        public C4458a m24056b(int i) {
            this.f16741m.f25422f = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.clearcut.b$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4459b {
        /* renamed from: a */
        boolean mo17501a(String str, int i);
    }

    /* renamed from: com.google.android.gms.clearcut.b$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4460c {
        /* renamed from: a */
        byte[] m24055a();
    }

    /* renamed from: com.google.android.gms.clearcut.b$d */
    /* loaded from: classes2.dex */
    public static class C4461d {
        /* renamed from: a */
        public long m24054a(long j) {
            return TimeZone.getDefault().getOffset(j) / 1000;
        }
    }

    public C4456b(Context context, int i, String str, String str2, String str3, boolean z, AbstractC4462c abstractC4462c, AbstractC4682e abstractC4682e, C4461d c4461d, C4455a c4455a, AbstractC4459b abstractC4459b) {
        this.f16719i = -1;
        this.f16723m = 0;
        Context applicationContext = context.getApplicationContext();
        this.f16715e = applicationContext == null ? context : applicationContext;
        this.f16716f = context.getPackageName();
        this.f16717g = m24082a(context);
        this.f16719i = i;
        this.f16718h = str;
        this.f16720j = str2;
        this.f16721k = str3;
        this.f16722l = z;
        this.f16724n = abstractC4462c;
        this.f16725o = abstractC4682e;
        this.f16727q = c4461d == null ? new C4461d() : c4461d;
        this.f16726p = c4455a;
        this.f16723m = 0;
        this.f16728r = abstractC4459b;
        if (this.f16722l) {
            C4588d.m23618b(this.f16720j == null, "can't be anonymous with an upload account");
        }
    }

    public C4456b(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, f16714d, C4685h.m23138d(), null, C4455a.f16709a, new ahe(context));
    }

    /* renamed from: a */
    private int m24082a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int[] m24073d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int i = 0;
        Iterator<Integer> it2 = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return iArr;
            }
            i = i2 + 1;
            iArr[i2] = it2.next().intValue();
        }
    }

    /* renamed from: e */
    static /* synthetic */ int m24072e(C4456b c4456b) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static String[] m24071e(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static byte[][] m24069f(ArrayList<byte[]> arrayList) {
        if (arrayList == null) {
            return null;
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    /* renamed from: a */
    public C4458a m24079a(byte[] bArr) {
        return new C4458a(bArr);
    }
}
