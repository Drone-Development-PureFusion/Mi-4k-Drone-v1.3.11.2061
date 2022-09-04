package com.fimi.soul.module.p209b.p210a.p211a.p213b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.p210a.p211a.C2509l;
import com.fimi.soul.module.p209b.p210a.p211a.View$OnClickListenerC2484b;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.C10109R;
import java.io.File;
/* renamed from: com.fimi.soul.module.b.a.a.b.a */
/* loaded from: classes.dex */
public class C2485a extends View$OnClickListenerC2484b {

    /* renamed from: q */
    private static final int f8067q = 1280;

    /* renamed from: r */
    private static final int f8068r = 96;

    /* renamed from: s */
    private static final int f8069s = 75;

    /* renamed from: t */
    private static final int f8070t = 40;

    /* renamed from: u */
    private static final int f8071u = 300;

    /* renamed from: v */
    private static final int f8072v = 70;

    public C2485a(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
    }

    /* renamed from: a */
    private void m31521a(LinearLayout linearLayout, float f) {
        LinearLayout linearLayout2 = new LinearLayout(this.activity);
        linearLayout2.setPadding(0, 0, 0, 5);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, (int) (75.0f * f)));
        int i = (int) (40.0f * f);
        this.f8063n = new TextView(this.activity);
        this.f8063n.setTextColor(-12895429);
        this.f8063n.setTextSize(2, 21.0f);
        this.f8063n.setGravity(85);
        onTextChanged(this.f8055f.getText(), 0, 0, 0);
        this.f8063n.setPadding(i, 0, i, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout2.addView(this.f8063n, layoutParams);
        View view = new View(this.activity);
        view.setBackgroundColor(-3355444);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, f > 1.0f ? (int) f : 1));
    }

    /* renamed from: a */
    private void m31520a(RelativeLayout relativeLayout, float f) {
        this.f8056g = new TextView(this.activity);
        this.f8056g.setTextColor(-12895429);
        this.f8056g.setTextSize(2, 18.0f);
        this.f8056g.setGravity(17);
        int stringRes = C10109R.getStringRes(this.activity, "ssdk_oks_cancel");
        if (stringRes > 0) {
            this.f8056g.setText(stringRes);
        }
        int i = (int) (40.0f * f);
        this.f8056g.setPadding(i, 0, i, 0);
        relativeLayout.addView(this.f8056g, new RelativeLayout.LayoutParams(-2, -1));
        this.f8056g.setOnClickListener(this);
        TextView textView = new TextView(this.activity);
        textView.setTextColor(-12895429);
        textView.setTextSize(2, 22.0f);
        textView.setGravity(17);
        int stringRes2 = C10109R.getStringRes(this.activity, "ssdk_oks_multi_share");
        if (stringRes2 > 0) {
            textView.setText(stringRes2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(13);
        relativeLayout.addView(textView, layoutParams);
        this.f8057h = new TextView(this.activity);
        this.f8057h.setTextColor(-37615);
        this.f8057h.setTextSize(2, 18.0f);
        this.f8057h.setGravity(17);
        int stringRes3 = C10109R.getStringRes(this.activity, "ssdk_oks_share");
        if (stringRes3 > 0) {
            this.f8057h.setText(stringRes3);
        }
        this.f8057h.setPadding(i, 0, i, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(11);
        relativeLayout.addView(this.f8057h, layoutParams2);
        this.f8057h.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m31518a(AsyncImageView asyncImageView) {
        String imageUrl = this.f8051b.getImageUrl();
        String imagePath = this.f8051b.getImagePath();
        String[] imageArray = this.f8051b.getImageArray();
        Bitmap bitmap = null;
        this.f8058i.setVisibility(0);
        if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
            try {
                bitmap = BitmapHelper.getBitmap(imagePath);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (bitmap != null) {
            this.f8064o = bitmap;
            asyncImageView.setBitmap(bitmap);
        } else if (imageArray != null && imageArray.length > 0 && !TextUtils.isEmpty(imageArray[0]) && new File(imageArray[0]).exists()) {
            try {
                bitmap = BitmapHelper.getBitmap(imagePath);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (bitmap != null) {
            this.f8064o = bitmap;
            asyncImageView.setBitmap(bitmap);
        } else if (bitmap != null || TextUtils.isEmpty(imageUrl)) {
            this.f8058i.setVisibility(8);
        } else {
            asyncImageView.execute(imageUrl, 0);
        }
    }

    /* renamed from: b */
    private void m31517b(LinearLayout linearLayout, float f) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f > 1.0f ? (int) f : 1);
        View view = new View(this.activity);
        view.setBackgroundColor(687865856);
        linearLayout.addView(view, layoutParams);
        View view2 = new View(this.activity);
        view2.setBackgroundColor(335544320);
        linearLayout.addView(view2, layoutParams);
        View view3 = new View(this.activity);
        view3.setBackgroundColor(117440512);
        linearLayout.addView(view3, layoutParams);
    }

    /* renamed from: b */
    private void m31516b(RelativeLayout relativeLayout, float f) {
        this.f8054e = new ScrollView(this.activity);
        relativeLayout.addView(this.f8054e, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(1);
        this.f8054e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.f8055f = new EditText(this.activity);
        int i = (int) (40.0f * f);
        this.f8055f.setPadding(i, i, i, i);
        this.f8055f.setBackgroundDrawable(null);
        this.f8055f.setTextColor(-12895429);
        this.f8055f.setTextSize(2, 21.0f);
        this.f8055f.setText(this.f8051b.getText());
        linearLayout.addView(this.f8055f, new LinearLayout.LayoutParams(-1, -2));
        this.f8055f.addTextChangedListener(this);
        this.f8058i = new RelativeLayout(this.activity);
        this.f8058i.setBackgroundColor(-13553359);
        int i2 = (int) (300.0f * f);
        int i3 = (int) (70.0f * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        linearLayout.addView(this.f8058i, layoutParams);
        this.f8059j = new AsyncImageView(this.activity) { // from class: com.fimi.soul.module.b.a.a.b.a.1
            @Override // com.mob.tools.gui.AsyncImageView, com.mob.tools.gui.BitmapProcessor.BitmapCallback
            public void onImageGot(String str, Bitmap bitmap) {
                C2485a.this.f8064o = bitmap;
                super.onImageGot(str, bitmap);
            }
        };
        this.f8059j.setScaleToCropCenter(true);
        this.f8058i.addView(this.f8059j, new RelativeLayout.LayoutParams(i2, i2));
        this.f8059j.setOnClickListener(this);
        m31518a(this.f8059j);
        this.f8060k = new C2509l(this.activity);
        this.f8060k.setRatio(f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        this.f8058i.addView(this.f8060k, layoutParams2);
        this.f8060k.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.p209b.p210a.p211a.View$OnClickListenerC2484b, com.mob.tools.FakeActivity
    public void onCreate() {
        super.onCreate();
        float screenHeight = C10109R.getScreenHeight(this.activity) / 1280.0f;
        this.f8065p = 0;
        this.f8052c = new LinearLayout(this.activity);
        this.f8052c.setOrientation(1);
        this.activity.setContentView(this.f8052c);
        this.f8053d = new RelativeLayout(this.activity);
        this.f8053d.setBackgroundColor(-1644052);
        this.f8052c.addView(this.f8053d, new LinearLayout.LayoutParams(-1, (int) (96.0f * screenHeight)));
        m31520a(this.f8053d, screenHeight);
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        relativeLayout.setBackgroundColor(-1);
        this.f8052c.addView(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
        m31516b(relativeLayout, screenHeight);
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(1);
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -2));
        m31517b(linearLayout, screenHeight);
        this.f8061l = new LinearLayout(this.activity);
        this.f8061l.setOrientation(1);
        this.f8052c.addView(this.f8061l, new LinearLayout.LayoutParams(-1, -2));
        m31521a(this.f8061l, screenHeight);
    }
}
