package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7605pv;
import com.google.android.gms.internal.C7606pw;
import com.google.android.gms.internal.C7607px;
import com.google.android.gms.internal.C7612qa;
import com.google.android.gms.internal.C7625qh;
import com.google.android.gms.internal.C7626qi;
import com.google.android.gms.internal.C7628qk;
import com.google.android.gms.internal.C7629ql;
import com.google.android.gms.internal.C7630qm;
import com.google.android.gms.internal.C7633qp;
import com.google.android.gms.internal.C7637qt;
import com.google.android.gms.internal.C7638qu;
import com.google.android.gms.internal.C7648rc;
import com.google.android.gms.internal.C7715sw;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes2.dex */
public class ContextFenceStub extends AwarenessFence {
    public static final Parcelable.Creator<ContextFenceStub> CREATOR = new C4742g();

    /* renamed from: a */
    private final int f17361a;

    /* renamed from: b */
    private C7612qa f17362b;

    /* renamed from: c */
    private byte[] f17363c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContextFenceStub(int i, byte[] bArr) {
        this.f17361a = i;
        this.f17362b = null;
        this.f17363c = bArr;
        m22978f();
    }

    public ContextFenceStub(C7612qa c7612qa) {
        this.f17361a = 1;
        this.f17362b = (C7612qa) C4588d.m23627a(c7612qa);
        this.f17363c = null;
        m22978f();
    }

    /* renamed from: a */
    public static ContextFenceStub m22991a(ContextFenceStub contextFenceStub) {
        C4588d.m23627a(contextFenceStub);
        ArrayList arrayList = new ArrayList();
        arrayList.add(contextFenceStub);
        return new ContextFenceStub(m22992a(3, m22979e(arrayList), null, null, null, null, null, null, null, null, null, null, null));
    }

    /* renamed from: a */
    public static ContextFenceStub m22990a(C4732a c4732a) {
        C4588d.m23627a(c4732a);
        return new ContextFenceStub(m22992a(7, null, null, null, null, c4732a.m22941a(), null, null, null, null, null, null, null));
    }

    /* renamed from: a */
    public static ContextFenceStub m22989a(C4733b c4733b) {
        C4588d.m23627a(c4733b);
        return new ContextFenceStub(m22992a(11, null, null, null, null, null, null, null, null, c4733b.m22933c(), null, null, null));
    }

    /* renamed from: a */
    public static ContextFenceStub m22988a(C4737d c4737d) {
        C4588d.m23627a(c4737d);
        return new ContextFenceStub(m22992a(12, null, null, null, null, null, null, null, null, null, c4737d.m22928a(), null, null));
    }

    /* renamed from: a */
    public static ContextFenceStub m22987a(C4751n c4751n) {
        C4588d.m23627a(c4751n);
        return new ContextFenceStub(m22992a(5, null, null, c4751n.m22899a(), null, null, null, null, null, null, null, null, null));
    }

    /* renamed from: a */
    public static ContextFenceStub m22986a(C4753p c4753p) {
        C4588d.m23627a(c4753p);
        return new ContextFenceStub(m22992a(4, null, c4753p.m22891a(), null, null, null, null, null, null, null, null, null, null));
    }

    /* renamed from: a */
    public static C7612qa m22992a(int i, C7612qa[] c7612qaArr, C7637qt c7637qt, C7625qh c7625qh, C7629ql c7629ql, C7605pv c7605pv, C7633qp c7633qp, C7630qm c7630qm, C7628qk c7628qk, C7606pw c7606pw, C7607px c7607px, C7626qi c7626qi, C7638qu c7638qu) {
        C7612qa c7612qa = new C7612qa();
        c7612qa.f25245a = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                c7612qa.f25246b = c7612qaArr;
                break;
            case 4:
                c7612qa.f25247c = c7637qt;
                break;
            case 5:
                c7612qa.f25248d = c7625qh;
                break;
            case 6:
                c7612qa.f25249e = c7629ql;
                break;
            case 7:
                c7612qa.f25250f = c7605pv;
                break;
            case 8:
                c7612qa.f25251g = c7633qp;
                break;
            case 9:
                c7612qa.f25252h = c7630qm;
                break;
            case 10:
                c7612qa.f25253i = c7628qk;
                break;
            case 11:
                c7612qa.f25254j = c7606pw;
                break;
            case 12:
                c7612qa.f25255k = c7607px;
                break;
            case 13:
                c7612qa.f25256l = c7626qi;
                break;
            case 14:
                c7612qa.f25258n = c7638qu;
                break;
            default:
                C7715sw.m13665a("ContextFenceStub", "Unknown context fence type=%s", Integer.valueOf(i));
                break;
        }
        return c7612qa;
    }

    /* renamed from: c */
    public static ContextFenceStub m22983c(Collection<ContextFenceStub> collection) {
        C4588d.m23627a(collection);
        C4588d.m23619b(!collection.isEmpty());
        return new ContextFenceStub(m22992a(1, m22979e(collection), null, null, null, null, null, null, null, null, null, null, null));
    }

    /* renamed from: d */
    public static ContextFenceStub m22981d(Collection<ContextFenceStub> collection) {
        C4588d.m23627a(collection);
        C4588d.m23619b(!collection.isEmpty());
        return new ContextFenceStub(m22992a(2, m22979e(collection), null, null, null, null, null, null, null, null, null, null, null));
    }

    /* renamed from: d */
    private void m22982d() {
        if (!m22980e()) {
            try {
                this.f17362b = C7612qa.m14071a(this.f17363c);
                this.f17363c = null;
            } catch (C7648rc e) {
                C7715sw.m13664a("ContextFenceStub", "Could not deserialize context fence bytes.", (Throwable) e);
                throw new IllegalStateException(e);
            }
        }
        m22978f();
    }

    /* renamed from: e */
    private boolean m22980e() {
        return this.f17362b != null;
    }

    /* renamed from: e */
    private static C7612qa[] m22979e(Collection<ContextFenceStub> collection) {
        C7612qa[] c7612qaArr = new C7612qa[collection.size()];
        int i = 0;
        for (ContextFenceStub contextFenceStub : collection) {
            c7612qaArr[i] = contextFenceStub.m22984c();
            i++;
        }
        return c7612qaArr;
    }

    /* renamed from: f */
    private void m22978f() {
        if (this.f17362b != null || this.f17363c == null) {
            if (this.f17362b != null && this.f17363c == null) {
                return;
            }
            if (this.f17362b != null && this.f17363c != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (this.f17362b != null || this.f17363c != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22993a() {
        return this.f17361a;
    }

    /* renamed from: b */
    public byte[] m22985b() {
        return this.f17363c != null ? this.f17363c : AbstractC7649rd.m13857a(this.f17362b);
    }

    /* renamed from: c */
    public C7612qa m22984c() {
        m22982d();
        return this.f17362b;
    }

    public String toString() {
        m22982d();
        return this.f17362b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4742g.m22917a(this, parcel, i);
    }
}
