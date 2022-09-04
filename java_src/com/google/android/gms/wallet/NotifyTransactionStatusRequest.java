package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new C9409s();

    /* renamed from: a */
    final int f29534a;

    /* renamed from: b */
    String f29535b;

    /* renamed from: c */
    int f29536c;

    /* renamed from: d */
    String f29537d;

    /* renamed from: com.google.android.gms.wallet.NotifyTransactionStatusRequest$a */
    /* loaded from: classes2.dex */
    public final class C9343a {
        private C9343a() {
        }

        /* renamed from: a */
        public C9343a m8476a(int i) {
            NotifyTransactionStatusRequest.this.f29536c = i;
            return this;
        }

        /* renamed from: a */
        public C9343a m8475a(String str) {
            NotifyTransactionStatusRequest.this.f29535b = str;
            return this;
        }

        /* renamed from: a */
        public NotifyTransactionStatusRequest m8477a() {
            boolean z = true;
            C4588d.m23618b(!TextUtils.isEmpty(NotifyTransactionStatusRequest.this.f29535b), "googleTransactionId is required");
            if (NotifyTransactionStatusRequest.this.f29536c < 1 || NotifyTransactionStatusRequest.this.f29536c > 8) {
                z = false;
            }
            C4588d.m23618b(z, "status is an unrecognized value");
            return NotifyTransactionStatusRequest.this;
        }

        /* renamed from: b */
        public C9343a m8474b(String str) {
            NotifyTransactionStatusRequest.this.f29537d = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.wallet.NotifyTransactionStatusRequest$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9344b {

        /* renamed from: a */
        public static final int f29539a = 1;

        /* renamed from: com.google.android.gms.wallet.NotifyTransactionStatusRequest$b$a */
        /* loaded from: classes2.dex */
        public interface AbstractC9345a {

            /* renamed from: a */
            public static final int f29540a = 2;

            /* renamed from: b */
            public static final int f29541b = 3;

            /* renamed from: c */
            public static final int f29542c = 4;

            /* renamed from: d */
            public static final int f29543d = 5;

            /* renamed from: e */
            public static final int f29544e = 6;

            /* renamed from: f */
            public static final int f29545f = 7;

            /* renamed from: g */
            public static final int f29546g = 8;
        }
    }

    NotifyTransactionStatusRequest() {
        this.f29534a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotifyTransactionStatusRequest(int i, String str, int i2, String str2) {
        this.f29534a = i;
        this.f29535b = str;
        this.f29536c = i2;
        this.f29537d = str2;
    }

    /* renamed from: a */
    public static C9343a m8482a() {
        NotifyTransactionStatusRequest notifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
        notifyTransactionStatusRequest.getClass();
        return new C9343a();
    }

    /* renamed from: b */
    public int m8481b() {
        return this.f29534a;
    }

    /* renamed from: c */
    public String m8480c() {
        return this.f29535b;
    }

    /* renamed from: d */
    public int m8479d() {
        return this.f29536c;
    }

    /* renamed from: e */
    public String m8478e() {
        return this.f29537d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9409s.m8198a(this, parcel, i);
    }
}
