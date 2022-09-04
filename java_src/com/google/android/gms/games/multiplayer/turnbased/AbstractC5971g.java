package com.google.android.gms.games.multiplayer.turnbased;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.List;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.g */
/* loaded from: classes2.dex */
public interface AbstractC5971g {

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5972a extends AbstractC4502m {
        /* renamed from: b */
        String mo19275b();
    }

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$b */
    /* loaded from: classes2.dex */
    public interface AbstractC5973b extends AbstractC4502m {
        /* renamed from: c */
        TurnBasedMatch mo19274c();
    }

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$c */
    /* loaded from: classes2.dex */
    public interface AbstractC5974c extends AbstractC4502m {
        /* renamed from: c */
        TurnBasedMatch mo19273c();
    }

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$d */
    /* loaded from: classes2.dex */
    public interface AbstractC5975d extends AbstractC4502m {
        /* renamed from: c */
        TurnBasedMatch mo19272c();
    }

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$e */
    /* loaded from: classes2.dex */
    public interface AbstractC5976e extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        C5963a mo19271c();
    }

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.g$f */
    /* loaded from: classes2.dex */
    public interface AbstractC5977f extends AbstractC4502m {
        /* renamed from: c */
        TurnBasedMatch mo19270c();
    }

    /* renamed from: a */
    Intent mo19299a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    Intent mo19298a(AbstractC4489g abstractC4489g, int i, int i2);

    /* renamed from: a */
    Intent mo19297a(AbstractC4489g abstractC4489g, int i, int i2, boolean z);

    /* renamed from: a */
    AbstractC4494i<AbstractC5976e> mo19296a(AbstractC4489g abstractC4489g, int i, int[] iArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC5973b> mo19294a(AbstractC4489g abstractC4489g, AbstractC5966d abstractC5966d);

    /* renamed from: a */
    AbstractC4494i<AbstractC5973b> mo19293a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC5974c> mo19292a(AbstractC4489g abstractC4489g, String str, String str2);

    /* renamed from: a */
    AbstractC4494i<AbstractC5977f> mo19291a(AbstractC4489g abstractC4489g, String str, byte[] bArr, String str2);

    /* renamed from: a */
    AbstractC4494i<AbstractC5977f> mo19290a(AbstractC4489g abstractC4489g, String str, byte[] bArr, String str2, List<ParticipantResult> list);

    /* renamed from: a */
    AbstractC4494i<AbstractC5977f> mo19289a(AbstractC4489g abstractC4489g, String str, byte[] bArr, String str2, ParticipantResult... participantResultArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC5977f> mo19288a(AbstractC4489g abstractC4489g, String str, byte[] bArr, List<ParticipantResult> list);

    /* renamed from: a */
    AbstractC4494i<AbstractC5977f> mo19287a(AbstractC4489g abstractC4489g, String str, byte[] bArr, ParticipantResult... participantResultArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC5976e> mo19286a(AbstractC4489g abstractC4489g, int[] iArr);

    /* renamed from: a */
    void mo19295a(AbstractC4489g abstractC4489g, AbstractC5964b abstractC5964b);

    /* renamed from: b */
    AbstractC4494i<AbstractC5973b> mo19284b(AbstractC4489g abstractC4489g, String str);

    /* renamed from: b */
    void mo19285b(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    int mo19283c(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    void mo19282c(AbstractC4489g abstractC4489g, String str);

    /* renamed from: d */
    void mo19281d(AbstractC4489g abstractC4489g, String str);

    /* renamed from: e */
    AbstractC4494i<AbstractC5977f> mo19280e(AbstractC4489g abstractC4489g, String str);

    /* renamed from: f */
    AbstractC4494i<AbstractC5974c> mo19279f(AbstractC4489g abstractC4489g, String str);

    /* renamed from: g */
    AbstractC4494i<AbstractC5972a> mo19278g(AbstractC4489g abstractC4489g, String str);

    /* renamed from: h */
    void mo19277h(AbstractC4489g abstractC4489g, String str);

    /* renamed from: i */
    AbstractC4494i<AbstractC5975d> mo19276i(AbstractC4489g abstractC4489g, String str);
}
