package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C4072i();

    /* renamed from: a */
    final int f15551a;

    /* renamed from: b */
    private final String f15552b;

    /* renamed from: c */
    private GoogleSignInOptions f15553c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInConfiguration(int i, String str, GoogleSignInOptions googleSignInOptions) {
        this.f15551a = i;
        this.f15552b = C4588d.m23625a(str);
        this.f15553c = googleSignInOptions;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this(3, str, googleSignInOptions);
    }

    /* renamed from: a */
    public String m25626a() {
        return this.f15552b;
    }

    /* renamed from: b */
    public GoogleSignInOptions m25625b() {
        return this.f15553c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
                if (this.f15552b.equals(signInConfiguration.m25626a()) && (this.f15553c != null ? this.f15553c.equals(signInConfiguration.m25625b()) : signInConfiguration.m25625b() == null)) {
                    z = true;
                }
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public int hashCode() {
        return new C4062d().m25599a(this.f15552b).m25599a(this.f15553c).m25600a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4072i.m25584a(this, parcel, i);
    }
}
