package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.bi */
/* loaded from: classes2.dex */
public class C9079bi extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28734a = EnumC6890eg.ADVERTISING_TRACKING_ENABLED.toString();

    /* renamed from: b */
    private final C9209g f28735b;

    public C9079bi(Context context) {
        this(C9209g.m8924a(context));
    }

    C9079bi(C9209g c9209g) {
        super(f28734a, new String[0]);
        this.f28735b = c9209g;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(Boolean.valueOf(!this.f28735b.m8922b()));
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
