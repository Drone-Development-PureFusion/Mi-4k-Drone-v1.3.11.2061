package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7316kt;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.kr */
/* loaded from: classes2.dex */
public class C7313kr implements AbstractC7316kt {

    /* renamed from: a */
    private final Set<String> f24470a;

    /* renamed from: b */
    private final AbstractC7316kt.EnumC7317a f24471b;

    public C7313kr(AbstractC7316kt.EnumC7317a enumC7317a, List<String> list) {
        if (list != null) {
            this.f24470a = new HashSet(list);
        } else {
            this.f24470a = null;
        }
        this.f24471b = enumC7317a;
    }

    @Override // com.google.android.gms.internal.AbstractC7316kt
    /* renamed from: a */
    public AbstractC7316kt.EnumC7317a mo14834a() {
        return this.f24471b;
    }

    /* renamed from: a */
    protected String mo14849a(AbstractC7316kt.EnumC7317a enumC7317a, String str, String str2, long j) {
        String valueOf = String.valueOf(new Date(j).toString());
        String valueOf2 = String.valueOf(enumC7317a);
        return new StringBuilder(String.valueOf(valueOf).length() + 6 + String.valueOf(valueOf2).length() + String.valueOf(str).length() + String.valueOf(str2).length()).append(valueOf).append(" [").append(valueOf2).append("] ").append(str).append(": ").append(str2).toString();
    }

    /* renamed from: a */
    protected void mo14848a(String str, String str2) {
        System.err.println(str2);
    }

    /* renamed from: a */
    protected boolean m14850a(AbstractC7316kt.EnumC7317a enumC7317a, String str) {
        return enumC7317a.ordinal() >= this.f24471b.ordinal() && (this.f24470a == null || enumC7317a.ordinal() > AbstractC7316kt.EnumC7317a.DEBUG.ordinal() || this.f24470a.contains(str));
    }

    @Override // com.google.android.gms.internal.AbstractC7316kt
    /* renamed from: b */
    public void mo14833b(AbstractC7316kt.EnumC7317a enumC7317a, String str, String str2, long j) {
        if (m14850a(enumC7317a, str)) {
            String mo14849a = mo14849a(enumC7317a, str, str2, j);
            switch (enumC7317a) {
                case ERROR:
                    mo14848a(str, mo14849a);
                    return;
                case WARN:
                    mo14847b(str, mo14849a);
                    return;
                case INFO:
                    mo14846c(str, mo14849a);
                    return;
                case DEBUG:
                    mo14845d(str, mo14849a);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }

    /* renamed from: b */
    protected void mo14847b(String str, String str2) {
        System.out.println(str2);
    }

    /* renamed from: c */
    protected void mo14846c(String str, String str2) {
        System.out.println(str2);
    }

    /* renamed from: d */
    protected void mo14845d(String str, String str2) {
        System.out.println(str2);
    }
}
