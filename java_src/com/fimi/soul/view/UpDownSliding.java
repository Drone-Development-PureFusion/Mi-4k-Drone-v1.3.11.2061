package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes2.dex */
public class UpDownSliding extends RelativeLayout {

    /* renamed from: B */
    private static final int f12382B = 1;

    /* renamed from: C */
    private static final int f12383C = 2;

    /* renamed from: r */
    private static final int f12384r = 0;

    /* renamed from: s */
    private static final int f12385s = 1;

    /* renamed from: t */
    private static final int f12386t = 2;

    /* renamed from: u */
    private static final int f12387u = 3;

    /* renamed from: y */
    private static int f12388y = -1;

    /* renamed from: z */
    private static int f12389z = -2130706433;

    /* renamed from: a */
    int f12392a;

    /* renamed from: b */
    int f12393b;

    /* renamed from: c */
    int f12394c;

    /* renamed from: d */
    int f12395d;

    /* renamed from: g */
    private int[] f12398g;

    /* renamed from: h */
    private int[] f12399h;

    /* renamed from: i */
    private int[] f12400i;

    /* renamed from: j */
    private LinearLayout[] f12401j;

    /* renamed from: k */
    private ImageView f12402k;

    /* renamed from: l */
    private VelocityTracker f12403l;

    /* renamed from: m */
    private TextView[] f12404m;

    /* renamed from: n */
    private AbstractC3202c f12405n;

    /* renamed from: v */
    private RelativeLayout.LayoutParams f12409v;

    /* renamed from: w */
    private RelativeLayout.LayoutParams f12410w;

    /* renamed from: x */
    private RelativeLayout.LayoutParams f12411x;

    /* renamed from: f */
    private String[] f12397f = {getResources().getString(C1704R.C1707string.video), getResources().getString(C1704R.C1707string.photograph), getResources().getString(C1704R.C1707string.stream_live)};

    /* renamed from: e */
    boolean f12396e = false;

    /* renamed from: o */
    private Boolean f12406o = false;

    /* renamed from: p */
    private EnumC3201b f12407p = EnumC3201b.TakePhoto;

    /* renamed from: q */
    private final int f12408q = 10;

    /* renamed from: A */
    private EnumC3201b f12390A = EnumC3201b.TakePhoto;

    /* renamed from: D */
    private Handler f12391D = new Handler() { // from class: com.fimi.soul.view.UpDownSliding.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    UpDownSliding.this.m28779a(EnumC3201b.TakePhoto, EnumC3201b.Live);
                    return;
                case 1:
                    UpDownSliding.this.m28779a(EnumC3201b.TakePhoto, EnumC3201b.Record);
                    return;
                case 2:
                    UpDownSliding.this.m28781a(2, EnumC3200a.DOWN, (Boolean) true);
                    return;
                case 3:
                    UpDownSliding.this.m28781a(1, EnumC3200a.UP, (Boolean) true);
                    return;
                default:
                    return;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.view.UpDownSliding$a */
    /* loaded from: classes2.dex */
    public enum EnumC3200a {
        UP,
        DOWN
    }

    /* renamed from: com.fimi.soul.view.UpDownSliding$b */
    /* loaded from: classes2.dex */
    public enum EnumC3201b {
        Record(0),
        TakePhoto(1),
        Live(2);
        

        /* renamed from: d */
        private int f12427d;

        EnumC3201b(int i) {
            this.f12427d = i;
        }

        /* renamed from: a */
        public int m28769a() {
            return this.f12427d;
        }
    }

    /* renamed from: com.fimi.soul.view.UpDownSliding$c */
    /* loaded from: classes2.dex */
    public interface AbstractC3202c {
        /* renamed from: a */
        void mo28768a(EnumC3201b enumC3201b);
    }

    public UpDownSliding(Context context) {
        super(context);
        m28780a(context);
    }

    public UpDownSliding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28780a(context);
    }

