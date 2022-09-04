package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C4007e();

    /* renamed from: a */
    final int f15390a;

    /* renamed from: b */
    private final boolean f15391b;

    /* renamed from: c */
    private final boolean f15392c;
    @Deprecated

    /* renamed from: d */
    private final boolean f15393d;

    /* renamed from: e */
    private final int f15394e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes.dex */
    public static class C3995a {

        /* renamed from: a */
        private boolean f15395a = false;

        /* renamed from: b */
        private boolean f15396b = true;

        /* renamed from: c */
        private int f15397c = 1;

        /* renamed from: a */
        public C3995a m25816a(int i) {
            this.f15397c = i;
            return this;
        }

        /* renamed from: a */
        public C3995a m25814a(boolean z) {
            this.f15395a = z;
            return this;
        }

        /* renamed from: a */
        public CredentialPickerConfig m25817a() {
            return new CredentialPickerConfig(this);
        }

        /* renamed from: b */
        public C3995a m25812b(boolean z) {
            this.f15396b = z;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C3995a m25810c(boolean z) {
            this.f15397c = z ? 3 : 1;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$b */
    /* loaded from: classes.dex */
    public @interface AbstractC3996b {

        /* renamed from: a */
        public static final int f15398a = 1;

        /* renamed from: b */
        public static final int f15399b = 2;

        /* renamed from: c */
        public static final int f15400c = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        int i3 = 3;
        boolean z4 = true;
        this.f15390a = i;
        this.f15391b = z;
        this.f15392c = z2;
        if (i < 2) {
            this.f15393d = z3;
            this.f15394e = !z3 ? 1 : i3;
            return;
        }
        this.f15393d = i2 != 3 ? false : z4;
        this.f15394e = i2;
    }

    private CredentialPickerConfig(C3995a c3995a) {
        this(2, c3995a.f15395a, c3995a.f15396b, false, c3995a.f15397c);
    }

    /* renamed from: a */
    public boolean m25821a() {
        return this.f15391b;
    }

    /* renamed from: b */
    public boolean m25820b() {
        return this.f15392c;
    }

    @Deprecated
    /* renamed from: c */
    public boolean m25819c() {
        return this.f15394e == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m25818d() {
        return this.f15394e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4007e.m25760a(this, parcel, i);
    }
}
