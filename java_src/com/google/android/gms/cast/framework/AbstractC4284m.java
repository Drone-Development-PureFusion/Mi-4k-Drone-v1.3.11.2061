package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.cast.framework.AbstractC4244ac;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.m */
/* loaded from: classes2.dex */
public abstract class AbstractC4284m {

    /* renamed from: a */
    private final Context f16242a;

    /* renamed from: b */
    private final String f16243b;

    /* renamed from: c */
    private final BinderC4286a f16244c = new BinderC4286a();

    /* renamed from: com.google.android.gms.cast.framework.m$a */
    /* loaded from: classes2.dex */
    private class BinderC4286a extends AbstractC4244ac.AbstractBinderC4245a {
        private BinderC4286a() {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4244ac
        /* renamed from: a */
        public int mo24707a() {
            return 9683208;
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4244ac
        /* renamed from: a */
        public AbstractC4170e mo24706a(String str) {
            AbstractC4279j mo17805a = AbstractC4284m.this.mo17805a(str);
            if (mo17805a == null) {
                return null;
            }
            return mo17805a.m24727u();
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4244ac
        /* renamed from: b */
        public boolean mo24705b() {
            return AbstractC4284m.this.mo17804c();
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4244ac
        /* renamed from: c */
        public String mo24704c() {
            return AbstractC4284m.this.m24709b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4284m(Context context, String str) {
        this.f16242a = ((Context) C4588d.m23627a(context)).getApplicationContext();
        this.f16243b = C4588d.m23625a(str);
    }

    /* renamed from: a */
    public final Context m24710a() {
        return this.f16242a;
    }

    /* renamed from: a */
    public abstract AbstractC4279j mo17805a(String str);

    /* renamed from: b */
    public final String m24709b() {
        return this.f16243b;
    }

    /* renamed from: c */
    public abstract boolean mo17804c();

    /* renamed from: d */
    public IBinder m24708d() {
        return this.f16244c;
    }
}
