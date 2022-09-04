package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new C9750x();

    /* renamed from: a */
    public final int f30359a;

    /* renamed from: b */
    private String f30360b;

    /* renamed from: c */
    private String f30361c;

    /* renamed from: d */
    private boolean f30362d;

    /* renamed from: e */
    private boolean f30363e;

    /* renamed from: f */
    private Uri f30364f;

    /* renamed from: com.google.firebase.auth.UserProfileChangeRequest$a */
    /* loaded from: classes2.dex */
    public static class C9717a {

        /* renamed from: a */
        private String f30365a;

        /* renamed from: b */
        private Uri f30366b;

        /* renamed from: c */
        private boolean f30367c;

        /* renamed from: d */
        private boolean f30368d;

        /* renamed from: a */
        public C9717a m7350a(@Nullable Uri uri) {
            if (uri == null) {
                this.f30368d = true;
            } else {
                this.f30366b = uri;
            }
            return this;
        }

        /* renamed from: a */
        public C9717a m7349a(@Nullable String str) {
            if (str == null) {
                this.f30367c = true;
            } else {
                this.f30365a = str;
            }
            return this;
        }

        /* renamed from: a */
        public UserProfileChangeRequest m7351a() {
            return new UserProfileChangeRequest(1, this.f30365a, this.f30366b == null ? null : this.f30366b.toString(), this.f30367c, this.f30368d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserProfileChangeRequest(int i, String str, String str2, boolean z, boolean z2) {
        this.f30359a = i;
        this.f30360b = str;
        this.f30361c = str2;
        this.f30362d = z;
        this.f30363e = z2;
        this.f30364f = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Nullable
    /* renamed from: a */
    public String m7356a() {
        return this.f30360b;
    }

    /* renamed from: b */
    public String m7355b() {
        return this.f30361c;
    }

    @Nullable
    /* renamed from: c */
    public Uri m7354c() {
        return this.f30364f;
    }

    /* renamed from: d */
    public boolean m7353d() {
        return this.f30362d;
    }

    /* renamed from: e */
    public boolean m7352e() {
        return this.f30363e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9750x.m7225a(this, parcel, i);
    }
}
