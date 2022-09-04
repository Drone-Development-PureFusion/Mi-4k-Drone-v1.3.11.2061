package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4692o;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {

    /* renamed from: b */
    private final int f27473b;

    /* renamed from: c */
    private String f27474c;

    /* renamed from: a */
    private static final String f27472a = MapStyleOptions.class.getSimpleName();
    public static final C8627s CREATOR = new C8627s();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapStyleOptions(int i, String str) {
        this.f27473b = i;
        this.f27474c = str;
    }

    public MapStyleOptions(String str) {
        this.f27473b = 1;
        this.f27474c = str;
    }

    /* renamed from: a */
    public static MapStyleOptions m11358a(Context context, int i) {
        try {
            return new MapStyleOptions(new String(C4692o.m23123a(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            throw new Resources.NotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("Failed to read resource ").append(i).append(": ").append(valueOf).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11359a() {
        return this.f27473b;
    }

    /* renamed from: b */
    public String m11357b() {
        return this.f27474c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8627s.m10937a(this, parcel, i);
    }
}
