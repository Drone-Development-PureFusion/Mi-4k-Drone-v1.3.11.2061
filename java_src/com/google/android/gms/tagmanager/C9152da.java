package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: com.google.android.gms.tagmanager.da */
/* loaded from: classes2.dex */
class C9152da {
    /* renamed from: a */
    private static C9085bn<AbstractC7090hj.C7091a> m9083a(C9085bn<AbstractC7090hj.C7091a> c9085bn) {
        try {
            return new C9085bn<>(C9147cw.m9111f(m9080a(C9147cw.m9132a(c9085bn.m9288a()))), c9085bn.m9287b());
        } catch (UnsupportedEncodingException e) {
            C9065aw.m9300a("Escape URI: unsupported encoding", e);
            return c9085bn;
        }
    }

    /* renamed from: a */
    private static C9085bn<AbstractC7090hj.C7091a> m9082a(C9085bn<AbstractC7090hj.C7091a> c9085bn, int i) {
        if (!m9084a(c9085bn.m9288a())) {
            C9065aw.m9301a("Escaping can only be applied to strings.");
            return c9085bn;
        }
        switch (i) {
            case 12:
                return m9083a(c9085bn);
            default:
                C9065aw.m9301a(new StringBuilder(39).append("Unsupported Value Escaping: ").append(i).toString());
                return c9085bn;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9085bn<AbstractC7090hj.C7091a> m9081a(C9085bn<AbstractC7090hj.C7091a> c9085bn, int... iArr) {
        for (int i : iArr) {
            c9085bn = m9082a(c9085bn, i);
        }
        return c9085bn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m9080a(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    /* renamed from: a */
    private static boolean m9084a(AbstractC7090hj.C7091a c7091a) {
        return C9147cw.m9112f(c7091a) instanceof String;
    }
}
