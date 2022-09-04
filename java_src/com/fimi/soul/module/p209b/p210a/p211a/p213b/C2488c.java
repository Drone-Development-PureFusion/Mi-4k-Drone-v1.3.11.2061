package com.fimi.soul.module.p209b.p210a.p211a.p213b;

import android.content.Context;
import com.fimi.soul.module.p209b.p210a.p211a.AbstractC2502i;
import com.fimi.soul.module.p209b.p210a.p211a.AbstractView$OnClickListenerC2507j;
import com.mob.tools.utils.C10109R;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.module.b.a.a.b.c */
/* loaded from: classes.dex */
public class C2488c extends AbstractView$OnClickListenerC2507j {

    /* renamed from: k */
    private static final int f8076k = 720;

    /* renamed from: l */
    private static final int f8077l = 1;

    /* renamed from: m */
    private static final int f8078m = 76;

    /* renamed from: n */
    private static final int f8079n = 20;

    /* renamed from: o */
    private static final int f8080o = 12;

    /* renamed from: p */
    private static final int f8081p = 4;

    public C2488c(AbstractC2502i abstractC2502i, ArrayList<Object> arrayList) {
        super(abstractC2502i, arrayList);
    }

    @Override // com.fimi.soul.module.p209b.p210a.p211a.AbstractView$OnClickListenerC2507j
    /* renamed from: a */
    protected void mo31475a(Context context, ArrayList<Object> arrayList) {
        int i = 1;
        int screenWidth = C10109R.getScreenWidth(context);
        this.f8154g = 4;
        float f = screenWidth / 720.0f;
        this.f8155h = (int) (1.0f * f);
        if (this.f8155h >= 1) {
            i = this.f8155h;
        }
        this.f8155h = i;
        this.f8157j = (int) (76.0f * f);
        this.f8156i = (int) (20.0f * f);
        this.f8151d = (int) (52.0f * f);
        this.f8153f = (screenWidth - (this.f8155h * 3)) / 4;
        if (arrayList.size() <= this.f8154g) {
            this.f8152e = this.f8153f + this.f8155h;
        } else if (arrayList.size() <= 12 - this.f8154g) {
            this.f8152e = (this.f8153f + this.f8155h) * 2;
        } else {
            this.f8152e = (this.f8153f + this.f8155h) * 3;
        }
    }

    @Override // com.fimi.soul.module.p209b.p210a.p211a.AbstractView$OnClickListenerC2507j
    /* renamed from: a */
    protected void mo31473a(ArrayList<Object> arrayList) {
        int size = arrayList.size();
        if (size < 12) {
            int i = size / this.f8154g;
            if (size % this.f8154g != 0) {
                i++;
            }
            this.f8150c = (Object[][]) Array.newInstance(Object.class, 1, i * this.f8154g);
        } else {
            int i2 = size / 12;
            if (size % 12 != 0) {
                i2++;
            }
            this.f8150c = (Object[][]) Array.newInstance(Object.class, i2, 12);
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = i3 / 12;
            this.f8150c[i4][i3 - (i4 * 12)] = arrayList.get(i3);
        }
    }
}
