package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C8325w();

    /* renamed from: a */
    final int f26900a;

    /* renamed from: b */
    private final String f26901b;

    /* renamed from: c */
    private final String f26902c;

    /* renamed from: d */
    private final String f26903d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceReport(int i, String str, String str2, String str3) {
        this.f26900a = i;
        this.f26901b = str;
        this.f26902c = str2;
        this.f26903d = str3;
    }

    /* renamed from: a */
    public static PlaceReport m12335a(String str, String str2) {
        return m12334a(str, str2, "unknown");
    }

    /* renamed from: a */
    public static PlaceReport m12334a(String str, String str2, String str3) {
        C4588d.m23627a(str);
        C4588d.m23625a(str2);
        C4588d.m23625a(str3);
        C4588d.m23618b(m12336a(str3), "Invalid source");
        return new PlaceReport(1, str, str2, str3);
    }

    /* renamed from: a */
    private static boolean m12336a(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1436706272:
                if (str.equals("inferredGeofencing")) {
                    c = 2;
                    break;
                }
                break;
            case -1194968642:
                if (str.equals("userReported")) {
                    c = 1;
                    break;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c = 0;
                    break;
                }
                break;
            case -262743844:
                if (str.equals("inferredReverseGeocoding")) {
                    c = 4;
                    break;
                }
                break;
            case 1164924125:
                if (str.equals("inferredSnappedToRoad")) {
                    c = 5;
                    break;
                }
                break;
            case 1287171955:
                if (str.equals("inferredRadioSignals")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String m12337a() {
        return this.f26901b;
    }

    /* renamed from: b */
    public String m12333b() {
        return this.f26902c;
    }

    /* renamed from: c */
    public String m12332c() {
        return this.f26903d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C4585c.m23634a(this.f26901b, placeReport.f26901b) && C4585c.m23634a(this.f26902c, placeReport.f26902c) && C4585c.m23634a(this.f26903d, placeReport.f26903d);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f26901b, this.f26902c, this.f26903d);
    }

    public String toString() {
        C4585c.C4587a m23635a = C4585c.m23635a(this);
        m23635a.m23632a("placeId", this.f26901b);
        m23635a.m23632a("tag", this.f26902c);
        if (!"unknown".equals(this.f26903d)) {
            m23635a.m23632a("source", this.f26903d);
        }
        return m23635a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8325w.m12058a(this, parcel, i);
    }
}