    public UpDownSliding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28780a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28779a(EnumC3201b enumC3201b, EnumC3201b enumC3201b2) {
        if (enumC3201b == EnumC3201b.Record && enumC3201b2 == EnumC3201b.TakePhoto) {
            m28781a(2, EnumC3200a.UP, (Boolean) false);
        } else if (enumC3201b == EnumC3201b.TakePhoto && enumC3201b2 == EnumC3201b.Live) {
            m28781a(1, EnumC3200a.UP, (Boolean) false);
        } else if (enumC3201b == EnumC3201b.Live && enumC3201b2 == EnumC3201b.TakePhoto) {
            m28781a(1, EnumC3200a.DOWN, (Boolean) false);
        } else if (enumC3201b == EnumC3201b.TakePhoto && enumC3201b2 == EnumC3201b.Record) {
            m28781a(2, EnumC3200a.DOWN, (Boolean) false);
        } else if (enumC3201b == EnumC3201b.Record && enumC3201b2 == EnumC3201b.Live) {
            m28779a(EnumC3201b.Record, EnumC3201b.TakePhoto);
            this.f12391D.sendEmptyMessageAtTime(0, 1000L);
        } else if (enumC3201b != EnumC3201b.Live || enumC3201b2 != EnumC3201b.Record) {
        } else {
            m28779a(EnumC3201b.Live, EnumC3201b.TakePhoto);
            this.f12391D.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* renamed from: a */
    public void m28781a(int i, EnumC3200a enumC3200a, Boolean bool) {
        ValueAnimator ofInt;
        ValueAnimator ofInt2;
        ValueAnimator ofInt3 = enumC3200a == EnumC3200a.DOWN ? ValueAnimator.ofInt(this.f12409v.topMargin, this.f12400i[i]) : ValueAnimator.ofInt(this.f12409v.topMargin, this.f12400i[i - 1]);
        switch (i) {
            case 1:
                if (enumC3200a == EnumC3200a.DOWN) {
                    ofInt2 = ValueAnimator.ofInt(0, this.f12399h[0]);
                    this.f12404m[0].setTextColor(f12389z);
                    this.f12404m[1].setTextColor(f12388y);
                    this.f12404m[2].setTextColor(f12389z);
                    this.f12407p = EnumC3201b.TakePhoto;
                } else {
                    ofInt2 = ValueAnimator.ofInt(this.f12399h[0], 0);
                    this.f12404m[0].setTextColor(f12389z);
                    this.f12404m[1].setTextColor(f12389z);
                    this.f12404m[2].setTextColor(f12388y);
                    this.f12407p = EnumC3201b.Live;
                }
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.UpDownSliding.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        UpDownSliding.this.f12409v.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UpDownSliding.this.f12411x.leftMargin = (((Integer) valueAnimator.getAnimatedValue()).intValue() / (UpDownSliding.this.f12394c / UpDownSliding.this.f12395d)) + UpDownSliding.this.f12394c;
                        UpDownSliding.this.f12410w.leftMargin = UpDownSliding.this.f12399h[1] - (((Integer) valueAnimator.getAnimatedValue()).intValue() / (UpDownSliding.this.f12394c / UpDownSliding.this.f12395d));
                    }
                });
                ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.UpDownSliding.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        UpDownSliding.this.f12409v.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UpDownSliding.this.f12411x.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.f12392a;
                        UpDownSliding.this.f12410w.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + (UpDownSliding.this.f12392a * 2);
                        UpDownSliding.this.f12401j[0].setLayoutParams(UpDownSliding.this.f12409v);
                        UpDownSliding.this.f12401j[1].setLayoutParams(UpDownSliding.this.f12411x);
                        UpDownSliding.this.f12401j[2].setLayoutParams(UpDownSliding.this.f12410w);
                    }
                });
                if (this.f12405n != null && bool.booleanValue()) {
                    this.f12405n.mo28768a(this.f12407p);
                    C1642c.m34885e().m34545a(this.f12407p.m28769a());
                }
                ofInt2.setDuration(250L);
                ofInt3.setDuration(250L);
                ofInt2.start();
                ofInt3.start();
                return;
            case 2:
                if (enumC3200a == EnumC3200a.DOWN) {
                    ofInt = ValueAnimator.ofInt(this.f12399h[0], this.f12399h[1]);
                    this.f12404m[0].setTextColor(f12388y);
                    this.f12404m[1].setTextColor(f12389z);
                    this.f12404m[2].setTextColor(f12389z);
                    this.f12407p = EnumC3201b.Record;
                } else {
                    ofInt = ValueAnimator.ofInt(this.f12399h[1], this.f12399h[0]);
                    this.f12404m[0].setTextColor(f12389z);
                    this.f12404m[1].setTextColor(f12388y);
                    this.f12404m[2].setTextColor(f12389z);
                    this.f12407p = EnumC3201b.TakePhoto;
                }
                ofInt.setDuration(500L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.UpDownSliding.5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        UpDownSliding.this.f12409v.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UpDownSliding.this.f12411x.leftMargin = UpDownSliding.this.f12399h[1] - (((Integer) valueAnimator.getAnimatedValue()).intValue() - UpDownSliding.this.f12399h[0]);
                        UpDownSliding.this.f12410w.leftMargin = (UpDownSliding.this.f12399h[1] - ((Integer) valueAnimator.getAnimatedValue()).intValue()) * (UpDownSliding.this.f12394c / UpDownSliding.this.f12395d);
                    }
                });
                ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.UpDownSliding.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        UpDownSliding.this.f12409v.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UpDownSliding.this.f12411x.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.f12392a;
                        UpDownSliding.this.f12410w.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue() + (UpDownSliding.this.f12392a * 2);
                        UpDownSliding.this.f12401j[0].setLayoutParams(UpDownSliding.this.f12409v);
                        UpDownSliding.this.f12401j[1].setLayoutParams(UpDownSliding.this.f12411x);
                        UpDownSliding.this.f12401j[2].setLayoutParams(UpDownSliding.this.f12410w);
                    }
                });
                if (this.f12405n != null && bool.booleanValue()) {
                    this.f12405n.mo28768a(this.f12407p);
                    C1642c.m34885e().m34545a(this.f12407p.m28769a());
                }
                ofInt.setDuration(250L);
                ofInt3.setDuration(250L);
                ofInt.start();
                ofInt3.start();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m28780a(Context context) {
        this.f12392a = (int) getResources().getDimension(C1704R.dimen.updownsliding_top_margin);
        this.f12394c = (int) getResources().getDimension(C1704R.dimen.updownsliding_left_margin);
        this.f12395d = (int) getResources().getDimension(C1704R.dimen.updownsliding_left_second_margin);
        this.f12393b = (int) getResources().getDimension(C1704R.dimen.updownaliding_textsize);
        this.f12398g = new int[]{this.f12392a, this.f12392a * 2, this.f12392a * 3};
        this.f12399h = new int[]{this.f12394c, this.f12394c + this.f12395d, this.f12394c};
        this.f12400i = new int[]{0, this.f12392a, this.f12392a * 2};
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f12401j = new LinearLayout[3];
        this.f12404m = new TextView[3];
        for (final int i = 0; i < this.f12397f.length; i++) {
            this.f12401j[i] = new LinearLayout(context);
            this.f12404m[i] = new TextView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f12404m[i].setTextColor(-1);
            this.f12404m[i].setText(this.f12397f[i]);
            this.f12404m[i].setTextSize(0, this.f12393b);
            this.f12404m[i].setTextColor(f12389z);
            this.f12404m[i].setLayoutParams(layoutParams);
            this.f12404m[i].setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.UpDownSliding.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (UpDownSliding.this.isEnabled() && i != UpDownSliding.this.f12407p.m28769a()) {
                        if (i == EnumC3201b.Record.m28769a() && UpDownSliding.this.f12407p == EnumC3201b.TakePhoto) {
                            UpDownSliding.this.m28781a(2, EnumC3200a.DOWN, (Boolean) true);
                        } else if (i == EnumC3201b.TakePhoto.m28769a() && UpDownSliding.this.f12407p == EnumC3201b.Record) {
                            UpDownSliding.this.m28781a(2, EnumC3200a.UP, (Boolean) true);
                        } else if (i == EnumC3201b.Record.m28769a() && UpDownSliding.this.f12407p == EnumC3201b.Live) {
                            UpDownSliding.this.m28781a(1, EnumC3200a.DOWN, (Boolean) false);
                            UpDownSliding.this.f12391D.sendEmptyMessageAtTime(2, 1000L);
                        } else if (i == EnumC3201b.TakePhoto.m28769a() && UpDownSliding.this.f12407p == EnumC3201b.Live) {
                            UpDownSliding.this.m28781a(1, EnumC3200a.DOWN, (Boolean) true);
                        } else if (i == EnumC3201b.Live.m28769a() && UpDownSliding.this.f12407p == EnumC3201b.Record) {
                            UpDownSliding.this.m28781a(2, EnumC3200a.UP, (Boolean) false);
                            UpDownSliding.this.f12391D.sendEmptyMessageAtTime(3, 1000L);
                        } else if (i != EnumC3201b.Live.m28769a() || UpDownSliding.this.f12407p != EnumC3201b.TakePhoto) {
                        } else {
                            UpDownSliding.this.m28781a(1, EnumC3200a.UP, (Boolean) true);
                        }
                    }
                }
            });
            C3103au.m29232a(context.getAssets(), this.f12404m[i]);
            this.f12404m[i].getPaint().setFakeBoldText(true);
            this.f12401j[i].setId(i + 100);
            this.f12401j[i].addView(this.f12404m[i]);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.topMargin = this.f12398g[i];
            layoutParams2.leftMargin = this.f12399h[i];
            this.f12401j[i].setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f12401j[i]);
        }
        relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f12404m[0].getMeasuredHeight();
        int measuredWidth = this.f12404m[0].getMeasuredWidth();
        this.f12404m[1].setTextColor(f12388y);
        if (C1772d.m34208a().m34187k()) {
            this.f12404m[2].setVisibility(8);
            this.f12404m[2].setEnabled(false);
        } else {
            this.f12404m[2].setVisibility(0);
            this.f12404m[2].setEnabled(true);
        }
        this.f12402k = new ImageView(context);
        this.f12402k.setBackgroundResource(C1704R.C1705drawable.mode_selected_dot);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int dimension = (int) getResources().getDimension(C1704R.dimen.updownsliding_dot_diameter);
        layoutParams3.height = dimension;
        layoutParams3.width = dimension;
        layoutParams3.topMargin = ((this.f12392a * 2) + (measuredHeight / 2)) - (dimension / 2);
        layoutParams3.leftMargin = (int) (measuredWidth + this.f12399h[1] + getResources().getDimension(C1704R.dimen.updownsliding_dot_text) + (dimension / 5));
        this.f12402k.setLayoutParams(layoutParams3);
        relativeLayout.addView(this.f12402k);
        addView(relativeLayout);
        this.f12409v = (RelativeLayout.LayoutParams) this.f12401j[0].getLayoutParams();
        this.f12411x = (RelativeLayout.LayoutParams) this.f12401j[1].getLayoutParams();
        this.f12410w = (RelativeLayout.LayoutParams) this.f12401j[2].getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams4.height = ((this.f12392a * 2) + (measuredHeight / 2)) * 2;
        relativeLayout.setLayoutParams(layoutParams4);
    }

    /* renamed from: b */
    public void m28776b(Context context) {
        this.f12404m[2].setVisibility(8);
        this.f12404m[2].setEnabled(false);
        setState(EnumC3201b.TakePhoto);
    }

    public EnumC3201b getCurrentState() {
        EnumC3201b enumC3201b = EnumC3201b.Record;
        switch (C1642c.m34885e().m34534c()) {
            case 0:
                return EnumC3201b.Record;
            case 1:
                return EnumC3201b.TakePhoto;
            case 2:
                return EnumC3201b.Live;
            default:
                return enumC3201b;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f12403l == null) {
                    this.f12403l = VelocityTracker.obtain();
                } else {
                    this.f12403l.clear();
                }
                this.f12403l.addMovement(motionEvent);
                this.f12396e = true;
                break;
            case 1:
                this.f12403l.recycle();
                this.f12403l = null;
                break;
            case 2:
                this.f12403l.addMovement(motionEvent);
                this.f12403l.computeCurrentVelocity(1000);
                if (Math.abs(this.f12403l.getYVelocity()) >= 10.0f) {
                    if (this.f12396e) {
                        this.f12396e = false;
                        if (this.f12403l.getYVelocity() <= 0.0f) {
                            if (this.f12403l.getYVelocity() < 0.0f) {
                                int i = 0;
                                while (true) {
                                    if (i >= this.f12400i.length) {
                                        i = 0;
                                    } else if (this.f12400i[i] != this.f12409v.topMargin) {
                                        i++;
                                    }
                                }
                                if (i != 0) {
                                    if (i != 1) {
                                        if (i == 2) {
                                            this.f12390A = EnumC3201b.TakePhoto;
                                        }
                                        m28781a(i, EnumC3200a.UP, (Boolean) true);
                                        break;
                                    } else {
                                        this.f12390A = EnumC3201b.Live;
                                        return super.onTouchEvent(motionEvent);
                                    }
                                } else {
                                    return super.onTouchEvent(motionEvent);
                                }
                            }
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= this.f12400i.length) {
                                    i2 = 0;
                                } else if (this.f12400i[i2] != this.f12409v.topMargin) {
                                    i2++;
                                }
                            }
                            if (i2 != 2) {
                                if (i2 + 1 == 1) {
                                    this.f12390A = EnumC3201b.TakePhoto;
                                }
                                if (i2 + 1 == 2) {
                                    this.f12390A = EnumC3201b.Record;
                                }
                                m28781a(i2 + 1, EnumC3200a.DOWN, (Boolean) true);
                                break;
                            } else {
                                return super.onTouchEvent(motionEvent);
                            }
                        }
                    }
                } else {
                    return super.onTouchEvent(motionEvent);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnUpDownSliding(AbstractC3202c abstractC3202c) {
        this.f12405n = abstractC3202c;
    }

    public void setState(EnumC3201b enumC3201b) {
        if (enumC3201b == this.f12390A) {
            return;
        }
        this.f12390A = enumC3201b;
        if (this.f12406o.booleanValue()) {
            m28779a(this.f12407p, enumC3201b);
            return;
        }
        this.f12406o = true;
        switch (enumC3201b) {
            case Record:
                this.f12409v.topMargin = this.f12398g[1];
                this.f12411x.topMargin = this.f12398g[2];
                this.f12410w.topMargin = this.f12392a * 4;
                this.f12409v.leftMargin = this.f12399h[1];
                this.f12411x.leftMargin = this.f12399h[2];
                this.f12410w.leftMargin = 0;
                this.f12404m[0].setTextColor(f12388y);
                this.f12404m[1].setTextColor(f12389z);
                this.f12404m[2].setTextColor(f12389z);
                this.f12407p = EnumC3201b.Record;
                break;
            case TakePhoto:
                this.f12409v.topMargin = this.f12398g[0];
                this.f12411x.topMargin = this.f12398g[1];
                this.f12410w.topMargin = this.f12398g[2];
                this.f12409v.leftMargin = this.f12399h[0];
                this.f12411x.leftMargin = this.f12399h[1];
                this.f12410w.leftMargin = this.f12399h[2];
                this.f12404m[0].setTextColor(f12389z);
                this.f12404m[1].setTextColor(f12388y);
                this.f12404m[2].setTextColor(f12389z);
                this.f12407p = EnumC3201b.TakePhoto;
                break;
            case Live:
                this.f12409v.topMargin = 0;
                this.f12411x.topMargin = this.f12398g[0];
                this.f12410w.topMargin = this.f12398g[1];
                this.f12409v.leftMargin = 0;
                this.f12411x.leftMargin = this.f12399h[0];
                this.f12410w.leftMargin = this.f12399h[1];
                this.f12404m[0].setTextColor(f12389z);
                this.f12404m[1].setTextColor(f12389z);
                this.f12404m[2].setTextColor(f12388y);
                this.f12407p = EnumC3201b.Live;
                break;
        }
        this.f12401j[0].setLayoutParams(this.f12409v);
        this.f12401j[1].setLayoutParams(this.f12411x);
        this.f12401j[2].setLayoutParams(this.f12410w);
    }
}
