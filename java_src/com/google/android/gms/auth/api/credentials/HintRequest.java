package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C4009g();

    /* renamed from: a */
    final int f15410a;

    /* renamed from: b */
    private final CredentialPickerConfig f15411b;

    /* renamed from: c */
    private final boolean f15412c;

    /* renamed from: d */
    private final boolean f15413d;

    /* renamed from: e */
    private final String[] f15414e;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    /* loaded from: classes2.dex */
    public static final class C4000a {

        /* renamed from: a */
        private boolean f15415a;

        /* renamed from: b */
        private boolean f15416b;

        /* renamed from: c */
        private String[] f15417c;

        /* renamed from: d */
        private CredentialPickerConfig f15418d = new CredentialPickerConfig.C3995a().m25817a();

        /* renamed from: a */
        public C4000a m25789a(@NonNull CredentialPickerConfig credentialPickerConfig) {
            this.f15418d = (CredentialPickerConfig) C4588d.m23627a(credentialPickerConfig);
            return this;
        }

        /* renamed from: a */
        public C4000a m25787a(boolean z) {
            this.f15415a = z;
            return this;
        }

        /* renamed from: a */
        public C4000a m25786a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f15417c = strArr;
            return this;
        }

        /* renamed from: a */
        public HintRequest m25790a() {
            if (this.f15417c == null) {
                this.f15417c = new String[0];
            }
            if (this.f15415a || this.f15416b || this.f15417c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public C4000a m25784b(boolean z) {
            this.f15416b = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr) {
        this.f15410a = i;
        this.f15411b = (CredentialPickerConfig) C4588d.m23627a(credentialPickerConfig);
        this.f15412c = z;
        this.f15413d = z2;
        this.f15414e = (String[]) C4588d.m23627a(strArr);
    }

    private HintRequest(C4000a c4000a) {
        this(1, c4000a.f15418d, c4000a.f15415a, c4000a.f15416b, c4000a.f15417c);
    }

    @NonNull
    /* renamed from: a */
    public CredentialPickerConfig m25794a() {
        return this.f15411b;
    }

    /* renamed from: b */
    public boolean m25793b() {
        return this.f15412c;
    }

    /* renamed from: c */
    public boolean m25792c() {
        return this.f15413d;
    }

    @NonNull
    /* renamed from: d */
    public String[] m25791d() {
        return this.f15414e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4009g.m25754a(this, parcel, i);
    }
}
