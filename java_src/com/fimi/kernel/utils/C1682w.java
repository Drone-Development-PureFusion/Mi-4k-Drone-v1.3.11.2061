package com.fimi.kernel.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
/* renamed from: com.fimi.kernel.utils.w */
/* loaded from: classes.dex */
public class C1682w {

    /* renamed from: a */
    public static final int f4166a = -1728053248;

    /* renamed from: i */
    private static boolean f4167i;

    /* renamed from: b */
    private final C1684a f4168b;

    /* renamed from: c */
    private boolean f4169c;

    /* renamed from: d */
    private boolean f4170d;

    /* renamed from: e */
    private boolean f4171e;

    /* renamed from: f */
    private boolean f4172f;

    /* renamed from: g */
    private View f4173g;

    /* renamed from: h */
    private View f4174h;

    /* renamed from: com.fimi.kernel.utils.w$a */
    /* loaded from: classes.dex */
    public static class C1684a {

        /* renamed from: a */
        private static final String f4175a = "status_bar_height";

        /* renamed from: b */
        private static final String f4176b = "navigation_bar_height";

        /* renamed from: c */
        private static final String f4177c = "navigation_bar_height_landscape";

        /* renamed from: d */
        private static final String f4178d = "navigation_bar_width";

        /* renamed from: e */
        private final boolean f4179e;

        /* renamed from: f */
        private final boolean f4180f;

        /* renamed from: g */
        private final int f4181g;

        /* renamed from: h */
        private final int f4182h;

        /* renamed from: i */
        private final boolean f4183i;

        /* renamed from: j */
        private final int f4184j;

        /* renamed from: k */
        private final int f4185k;

        /* renamed from: l */
        private final boolean f4186l;

        /* renamed from: m */
        private final float f4187m;

        private C1684a(Activity activity, boolean z, boolean z2) {
            boolean z3 = true;
            Resources resources = activity.getResources();
            this.f4186l = resources.getConfiguration().orientation == 1;
            this.f4187m = m34471a(activity);
            this.f4181g = m34469a(resources, f4175a);
            this.f4182h = m34470a((Context) activity);
            this.f4184j = m34466b(activity);
            this.f4185k = m34464c(activity);
            this.f4183i = this.f4184j <= 0 ? false : z3;
            this.f4179e = z;
            this.f4180f = z2;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        private float m34471a(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(displayMetrics.widthPixels / displayMetrics.density, displayMetrics.heightPixels / displayMetrics.density);
        }

        @TargetApi(14)
        /* renamed from: a */
        private int m34470a(Context context) {
            if (Build.VERSION.SDK_INT >= 14) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16843499, typedValue, true);
                return context.getResources().getDimensionPixelSize(typedValue.resourceId);
            }
            return 0;
        }

        /* renamed from: a */
        private int m34469a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        /* renamed from: b */
        private int m34466b(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return m34469a(resources, this.f4186l ? f4176b : f4177c);
        }

        @TargetApi(14)
        /* renamed from: c */
        private int m34464c(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return m34469a(resources, f4178d);
        }

        /* renamed from: a */
        public int m34468a(boolean z) {
            int i = 0;
            int i2 = this.f4179e ? this.f4181g : 0;
            if (z) {
                i = this.f4182h;
            }
            return i + i2;
        }

        /* renamed from: a */
        public boolean m34472a() {
            return this.f4187m >= 600.0f || this.f4186l;
        }

        /* renamed from: b */
        public int m34467b() {
            return this.f4181g;
        }

        /* renamed from: c */
        public int m34465c() {
            return this.f4182h;
        }

        /* renamed from: d */
        public boolean m34463d() {
            return this.f4183i;
        }

        /* renamed from: e */
        public int m34462e() {
            return this.f4184j;
        }

        /* renamed from: f */
        public int m34461f() {
            return this.f4185k;
        }

        /* renamed from: g */
        public int m34460g() {
            if (!this.f4180f || !m34472a()) {
                return 0;
            }
            return this.f4184j;
        }

