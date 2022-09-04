package org.p286a.p287a.p306i.p310d;

import java.util.Date;
import org.apache.http.cookie.SetCookie2;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.d.c */
/* loaded from: classes2.dex */
public class C11248c extends C11249d implements SetCookie2 {
    private static final long serialVersionUID = -7744598295706617057L;

    /* renamed from: a */
    private String f36178a;

    /* renamed from: b */
    private int[] f36179b;

    /* renamed from: c */
    private boolean f36180c;

    public C11248c(String str, String str2) {
        super(str, str2);
    }

    @Override // org.p286a.p287a.p306i.p310d.C11249d
    public Object clone() {
        C11248c c11248c = (C11248c) super.clone();
        if (this.f36179b != null) {
            c11248c.f36179b = (int[]) this.f36179b.clone();
        }
        return c11248c;
    }

    @Override // org.p286a.p287a.p306i.p310d.C11249d
    public String getCommentURL() {
        return this.f36178a;
    }

    @Override // org.p286a.p287a.p306i.p310d.C11249d
    public int[] getPorts() {
        return this.f36179b;
    }

    @Override // org.p286a.p287a.p306i.p310d.C11249d
    public boolean isExpired(Date date) {
        return this.f36180c || super.isExpired(date);
    }

    @Override // org.p286a.p287a.p306i.p310d.C11249d
    public boolean isPersistent() {
        return !this.f36180c && super.isPersistent();
    }

    public void setCommentURL(String str) {
        this.f36178a = str;
    }

    public void setDiscard(boolean z) {
        this.f36180c = z;
    }

    public void setPorts(int[] iArr) {
        this.f36179b = iArr;
    }
}
