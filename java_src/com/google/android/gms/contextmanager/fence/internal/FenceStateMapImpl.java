package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AbstractC4098d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class FenceStateMapImpl extends AbstractSafeParcelable implements AbstractC4098d {
    public static final Parcelable.Creator<FenceStateMapImpl> CREATOR = new C4745j();

    /* renamed from: a */
    public final Map<String, FenceStateImpl> f17374a = new HashMap();

    /* renamed from: b */
    private final int f17375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FenceStateMapImpl(int i, Bundle bundle) {
        this.f17375b = i;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f17374a.put(str, (FenceStateImpl) C4631c.m23442a(bundle.getByteArray(str), FenceStateImpl.CREATOR));
            }
        }
    }

    @Override // com.google.android.gms.awareness.fence.AbstractC4098d
    /* renamed from: a */
    public Set<String> mo22964a() {
        return this.f17374a.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m22962b() {
        return this.f17375b;
    }

    @Override // com.google.android.gms.awareness.fence.AbstractC4098d
    /* renamed from: b */
    public FenceStateImpl mo22963a(String str) {
        if (this.f17374a.containsKey(str)) {
            return this.f17374a.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle m22960c() {
        if (this.f17374a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, FenceStateImpl> entry : this.f17374a.entrySet()) {
            bundle.putByteArray(entry.getKey(), C4631c.m23444a(entry.getValue()));
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4745j.m22908a(this, parcel, i);
    }
}
