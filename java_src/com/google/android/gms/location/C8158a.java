package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.location.internal.C8172a;
import com.google.android.gms.location.internal.C8215l;
/* renamed from: com.google.android.gms.location.a */
/* loaded from: classes2.dex */
public class C8158a {

    /* renamed from: a */
    public static final String f26704a = "activity_recognition";

    /* renamed from: d */
    private static final C4467a.C4478g<C8215l> f26707d = new C4467a.C4478g<>();

    /* renamed from: e */
    private static final C4467a.AbstractC4473b<C8215l, C4467a.AbstractC4468a.C4470b> f26708e = new C4467a.AbstractC4473b<C8215l, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.location.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8215l mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C8215l(context, looper, abstractC4491b, abstractC4492c, C8158a.f26704a);
        }
    };

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f26705b = new C4467a<>("ActivityRecognition.API", f26708e, f26707d);

    /* renamed from: c */
    public static final AbstractC8163b f26706c = new C8172a();

    /* renamed from: com.google.android.gms.location.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8160a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C8215l> {
        public AbstractC8160a(AbstractC4489g abstractC4489g) {
            super(C8158a.f26705b, abstractC4489g);
        }
    }

    private C8158a() {
    }
}
