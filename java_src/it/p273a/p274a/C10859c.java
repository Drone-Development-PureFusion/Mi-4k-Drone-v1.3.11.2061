package it.p273a.p274a;

import java.io.IOException;
import java.net.Socket;
/* renamed from: it.a.a.c */
/* loaded from: classes.dex */
class C10859c extends RunnableC10873l {

    /* renamed from: a */
    private final C10855b f34810a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10859c(C10855b c10855b) {
        this.f34810a = c10855b;
    }

    @Override // it.p273a.p274a.RunnableC10873l, it.p273a.p274a.AbstractC10870i
    /* renamed from: a */
    public Socket mo2997a() {
        Socket mo2997a = super.mo2997a();
        if (C10855b.m3106a(this.f34810a)) {
            try {
                return C10855b.m3104a(this.f34810a, mo2997a, mo2997a.getInetAddress().getHostName(), mo2997a.getPort());
            } catch (IOException e) {
                try {
                    mo2997a.close();
                } catch (Throwable th) {
                }
                throw new C10871j(e);
            }
        }
        return mo2997a;
    }
}
