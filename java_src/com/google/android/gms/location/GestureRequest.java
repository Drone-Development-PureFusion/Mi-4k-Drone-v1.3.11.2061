package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class GestureRequest extends AbstractSafeParcelable {

    /* renamed from: e */
    private final int f26664e;

    /* renamed from: f */
    private final List<Integer> f26665f;

    /* renamed from: a */
    private static final List<Integer> f26660a = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));

    /* renamed from: b */
    private static final List<Integer> f26661b = Collections.unmodifiableList(Arrays.asList(1));

    /* renamed from: c */
    private static final List<Integer> f26662c = Collections.unmodifiableList(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 19));

    /* renamed from: d */
    private static final List<Integer> f26663d = Collections.unmodifiableList(Arrays.asList(3, 5, 7, 9, 11, 13, 15, 17));
    public static final C8340v CREATOR = new C8340v();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GestureRequest(int i, List<Integer> list) {
        this.f26664e = i;
        this.f26665f = list;
    }

    /* renamed from: a */
    public int m12633a() {
        return this.f26664e;
    }

    /* renamed from: b */
    public List<Integer> m12632b() {
        return this.f26665f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8340v.m12027a(this, parcel, i);
    }
}
