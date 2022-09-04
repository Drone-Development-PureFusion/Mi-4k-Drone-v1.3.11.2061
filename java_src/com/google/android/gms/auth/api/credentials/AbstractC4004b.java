package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.auth.api.credentials.b */
/* loaded from: classes2.dex */
public interface AbstractC4004b {

    /* renamed from: a */
    public static final int f15437a = 1000;

    /* renamed from: b */
    public static final int f15438b = 1001;

    /* renamed from: c */
    public static final int f15439c = 2000;

    /* renamed from: a */
    PendingIntent mo25737a(AbstractC4489g abstractC4489g, HintRequest hintRequest);

    /* renamed from: a */
    AbstractC4494i<Status> mo25740a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo25739a(AbstractC4489g abstractC4489g, Credential credential);

    /* renamed from: a */
    AbstractC4494i<AbstractC4003a> mo25738a(AbstractC4489g abstractC4489g, CredentialRequest credentialRequest);

    /* renamed from: b */
    AbstractC4494i<Status> mo25735b(AbstractC4489g abstractC4489g, Credential credential);
}
