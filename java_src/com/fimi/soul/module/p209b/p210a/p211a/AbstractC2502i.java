package com.fimi.soul.module.p209b.p210a.p211a;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.C2477a;
import com.fimi.soul.module.p209b.C2511c;
import com.mob.tools.gui.MobViewPager;
import com.mob.tools.utils.C10109R;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.b.a.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC2502i extends C2511c {

    /* renamed from: a */
    private C2478a f8135a;

    /* renamed from: b */
    private Runnable f8136b;

    /* renamed from: c */
    private Animation f8137c;

    /* renamed from: d */
    private Animation f8138d;

    /* renamed from: e */
    private LinearLayout f8139e;

    /* renamed from: f */
    private boolean f8140f;

    public AbstractC2502i(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
        this.f8135a = (C2478a) C10109R.forceCast(abstractC2513e);
    }

    /* renamed from: j */
    private void m31478j() {
        this.f8137c = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f8137c.setDuration(300L);
        this.f8138d = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.f8138d.setDuration(300L);
    }

    /* renamed from: a */
    protected abstract AbstractView$OnClickListenerC2507j mo31488a(ArrayList<Object> arrayList);

    /* renamed from: a */
    public final void m31493a(final View view, final C2477a c2477a) {
        this.f8136b = new Runnable() { // from class: com.fimi.soul.module.b.a.a.i.3
            @Override // java.lang.Runnable
            public void run() {
                c2477a.f8035c.onClick(view);
            }
        };
        finish();
    }

    /* renamed from: d */
    public final void m31483d(final Platform platform) {
        this.f8136b = new Runnable() { // from class: com.fimi.soul.module.b.a.a.i.2
            @Override // java.lang.Runnable
            public void run() {
                boolean c = AbstractC2502i.this.c();
                boolean z = platform instanceof CustomPlatform;
                boolean c2 = AbstractC2502i.this.c(platform);
                if (c || z || c2) {
                    AbstractC2502i.this.a(platform);
                    return;
                }
                Platform.ShareParams b = AbstractC2502i.this.b(platform);
                if (b == null) {
                    return;
                }
                ShareSDK.logDemoEvent(3, null);
                if (AbstractC2502i.this.g() != null) {
                    AbstractC2502i.this.g().m31404a(platform, b);
                }
                AbstractC2502i.this.f8135a.mo31419a(AbstractC2502i.this.activity, platform, b);
            }
        };
        finish();
    }

    /* renamed from: i */
    protected ArrayList<Object> m31479i() {
        ArrayList<Object> arrayList = new ArrayList<>();
        Platform[] platformList = ShareSDK.getPlatformList();
        if (platformList == null) {
            platformList = new Platform[0];
        }
        HashMap<String, String> e = e();
        if (e == null) {
            e = new HashMap<>();
        }
        for (Platform platform : platformList) {
            if (!e.containsKey(platform.getName())) {
                arrayList.add(platform);
            }
        }
        ArrayList<C2477a> d = d();
        if (d != null && d.size() > 0) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
        m31478j();
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(1);
        this.activity.setContentView(linearLayout);
        TextView textView = new TextView(this.activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.b.a.a.i.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC2502i.this.finish();
            }
        });
        linearLayout.addView(textView, layoutParams);
        this.f8139e = new LinearLayout(this.activity);
        this.f8139e.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.f8139e.setAnimation(this.f8137c);
        linearLayout.addView(this.f8139e, layoutParams2);
        MobViewPager mobViewPager = new MobViewPager(this.activity);
        AbstractView$OnClickListenerC2507j mo31488a = mo31488a(m31479i());
        this.f8139e.addView(mobViewPager, new LinearLayout.LayoutParams(-1, mo31488a.m31471b()));
        C2498f c2498f = new C2498f(this.activity);
        this.f8139e.addView(c2498f, new LinearLayout.LayoutParams(-1, mo31488a.m31477a()));
        c2498f.setScreenCount(mo31488a.getCount());
        c2498f.m31500a(0, 0);
        mo31488a.m31474a(c2498f);
        mobViewPager.setAdapter(mo31488a);
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        if (this.f8140f) {
            this.f8140f = false;
            return false;
        }
        this.f8138d.setAnimationListener(new Animation.AnimationListener() { // from class: com.fimi.soul.module.b.a.a.i.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AbstractC2502i.this.f8136b == null) {
                    ShareSDK.logDemoEvent(2, null);
                } else {
                    AbstractC2502i.this.f8136b.run();
                    AbstractC2502i.this.f8136b = null;
                }
                AbstractC2502i.this.f8140f = true;
                AbstractC2502i.this.finish();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.f8139e.clearAnimation();
        this.f8139e.setAnimation(this.f8138d);
        this.f8139e.setVisibility(8);
        return true;
    }
}
