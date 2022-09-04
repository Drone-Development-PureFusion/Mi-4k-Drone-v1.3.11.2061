package com.google.android.gms.games.request;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.games.request.g */
/* loaded from: classes2.dex */
public interface AbstractC6001g {

    /* renamed from: a */
    public static final int f20346a = 0;

    /* renamed from: b */
    public static final int f20347b = 1;

    /* renamed from: c */
    public static final int f20348c = 0;

    /* renamed from: d */
    public static final int f20349d = 1;

    /* renamed from: e */
    public static final int f20350e = 0;

    /* renamed from: f */
    public static final int f20351f = 1;

    /* renamed from: g */
    public static final int f20352g = 2;

    /* renamed from: h */
    public static final int f20353h = 0;

    /* renamed from: i */
    public static final int f20354i = 1;

    /* renamed from: j */
    public static final String f20355j = "requests";

    /* renamed from: k */
    public static final int f20356k = -1;

    /* renamed from: l */
    public static final int f20357l = 8;

    /* renamed from: com.google.android.gms.games.request.g$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6002a extends AbstractC4500k, AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.request.g$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6003b extends AbstractC4500k, AbstractC4502m {
        /* renamed from: a */
        C5995a mo19152a(int i);
    }

    /* renamed from: com.google.android.gms.games.request.g$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6004c extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.request.g$d */
    /* loaded from: classes2.dex */
    public interface AbstractC6005d extends AbstractC4500k, AbstractC4502m {
        /* renamed from: a */
        int mo19151a(String str);

        /* renamed from: c */
        Set<String> mo19150c();
    }

    /* renamed from: a */
    Intent mo19161a(AbstractC4489g abstractC4489g, int i, byte[] bArr, int i2, Bitmap bitmap, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC6003b> mo19162a(AbstractC4489g abstractC4489g, int i, int i2, int i3);

    /* renamed from: a */
    AbstractC4494i<AbstractC6005d> mo19159a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC6005d> mo19158a(AbstractC4489g abstractC4489g, List<String> list);

    /* renamed from: a */
    ArrayList<GameRequest> mo19165a(Intent intent);

    /* renamed from: a */
    ArrayList<GameRequest> mo19164a(Bundle bundle);

    /* renamed from: a */
    void mo19163a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    void mo19160a(AbstractC4489g abstractC4489g, AbstractC6000f abstractC6000f);

    /* renamed from: b */
    Intent mo19157b(AbstractC4489g abstractC4489g);

    /* renamed from: b */
    AbstractC4494i<AbstractC6005d> mo19156b(AbstractC4489g abstractC4489g, String str);

    /* renamed from: b */
    AbstractC4494i<AbstractC6005d> mo19155b(AbstractC4489g abstractC4489g, List<String> list);

    /* renamed from: c */
    int mo19154c(AbstractC4489g abstractC4489g);

    /* renamed from: d */
    int mo19153d(AbstractC4489g abstractC4489g);
}
