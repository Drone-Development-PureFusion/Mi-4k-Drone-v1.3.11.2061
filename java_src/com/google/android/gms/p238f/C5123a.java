package com.google.android.gms.p238f;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.C4656l;
import com.google.android.gms.common.internal.C4588d;
import java.lang.reflect.Method;
/* renamed from: com.google.android.gms.f.a */
/* loaded from: classes2.dex */
public class C5123a {

    /* renamed from: a */
    public static final String f18209a = "GmsCore_OpenSSL";

    /* renamed from: b */
    private static final C4648j f18210b = C4648j.m23370b();

    /* renamed from: c */
    private static final Object f18211c = new Object();

    /* renamed from: d */
    private static Method f18212d = null;

    /* renamed from: com.google.android.gms.f.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5125a {
        /* renamed from: a */
        void m21773a();

        /* renamed from: a */
        void m21772a(int i, Intent intent);
    }

    /* renamed from: a */
    public static void m21778a(Context context) {
        C4588d.m23626a(context, "Context must not be null");
        f18210b.m23363d(context);
        Context m23329l = C4656l.m23329l(context);
        if (m23329l == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new C4516c(8);
        }
        synchronized (f18211c) {
            try {
                if (f18212d == null) {
                    m21776b(m23329l);
                }
                f18212d.invoke(null, m23329l);
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new String("Failed to install provider: "));
                throw new C4516c(8);
            }
        }
    }

    /* renamed from: a */
    public static void m21777a(final Context context, final AbstractC5125a abstractC5125a) {
        C4588d.m23626a(context, "Context must not be null");
        C4588d.m23626a(abstractC5125a, "Listener must not be null");
        C4588d.m23620b("Must be called on the UI thread");
        new AsyncTask<Void, Void, Integer>() { // from class: com.google.android.gms.f.a.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Integer doInBackground(Void... voidArr) {
                try {
                    C5123a.m21778a(context);
                    return 0;
                } catch (C4516c e) {
                    return Integer.valueOf(e.f16879a);
                } catch (C4517d e2) {
                    return Integer.valueOf(e2.m23905a());
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Integer num) {
                if (num.intValue() == 0) {
                    abstractC5125a.m21773a();
                    return;
                }
                abstractC5125a.m21772a(num.intValue(), C5123a.f18210b.mo23372a(context, num.intValue(), "pi"));
            }
        }.execute(new Void[0]);
    }

    /* renamed from: b */
    private static void m21776b(Context context) {
        f18212d = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
    }
}
