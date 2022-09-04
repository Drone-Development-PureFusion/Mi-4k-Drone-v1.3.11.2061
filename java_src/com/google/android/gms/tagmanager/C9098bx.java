package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.bx */
/* loaded from: classes2.dex */
class C9098bx extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28776a = EnumC6890eg.RESOLUTION.toString();

    /* renamed from: b */
    private final Context f28777b;

    public C9098bx(Context context) {
        super(f28776a, new String[0]);
        this.f28777b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f28777b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        return C9147cw.m9111f(new StringBuilder(23).append(i).append("x").append(displayMetrics.heightPixels).toString());
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
