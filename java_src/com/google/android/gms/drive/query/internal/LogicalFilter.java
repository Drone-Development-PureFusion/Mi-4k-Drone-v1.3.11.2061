package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class LogicalFilter extends AbstractFilter {
    public static final Parcelable.Creator<LogicalFilter> CREATOR = new C5046k();

    /* renamed from: a */
    final Operator f18089a;

    /* renamed from: b */
    final List<FilterHolder> f18090b;

    /* renamed from: c */
    final int f18091c;

    /* renamed from: d */
    private List<Filter> f18092d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogicalFilter(int i, Operator operator, List<FilterHolder> list) {
        this.f18091c = i;
        this.f18089a = operator;
        this.f18090b = list;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.f18091c = 1;
        this.f18089a = operator;
        this.f18090b = new ArrayList(filterArr.length + 1);
        this.f18090b.add(new FilterHolder(filter));
        this.f18092d = new ArrayList(filterArr.length + 1);
        this.f18092d.add(filter);
        for (Filter filter2 : filterArr) {
            this.f18090b.add(new FilterHolder(filter2));
            this.f18092d.add(filter2);
        }
    }

    public LogicalFilter(Operator operator, Iterable<Filter> iterable) {
        this.f18091c = 1;
        this.f18089a = operator;
        this.f18092d = new ArrayList();
        this.f18090b = new ArrayList();
        for (Filter filter : iterable) {
            this.f18092d.add(filter);
            this.f18090b.add(new FilterHolder(filter));
        }
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <T> T mo22003a(AbstractC5041f<T> abstractC5041f) {
        List<T> arrayList = new ArrayList<>();
        for (FilterHolder filterHolder : this.f18090b) {
            arrayList.add(filterHolder.m22007a().mo22003a(abstractC5041f));
        }
        return abstractC5041f.mo21983a(this.f18089a, arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5046k.m21959a(this, parcel, i);
    }
}
