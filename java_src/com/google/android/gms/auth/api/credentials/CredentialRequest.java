package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C4008f();

    /* renamed from: a */
    final int f15401a;

    /* renamed from: b */
    private final boolean f15402b;

    /* renamed from: c */
    private final String[] f15403c;

    /* renamed from: d */
    private final CredentialPickerConfig f15404d;

    /* renamed from: e */
    private final CredentialPickerConfig f15405e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    /* loaded from: classes.dex */
    public static final class C3998a {

        /* renamed from: a */
        private boolean f15406a;

        /* renamed from: b */
        private String[] f15407b;

        /* renamed from: c */
        private CredentialPickerConfig f15408c;

        /* renamed from: d */
        private CredentialPickerConfig f15409d;

        /* renamed from: a */
        public C3998a m25803a(CredentialPickerConfig credentialPickerConfig) {
            this.f15408c = credentialPickerConfig;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C3998a m25801a(boolean z) {
            return m25797b(z);
        }

        /* renamed from: a */
        public C3998a m25800a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f15407b = strArr;
            return this;
        }

        /* renamed from: a */
        public CredentialRequest m25804a() {
            if (this.f15407b == null) {
                this.f15407b = new String[0];
            }
            if (this.f15406a || this.f15407b.length != 0) {
                return new CredentialRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public C3998a m25799b(CredentialPickerConfig credentialPickerConfig) {
            this.f15409d = credentialPickerConfig;
            return this;
        }

        /* renamed from: b */
        public C3998a m25797b(boolean z) {
            this.f15406a = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2) {
        this.f15401a = i;
        this.f15402b = z;
        this.f15403c = (String[]) C4588d.m23627a(strArr);
        this.f15404d = credentialPickerConfig == null ? new CredentialPickerConfig.C3995a().m25817a() : credentialPickerConfig;
        this.f15405e = credentialPickerConfig2 == null ? new CredentialPickerConfig.C3995a().m25817a() : credentialPickerConfig2;
    }

    private CredentialRequest(C3998a c3998a) {
        this(2, c3998a.f15406a, c3998a.f15407b, c3998a.f15408c, c3998a.f15409d);
    }

    @Deprecated
    /* renamed from: a */
    public boolean m25809a() {
        return m25808b();
    }

    /* renamed from: b */
    public boolean m25808b() {
        return this.f15402b;
    }

    @NonNull
    /* renamed from: c */
    public String[] m25807c() {
        return this.f15403c;
    }

    @NonNull
    /* renamed from: d */
    public CredentialPickerConfig m25806d() {
        return this.f15404d;
    }

    @NonNull
    /* renamed from: e */
    public CredentialPickerConfig m25805e() {
        return this.f15405e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4008f.m25757a(this, parcel, i);
    }
}
