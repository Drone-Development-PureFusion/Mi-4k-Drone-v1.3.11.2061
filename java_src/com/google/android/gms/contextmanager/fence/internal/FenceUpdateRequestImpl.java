package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AbstractC4099e;
import com.google.android.gms.awareness.fence.AbstractC4104i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.C7716sx;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class FenceUpdateRequestImpl extends AbstractSafeParcelable implements AbstractC4099e {
    public static final Parcelable.Creator<FenceUpdateRequestImpl> CREATOR = new C4747l();

    /* renamed from: a */
    private final int f17379a;

    /* renamed from: b */
    private final ArrayList<UpdateFenceOperation> f17380b;

    @Deprecated
    public FenceUpdateRequestImpl() {
        this(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FenceUpdateRequestImpl(int i, ArrayList<UpdateFenceOperation> arrayList) {
        this.f17379a = i;
        this.f17380b = arrayList;
    }

    public FenceUpdateRequestImpl(ArrayList<UpdateFenceOperation> arrayList) {
        this(1, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22956a() {
        return this.f17379a;
    }

    /* renamed from: a */
    public void m22955a(C7716sx<AbstractC4104i, BinderC4738e> c7716sx) {
        Iterator<UpdateFenceOperation> it2 = this.f17380b.iterator();
        while (it2.hasNext()) {
            it2.next().m22951a(c7716sx);
        }
    }

    /* renamed from: b */
    public ArrayList<UpdateFenceOperation> m22954b() {
        return this.f17380b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4747l.m22902a(this, parcel, i);
    }
}
