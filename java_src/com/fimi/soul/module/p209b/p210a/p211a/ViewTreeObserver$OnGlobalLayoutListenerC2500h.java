package com.fimi.soul.module.p209b.p210a.p211a;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.C2511c;
import com.mob.tools.gui.ScaledImageView;
/* renamed from: com.fimi.soul.module.b.a.a.h */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC2500h extends C2511c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private Bitmap f8132a;

    /* renamed from: b */
    private ScaledImageView f8133b;

    public ViewTreeObserver$OnGlobalLayoutListenerC2500h(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
    }

    /* renamed from: a */
    public void m31496a(Bitmap bitmap) {
        this.f8132a = bitmap;
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
        this.f8133b = new ScaledImageView(this.activity);
        this.f8133b.setScaleType(ImageView.ScaleType.MATRIX);
        this.activity.setContentView(this.f8133b);
        if (this.f8132a != null) {
            this.f8133b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8133b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f8133b.post(new Runnable() { // from class: com.fimi.soul.module.b.a.a.h.1
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver$OnGlobalLayoutListenerC2500h.this.f8133b.setBitmap(ViewTreeObserver$OnGlobalLayoutListenerC2500h.this.f8132a);
            }
        });
    }
}
