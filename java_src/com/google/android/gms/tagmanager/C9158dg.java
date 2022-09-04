package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dg */
/* loaded from: classes2.dex */
public class C9158dg extends AbstractC9145cu {

    /* renamed from: a */
    static final String f28919a;

    /* renamed from: b */
    private static final String f28920b = EnumC6890eg.ARBITRARY_PIXEL.toString();

    /* renamed from: c */
    private static final String f28921c = EnumC6958fh.URL.toString();

    /* renamed from: d */
    private static final String f28922d = EnumC6958fh.ADDITIONAL_PARAMS.toString();

    /* renamed from: e */
    private static final String f28923e = EnumC6958fh.UNREPEATABLE.toString();

    /* renamed from: f */
    private static final Set<String> f28924f = new HashSet();

    /* renamed from: g */
    private final AbstractC9160a f28925g;

    /* renamed from: h */
    private final Context f28926h;

    /* renamed from: com.google.android.gms.tagmanager.dg$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9160a {
        /* renamed from: a */
        AbstractC9026aa mo9076a();
    }

    static {
        String str = f28920b;
        f28919a = new StringBuilder(String.valueOf(str).length() + 17).append("gtm_").append(str).append("_unrepeatable").toString();
    }

    public C9158dg(final Context context) {
        this(context, new AbstractC9160a() { // from class: com.google.android.gms.tagmanager.dg.1
            @Override // com.google.android.gms.tagmanager.C9158dg.AbstractC9160a
            /* renamed from: a */
            public AbstractC9026aa mo9076a() {
                return C9213h.m8914a(context);
            }
        });
    }

    C9158dg(Context context, AbstractC9160a abstractC9160a) {
        super(f28920b, f28921c);
        this.f28925g = abstractC9160a;
        this.f28926h = context;
    }

    /* renamed from: c */
    private synchronized boolean m9077c(String str) {
        boolean z = true;
        synchronized (this) {
            if (!m9078b(str)) {
                if (m9079a(str)) {
                    f28924f.add(str);
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    boolean m9079a(String str) {
        return this.f28926h.getSharedPreferences(f28919a, 0).contains(str);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9145cu
    /* renamed from: b */
    public void mo8981b(Map<String, AbstractC7090hj.C7091a> map) {
        String m9132a = map.get(f28923e) != null ? C9147cw.m9132a(map.get(f28923e)) : null;
        if (m9132a == null || !m9077c(m9132a)) {
            Uri.Builder buildUpon = Uri.parse(C9147cw.m9132a(map.get(f28921c))).buildUpon();
            AbstractC7090hj.C7091a c7091a = map.get(f28922d);
            if (c7091a != null) {
                Object m9112f = C9147cw.m9112f(c7091a);
                if (!(m9112f instanceof List)) {
                    String valueOf = String.valueOf(buildUpon.build().toString());
                    C9065aw.m9301a(valueOf.length() != 0 ? "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(valueOf) : new String("ArbitraryPixel: additional params not a list: not sending partial hit: "));
                    return;
                }
                for (Object obj : (List) m9112f) {
                    if (!(obj instanceof Map)) {
                        String valueOf2 = String.valueOf(buildUpon.build().toString());
                        C9065aw.m9301a(valueOf2.length() != 0 ? "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(valueOf2) : new String("ArbitraryPixel: additional params contains non-map: not sending partial hit: "));
                        return;
                    }
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            }
            String uri = buildUpon.build().toString();
            this.f28925g.mo9076a().mo8913a(uri);
            String valueOf3 = String.valueOf(uri);
            C9065aw.m9295e(valueOf3.length() != 0 ? "ArbitraryPixel: url = ".concat(valueOf3) : new String("ArbitraryPixel: url = "));
            if (m9132a == null) {
                return;
            }
            synchronized (C9158dg.class) {
                f28924f.add(m9132a);
                C9133cn.m9162a(this.f28926h, f28919a, m9132a, "true");
            }
        }
    }

    /* renamed from: b */
    boolean m9078b(String str) {
        return f28924f.contains(str);
    }
}
