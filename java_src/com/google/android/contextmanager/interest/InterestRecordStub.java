package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7617qf;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7648rc;
/* loaded from: classes2.dex */
public class InterestRecordStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InterestRecordStub> CREATOR = new C3423a();

    /* renamed from: a */
    private final int f13676a;

    /* renamed from: b */
    private final AbstractC7617qf.C7619b f13677b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterestRecordStub(int i, byte[] bArr) {
        this.f13676a = i;
        AbstractC7617qf.C7619b c7619b = null;
        try {
            c7619b = AbstractC7617qf.C7619b.m14057a(bArr);
        } catch (C7648rc e) {
            Log.e("InterestRecordStub", "Could not deserialize interest bytes.", e);
        }
        this.f13677b = c7619b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m27887a() {
        return this.f13676a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m27886b() {
        return AbstractC7649rd.m13857a(this.f13677b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3423a.m27883a(this, parcel, i);
    }
}
