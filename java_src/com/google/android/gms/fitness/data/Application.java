package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class Application extends AbstractSafeParcelable {

    /* renamed from: b */
    private final int f18369b;

    /* renamed from: c */
    private final String f18370c;

    /* renamed from: d */
    private final String f18371d;

    /* renamed from: e */
    private final String f18372e;

    /* renamed from: a */
    public static final Application f18368a = new Application("com.google.android.gms", null, null);
    public static final Parcelable.Creator<Application> CREATOR = new C5149g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Application(int i, String str, String str2, String str3) {
        this.f18369b = i;
        this.f18370c = (String) C4588d.m23627a(str);
        this.f18371d = "";
        this.f18372e = str3;
    }

    public Application(String str, String str2, String str3) {
        this(1, str, "", str3);
    }

    /* renamed from: a */
    public static Application m21763a(String str) {
        return m21762a(str, null, null);
    }

    /* renamed from: a */
    public static Application m21762a(String str, String str2, String str3) {
        return "com.google.android.gms".equals(str) ? f18368a : new Application(str, str2, str3);
    }

    /* renamed from: a */
    private boolean m21764a(Application application) {
        return this.f18370c.equals(application.f18370c) && C4585c.m23634a(this.f18371d, application.f18371d) && C4585c.m23634a(this.f18372e, application.f18372e);
    }

    /* renamed from: a */
    public String m21765a() {
        return this.f18370c;
    }

    /* renamed from: b */
    public String m21761b() {
        return this.f18371d;
    }

    /* renamed from: c */
    public String m21760c() {
        return this.f18372e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21759d() {
        return this.f18369b;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Application) && m21764a((Application) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18370c, this.f18371d, this.f18372e);
    }

    public String toString() {
        return String.format("Application{%s:%s:%s}", this.f18370c, this.f18371d, this.f18372e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5149g.m21469a(this, parcel, i);
    }
}
