package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.AbstractC4662a<String, Integer> {
    public static final C4660b CREATOR = new C4660b();

    /* renamed from: a */
    private final int f17195a;

    /* renamed from: b */
    private final HashMap<String, Integer> f17196b;

    /* renamed from: c */
    private final SparseArray<String> f17197c;

    /* renamed from: d */
    private final ArrayList<Entry> f17198d;

    /* loaded from: classes2.dex */
    public static final class Entry extends AbstractSafeParcelable {
        public static final C4661c CREATOR = new C4661c();

        /* renamed from: a */
        final int f17199a;

        /* renamed from: b */
        final String f17200b;

        /* renamed from: c */
        final int f17201c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Entry(int i, String str, int i2) {
            this.f17199a = i;
            this.f17200b = str;
            this.f17201c = i2;
        }

        Entry(String str, int i) {
            this.f17199a = 1;
            this.f17200b = str;
            this.f17201c = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4661c c4661c = CREATOR;
            C4661c.m23299a(this, parcel, i);
        }
    }

    public StringToIntConverter() {
        this.f17195a = 1;
        this.f17196b = new HashMap<>();
        this.f17197c = new SparseArray<>();
        this.f17198d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringToIntConverter(int i, ArrayList<Entry> arrayList) {
        this.f17195a = i;
        this.f17196b = new HashMap<>();
        this.f17197c = new SparseArray<>();
        this.f17198d = null;
        m23309a(arrayList);
    }

    /* renamed from: a */
    private void m23309a(ArrayList<Entry> arrayList) {
        Iterator<Entry> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Entry next = it2.next();
            m23310a(next.f17200b, next.f17201c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m23312a() {
        return this.f17195a;
    }

    /* renamed from: a */
    public StringToIntConverter m23310a(String str, int i) {
        this.f17196b.put(str, Integer.valueOf(i));
        this.f17197c.put(i, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.AbstractC4662a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public String mo23270a(Integer num) {
        String str = this.f17197c.get(num.intValue());
        return (str != null || !this.f17196b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<Entry> m23308b() {
        ArrayList<Entry> arrayList = new ArrayList<>();
        for (String str : this.f17196b.keySet()) {
            arrayList.add(new Entry(str, this.f17196b.get(str).intValue()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.AbstractC4662a
    /* renamed from: c */
    public int mo23269c() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.AbstractC4662a
    /* renamed from: d */
    public int mo23268d() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4660b c4660b = CREATOR;
        C4660b.m23302a(this, parcel, i);
    }
}
