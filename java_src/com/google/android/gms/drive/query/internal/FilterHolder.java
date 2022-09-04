package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;
/* loaded from: classes2.dex */
public class FilterHolder extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FilterHolder> CREATOR = new C5039d();

    /* renamed from: a */
    final int f18070a;

    /* renamed from: b */
    final ComparisonFilter<?> f18071b;

    /* renamed from: c */
    final FieldOnlyFilter f18072c;

    /* renamed from: d */
    final LogicalFilter f18073d;

    /* renamed from: e */
    final NotFilter f18074e;

    /* renamed from: f */
    final InFilter<?> f18075f;

    /* renamed from: g */
    final MatchAllFilter f18076g;

    /* renamed from: h */
    final HasFilter f18077h;

    /* renamed from: i */
    final FullTextSearchFilter f18078i;

    /* renamed from: j */
    final OwnedByMeFilter f18079j;

    /* renamed from: k */
    private final Filter f18080k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FilterHolder(int i, ComparisonFilter<?> comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> inFilter, MatchAllFilter matchAllFilter, HasFilter<?> hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.f18070a = i;
        this.f18071b = comparisonFilter;
        this.f18072c = fieldOnlyFilter;
        this.f18073d = logicalFilter;
        this.f18074e = notFilter;
        this.f18075f = inFilter;
        this.f18076g = matchAllFilter;
        this.f18077h = hasFilter;
        this.f18078i = fullTextSearchFilter;
        this.f18079j = ownedByMeFilter;
        if (this.f18071b != null) {
            this.f18080k = this.f18071b;
        } else if (this.f18072c != null) {
            this.f18080k = this.f18072c;
        } else if (this.f18073d != null) {
            this.f18080k = this.f18073d;
        } else if (this.f18074e != null) {
            this.f18080k = this.f18074e;
        } else if (this.f18075f != null) {
            this.f18080k = this.f18075f;
        } else if (this.f18076g != null) {
            this.f18080k = this.f18076g;
        } else if (this.f18077h != null) {
            this.f18080k = this.f18077h;
        } else if (this.f18078i != null) {
            this.f18080k = this.f18078i;
        } else if (this.f18079j == null) {
            throw new IllegalArgumentException("At least one filter must be set.");
        } else {
            this.f18080k = this.f18079j;
        }
    }

    public FilterHolder(Filter filter) {
        C4588d.m23626a(filter, "Null filter.");
        this.f18070a = 2;
        this.f18071b = filter instanceof ComparisonFilter ? (ComparisonFilter) filter : null;
        this.f18072c = filter instanceof FieldOnlyFilter ? (FieldOnlyFilter) filter : null;
        this.f18073d = filter instanceof LogicalFilter ? (LogicalFilter) filter : null;
        this.f18074e = filter instanceof NotFilter ? (NotFilter) filter : null;
        this.f18075f = filter instanceof InFilter ? (InFilter) filter : null;
        this.f18076g = filter instanceof MatchAllFilter ? (MatchAllFilter) filter : null;
        this.f18077h = filter instanceof HasFilter ? (HasFilter) filter : null;
        this.f18078i = filter instanceof FullTextSearchFilter ? (FullTextSearchFilter) filter : null;
        this.f18079j = filter instanceof OwnedByMeFilter ? (OwnedByMeFilter) filter : null;
        if (this.f18071b == null && this.f18072c == null && this.f18073d == null && this.f18074e == null && this.f18075f == null && this.f18076g == null && this.f18077h == null && this.f18078i == null && this.f18079j == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.f18080k = filter;
    }

    /* renamed from: a */
    public Filter m22007a() {
        return this.f18080k;
    }

    public String toString() {
        return String.format("FilterHolder[%s]", this.f18080k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5039d.m21991a(this, parcel, i);
    }
}
