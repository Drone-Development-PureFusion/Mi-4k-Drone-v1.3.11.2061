package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class GetRecentContextCall {

    /* loaded from: classes2.dex */
    public static class Request extends AbstractSafeParcelable {
        public static final C3958f CREATOR = new C3958f();

        /* renamed from: a */
        final int f15250a;

        /* renamed from: b */
        public final Account f15251b;

        /* renamed from: c */
        public final boolean f15252c;

        /* renamed from: d */
        public final boolean f15253d;

        /* renamed from: e */
        public final boolean f15254e;

        /* renamed from: f */
        public final String f15255f;

        public Request() {
            this(null, false, false, false, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Request(int i, Account account, boolean z, boolean z2, boolean z3, String str) {
            this.f15250a = i;
            this.f15251b = account;
            this.f15252c = z;
            this.f15253d = z2;
            this.f15254e = z3;
            this.f15255f = str;
        }

        public Request(Account account, boolean z, boolean z2, boolean z3, String str) {
            this(1, account, z, z2, z3, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C3958f c3958f = CREATOR;
            C3958f.m25914a(this, parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public static class Response extends AbstractSafeParcelable implements AbstractC4502m {
        public static final C3959g CREATOR = new C3959g();

        /* renamed from: a */
        public Status f15256a;

        /* renamed from: b */
        public List<UsageInfo> f15257b;
        @Deprecated

        /* renamed from: c */
        public String[] f15258c;

        /* renamed from: d */
        final int f15259d;

        public Response() {
            this.f15259d = 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Response(int i, Status status, List<UsageInfo> list, String[] strArr) {
            this.f15259d = i;
            this.f15256a = status;
            this.f15257b = list;
            this.f15258c = strArr;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f15256a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C3959g c3959g = CREATOR;
            C3959g.m25911a(this, parcel, i);
        }
    }
}
