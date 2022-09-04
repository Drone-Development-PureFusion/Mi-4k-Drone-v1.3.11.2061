package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7316kt;
import com.google.firebase.C9751b;
import com.google.firebase.database.C9866d;
import com.google.firebase.database.C9874g;
import com.google.firebase.database.connection.idl.C9843c;
import com.google.firebase.database.connection.idl.ConnectionConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: com.google.android.gms.internal.gw */
/* loaded from: classes2.dex */
public class C7058gw implements AbstractC7163il {

    /* renamed from: a */
    private final Context f23822a;

    /* renamed from: b */
    private final Set<String> f23823b = new HashSet();

    /* renamed from: c */
    private final C9751b f23824c;

    public C7058gw(C9751b c9751b) {
        this.f23824c = c9751b;
        if (this.f23824c != null) {
            this.f23822a = this.f23824c.m7224a();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7103hr mo15351a(C7146ic c7146ic, C7099hn c7099hn, C7101hp c7101hp, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        final C9843c m6813a = C9843c.m6813a(this.f23822a, new ConnectionConfig(c7101hp, c7146ic.m15405g(), c7146ic.m15406f(), c7146ic.m15402j(), C9874g.m6731g(), c7146ic.m15398n()), c7099hn, abstractC7104a);
        this.f23824c.m7217a(new C9751b.AbstractC9753b() { // from class: com.google.android.gms.internal.gw.2
            @Override // com.google.firebase.C9751b.AbstractC9753b
            /* renamed from: a */
            public void mo7159a(boolean z) {
                if (z) {
                    m6813a.mo6799d("app_in_background");
                } else {
                    m6813a.mo6798e("app_in_background");
                }
            }
        });
        return m6813a;
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7136hy mo15348a(ScheduledExecutorService scheduledExecutorService) {
        return new C7052gu(this.f23824c, scheduledExecutorService);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7153ig mo15352a(C7146ic c7146ic) {
        return new C7057gv();
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7257jp mo15349a(C7146ic c7146ic, String str) {
        String m15397o = c7146ic.m15397o();
        String sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(m15397o).length()).append(str).append("_").append(m15397o).toString();
        if (this.f23823b.contains(sb)) {
            throw new C9866d(new StringBuilder(String.valueOf(m15397o).length() + 47).append("SessionPersistenceKey '").append(m15397o).append("' has already been used.").toString());
        }
        this.f23823b.add(sb);
        return new C7254jm(c7146ic, new C7062gx(this.f23822a, c7146ic, sb), new C7255jn(c7146ic.m15401k()));
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7316kt mo15350a(C7146ic c7146ic, AbstractC7316kt.EnumC7317a enumC7317a, List<String> list) {
        return new C7312kq(enumC7317a, list);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: b */
    public AbstractC7199ip mo15347b(C7146ic c7146ic) {
        final C7315ks m15413a = c7146ic.m15413a("RunLoop");
        return new AbstractC7383me() { // from class: com.google.android.gms.internal.gw.1
            @Override // com.google.android.gms.internal.AbstractC7383me
            /* renamed from: a */
            public void mo14627a(final Throwable th) {
                final String m14625b = AbstractC7383me.m14625b(th);
                m15413a.m14842a(m14625b, th);
                new Handler(C7058gw.this.f23822a.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.gw.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException(m14625b, th);
                    }
                });
                e().shutdownNow();
            }
        };
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: c */
    public String mo15346c(C7146ic c7146ic) {
        return new StringBuilder(19).append(Build.VERSION.SDK_INT).append("/Android").toString();
    }
}
