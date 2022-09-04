package com.fimi.soul.module.p209b.p210a.p211a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mob.tools.utils.C10109R;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.module.b.a.a.g */
/* loaded from: classes.dex */
public class C2499g extends LinearLayout {

    /* renamed from: a */
    private static final int f8126a = 720;

    /* renamed from: b */
    private static final int f8127b = 64;

    /* renamed from: c */
    private static final int f8128c = 24;

    /* renamed from: d */
    private TextView f8129d;

    /* renamed from: e */
    private C2508k f8130e;

    /* renamed from: f */
    private ProgressBar f8131f;

    public C2499g(Context context) {
        super(context);
        int[] screenSize = C10109R.getScreenSize(context);
        float f = (screenSize[0] < screenSize[1] ? screenSize[0] : screenSize[1]) / 720.0f;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(linearLayout, layoutParams);
        this.f8130e = new C2508k(context);
        int bitmapRes = C10109R.getBitmapRes(context, "ssdk_oks_ptr_ptr");
        if (bitmapRes > 0) {
            this.f8130e.setImageResource(bitmapRes);
        }
        int i = (int) (64.0f * f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 16;
        int i2 = (int) (f * 24.0f);
        layoutParams2.bottomMargin = i2;
        layoutParams2.topMargin = i2;
        linearLayout.addView(this.f8130e, layoutParams2);
        this.f8131f = new ProgressBar(context);
        this.f8131f.setIndeterminateDrawable(context.getResources().getDrawable(C10109R.getBitmapRes(context, "ssdk_oks_classic_progressbar")));
        linearLayout.addView(this.f8131f, layoutParams2);
        this.f8131f.setVisibility(8);
        this.f8129d = new TextView(getContext());
        this.f8129d.setTextSize(2, 18.0f);
        this.f8129d.setPadding(i2, 0, i2, 0);
        this.f8129d.setTextColor(-16139513);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        linearLayout.addView(this.f8129d, layoutParams3);
    }

    @TargetApi(11)
    /* renamed from: a */
    public void m31499a() {
        this.f8130e.setVisibility(8);
        this.f8131f.setVisibility(0);
        int stringRes = C10109R.getStringRes(getContext(), "ssdk_oks_refreshing");
        if (stringRes > 0) {
            this.f8129d.setText(stringRes);
        }
    }

    @SuppressLint({"NewApi"})
    @TargetApi(11)
    /* renamed from: a */
    public void m31498a(int i) {
        int i2 = Opcodes.GETFIELD;
        if (i > 100) {
            int i3 = ((i - 100) * Opcodes.GETFIELD) / 20;
            if (i3 <= 180) {
                i2 = i3;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.f8130e.setRotation(i2);
        } else {
            this.f8130e.setRotation(0.0f);
        }
        if (i < 100) {
            int stringRes = C10109R.getStringRes(getContext(), "ssdk_oks_pull_to_refresh");
            if (stringRes <= 0) {
                return;
            }
            this.f8129d.setText(stringRes);
            return;
        }
        int stringRes2 = C10109R.getStringRes(getContext(), "ssdk_oks_release_to_refresh");
        if (stringRes2 <= 0) {
            return;
        }
        this.f8129d.setText(stringRes2);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void m31497b() {
        this.f8131f.setVisibility(8);
        this.f8130e.setRotation(180.0f);
        this.f8130e.setVisibility(0);
    }
}
