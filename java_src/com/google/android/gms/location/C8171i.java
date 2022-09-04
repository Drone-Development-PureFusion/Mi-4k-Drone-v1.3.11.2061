package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.location.i */
/* loaded from: classes2.dex */
public class C8171i {

    /* renamed from: a */
    private final int f26729a;

    /* renamed from: b */
    private final int f26730b;

    /* renamed from: c */
    private final List<AbstractC8167f> f26731c;

    /* renamed from: d */
    private final Location f26732d;

    private C8171i(int i, int i2, List<AbstractC8167f> list, Location location) {
        this.f26729a = i;
        this.f26730b = i2;
        this.f26731c = list;
        this.f26732d = location;
    }

    /* renamed from: a */
    public static C8171i m12557a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new C8171i(intent.getIntExtra("gms_error_code", -1), m12555b(intent), m12553c(intent), (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: b */
    private static int m12555b(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra == -1) {
            return -1;
        }
        if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
            return -1;
        }
        return intExtra;
    }

    /* renamed from: c */
    private static List<AbstractC8167f> m12553c(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ParcelableGeofence.m12530a((byte[]) it2.next()));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public boolean m12558a() {
        return this.f26729a != -1;
    }

    /* renamed from: b */
    public int m12556b() {
        return this.f26729a;
    }

    /* renamed from: c */
    public int m12554c() {
        return this.f26730b;
    }

    /* renamed from: d */
    public List<AbstractC8167f> m12552d() {
        return this.f26731c;
    }

    /* renamed from: e */
    public Location m12551e() {
        return this.f26732d;
    }
}
