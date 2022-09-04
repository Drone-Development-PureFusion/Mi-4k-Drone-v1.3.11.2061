package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.common.util.C4696s;
/* loaded from: classes2.dex */
public final class aja extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private int f21983a;

    /* renamed from: b */
    private long f21984b;

    /* renamed from: c */
    private int f21985c;

    /* renamed from: d */
    private int f21986d;

    /* renamed from: e */
    private int f21987e;

    /* renamed from: f */
    private int f21988f;

    /* renamed from: g */
    private int f21989g;

    /* renamed from: h */
    private boolean f21990h;

    /* renamed from: i */
    private boolean f21991i;

    /* renamed from: j */
    private C6403b f21992j;

    /* renamed from: k */
    private Drawable f21993k;

    /* renamed from: l */
    private Drawable f21994l;

    /* renamed from: m */
    private boolean f21995m;

    /* renamed from: n */
    private boolean f21996n;

    /* renamed from: o */
    private boolean f21997o;

    /* renamed from: p */
    private int f21998p;

    /* renamed from: com.google.android.gms.internal.aja$a */
    /* loaded from: classes2.dex */
    private static final class C6401a extends Drawable {

        /* renamed from: a */
        private static final C6401a f21999a = new C6401a();

        /* renamed from: b */
        private static final C6402a f22000b = new C6402a();

        /* renamed from: com.google.android.gms.internal.aja$a$a */
        /* loaded from: classes2.dex */
        private static final class C6402a extends Drawable.ConstantState {
            private C6402a() {
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public int getChangingConfigurations() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public Drawable newDrawable() {
                return C6401a.f21999a;
            }
        }

        private C6401a() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable.ConstantState getConstantState() {
            return f22000b;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aja$b */
    /* loaded from: classes2.dex */
    public static final class C6403b extends Drawable.ConstantState {

        /* renamed from: a */
        int f22001a;

        /* renamed from: b */
        int f22002b;

        C6403b(C6403b c6403b) {
            if (c6403b != null) {
                this.f22001a = c6403b.f22001a;
                this.f22002b = c6403b.f22002b;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f22001a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new aja(this);
        }
    }

    public aja(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? C6401a.f21999a : drawable;
        this.f21993k = drawable;
        drawable.setCallback(this);
        this.f21992j.f22002b |= drawable.getChangingConfigurations();
        drawable2 = drawable2 == null ? C6401a.f21999a : drawable2;
        this.f21994l = drawable2;
        drawable2.setCallback(this);
        this.f21992j.f22002b |= drawable2.getChangingConfigurations();
    }

    aja(C6403b c6403b) {
        this.f21983a = 0;
        this.f21987e = 255;
        this.f21989g = 0;
        this.f21990h = true;
        this.f21992j = new C6403b(c6403b);
    }

    /* renamed from: a */
    public void m17142a(int i) {
        this.f21985c = 0;
        this.f21986d = this.f21987e;
        this.f21989g = 0;
        this.f21988f = i;
        this.f21983a = 1;
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean m17143a() {
        if (!this.f21995m) {
            this.f21996n = (this.f21993k.getConstantState() == null || this.f21994l.getConstantState() == null) ? false : true;
            this.f21995m = true;
        }
        return this.f21996n;
    }

    /* renamed from: b */
    public Drawable m17141b() {
        return this.f21994l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        switch (this.f21983a) {
            case 1:
                this.f21984b = SystemClock.uptimeMillis();
                this.f21983a = 2;
                break;
            case 2:
                if (this.f21984b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f21984b)) / this.f21988f;
                    if (uptimeMillis < 1.0f) {
                        z = false;
                    }
                    if (z) {
                        this.f21983a = 0;
                    }
                    this.f21989g = (int) ((Math.min(uptimeMillis, 1.0f) * (this.f21986d + 0)) + 0.0f);
                }
            default:
                z2 = z;
                break;
        }
        int i = this.f21989g;
        boolean z3 = this.f21990h;
        Drawable drawable = this.f21993k;
        Drawable drawable2 = this.f21994l;
        if (z2) {
            if (!z3 || i == 0) {
                drawable.draw(canvas);
            }
            if (i != this.f21987e) {
                return;
            }
            drawable2.setAlpha(this.f21987e);
            drawable2.draw(canvas);
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f21987e - i);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f21987e);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f21987e);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f21992j.f22001a | this.f21992j.f22002b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (m17143a()) {
            this.f21992j.f22001a = getChangingConfigurations();
            return this.f21992j;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f21993k.getIntrinsicHeight(), this.f21994l.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f21993k.getIntrinsicWidth(), this.f21994l.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (!this.f21997o) {
            this.f21998p = Drawable.resolveOpacity(this.f21993k.getOpacity(), this.f21994l.getOpacity());
            this.f21997o = true;
        }
        return this.f21998p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    @TargetApi(11)
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (!C4696s.m23114a() || (callback = getCallback()) == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f21991i && super.mutate() == this) {
            if (!m17143a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f21993k.mutate();
            this.f21994l.mutate();
            this.f21991i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21993k.setBounds(rect);
        this.f21994l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    @TargetApi(11)
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (!C4696s.m23114a() || (callback = getCallback()) == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f21989g == this.f21987e) {
            this.f21989g = i;
        }
        this.f21987e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21993k.setColorFilter(colorFilter);
        this.f21994l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    @TargetApi(11)
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (!C4696s.m23114a() || (callback = getCallback()) == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
