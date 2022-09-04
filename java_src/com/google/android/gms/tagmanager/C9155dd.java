package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dd */
/* loaded from: classes2.dex */
public class C9155dd extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28913a = EnumC6890eg.APP_NAME.toString();

    /* renamed from: b */
    private final Context f28914b;

    public C9155dd(Context context) {
        super(f28913a, new String[0]);
        this.f28914b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        try {
            PackageManager packageManager = this.f28914b.getPackageManager();
            return C9147cw.m9111f(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f28914b.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            C9065aw.m9300a("App name is not found.", e);
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
