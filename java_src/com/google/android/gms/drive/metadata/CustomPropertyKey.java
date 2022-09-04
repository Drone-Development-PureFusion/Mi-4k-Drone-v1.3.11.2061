package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CustomPropertyKey extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f17978a = 0;

    /* renamed from: b */
    public static final int f17979b = 1;

    /* renamed from: c */
    final int f17981c;

    /* renamed from: d */
    final String f17982d;

    /* renamed from: e */
    final int f17983e;
    public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new C4998h();

    /* renamed from: f */
    private static final Pattern f17980f = Pattern.compile("[\\w.!@$%^&*()/-]+");

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomPropertyKey(int i, String str, int i2) {
        boolean z = true;
        C4588d.m23626a(str, (Object) "key");
        C4588d.m23618b(f17980f.matcher(str).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        if (i2 != 0 && i2 != 1) {
            z = false;
        }
        C4588d.m23618b(z, "visibility must be either PUBLIC or PRIVATE");
        this.f17981c = i;
        this.f17982d = str;
        this.f17983e = i2;
    }

    public CustomPropertyKey(String str, int i) {
        this(1, str, i);
    }

    /* renamed from: a */
    public static CustomPropertyKey m22174a(JSONObject jSONObject) {
        return new CustomPropertyKey(jSONObject.getString("key"), jSONObject.getInt("visibility"));
    }

    /* renamed from: a */
    public String m22175a() {
        return this.f17982d;
    }

    /* renamed from: b */
    public int m22173b() {
        return this.f17983e;
    }

    /* renamed from: c */
    public JSONObject m22172c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", m22175a());
        jSONObject.put("visibility", m22173b());
        return jSONObject;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomPropertyKey)) {
            return false;
        }
        CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
        if (!customPropertyKey.m22175a().equals(this.f17982d) || customPropertyKey.m22173b() != this.f17983e) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f17982d;
        return new StringBuilder(String.valueOf(str).length() + 11).append(str).append(this.f17983e).toString().hashCode();
    }

    public String toString() {
        String str = this.f17982d;
        return new StringBuilder(String.valueOf(str).length() + 31).append("CustomPropertyKey(").append(str).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(this.f17983e).append(")").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4998h.m22163a(this, parcel, i);
    }
}
