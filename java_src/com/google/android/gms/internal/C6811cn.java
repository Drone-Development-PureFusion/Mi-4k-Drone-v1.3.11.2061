package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.cn */
/* loaded from: classes2.dex */
public class C6811cn implements aqe {

    /* renamed from: a */
    private Context f22907a;

    /* renamed from: b */
    private DisplayMetrics f22908b = new DisplayMetrics();

    public C6811cn(Context context) {
        this.f22907a = context;
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        ((WindowManager) this.f22907a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f22908b);
        return new C6893ej(this.f22908b.widthPixels + "x" + this.f22908b.heightPixels);
    }
}
