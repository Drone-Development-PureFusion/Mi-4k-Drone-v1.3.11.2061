package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class InterestUpdateBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InterestUpdateBatchImpl> CREATOR = new C4782j();

    /* renamed from: a */
    private final int f17425a;

    /* renamed from: b */
    private final ArrayList<Operation> f17426b;

    /* loaded from: classes2.dex */
    public static class Operation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Operation> CREATOR = new C4783k();

        /* renamed from: a */
        private final int f17427a;

        /* renamed from: b */
        private final int f17428b;

        /* renamed from: c */
        private final InterestRecordStub f17429c;

        /* renamed from: d */
        private final String f17430d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Operation(int i, int i2, InterestRecordStub interestRecordStub, String str) {
            this.f17427a = i;
            this.f17428b = i2;
            this.f17429c = interestRecordStub;
            this.f17430d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m22855a() {
            return this.f17427a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public InterestRecordStub m22854b() {
            return this.f17429c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public String m22853c() {
            return this.f17430d;
        }

        /* renamed from: d */
        public int m22852d() {
            return this.f17428b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4783k.m22771a(this, parcel, i);
        }
    }

    public InterestUpdateBatchImpl() {
        this.f17425a = 1;
        this.f17426b = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterestUpdateBatchImpl(int i, ArrayList<Operation> arrayList) {
        this.f17425a = i;
        this.f17426b = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22857a() {
        return this.f17425a;
    }

    /* renamed from: b */
    public ArrayList<Operation> m22856b() {
        return this.f17426b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4782j.m22774a(this, parcel, i);
    }
}
