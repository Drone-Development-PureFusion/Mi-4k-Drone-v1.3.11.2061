package com.google.android.gms.p231b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* renamed from: com.google.android.gms.b.d */
/* loaded from: classes.dex */
public interface AbstractC4151d {

    @Deprecated
    /* renamed from: com.google.android.gms.b.d$a */
    /* loaded from: classes.dex */
    public interface AbstractC4152a {
        /* renamed from: a */
        AbstractC4494i<Status> mo17879a();

        /* renamed from: a */
        AbstractC4494i<Status> mo17878a(AbstractC4489g abstractC4489g);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.b.d$b */
    /* loaded from: classes.dex */
    public static final class C4153b {

        /* renamed from: a */
        public final Uri f15743a;

        /* renamed from: b */
        public final Uri f15744b;

        /* renamed from: c */
        public final int f15745c;

        public C4153b(Uri uri, Uri uri2, View view) {
            this.f15743a = uri;
            this.f15744b = uri2;
            this.f15745c = view.getId();
        }

        public C4153b(Uri uri, View view) {
            this(uri, null, view);
        }
    }

    @Deprecated
    /* renamed from: a */
    AbstractC4152a mo17889a(AbstractC4489g abstractC4489g, C4146a c4146a);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo17893a(AbstractC4489g abstractC4489g, Activity activity, Intent intent);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo17892a(AbstractC4489g abstractC4489g, Activity activity, Intent intent, String str, Uri uri, List<C4153b> list);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo17891a(AbstractC4489g abstractC4489g, Activity activity, Uri uri);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo17890a(AbstractC4489g abstractC4489g, Activity activity, Uri uri, String str, Uri uri2, List<C4153b> list);

    /* renamed from: b */
    AbstractC4494i<Status> mo17883b(AbstractC4489g abstractC4489g, C4146a c4146a);

    /* renamed from: c */
    AbstractC4494i<Status> mo17880c(AbstractC4489g abstractC4489g, C4146a c4146a);
}
