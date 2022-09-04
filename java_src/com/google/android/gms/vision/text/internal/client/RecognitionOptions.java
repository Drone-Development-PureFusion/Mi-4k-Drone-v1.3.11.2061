package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class RecognitionOptions extends AbstractSafeParcelable {
    public static final C9324e CREATOR = new C9324e();

    /* renamed from: a */
    final int f29398a;

    /* renamed from: b */
    public final Rect f29399b;

    public RecognitionOptions() {
        this.f29398a = 1;
        this.f29399b = new Rect();
    }

    public RecognitionOptions(int i, Rect rect) {
        this.f29398a = i;
        this.f29399b = rect;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9324e.m8619a(this, parcel, i);
    }
}