        /* renamed from: h */
        public int m34459h() {
            if (!this.f4180f || m34472a()) {
                return 0;
            }
            return this.f4185k;
        }
    }

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f4167i = "V6".equals((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(19)
    public C1682w(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f4169c = obtainStyledAttributes.getBoolean(0, false);
                this.f4170d = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if ((67108864 & attributes.flags) != 0) {
                    this.f4169c = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.f4170d = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f4168b = new C1684a(activity, this.f4169c, this.f4170d);
        if (!this.f4168b.m34463d()) {
            this.f4170d = false;
        }
        if (this.f4169c) {
            m34489a(activity, viewGroup);
        }
        if (this.f4170d) {
            m34482b(activity, viewGroup);
        }
    }

    /* renamed from: a */
    private void m34489a(Context context, ViewGroup viewGroup) {
        this.f4173g = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f4168b.m34467b());
        layoutParams.gravity = 48;
        if (this.f4170d && !this.f4168b.m34472a()) {
            layoutParams.rightMargin = this.f4168b.m34461f();
        }
        this.f4173g.setLayoutParams(layoutParams);
        this.f4173g.setBackgroundColor(-1728053248);
        this.f4173g.setVisibility(8);
        viewGroup.addView(this.f4173g);
    }

    /* renamed from: b */
    private void m34482b(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f4174h = new View(context);
        if (this.f4168b.m34472a()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f4168b.m34462e());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f4168b.m34461f(), -1);
            layoutParams.gravity = 5;
        }
        this.f4174h.setLayoutParams(layoutParams);
        this.f4174h.setBackgroundColor(-1728053248);
        this.f4174h.setVisibility(8);
        viewGroup.addView(this.f4174h);
    }

    /* renamed from: a */
    public C1684a m34492a() {
        return this.f4168b;
    }

    /* renamed from: a */
    public void m34491a(float f) {
        m34484b(f);
        m34478c(f);
    }

    /* renamed from: a */
    public void m34490a(int i) {
        m34477c(i);
        m34474e(i);
    }

    /* renamed from: a */
    public void m34488a(Drawable drawable) {
        m34481b(drawable);
        m34476c(drawable);
    }

    /* renamed from: a */
    public void m34487a(boolean z) {
        this.f4171e = z;
        if (this.f4169c) {
            this.f4173g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void m34486a(boolean z, Activity activity) {
        int i = 0;
        if (f4167i) {
            Class<?> cls = activity.getWindow().getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                Window window = activity.getWindow();
                Object[] objArr = new Object[2];
                if (z) {
                    i = i2;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                method.invoke(window, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @TargetApi(11)
    /* renamed from: b */
    public void m34484b(float f) {
        if (!this.f4169c || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f4173g.setAlpha(f);
    }

    /* renamed from: b */
    public void m34483b(int i) {
        m34475d(i);
        m34473f(i);
    }

    /* renamed from: b */
    public void m34481b(Drawable drawable) {
        if (this.f4169c) {
            this.f4173g.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    public void m34480b(boolean z) {
        this.f4172f = z;
        if (this.f4170d) {
            this.f4174h.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: b */
    public boolean m34485b() {
        return this.f4171e;
    }

    @TargetApi(11)
    /* renamed from: c */
    public void m34478c(float f) {
        if (!this.f4170d || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f4174h.setAlpha(f);
    }

    /* renamed from: c */
    public void m34477c(int i) {
        if (this.f4169c) {
            this.f4173g.setBackgroundColor(i);
        }
    }

    /* renamed from: c */
    public void m34476c(Drawable drawable) {
        if (this.f4170d) {
            this.f4174h.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: c */
    public boolean m34479c() {
        return this.f4172f;
    }

    /* renamed from: d */
    public void m34475d(int i) {
        if (this.f4169c) {
            this.f4173g.setBackgroundResource(i);
        }
    }

    /* renamed from: e */
    public void m34474e(int i) {
        if (this.f4170d) {
            this.f4174h.setBackgroundColor(i);
        }
    }

    /* renamed from: f */
    public void m34473f(int i) {
        if (this.f4170d) {
            this.f4174h.setBackgroundResource(i);
        }
    }
}
