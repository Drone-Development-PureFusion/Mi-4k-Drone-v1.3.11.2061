package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.df */
/* loaded from: classes2.dex */
public class C9157df extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28917a = EnumC6890eg.APP_VERSION_NAME.toString();

    /* renamed from: b */
    private final Context f28918b;

    public C9157df(Context context) {
        super(f28917a, new String[0]);
        this.f28918b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        try {
            return C9147cw.m9111f(this.f28918b.getPackageManager().getPackageInfo(this.f28918b.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(this.f28918b.getPackageName());
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
