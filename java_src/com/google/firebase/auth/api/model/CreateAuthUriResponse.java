package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
import java.util.List;
/* loaded from: classes.dex */
public class CreateAuthUriResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateAuthUriResponse> CREATOR = new C9719a();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30369a;
    @AbstractC7491om(m14334a = "authUri")

    /* renamed from: b */
    private String f30370b;
    @AbstractC7491om(m14334a = "registered")

    /* renamed from: c */
    private boolean f30371c;
    @AbstractC7491om(m14334a = "providerId")

    /* renamed from: d */
    private String f30372d;
    @AbstractC7491om(m14334a = "forExistingProvider")

    /* renamed from: e */
    private boolean f30373e;
    @AbstractC7491om(m14334a = "allProviders")

    /* renamed from: f */
    private StringList f30374f;

    public CreateAuthUriResponse() {
        this.f30369a = 1;
        this.f30374f = StringList.m7315b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateAuthUriResponse(int i, String str, boolean z, String str2, boolean z2, StringList stringList) {
        this.f30369a = i;
        this.f30370b = str;
        this.f30371c = z;
        this.f30372d = str2;
        this.f30373e = z2;
        this.f30374f = stringList == null ? StringList.m7315b() : StringList.m7316a(stringList);
    }

    @Nullable
    /* renamed from: a */
    public String m7348a() {
        return this.f30370b;
    }

    /* renamed from: b */
    public boolean m7347b() {
        return this.f30371c;
    }

    @Nullable
    /* renamed from: c */
    public String m7346c() {
        return this.f30372d;
    }

    /* renamed from: d */
    public boolean m7345d() {
        return this.f30373e;
    }

    /* renamed from: e */
    public StringList m7344e() {
        return this.f30374f;
    }

    @Nullable
    /* renamed from: f */
    public List<String> m7343f() {
        return this.f30374f.m7317a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9719a.m7303a(this, parcel, i);
    }
}
