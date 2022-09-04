package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.db */
/* loaded from: classes2.dex */
public class C9153db extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28907a = EnumC6890eg.ADWORDS_CLICK_REFERRER.toString();

    /* renamed from: b */
    private static final String f28908b = EnumC6958fh.COMPONENT.toString();

    /* renamed from: c */
    private static final String f28909c = EnumC6958fh.CONVERSION_ID.toString();

    /* renamed from: d */
    private final Context f28910d;

    public C9153db(Context context) {
        super(f28907a, f28909c);
        this.f28910d = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        AbstractC7090hj.C7091a c7091a = map.get(f28909c);
        if (c7091a == null) {
            return C9147cw.m9110g();
        }
        String m9132a = C9147cw.m9132a(c7091a);
        AbstractC7090hj.C7091a c7091a2 = map.get(f28908b);
        String m9314a = C9052an.m9314a(this.f28910d, m9132a, c7091a2 != null ? C9147cw.m9132a(c7091a2) : null);
        return m9314a != null ? C9147cw.m9111f(m9314a) : C9147cw.m9110g();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
