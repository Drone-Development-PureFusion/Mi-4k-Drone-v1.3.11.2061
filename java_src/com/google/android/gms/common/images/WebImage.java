package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C4554c();

    /* renamed from: a */
    private final int f16968a;

    /* renamed from: b */
    private final Uri f16969b;

    /* renamed from: c */
    private final int f16970c;

    /* renamed from: d */
    private final int f16971d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f16968a = i;
        this.f16969b = uri;
        this.f16970c = i2;
        this.f16971d = i3;
    }

    public WebImage(Uri uri) {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i >= 0 && i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException("width and height must not be negative");
    }

    public WebImage(JSONObject jSONObject) {
        this(m23764a(jSONObject), jSONObject.optInt(FimiMediaMeta.IJKM_KEY_WIDTH, 0), jSONObject.optInt(FimiMediaMeta.IJKM_KEY_HEIGHT, 0));
    }

    /* renamed from: a */
    private static Uri m23764a(JSONObject jSONObject) {
        if (jSONObject.has("url")) {
            try {
                return Uri.parse(jSONObject.getString("url"));
            } catch (JSONException e) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m23765a() {
        return this.f16968a;
    }

    /* renamed from: b */
    public Uri m23763b() {
        return this.f16969b;
    }

    /* renamed from: c */
    public int m23762c() {
        return this.f16970c;
    }

    /* renamed from: d */
    public int m23761d() {
        return this.f16971d;
    }

    /* renamed from: e */
    public JSONObject m23760e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f16969b.toString());
            jSONObject.put(FimiMediaMeta.IJKM_KEY_WIDTH, this.f16970c);
            jSONObject.put(FimiMediaMeta.IJKM_KEY_HEIGHT, this.f16971d);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C4585c.m23634a(this.f16969b, webImage.f16969b) && this.f16970c == webImage.f16970c && this.f16971d == webImage.f16971d;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f16969b, Integer.valueOf(this.f16970c), Integer.valueOf(this.f16971d));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f16970c), Integer.valueOf(this.f16971d), this.f16969b.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4554c.m23744a(this, parcel, i);
    }
}
