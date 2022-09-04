package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.android.gms.wearable.e */
/* loaded from: classes.dex */
public interface AbstractC9458e {

    /* renamed from: a */
    public static final String f29851a = "com.google.android.gms.wearable.DATA_CHANGED";

    /* renamed from: b */
    public static final int f29852b = 0;

    /* renamed from: c */
    public static final int f29853c = 1;

    /* renamed from: com.google.android.gms.wearable.e$a */
    /* loaded from: classes.dex */
    public interface AbstractC9459a extends AbstractC4502m {
        /* renamed from: b */
        AbstractC9466h mo7806b();
    }

    /* renamed from: com.google.android.gms.wearable.e$b */
    /* loaded from: classes.dex */
    public interface AbstractC9460b {
        /* renamed from: a */
        void mo8095a(C9465g c9465g);
    }

    /* renamed from: com.google.android.gms.wearable.e$c */
    /* loaded from: classes.dex */
    public interface AbstractC9461c extends AbstractC4502m {
        /* renamed from: b */
        int mo7805b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.e$d */
    /* loaded from: classes.dex */
    public @interface AbstractC9462d {
    }

    /* renamed from: com.google.android.gms.wearable.e$e */
    /* loaded from: classes.dex */
    public interface AbstractC9463e extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        ParcelFileDescriptor mo7803c();

        /* renamed from: d */
        InputStream mo7802d();
    }

    /* renamed from: a */
    AbstractC4494i<C9627j> mo7841a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<AbstractC9459a> mo7840a(AbstractC4489g abstractC4489g, Uri uri);

    /* renamed from: a */
    AbstractC4494i<C9627j> mo7839a(AbstractC4489g abstractC4489g, Uri uri, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC9463e> mo7838a(AbstractC4489g abstractC4489g, Asset asset);

    /* renamed from: a */
    AbstractC4494i<AbstractC9459a> mo7837a(AbstractC4489g abstractC4489g, PutDataRequest putDataRequest);

    /* renamed from: a */
    AbstractC4494i<Status> mo7836a(AbstractC4489g abstractC4489g, AbstractC9460b abstractC9460b);

    /* renamed from: a */
    AbstractC4494i<Status> mo7835a(AbstractC4489g abstractC4489g, AbstractC9460b abstractC9460b, Uri uri, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC9463e> mo7833a(AbstractC4489g abstractC4489g, AbstractC9467i abstractC9467i);

    /* renamed from: b */
    AbstractC4494i<C9627j> mo7830b(AbstractC4489g abstractC4489g, Uri uri);

    /* renamed from: b */
    AbstractC4494i<AbstractC9461c> mo7829b(AbstractC4489g abstractC4489g, Uri uri, int i);

    /* renamed from: b */
    AbstractC4494i<Status> mo7828b(AbstractC4489g abstractC4489g, AbstractC9460b abstractC9460b);

    /* renamed from: c */
    AbstractC4494i<AbstractC9461c> mo7827c(AbstractC4489g abstractC4489g, Uri uri);
}
