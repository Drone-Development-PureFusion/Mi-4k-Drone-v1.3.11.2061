package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.ah */
/* loaded from: classes2.dex */
public class C9038ah extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28686a = EnumC6890eg.ADVERTISER_ID.toString();

    /* renamed from: b */
    private final C9209g f28687b;

    public C9038ah(Context context) {
        this(C9209g.m8924a(context));
    }

    C9038ah(C9209g c9209g) {
        super(f28686a, new String[0]);
        this.f28687b = c9209g;
        this.f28687b.m8925a();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String m8925a = this.f28687b.m8925a();
        return m8925a == null ? C9147cw.m9110g() : C9147cw.m9111f(m8925a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
