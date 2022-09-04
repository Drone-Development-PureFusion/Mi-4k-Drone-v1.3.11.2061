package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5952b;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5955d;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5961h;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.internal.ail;
import java.util.List;
/* renamed from: com.google.android.gms.games.internal.a.k */
/* loaded from: classes2.dex */
public final class C5532k implements AbstractC5952b {
    /* renamed from: a */
    private static <L> ail<L> m20308a(AbstractC4489g abstractC4489g, L l) {
        if (l == null) {
            return null;
        }
        return abstractC4489g.mo17373a((AbstractC4489g) l);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public int mo19409a(AbstractC4489g abstractC4489g, AbstractC5952b.AbstractC5953a abstractC5953a, byte[] bArr, String str, String str2) {
        return C5355c.m20511a(abstractC4489g).m20146a(m20308a(abstractC4489g, abstractC5953a), bArr, str, str2);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public int mo19405a(AbstractC4489g abstractC4489g, byte[] bArr, String str) {
        return C5355c.m20511a(abstractC4489g).m20139a(bArr, str);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public int mo19404a(AbstractC4489g abstractC4489g, byte[] bArr, String str, String str2) {
        return C5355c.m20511a(abstractC4489g).m20138a(bArr, str, new String[]{str2});
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public int mo19403a(AbstractC4489g abstractC4489g, byte[] bArr, String str, List<String> list) {
        return C5355c.m20511a(abstractC4489g).m20138a(bArr, str, (String[]) list.toArray(new String[list.size()]));
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public Intent mo19412a(AbstractC4489g abstractC4489g, int i, int i2) {
        return C5355c.m20511a(abstractC4489g).m20136b(i, i2, true);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public Intent mo19411a(AbstractC4489g abstractC4489g, int i, int i2, boolean z) {
        return C5355c.m20511a(abstractC4489g).m20136b(i, i2, z);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public Intent mo19410a(AbstractC4489g abstractC4489g, Room room, int i) {
        return C5355c.m20511a(abstractC4489g).m20190a(room, i);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public void mo19408a(AbstractC4489g abstractC4489g, AbstractC5955d abstractC5955d) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a == null) {
            return;
        }
        m20507a.m20148a(abstractC4489g.mo17373a((AbstractC4489g) abstractC5955d.mo19388a()), m20308a(abstractC4489g, abstractC5955d.mo19386c()), m20308a(abstractC4489g, abstractC5955d.mo19385d()), abstractC5955d);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public void mo19407a(AbstractC4489g abstractC4489g, AbstractC5961h abstractC5961h, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20147a(abstractC4489g.mo17373a((AbstractC4489g) abstractC5961h), str);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: a */
    public void mo19406a(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20101c(str, 0);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: b */
    public void mo19402b(AbstractC4489g abstractC4489g, AbstractC5955d abstractC5955d) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a == null) {
            return;
        }
        m20507a.m20117b(abstractC4489g.mo17373a((AbstractC4489g) abstractC5955d.mo19388a()), m20308a(abstractC4489g, abstractC5955d.mo19386c()), m20308a(abstractC4489g, abstractC5955d.mo19385d()), abstractC5955d);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5952b
    /* renamed from: b */
    public void mo19401b(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20115b(str, 0);
        }
    }
}
