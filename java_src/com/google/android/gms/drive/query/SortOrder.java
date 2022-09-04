package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.AbstractC4995e;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class SortOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SortOrder> CREATOR = new C5034e();

    /* renamed from: a */
    final List<FieldWithSortOrder> f18037a;

    /* renamed from: b */
    final boolean f18038b;

    /* renamed from: c */
    final int f18039c;

    /* renamed from: com.google.android.gms.drive.query.SortOrder$a */
    /* loaded from: classes2.dex */
    public static class C5029a {

        /* renamed from: a */
        private final List<FieldWithSortOrder> f18040a = new ArrayList();

        /* renamed from: b */
        private boolean f18041b = false;

        /* renamed from: a */
        public C5029a m22041a(AbstractC4995e abstractC4995e) {
            this.f18040a.add(new FieldWithSortOrder(abstractC4995e.a(), true));
            return this;
        }

        /* renamed from: a */
        public SortOrder m22042a() {
            return new SortOrder((List) this.f18040a, false);
        }

        /* renamed from: b */
        public C5029a m22040b(AbstractC4995e abstractC4995e) {
            this.f18040a.add(new FieldWithSortOrder(abstractC4995e.a(), false));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortOrder(int i, List<FieldWithSortOrder> list, boolean z) {
        this.f18039c = i;
        this.f18037a = list;
        this.f18038b = z;
    }

    private SortOrder(List<FieldWithSortOrder> list, boolean z) {
        this(1, list, z);
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f18037a), Boolean.valueOf(this.f18038b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5034e.m22018a(this, parcel, i);
    }
}
