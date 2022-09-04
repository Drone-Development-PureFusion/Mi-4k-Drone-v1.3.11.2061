package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.C1675p;
import com.fimi.overseas.soul.C1704R;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes2.dex */
public class RemoteRollerView extends View {

    /* renamed from: A */
    private static final float f12177A = 0.1718f;

    /* renamed from: B */
    private static final float f12178B = 0.35f;

    /* renamed from: C */
    private static final float f12179C = 0.522f;

    /* renamed from: D */
    private static final int f12180D = 21;

    /* renamed from: E */
    private static final int f12181E = 22;

    /* renamed from: a */
    public static final int f12182a = 0;

    /* renamed from: b */
    public static final int f12183b = 1;

    /* renamed from: c */
    public static final int f12184c = 2;

    /* renamed from: d */
    public static final int f12185d = 3;

    /* renamed from: e */
    public static final int f12186e = 51;

    /* renamed from: f */
    public static final int f12187f = 1;

    /* renamed from: g */
    public static final int f12188g = 50;

    /* renamed from: m */
    private static final int f12189m = -14671840;

    /* renamed from: w */
    private static final float f12190w = 0.2229f;

    /* renamed from: x */
    private static final float f12191x = 0.3851f;

    /* renamed from: y */
    private static final float f12192y = 0.175f;

    /* renamed from: z */
    private static final float f12193z = 0.4685f;

    /* renamed from: h */
    private Bitmap f12194h;

    /* renamed from: i */
    private Bitmap f12195i;

    /* renamed from: j */
    private Bitmap f12196j;

    /* renamed from: k */
    private Bitmap f12197k;

    /* renamed from: l */
    private Paint f12198l;

    /* renamed from: n */
    private int f12199n;

    /* renamed from: o */
    private RectF f12200o;

    /* renamed from: p */
    private RectF f12201p;

    /* renamed from: q */
    private Bitmap f12202q;

    /* renamed from: r */
    private int f12203r;

    /* renamed from: s */
    private float f12204s;

    /* renamed from: t */
    private float f12205t;

    /* renamed from: u */
    private float f12206u;

    /* renamed from: v */
    private Context f12207v;

    public RemoteRollerView(Context context) {
        this(context, null);
    }

    public RemoteRollerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12207v = context;
        this.f12194h = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_left_up_empty);
        this.f12195i = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_left_down_empty);
        this.f12196j = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_right_up_empty);
        this.f12197k = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_right_down_empty);
        this.f12198l = new Paint();
        this.f12198l.setAntiAlias(true);
        this.f12198l.setColor(f12189m);
        this.f12198l.setStrokeWidth(C1675p.m34624b(context) * 0.092f);
        this.f12198l.setStyle(Paint.Style.STROKE);
        setLayerType(2, this.f12198l);
    }

    public RemoteRollerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12199n = 0;
        this.f12203r = 0;
        this.f12204s = 0.0f;
    }

    /* renamed from: a */
    private void m28871a(int i, Canvas canvas) {
        switch (i) {
            case 0:
                canvas.drawBitmap(this.f12194h, getWidth() * f12190w, getHeight() * f12191x, this.f12198l);
                this.f12200o = new RectF(getWidth() * f12177A, getHeight() * f12178B, (getWidth() * f12177A) + this.f12206u, (getHeight() * f12178B) + this.f12206u);
                this.f12201p = new RectF(getWidth() * f12190w, getHeight() * f12191x, (getWidth() * f12190w) + this.f12194h.getWidth(), (getHeight() * f12191x) + this.f12194h.getHeight());
                this.f12203r = AbstractC10866e.f34825D;
                this.f12204s = ((this.f12205t - 50.0f) / 50.0f) * 21.0f;
                return;
            case 1:
                canvas.drawBitmap(this.f12195i, getWidth() * f12192y, getHeight() * f12193z, this.f12198l);
                this.f12200o = new RectF(getWidth() * f12177A, getHeight() * f12178B, (getWidth() * f12177A) + this.f12206u, (getHeight() * f12178B) + this.f12206u);
                this.f12201p = new RectF(getWidth() * f12192y, getHeight() * f12193z, (getWidth() * f12192y) + this.f12195i.getWidth(), (getHeight() * f12193z) + this.f12195i.getHeight());
                this.f12203r = 215;
                this.f12204s = ((-this.f12205t) / 50.0f) * 22.0f;
                return;
            case 2:
                canvas.drawBitmap(this.f12196j, (getWidth() - this.f12196j.getWidth()) - (getWidth() * f12190w), getHeight() * f12191x, this.f12198l);
                this.f12200o = new RectF((getWidth() - (getWidth() * f12177A)) - this.f12206u, getHeight() * f12178B, getWidth() - (getWidth() * f12177A), (getHeight() * f12178B) + this.f12206u);
                this.f12201p = new RectF((getWidth() - this.f12196j.getWidth()) - (getWidth() * f12190w), getHeight() * f12191x, getWidth() - (getWidth() * f12190w), (getHeight() * f12191x) + this.f12194h.getHeight());
                this.f12203r = 314;
                this.f12204s = ((-(this.f12205t - 50.0f)) / 50.0f) * 21.0f;
                return;
            case 3:
                canvas.drawBitmap(this.f12197k, (getWidth() - this.f12197k.getWidth()) - (getWidth() * f12192y), getHeight() * f12193z, this.f12198l);
                this.f12200o = new RectF((getWidth() - (getWidth() * f12177A)) - this.f12206u, getHeight() * f12178B, getWidth() - (getWidth() * f12177A), (getHeight() * f12178B) + this.f12206u);
                this.f12201p = new RectF((getWidth() - this.f12197k.getWidth()) - (getWidth() * f12192y), getHeight() * f12193z, getWidth() - (getWidth() * f12192y), (getHeight() * f12193z) + this.f12197k.getHeight());
                this.f12203r = 325;
                this.f12204s = (this.f12205t / 50.0f) * 22.0f;
                return;
            default:
                return;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m28871a(this.f12199n, canvas);
        canvas.drawArc(this.f12200o, this.f12203r, this.f12204s, false, this.f12198l);
        this.f12198l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f12202q, (Rect) null, this.f12201p, this.f12198l);
        this.f12198l.setXfermode(null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12206u = C1675p.m34624b(this.f12207v) * f12179C;
    }

    public void setInitView(int i) {
        this.f12199n = i;
        switch (i) {
            case 0:
                this.f12202q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_left_up_full);
                return;
            case 1:
                this.f12202q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_left_down_full);
                return;
            case 2:
                this.f12202q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_right_up_full);
                return;
            case 3:
                this.f12202q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.arrow_right_down_full);
                return;
            default:
                return;
        }
    }

    public void setSweep(float f) {
        this.f12205t = f;
        invalidate();
    }
}
