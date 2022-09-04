package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class TextRecognizerOptions extends AbstractSafeParcelable {
    public static final C9327h CREATOR = new C9327h();

    /* renamed from: a */
    final int f29401a;

    public TextRecognizerOptions() {
        this.f29401a = 1;
    }

    public TextRecognizerOptions(int i) {
        this.f29401a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9327h.m8609a(this, parcel, i);
    }
}
