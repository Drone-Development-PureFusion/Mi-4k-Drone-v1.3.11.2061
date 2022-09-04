package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7316kt;
import com.google.firebase.C9751b;
import com.google.firebase.database.AbstractC9878j;
/* renamed from: com.google.android.gms.internal.id */
/* loaded from: classes2.dex */
public class C7149id extends C7146ic {
    /* renamed from: a */
    public synchronized void m15383a(C9751b c9751b) {
        this.f24058j = c9751b;
    }

    /* renamed from: a */
    public synchronized void m15382a(AbstractC9878j.EnumC9879a enumC9879a) {
        e();
        switch (enumC9879a) {
            case DEBUG:
                this.f24055g = AbstractC7316kt.EnumC7317a.DEBUG;
                break;
            case INFO:
                this.f24055g = AbstractC7316kt.EnumC7317a.INFO;
                break;
            case WARN:
                this.f24055g = AbstractC7316kt.EnumC7317a.WARN;
                break;
            case ERROR:
                this.f24055g = AbstractC7316kt.EnumC7317a.ERROR;
                break;
            case NONE:
                this.f24055g = AbstractC7316kt.EnumC7317a.NONE;
                break;
            default:
                String valueOf = String.valueOf(enumC9879a);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown log level: ").append(valueOf).toString());
        }
    }

    /* renamed from: a */
    public synchronized void m15381a(boolean z) {
        e();
        this.f24056h = z;
    }

    /* renamed from: c */
    public synchronized void m15380c(String str) {
        e();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f24053e = str;
    }
}
