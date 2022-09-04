package it.p273a.p274a;

import java.io.IOException;
import java.net.Socket;
/* renamed from: it.a.a.d */
/* loaded from: classes.dex */
class C10865d implements AbstractC10870i {

    /* renamed from: a */
    private final String f34819a;

    /* renamed from: b */
    private final int f34820b;

    /* renamed from: c */
    private final C10855b f34821c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10865d(C10855b c10855b, String str, int i) {
        this.f34821c = c10855b;
        this.f34819a = str;
        this.f34820b = i;
    }

    @Override // it.p273a.p274a.AbstractC10870i
    /* renamed from: a */
    public Socket mo2997a() {
        try {
            String m3069c = C10855b.m3079b(this.f34821c).m3012a() ? this.f34819a : C10855b.m3069c(this.f34821c);
            Socket mo3003d = C10855b.m3079b(this.f34821c).mo3003d(m3069c, this.f34820b);
            return C10855b.m3106a(this.f34821c) ? C10855b.m3104a(this.f34821c, mo3003d, m3069c, this.f34820b) : mo3003d;
        } catch (IOException e) {
            throw new C10871j("Cannot connect to the remote server", e);
        }
    }

    @Override // it.p273a.p274a.AbstractC10870i
    /* renamed from: b */
    public void mo2996b() {
    }
}
