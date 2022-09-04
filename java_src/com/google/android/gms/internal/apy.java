package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.apf;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
public final class apy extends apf.AbstractBinderC6709a {

    /* renamed from: a */
    private final Map<String, aoq> f22833a;

    /* renamed from: b */
    private final ExecutorService f22834b;

    /* renamed from: c */
    private final aor f22835c;

    /* renamed from: d */
    private final AbstractC9042aj f22836d;

    public apy(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        this(abstractC9042aj, new aor(context, abstractC9042aj, abstractC9032af), apz.m16245a());
    }

    apy(AbstractC9042aj abstractC9042aj, aor aorVar, ExecutorService executorService) {
        this.f22833a = new HashMap(1);
        C4588d.m23627a(abstractC9042aj);
        this.f22836d = abstractC9042aj;
        this.f22835c = aorVar;
        this.f22834b = executorService;
    }

    @Override // com.google.android.gms.internal.apf
    /* renamed from: a */
    public void mo16252a() {
        this.f22833a.clear();
    }

    @Override // com.google.android.gms.internal.apf
    /* renamed from: a */
    public void mo16250a(String str, Bundle bundle, String str2, long j, boolean z) {
        final aow aowVar = new aow(str, bundle, str2, new Date(j), z, this.f22836d);
        this.f22834b.execute(new Runnable() { // from class: com.google.android.gms.internal.apy.2
            @Override // java.lang.Runnable
            public void run() {
                if (apy.this.f22833a.isEmpty()) {
                    aph.m16396a("TagManagerBackend emit called without loaded container.");
                    return;
                }
                for (aoq aoqVar : apy.this.f22833a.values()) {
                    aoqVar.m16458a(aowVar);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.apf
    /* renamed from: a */
    public void mo16249a(String str, @Nullable String str2, @Nullable String str3) {
        mo16248a(str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.apf
    /* renamed from: a */
    public void mo16248a(final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final ape apeVar) {
        this.f22834b.execute(new Runnable() { // from class: com.google.android.gms.internal.apy.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z = true;
                try {
                    if (!apy.this.f22833a.containsKey(str)) {
                        apy.this.f22833a.put(str, apy.this.f22835c.m16445a(str, str2, str3));
                    }
                } catch (Throwable th) {
                    z = false;
                }
                try {
                    if (apeVar == null) {
                        return;
                    }
                    apeVar.mo16254a(z, str);
                } catch (RemoteException e) {
                    aph.m16395a("Error relaying callback", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.apf
    /* renamed from: b */
    public void mo16247b() {
        this.f22834b.execute(new Runnable() { // from class: com.google.android.gms.internal.apy.3
            @Override // java.lang.Runnable
            public void run() {
                if (apy.this.f22833a.isEmpty()) {
                    aph.m16394b("TagManagerBackend dispatch called without loaded container.");
                    return;
                }
                for (aoq aoqVar : apy.this.f22833a.values()) {
                    aoqVar.m16466a();
                }
            }
        });
    }
}
