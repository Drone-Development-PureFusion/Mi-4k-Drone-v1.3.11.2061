package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.flags.impl.AbstractC5269a;
import com.google.android.gms.internal.ami;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@DynamiteApi
/* loaded from: classes2.dex */
public class FlagProviderImpl extends ami.AbstractBinderC6565a {

    /* renamed from: a */
    private boolean f19139a = false;

    /* renamed from: b */
    private SharedPreferences f19140b;

    @Override // com.google.android.gms.internal.ami
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.f19139a ? z : AbstractC5269a.C5270a.m20842a(this.f19140b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ami
    public int getIntFlagValue(String str, int i, int i2) {
        return !this.f19139a ? i : AbstractC5269a.C5272b.m20840a(this.f19140b, str, Integer.valueOf(i)).intValue();
    }

    @Override // com.google.android.gms.internal.ami
    public long getLongFlagValue(String str, long j, int i) {
        return !this.f19139a ? j : AbstractC5269a.C5274c.m20838a(this.f19140b, str, Long.valueOf(j)).longValue();
    }

    @Override // com.google.android.gms.internal.ami
    public String getStringFlagValue(String str, String str2, int i) {
        return !this.f19139a ? str2 : AbstractC5269a.C5276d.m20836a(this.f19140b, str, str2);
    }

    @Override // com.google.android.gms.internal.ami
    public void init(AbstractC4170e abstractC4170e) {
        Context context = (Context) BinderC4173f.m25294a(abstractC4170e);
        if (this.f19139a) {
            return;
        }
        try {
            this.f19140b = C5278b.m20834a(context.createPackageContext("com.google.android.gms", 0));
            this.f19139a = true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }
}
