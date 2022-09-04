package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddPlaceRequest> CREATOR = new C8296o();

    /* renamed from: a */
    final int f26841a;

    /* renamed from: b */
    private final String f26842b;

    /* renamed from: c */
    private final LatLng f26843c;

    /* renamed from: d */
    private final String f26844d;

    /* renamed from: e */
    private final List<Integer> f26845e;

    /* renamed from: f */
    private final String f26846f;

    /* renamed from: g */
    private final Uri f26847g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AddPlaceRequest(int i, String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        boolean z = false;
        this.f26841a = i;
        this.f26842b = C4588d.m23625a(str);
        this.f26843c = (LatLng) C4588d.m23627a(latLng);
        this.f26844d = C4588d.m23625a(str2);
        this.f26845e = new ArrayList((Collection) C4588d.m23627a(list));
        C4588d.m23618b(!this.f26845e.isEmpty(), "At least one place type should be provided.");
        C4588d.m23618b((!TextUtils.isEmpty(str3) || uri != null) ? true : z, "One of phone number or URI should be provided.");
        this.f26846f = str3;
        this.f26847g = uri;
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, Uri uri) {
        this(str, latLng, str2, list, null, (Uri) C4588d.m23627a(uri));
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3) {
        this(str, latLng, str2, list, C4588d.m23625a(str3), null);
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        this(0, str, latLng, str2, list, str3, uri);
    }

    /* renamed from: a */
    public String m12366a() {
        return this.f26842b;
    }

    /* renamed from: b */
    public LatLng m12365b() {
        return this.f26843c;
    }

    /* renamed from: c */
    public String m12364c() {
        return this.f26844d;
    }

    /* renamed from: d */
    public List<Integer> m12363d() {
        return this.f26845e;
    }

    @Nullable
    /* renamed from: e */
    public String m12362e() {
        return this.f26846f;
    }

    @Nullable
    /* renamed from: f */
    public Uri m12361f() {
        return this.f26847g;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f26842b).m23632a("latLng", this.f26843c).m23632a("address", this.f26844d).m23632a("placeTypes", this.f26845e).m23632a("phoneNumer", this.f26846f).m23632a("websiteUri", this.f26847g).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8296o.m12140a(this, parcel, i);
    }
}
