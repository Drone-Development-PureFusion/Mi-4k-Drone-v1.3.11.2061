package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo23257a(String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo23248b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
