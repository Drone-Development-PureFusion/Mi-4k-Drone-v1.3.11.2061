package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class RealtimeDocumentSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RealtimeDocumentSyncRequest> CREATOR = new C5118z();

    /* renamed from: a */
    final int f17538a;

    /* renamed from: b */
    final List<String> f17539b;

    /* renamed from: c */
    final List<String> f17540c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealtimeDocumentSyncRequest(int i, List<String> list, List<String> list2) {
        this.f17538a = i;
        this.f17539b = (List) C4588d.m23627a(list);
        this.f17540c = (List) C4588d.m23627a(list2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5118z.m21781a(this, parcel, i);
    }
}
