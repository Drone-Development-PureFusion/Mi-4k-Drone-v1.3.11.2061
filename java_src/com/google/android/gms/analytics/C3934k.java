package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: com.google.android.gms.analytics.k */
/* loaded from: classes2.dex */
public final class C3934k implements AbstractC3947r {

    /* renamed from: a */
    private static final Uri f15198a;

    /* renamed from: b */
    private final LogPrinter f15199b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f15198a = builder.build();
    }

    @Override // com.google.android.gms.analytics.AbstractC3947r
    /* renamed from: a */
    public Uri mo25960a() {
        return f15198a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3947r
    /* renamed from: a */
    public void mo25959a(C3936l c3936l) {
        ArrayList<AbstractC3938n> arrayList = new ArrayList(c3936l.m25996b());
        Collections.sort(arrayList, new Comparator<AbstractC3938n>() { // from class: com.google.android.gms.analytics.k.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(AbstractC3938n abstractC3938n, AbstractC3938n abstractC3938n2) {
                return abstractC3938n.getClass().getCanonicalName().compareTo(abstractC3938n2.getClass().getCanonicalName());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (AbstractC3938n abstractC3938n : arrayList) {
            String obj = abstractC3938n.toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f15199b.println(sb.toString());
    }
}
