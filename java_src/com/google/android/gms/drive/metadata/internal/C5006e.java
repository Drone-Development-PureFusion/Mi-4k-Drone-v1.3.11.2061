package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajx;
import com.google.android.gms.internal.ajy;
import com.google.android.gms.internal.aka;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.drive.metadata.internal.e */
/* loaded from: classes2.dex */
public final class C5006e {

    /* renamed from: a */
    private static final Map<String, AbstractC4991a<?>> f18003a = new HashMap();

    /* renamed from: b */
    private static final Map<String, AbstractC5007a> f18004b = new HashMap();

    /* renamed from: com.google.android.gms.drive.metadata.internal.e$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5007a {
        /* renamed from: a */
        String mo17073a();

        /* renamed from: a */
        void mo17072a(DataHolder dataHolder);
    }

    static {
        m22132a(ajw.f22073a);
        m22132a(ajw.f22062G);
        m22132a(ajw.f22096x);
        m22132a(ajw.f22060E);
        m22132a(ajw.f22063H);
        m22132a(ajw.f22086n);
        m22132a(ajw.f22085m);
        m22132a(ajw.f22087o);
        m22132a(ajw.f22088p);
        m22132a(ajw.f22089q);
        m22132a(ajw.f22083k);
        m22132a(ajw.f22091s);
        m22132a(ajw.f22092t);
        m22132a(ajw.f22093u);
        m22132a(ajw.f22058C);
        m22132a(ajw.f22074b);
        m22132a(ajw.f22098z);
        m22132a(ajw.f22076d);
        m22132a(ajw.f22084l);
        m22132a(ajw.f22077e);
        m22132a(ajw.f22078f);
        m22132a(ajw.f22079g);
        m22132a(ajw.f22080h);
        m22132a(ajw.f22095w);
        m22132a(ajw.f22090r);
        m22132a(ajw.f22097y);
        m22132a(ajw.f22056A);
        m22132a(ajw.f22057B);
        m22132a(ajw.f22059D);
        m22132a(ajw.f22064I);
        m22132a(ajw.f22065J);
        m22132a(ajw.f22082j);
        m22132a(ajw.f22081i);
        m22132a(ajw.f22061F);
        m22132a(ajw.f22094v);
        m22132a(ajw.f22075c);
        m22132a(ajw.f22066K);
        m22132a(ajw.f22067L);
        m22132a(ajw.f22068M);
        m22132a(ajw.f22069N);
        m22132a(ajw.f22070O);
        m22132a(ajw.f22071P);
        m22132a(ajw.f22072Q);
        m22132a(ajy.f22100a);
        m22132a(ajy.f22102c);
        m22132a(ajy.f22103d);
        m22132a(ajy.f22104e);
        m22132a(ajy.f22101b);
        m22132a(ajy.f22105f);
        m22132a(aka.f22107a);
        m22132a(aka.f22108b);
        C5015m c5015m = ajw.f22058C;
        m22131a(C5015m.f18006a);
        m22131a(ajx.f22099a);
    }

    /* renamed from: a */
    public static AbstractC4991a<?> m22130a(String str) {
        return f18003a.get(str);
    }

    /* renamed from: a */
    public static Collection<AbstractC4991a<?>> m22134a() {
        return Collections.unmodifiableCollection(f18003a.values());
    }

    /* renamed from: a */
    public static void m22133a(DataHolder dataHolder) {
        for (AbstractC5007a abstractC5007a : f18004b.values()) {
            abstractC5007a.mo17072a(dataHolder);
        }
    }

    /* renamed from: a */
    private static void m22132a(AbstractC4991a<?> abstractC4991a) {
        if (f18003a.containsKey(abstractC4991a.mo22171a())) {
            String valueOf = String.valueOf(abstractC4991a.mo22171a());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate field name registered: ".concat(valueOf) : new String("Duplicate field name registered: "));
        } else {
            f18003a.put(abstractC4991a.mo22171a(), abstractC4991a);
        }
    }

    /* renamed from: a */
    private static void m22131a(AbstractC5007a abstractC5007a) {
        if (f18004b.put(abstractC5007a.mo17073a(), abstractC5007a) != null) {
            String valueOf = String.valueOf(abstractC5007a.mo17073a());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("A cleaner for key ").append(valueOf).append(" has already been registered").toString());
        }
    }
}
