package com.fimi.soul.utils;

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
/* renamed from: com.fimi.soul.utils.at */
/* loaded from: classes.dex */
public class C3100at {

    /* renamed from: a */
    public static final int f11566a = -1728053248;

    /* renamed from: i */
    private static boolean f11567i;

    /* renamed from: b */
    private final C3102a f11568b;

    /* renamed from: c */
    private boolean f11569c;

    /* renamed from: d */
    private boolean f11570d;

    /* renamed from: e */
    private boolean f11571e;

    /* renamed from: f */
    private boolean f11572f;

    /* renamed from: g */
    private View f11573g;

    /* renamed from: h */
    private View f11574h;

    /* renamed from: com.fimi.soul.utils.at$a */
    /* loaded from: classes.dex */
    public static class C3102a {

        /* renamed from: a */
        private static final String f11575a = "status_bar_height";

        /* renamed from: b */
        private static final String f11576b = "navigation_bar_height";

        /* renamed from: c */
        private static final String f11577c = "navigation_bar_height_landscape";

        /* renamed from: d */
        private static final String f11578d = "navigation_bar_width";

        /* renamed from: e */
        private final boolean f11579e;

        /* renamed from: f */
        private final boolean f11580f;

        /* renamed from: g */
        private final int f11581g;

        /* renamed from: h */
        private final int f11582h;

        /* renamed from: i */
        private final boolean f11583i;

        /* renamed from: j */
        private final int f11584j;

        /* renamed from: k */
        private final int f11585k;

        /* renamed from: l */
        private final boolean f11586l;

        /* renamed from: m */
        private final float f11587m;

        private C3102a(Activity activity, boolean z, boolean z2) {
            boolean z3 = true;
            Resources resources = activity.getResources();
            this.f11586l = resources.getConfiguration().orientation == 1;
            this.f11587m = m29256a(activity);
            this.f11581g = m29254a(resources, f11575a);
            this.f11582h = m29255a((Context) activity);
            this.f11584j = m29251b(activity);
            this.f11585k = m29249c(activity);
            this.f11583i = this.f11584j <= 0 ? false : z3;
            this.f11579e = z;
            this.f11580f = z2;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        private float m29256a(Activity activity) {
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
        private int m29255a(Context context) {
            if (Build.VERSION.SDK_INT >= 14) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16843499, typedValue, true);
                return context.getResources().getDimensionPixelSize(typedValue.resourceId);
            }
            return 0;
        }

        /* renamed from: a */
        private int m29254a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        /* renamed from: b */
        private int m29251b(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return m29254a(resources, this.f11586l ? f11576b : f11577c);
        }

        @TargetApi(14)
        /* renamed from: c */
        private int m29249c(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return m29254a(resources, f11578d);
        }

        /* renamed from: a */
        public int m29253a(boolean z) {
            int i = 0;
            int i2 = this.f11579e ? this.f11581g : 0;
            if (z) {
                i = this.f11582h;
            }
            return i + i2;
        }

        /* renamed from: a */
        public boolean m29257a() {
            return this.f11587m >= 600.0f || this.f11586l;
        }

        /* renamed from: b */
        public int m29252b() {
            return this.f11581g;
        }

        /* renamed from: c */
        public int m29250c() {
            return this.f11582h;
        }

        /* renamed from: d */
        public boolean m29248d() {
            return this.f11583i;
        }

        /* renamed from: e */
        public int m29247e() {
            return this.f11584j;
        }

        /* renamed from: f */
        public int m29246f() {
            return this.f11585k;
        }

        /* renamed from: g */
        public int m29245g() {
            if (!this.f11580f || !m29257a()) {
                return 0;
            }
            return this.f11584j;
        }

        /* renamed from: h */
        public int m29244h() {
            if (!this.f11580f || m29257a()) {
                return 0;
            }
            return this.f11585k;
        }
    }

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f11567i = "V6".equals((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(19)
    public C3100at(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f11569c = obtainStyledAttributes.getBoolean(0, false);
                this.f11570d = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if ((67108864 & attributes.flags) != 0) {
                    this.f11569c = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.f11570d = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f11568b = new C3102a(activity, this.f11569c, this.f11570d);
        if (!this.f11568b.m29248d()) {
            this.f11570d = false;
        }
        if (this.f11569c) {
            m29274a(activity, viewGroup);
        }
        if (this.f11570d) {
            m29267b(activity, viewGroup);
        }
    }

    /* renamed from: a */
    private void m29274a(Context context, ViewGroup viewGroup) {
        this.f11573g = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f11568b.m29252b());
        layoutParams.gravity = 48;
        if (this.f11570d && !this.f11568b.m29257a()) {
            layoutParams.rightMargin = this.f11568b.m29246f();
        }
        this.f11573g.setLayoutParams(layoutParams);
        this.f11573g.setBackgroundColor(-1728053248);
        this.f11573g.setVisibility(8);
        viewGroup.addView(this.f11573g);
    }

    /* renamed from: b */
    private void m29267b(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f11574h = new View(context);
        if (this.f11568b.m29257a()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f11568b.m29247e());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f11568b.m29246f(), -1);
            layoutParams.gravity = 5;
        }
        this.f11574h.setLayoutParams(layoutParams);
        this.f11574h.setBackgroundColor(-1728053248);
        this.f11574h.setVisibility(8);
        viewGroup.addView(this.f11574h);
    }

    /* renamed from: a */
    public C3102a m29277a() {
        return this.f11568b;
    }

    /* renamed from: a */
    public void m29276a(float f) {
        m29269b(f);
        m29263c(f);
    }

    /* renamed from: a */
    public void m29275a(int i) {
        m29262c(i);
        m29259e(i);
    }

    /* renamed from: a */
    public void m29273a(Drawable drawable) {
        m29266b(drawable);
        m29261c(drawable);
    }

    /* renamed from: a */
    public void m29272a(boolean z) {
        this.f11571e = z;
        if (this.f11569c) {
            this.f11573g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void m29271a(boolean z, Activity activity) {
        int i = 0;
        if (f11567i) {
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
    public void m29269b(float f) {
        if (!this.f11569c || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f11573g.setAlpha(f);
    }

    /* renamed from: b */
    public void m29268b(int i) {
        m29260d(i);
        m29258f(i);
    }

    /* renamed from: b */
    public void m29266b(Drawable drawable) {
        if (this.f11569c) {
            this.f11573g.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    public void m29265b(boolean z) {
        this.f11572f = z;
        if (this.f11570d) {
            this.f11574h.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: b */
    public boolean m29270b() {
        return this.f11571e;
    }

    @TargetApi(11)
    /* renamed from: c */
    public void m29263c(float f) {
        if (!this.f11570d || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f11574h.setAlpha(f);
    }

    /* renamed from: c */
    public void m29262c(int i) {
        if (this.f11569c) {
            this.f11573g.setBackgroundColor(i);
        }
    }

    /* renamed from: c */
    public void m29261c(Drawable drawable) {
        if (this.f11570d) {
            this.f11574h.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: c */
    public boolean m29264c() {
        return this.f11572f;
    }

    /* renamed from: d */
    public void m29260d(int i) {
        if (this.f11569c) {
            this.f11573g.setBackgroundResource(i);
        }
    }

    /* renamed from: e */
    public void m29259e(int i) {
        if (this.f11570d) {
            this.f11574h.setBackgroundColor(i);
        }
    }

    /* renamed from: f */
    public void m29258f(int i) {
        if (this.f11570d) {
            this.f11574h.setBackgroundResource(i);
        }
    }
}
