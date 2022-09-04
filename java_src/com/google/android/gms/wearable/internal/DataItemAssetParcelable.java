package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9467i;
import com.xiaomi.mipush.sdk.Constants;
@KeepName
/* loaded from: classes2.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, AbstractC9467i {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new C9593c();

    /* renamed from: a */
    final int f29919a;

    /* renamed from: b */
    private final String f29920b;

    /* renamed from: c */
    private final String f29921c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataItemAssetParcelable(int i, String str, String str2) {
        this.f29919a = i;
        this.f29920b = str;
        this.f29921c = str2;
    }

    public DataItemAssetParcelable(AbstractC9467i abstractC9467i) {
        this.f29919a = 1;
        this.f29920b = (String) C4588d.m23627a(abstractC9467i.mo7794c());
        this.f29921c = (String) C4588d.m23627a(abstractC9467i.mo7793d());
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: c */
    public String mo7794c() {
        return this.f29920b;
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: d */
    public String mo7793d() {
        return this.f29921c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC9467i mo7785a() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f29920b == null) {
            sb.append(",noid");
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(this.f29920b);
        }
        sb.append(", key=");
        sb.append(this.f29921c);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9593c.m7795a(this, parcel, i);
    }
}
