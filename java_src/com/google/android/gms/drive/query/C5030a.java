package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.metadata.AbstractC4992b;
import com.google.android.gms.drive.metadata.AbstractC4993c;
import com.google.android.gms.drive.metadata.AbstractC4994d;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;
/* renamed from: com.google.android.gms.drive.query.a */
/* loaded from: classes2.dex */
public class C5030a {
    /* renamed from: a */
    public static Filter m22039a() {
        return new FieldOnlyFilter(C5031b.f18046e);
    }

    /* renamed from: a */
    public static Filter m22038a(CustomPropertyKey customPropertyKey, String str) {
        C4588d.m23618b(str != null, "Custom property value may not be null.");
        return new HasFilter(C5031b.f18051j, new AppVisibleCustomProperties.C5001a().m22160a(customPropertyKey, str).m22161a());
    }

    /* renamed from: a */
    public static <T> Filter m22037a(AbstractC4992b<T> abstractC4992b, T t) {
        return new InFilter(abstractC4992b, t);
    }

    /* renamed from: a */
    public static <T> Filter m22036a(AbstractC4993c<T> abstractC4993c, T t) {
        return new ComparisonFilter(Operator.f18096a, abstractC4993c, t);
    }

    /* renamed from: a */
    public static Filter m22035a(AbstractC4993c<String> abstractC4993c, String str) {
        return new ComparisonFilter(Operator.f18104i, abstractC4993c, str);
    }

    /* renamed from: a */
    public static <T extends Comparable<T>> Filter m22034a(AbstractC4994d<T> abstractC4994d, T t) {
        return new ComparisonFilter(Operator.f18097b, abstractC4994d, t);
    }

    /* renamed from: a */
    public static Filter m22033a(Filter filter) {
        return new NotFilter(filter);
    }

    /* renamed from: a */
    public static Filter m22032a(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.f18101f, filter, filterArr);
    }

    /* renamed from: a */
    public static Filter m22031a(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.f18101f, iterable);
    }

    /* renamed from: b */
    public static Filter m22030b() {
        return new FieldOnlyFilter(C5031b.f18049h);
    }

    /* renamed from: b */
    public static <T extends Comparable<T>> Filter m22029b(AbstractC4994d<T> abstractC4994d, T t) {
        return new ComparisonFilter(Operator.f18099d, abstractC4994d, t);
    }

    /* renamed from: b */
    public static Filter m22028b(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.f18102g, filter, filterArr);
    }

    /* renamed from: b */
    public static Filter m22027b(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.f18102g, iterable);
    }

    /* renamed from: c */
    public static Filter m22026c() {
        return new OwnedByMeFilter();
    }

    /* renamed from: c */
    public static <T extends Comparable<T>> Filter m22025c(AbstractC4994d<T> abstractC4994d, T t) {
        return new ComparisonFilter(Operator.f18098c, abstractC4994d, t);
    }

    /* renamed from: d */
    public static <T extends Comparable<T>> Filter m22024d(AbstractC4994d<T> abstractC4994d, T t) {
        return new ComparisonFilter(Operator.f18100e, abstractC4994d, t);
    }
}
