package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4679b;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new C9418c();

    /* renamed from: a */
    String f29754a;

    /* renamed from: b */
    String f29755b;

    /* renamed from: c */
    ArrayList<LabelValue> f29756c;

    /* renamed from: d */
    private final int f29757d;

    LabelValueRow() {
        this.f29757d = 1;
        this.f29756c = C4679b.m23173a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LabelValueRow(int i, String str, String str2, ArrayList<LabelValue> arrayList) {
        this.f29757d = i;
        this.f29754a = str;
        this.f29755b = str2;
        this.f29756c = arrayList;
    }

    /* renamed from: a */
    public int m8179a() {
        return this.f29757d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9418c.m8164a(this, parcel, i);
    }
}
