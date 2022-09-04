package com.google.android.gms.contextmanager.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.awareness.C4090b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.common.util.C4681d;
import com.google.android.gms.internal.C7705ss;
/* loaded from: classes2.dex */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextManagerClientInfo> CREATOR = new C4765e();

    /* renamed from: a */
    private final int f17414a;

    /* renamed from: b */
    private final String f17415b;

    /* renamed from: c */
    private final String f17416c;

    /* renamed from: d */
    private final int f17417d;

    /* renamed from: e */
    private final String f17418e;

    /* renamed from: f */
    private final int f17419f;

    /* renamed from: g */
    private final int f17420g;

    /* renamed from: h */
    private final String f17421h;

    /* renamed from: i */
    private final String f17422i;

    /* renamed from: j */
    private final int f17423j;

    /* renamed from: k */
    private C7705ss f17424k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContextManagerClientInfo(int i, String str, String str2, int i2, String str3, int i3, int i4, String str4, String str5, int i5) {
        this.f17414a = i;
        this.f17415b = str;
        this.f17416c = str2;
        this.f17417d = i2;
        this.f17418e = str3;
        this.f17419f = i3;
        this.f17420g = i4;
        this.f17421h = str4;
        this.f17422i = str5;
        this.f17423j = i5;
    }

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4) {
        this(1, C4588d.m23625a(str), C4588d.m23625a(str2), i, C4588d.m23625a(str3), i2, i3, str4, str5, i4);
    }

    /* renamed from: a */
    public static ContextManagerClientInfo m22871a(Context context, String str) {
        return new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), context.getPackageName(), C4681d.m23156a(context, context.getPackageName()), 3, null, null, -1);
    }

    /* renamed from: a */
    public static ContextManagerClientInfo m22870a(Context context, String str, C4090b c4090b) {
        return new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), c4090b.m25515a(), C4681d.m23156a(context, context.getPackageName()), c4090b.m25513b(), c4090b.m25512c(), c4090b.m25511d(), c4090b.m25510e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22872a() {
        return this.f17414a;
    }

    /* renamed from: b */
    public String m22869b() {
        return this.f17415b;
    }

    /* renamed from: c */
    public C7705ss m22868c() {
        if (this.f17415b == null) {
            return null;
        }
        if (this.f17424k == null) {
            this.f17424k = new C7705ss(this.f17415b);
        }
        return this.f17424k;
    }

    /* renamed from: d */
    public String m22867d() {
        return this.f17416c;
    }

    /* renamed from: e */
    public int m22866e() {
        return this.f17417d;
    }

    /* renamed from: f */
    public String m22865f() {
        return this.f17418e;
    }

    /* renamed from: g */
    public int m22864g() {
        return this.f17419f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m22863h() {
        return this.f17420g;
    }

    /* renamed from: i */
    public String m22862i() {
        return this.f17421h;
    }

    /* renamed from: j */
    public String m22861j() {
        return this.f17422i;
    }

    /* renamed from: k */
    public int m22860k() {
        return this.f17423j;
    }

    /* renamed from: l */
    public String m22859l() {
        switch (this.f17420g) {
            case 0:
                return "0P";
            case 1:
                return "1P";
            case 2:
            default:
                return "unknownPartyType";
            case 3:
                return "3P";
        }
    }

    /* renamed from: m */
    public byte[] m22858m() {
        return C4631c.m23444a(this);
    }

    public String toString() {
        String valueOf = String.valueOf(m22868c());
        String valueOf2 = String.valueOf(m22867d());
        int m22866e = m22866e();
        String valueOf3 = String.valueOf(m22865f());
        int m22864g = m22864g();
        String valueOf4 = String.valueOf(m22859l());
        String valueOf5 = String.valueOf(m22862i());
        String valueOf6 = String.valueOf(m22861j());
        return new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length()).append("(account=").append(valueOf).append(", ").append(valueOf2).append("(").append(m22866e).append("):").append(valueOf3).append(", version=").append(m22864g).append(", ").append(valueOf4).append(", thirdPartyPackageName = ").append(valueOf5).append(" ,  thirdPartyModuleId = ").append(valueOf6).append(")").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4765e.m22805a(this, parcel, i);
    }
}
