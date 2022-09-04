package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppMetadata> CREATOR = new C8763d();

    /* renamed from: a */
    private final int f28046a;

    /* renamed from: b */
    private final List<AppIdentifier> f28047b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppMetadata(int i, List<AppIdentifier> list) {
        this.f28046a = i;
        this.f28047b = (List) C4588d.m23626a(list, "Must specify application identifiers");
        C4588d.m23629a(list.size(), (Object) "Application identifiers cannot be empty");
    }

    public AppMetadata(List<AppIdentifier> list) {
        this(1, list);
    }

    /* renamed from: a */
    public int m10227a() {
        return this.f28046a;
    }

    /* renamed from: b */
    public List<AppIdentifier> m10226b() {
        return this.f28047b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8763d.m10197a(this, parcel, i);
    }
}
