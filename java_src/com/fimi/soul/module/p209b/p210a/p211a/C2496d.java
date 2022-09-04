package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.p001v4.view.ViewCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.soul.module.p209b.p210a.p211a.C2490c;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.gui.BitmapProcessor;
import com.mob.tools.utils.C10109R;
/* renamed from: com.fimi.soul.module.b.a.a.d */
/* loaded from: classes.dex */
public class C2496d extends LinearLayout {

    /* renamed from: a */
    private static final int f8103a = 64;

    /* renamed from: b */
    private static final int f8104b = 24;

    /* renamed from: c */
    private static final int f8105c = 96;

    /* renamed from: d */
    private static final int f8106d = 20;

    /* renamed from: e */
    private ImageView f8107e;

    /* renamed from: f */
    private AsyncImageView f8108f;

    /* renamed from: g */
    private TextView f8109g;

    /* renamed from: h */
    private Bitmap f8110h;

    /* renamed from: i */
    private Bitmap f8111i;

    public C2496d(Context context, float f) {
        super(context);
        int i = (int) (20.0f * f);
        setPadding(i, 0, i, 0);
        setMinimumHeight((int) (96.0f * f));
        setBackgroundColor(-1);
        this.f8107e = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.f8107e, layoutParams);
        this.f8108f = new AsyncImageView(context);
        int i2 = (int) (64.0f * f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 16;
        int i3 = (int) (24.0f * f);
        layoutParams2.setMargins(i3, 0, i3, 0);
        addView(this.f8108f, layoutParams2);
        this.f8109g = new TextView(context);
        this.f8109g.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f8109g.setTextSize(2, 18.0f);
        this.f8109g.setSingleLine();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.weight = 1.0f;
        addView(this.f8109g, layoutParams3);
        int bitmapRes = C10109R.getBitmapRes(context, "ssdk_oks_classic_check_checked");
        if (bitmapRes > 0) {
            this.f8110h = BitmapFactory.decodeResource(context.getResources(), bitmapRes);
        }
        int bitmapRes2 = C10109R.getBitmapRes(getContext(), "ssdk_oks_classic_check_default");
        if (bitmapRes2 > 0) {
            this.f8111i = BitmapFactory.decodeResource(context.getResources(), bitmapRes2);
        }
    }

    /* renamed from: a */
    public void m31506a(C2490c.C2495b c2495b, boolean z) {
        this.f8109g.setText(c2495b.f8098b);
        this.f8107e.setImageBitmap(c2495b.f8097a ? this.f8110h : this.f8111i);
        if (this.f8108f != null) {
            if (!z) {
                this.f8108f.execute(c2495b.f8101e, 0);
                return;
            }
            Bitmap bitmapFromCache = BitmapProcessor.getBitmapFromCache(c2495b.f8101e);
            if (bitmapFromCache == null || bitmapFromCache.isRecycled()) {
                this.f8108f.execute((String) null, 0);
            } else {
                this.f8108f.setImageBitmap(bitmapFromCache);
            }
        }
    }
}
