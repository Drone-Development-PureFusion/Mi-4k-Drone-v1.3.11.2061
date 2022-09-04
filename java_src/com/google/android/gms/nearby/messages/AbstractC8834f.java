package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.nearby.messages.f */
/* loaded from: classes.dex */
public interface AbstractC8834f {
    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo9806a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo9805a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC4494i<Status> mo9804a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent, C8908n c8908n);

    /* renamed from: a */
    AbstractC4494i<Status> mo9803a(AbstractC4489g abstractC4489g, Message message);

    /* renamed from: a */
    AbstractC4494i<Status> mo9802a(AbstractC4489g abstractC4489g, Message message, C8903k c8903k);

    /* renamed from: a */
    AbstractC4494i<Status> mo9801a(AbstractC4489g abstractC4489g, AbstractC8833e abstractC8833e);

    /* renamed from: a */
    AbstractC4494i<Status> mo9800a(AbstractC4489g abstractC4489g, AbstractC8833e abstractC8833e, C8908n c8908n);

    /* renamed from: a */
    AbstractC4494i<Status> mo9799a(AbstractC4489g abstractC4489g, AbstractC8906l abstractC8906l);

    /* renamed from: a */
    void mo9807a(Intent intent, AbstractC8833e abstractC8833e);

    /* renamed from: b */
    AbstractC4494i<Status> mo9797b(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    /* renamed from: b */
    AbstractC4494i<Status> mo9796b(AbstractC4489g abstractC4489g, Message message);

    /* renamed from: b */
    AbstractC4494i<Status> mo9795b(AbstractC4489g abstractC4489g, AbstractC8833e abstractC8833e);

    /* renamed from: b */
    AbstractC4494i<Status> mo9794b(AbstractC4489g abstractC4489g, AbstractC8906l abstractC8906l);
}
