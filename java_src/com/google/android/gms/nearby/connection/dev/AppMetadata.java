package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppMetadata> CREATOR = new C8766c();

    /* renamed from: a */
    private final int f28065a;

    /* renamed from: b */
    private final List<AppIdentifier> f28066b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppMetadata(int i, List<AppIdentifier> list) {
        this.f28065a = i;
        this.f28066b = (List) C4588d.m23626a(list, "Must specify application identifiers");
        C4588d.m23629a(list.size(), (Object) "Application identifiers cannot be empty");
    }

    /* renamed from: a */
    public int m10192a() {
        return this.f28065a;
    }

    /* renamed from: b */
    public List<AppIdentifier> m10191b() {
        return this.f28066b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8766c.m10175a(this, parcel, i);
    }
}
