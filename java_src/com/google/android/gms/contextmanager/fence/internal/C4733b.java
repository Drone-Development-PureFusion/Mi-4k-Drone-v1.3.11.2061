package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7606pw;
import com.google.android.gms.internal.C7715sw;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.b */
/* loaded from: classes2.dex */
public class C4733b {

    /* renamed from: a */
    private final C7606pw f17391a;

    public C4733b(C7606pw c7606pw) {
        this.f17391a = (C7606pw) C4588d.m23627a(c7606pw);
    }

    /* renamed from: a */
    public static C4733b m22937a() {
        return new C4733b(m22935a(2, 3000L, 0));
    }

    /* renamed from: a */
    public static C4733b m22936a(int i) {
        return new C4733b(m22935a(1, 0L, i));
    }

    /* renamed from: a */
    private static C7606pw m22935a(int i, long j, int i2) {
        C7606pw c7606pw = new C7606pw();
        c7606pw.f25218a = i;
        c7606pw.f25219b = j;
        switch (i) {
            case 1:
            case 2:
            case 3:
                c7606pw.f25220c = i2;
                break;
            case 4:
            case 5:
            case 6:
                c7606pw.f25221d = i2;
                break;
            case 7:
            case 8:
            case 9:
                c7606pw.f25222e = i2;
                break;
            case 10:
            case 11:
            case 12:
                c7606pw.f25223f = i2;
                break;
            case 13:
            case 14:
            case 15:
                c7606pw.f25224g = i2;
                break;
            case 16:
            case 17:
            case 18:
                c7606pw.f25225h = i2;
                break;
            default:
                C7715sw.m13665a("AudioStateFenceStub", "Unknown trigger type=%s", Integer.valueOf(i));
                break;
        }
        return c7606pw;
    }

    /* renamed from: b */
    public static C4733b m22934b() {
        return new C4733b(m22935a(3, 3000L, 0));
    }

    /* renamed from: c */
    public C7606pw m22933c() {
        return this.f17391a;
    }
}
