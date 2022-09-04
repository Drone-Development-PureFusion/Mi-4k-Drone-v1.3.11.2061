package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.de */
/* loaded from: classes2.dex */
public class C9156de extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28915a = EnumC6890eg.APP_VERSION.toString();

    /* renamed from: b */
    private final Context f28916b;

    public C9156de(Context context) {
        super(f28915a, new String[0]);
        this.f28916b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        try {
            return C9147cw.m9111f(Integer.valueOf(this.f28916b.getPackageManager().getPackageInfo(this.f28916b.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(this.f28916b.getPackageName());
            String valueOf2 = String.valueOf(e.getMessage());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length()).append("Package name ").append(valueOf).append(" not found. ").append(valueOf2).toString());
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
