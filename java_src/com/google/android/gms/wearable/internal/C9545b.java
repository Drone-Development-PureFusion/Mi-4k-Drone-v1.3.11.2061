package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.AbstractC9467i;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.wearable.internal.b */
/* loaded from: classes2.dex */
public class C9545b implements AbstractC9467i {

    /* renamed from: a */
    private final String f30069a;

    /* renamed from: b */
    private final String f30070b;

    public C9545b(AbstractC9467i abstractC9467i) {
        this.f30069a = abstractC9467i.mo7794c();
        this.f30070b = abstractC9467i.mo7793d();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: c */
    public String mo7794c() {
        return this.f30069a;
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: d */
    public String mo7793d() {
        return this.f30070b;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC9467i mo7785a() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f30069a == null) {
            sb.append(",noid");
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(this.f30069a);
        }
        sb.append(", key=");
        sb.append(this.f30070b);
        sb.append("]");
        return sb.toString();
    }
}
