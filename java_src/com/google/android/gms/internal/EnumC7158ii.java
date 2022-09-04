package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7316kt;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ii */
/* loaded from: classes2.dex */
public enum EnumC7158ii implements AbstractC7163il {
    INSTANCE;

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7103hr mo15351a(C7146ic c7146ic, C7099hn c7099hn, C7101hp c7101hp, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        return new C7105hs(c7146ic.m15403i(), c7101hp, abstractC7104a);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7136hy mo15348a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7153ig mo15352a(C7146ic c7146ic) {
        return new C7232ix(Executors.defaultThreadFactory(), AbstractC7230iw.f24286a);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7257jp mo15349a(C7146ic c7146ic, String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7316kt mo15350a(C7146ic c7146ic, AbstractC7316kt.EnumC7317a enumC7317a, List<String> list) {
        return new C7313kr(enumC7317a, list);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: b */
    public AbstractC7199ip mo15347b(C7146ic c7146ic) {
        final C7315ks m15413a = c7146ic.m15413a("RunLoop");
        return new AbstractC7383me() { // from class: com.google.android.gms.internal.ii.1
            @Override // com.google.android.gms.internal.AbstractC7383me
            /* renamed from: a */
            public void mo14627a(Throwable th) {
                m15413a.m14842a(AbstractC7383me.m14625b(th), th);
            }
        };
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: c */
    public String mo15346c(C7146ic c7146ic) {
        String property = System.getProperty("java.vm.name", "Unknown JVM");
        String property2 = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder(String.valueOf(property2).length() + 1 + String.valueOf(property).length()).append(property2).append("/").append(property).toString();
    }
}
