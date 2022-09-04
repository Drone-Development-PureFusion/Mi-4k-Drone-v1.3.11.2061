package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.clearcut.C4456b;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7655ri;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final C4463d CREATOR = new C4463d();

    /* renamed from: a */
    public final int f16698a;

    /* renamed from: b */
    public PlayLoggerContext f16699b;

    /* renamed from: c */
    public byte[] f16700c;

    /* renamed from: d */
    public int[] f16701d;

    /* renamed from: e */
    public String[] f16702e;

    /* renamed from: f */
    public int[] f16703f;

    /* renamed from: g */
    public byte[][] f16704g;

    /* renamed from: h */
    public boolean f16705h;

    /* renamed from: i */
    public final AbstractC7655ri.C7659d f16706i;

    /* renamed from: j */
    public final C4456b.AbstractC4460c f16707j;

    /* renamed from: k */
    public final C4456b.AbstractC4460c f16708k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogEventParcelable(int i, PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z) {
        this.f16698a = i;
        this.f16699b = playLoggerContext;
        this.f16700c = bArr;
        this.f16701d = iArr;
        this.f16702e = strArr;
        this.f16706i = null;
        this.f16707j = null;
        this.f16708k = null;
        this.f16703f = iArr2;
        this.f16704g = bArr2;
        this.f16705h = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, AbstractC7655ri.C7659d c7659d, C4456b.AbstractC4460c abstractC4460c, C4456b.AbstractC4460c abstractC4460c2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.f16698a = 1;
        this.f16699b = playLoggerContext;
        this.f16706i = c7659d;
        this.f16707j = abstractC4460c;
        this.f16708k = abstractC4460c2;
        this.f16701d = iArr;
        this.f16702e = strArr;
        this.f16703f = iArr2;
        this.f16704g = bArr;
        this.f16705h = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.f16698a == logEventParcelable.f16698a && C4585c.m23634a(this.f16699b, logEventParcelable.f16699b) && Arrays.equals(this.f16700c, logEventParcelable.f16700c) && Arrays.equals(this.f16701d, logEventParcelable.f16701d) && Arrays.equals(this.f16702e, logEventParcelable.f16702e) && C4585c.m23634a(this.f16706i, logEventParcelable.f16706i) && C4585c.m23634a(this.f16707j, logEventParcelable.f16707j) && C4585c.m23634a(this.f16708k, logEventParcelable.f16708k) && Arrays.equals(this.f16703f, logEventParcelable.f16703f) && Arrays.deepEquals(this.f16704g, logEventParcelable.f16704g) && this.f16705h == logEventParcelable.f16705h;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f16698a), this.f16699b, this.f16700c, this.f16701d, this.f16702e, this.f16706i, this.f16707j, this.f16708k, this.f16703f, this.f16704g, Boolean.valueOf(this.f16705h));
    }

    public String toString() {
        return "LogEventParcelable[" + this.f16698a + ", " + this.f16699b + ", LogEventBytes: " + (this.f16700c == null ? null : new String(this.f16700c)) + ", TestCodes: " + Arrays.toString(this.f16701d) + ", MendelPackages: " + Arrays.toString(this.f16702e) + ", LogEvent: " + this.f16706i + ", ExtensionProducer: " + this.f16707j + ", VeProducer: " + this.f16708k + ", ExperimentIDs: " + Arrays.toString(this.f16703f) + ", ExperimentTokens: " + Arrays.toString(this.f16704g) + ", AddPhenotypeExperimentTokens: " + this.f16705h + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4463d.m24051a(this, parcel, i);
    }
}
