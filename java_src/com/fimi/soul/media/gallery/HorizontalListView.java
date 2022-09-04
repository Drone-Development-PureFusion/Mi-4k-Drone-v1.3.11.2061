package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.view.ViewCompat;
import android.support.p001v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.fimi.overseas.soul.C1704R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/* loaded from: classes.dex */
public class HorizontalListView extends AdapterView<ListAdapter> {

    /* renamed from: e */
    private static final int f7866e = -1;

    /* renamed from: f */
    private static final int f7867f = 0;

    /* renamed from: g */
    private static final float f7868g = 30.0f;

    /* renamed from: h */
    private static final float f7869h = 0.009f;

    /* renamed from: i */
    private static final String f7870i = "BUNDLE_ID_CURRENT_X";

    /* renamed from: j */
    private static final String f7871j = "BUNDLE_ID_PARENT_STATE";

    /* renamed from: D */
    private EdgeEffectCompat f7875D;

    /* renamed from: E */
    private EdgeEffectCompat f7876E;

    /* renamed from: F */
    private int f7877F;

    /* renamed from: I */
    private View.OnClickListener f7880I;

    /* renamed from: b */
    protected ListAdapter f7884b;

    /* renamed from: c */
    protected int f7885c;

    /* renamed from: d */
    protected int f7886d;

    /* renamed from: l */
    private GestureDetector f7888l;

    /* renamed from: m */
    private int f7889m;

    /* renamed from: v */
    private int f7898v;

    /* renamed from: w */
    private int f7899w;

    /* renamed from: x */
    private int f7900x;

    /* renamed from: a */
    protected Scroller f7883a = new Scroller(getContext());

    /* renamed from: k */
    private final C2393a f7887k = new C2393a();

    /* renamed from: n */
    private List<Queue<View>> f7890n = new ArrayList();

    /* renamed from: o */
    private boolean f7891o = false;

    /* renamed from: p */
    private Rect f7892p = new Rect();

    /* renamed from: q */
    private View f7893q = null;

    /* renamed from: r */
    private int f7894r = 0;

    /* renamed from: s */
    private Drawable f7895s = null;

    /* renamed from: t */
    private Integer f7896t = null;

    /* renamed from: u */
    private int f7897u = Integer.MAX_VALUE;

    /* renamed from: y */
    private AbstractC2398e f7901y = null;

    /* renamed from: z */
    private int f7902z = 0;

    /* renamed from: A */
    private boolean f7872A = false;

    /* renamed from: B */
    private AbstractC2396d f7873B = null;

    /* renamed from: C */
    private AbstractC2396d.EnumC2397a f7874C = AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE;

    /* renamed from: G */
    private boolean f7878G = false;

    /* renamed from: H */
    private boolean f7879H = false;

    /* renamed from: J */
    private DataSetObserver f7881J = new DataSetObserver() { // from class: com.fimi.soul.media.gallery.HorizontalListView.2
        @Override // android.database.DataSetObserver
        public void onChanged() {
            HorizontalListView.this.f7891o = true;
            HorizontalListView.this.f7872A = false;
            HorizontalListView.this.m31646f();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HorizontalListView.this.f7872A = false;
            HorizontalListView.this.m31646f();
            HorizontalListView.this.m31656c();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    };

    /* renamed from: K */
    private Runnable f7882K = new Runnable() { // from class: com.fimi.soul.media.gallery.HorizontalListView.3
        @Override // java.lang.Runnable
        public void run() {
            HorizontalListView.this.requestLayout();
        }
    };

    /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$a */
    /* loaded from: classes.dex */
    private class C2393a extends GestureDetector.SimpleOnGestureListener {
        private C2393a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.m31675a(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return HorizontalListView.this.m31674a(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            HorizontalListView.this.m31646f();
            int m31654c = HorizontalListView.this.m31654c((int) motionEvent.getX(), (int) motionEvent.getY());
            if (m31654c < 0 || HorizontalListView.this.f7878G) {
                return;
            }
            View childAt = HorizontalListView.this.getChildAt(m31654c);
            AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListView.this.getOnItemLongClickListener();
            if (onItemLongClickListener == null) {
                return;
            }
            int i = HorizontalListView.this.f7898v + m31654c;
            if (!onItemLongClickListener.onItemLongClick(HorizontalListView.this, childAt, i, HorizontalListView.this.f7884b.getItemId(i))) {
                return;
            }
            HorizontalListView.this.performHapticFeedback(0);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView.this.m31664a((Boolean) true);
            HorizontalListView.this.setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_TOUCH_SCROLL);
            HorizontalListView.this.m31646f();
            HorizontalListView.this.f7886d += (int) f;
            HorizontalListView.this.m31637j(Math.round(f));
            HorizontalListView.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            HorizontalListView.this.m31646f();
            AdapterView.OnItemClickListener onItemClickListener = HorizontalListView.this.getOnItemClickListener();
            int m31654c = HorizontalListView.this.m31654c((int) motionEvent.getX(), (int) motionEvent.getY());
            if (m31654c >= 0 && !HorizontalListView.this.f7878G) {
                View childAt = HorizontalListView.this.getChildAt(m31654c);
                int i = HorizontalListView.this.f7898v + m31654c;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(HorizontalListView.this, childAt, i, HorizontalListView.this.f7884b.getItemId(i));
                    return true;
                }
            }
            if (HorizontalListView.this.f7880I != null && !HorizontalListView.this.f7878G) {
                HorizontalListView.this.f7880I.onClick(HorizontalListView.this);
            }
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$b */
    /* loaded from: classes.dex */
    private static final class C2394b {
        static {
            if (Build.VERSION.SDK_INT < 11) {
                throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
            }
        }

        private C2394b() {
        }

        /* renamed from: a */
        public static void m31636a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$c */
    /* loaded from: classes.dex */
    public static final class C2395c {
        static {
            if (Build.VERSION.SDK_INT < 14) {
                throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
            }
        }

        private C2395c() {
        }

        /* renamed from: a */
        public static float m31635a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$d */
    /* loaded from: classes.dex */
    public interface AbstractC2396d {

        /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$d$a */
        /* loaded from: classes.dex */
        public enum EnumC2397a {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }

        /* renamed from: a */
        void m31634a(EnumC2397a enumC2397a);
    }

    /* renamed from: com.fimi.soul.media.gallery.HorizontalListView$e */
    /* loaded from: classes.dex */
    public interface AbstractC2398e {
        /* renamed from: a */
        void m31633a();
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7875D = new EdgeEffectCompat(context);
        this.f7876E = new EdgeEffectCompat(context);
        this.f7888l = new GestureDetector(context, this.f7887k);
        m31682a();
        m31663b();
        m31678a(context, attributeSet);
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT >= 11) {
            C2394b.m31636a(this.f7883a, f7869h);
        }
    }

    /* renamed from: a */
    private void m31682a() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.media.gallery.HorizontalListView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return HorizontalListView.this.f7888l.onTouchEvent(motionEvent);
            }
        });
    }

    /* renamed from: a */
    private void m31680a(int i, int i2) {
        while (i + i2 + this.f7894r < getWidth() && this.f7899w + 1 < this.f7884b.getCount()) {
            this.f7899w++;
            if (this.f7898v < 0) {
                this.f7898v = this.f7899w;
            }
            View view = this.f7884b.getView(this.f7899w, m31655c(this.f7899w), this);
            m31672a(view, -1);
            i += (this.f7899w == 0 ? 0 : this.f7894r) + view.getMeasuredWidth();
            m31641h();
        }
    }

    /* renamed from: a */
    private void m31679a(int i, View view) {
        int itemViewType = this.f7884b.getItemViewType(i);
        if (m31651d(itemViewType)) {
            this.f7890n.get(itemViewType).offer(view);
        }
    }

    /* renamed from: a */
    private void m31678a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.HorizontalListView);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m31677a(Canvas canvas) {
        if (this.f7875D != null && !this.f7875D.isFinished() && m31639i()) {
            int save = canvas.save();
            int height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((-height) + getPaddingBottom(), 0.0f);
            this.f7875D.setSize(getRenderHeight(), getRenderWidth());
            if (this.f7875D.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save);
        } else if (this.f7876E == null || this.f7876E.isFinished() || !m31639i()) {
        } else {
            int save2 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f, 0.0f, 0.0f);
            canvas.translate(getPaddingTop(), -width);
            this.f7876E.setSize(getRenderHeight(), getRenderWidth());
            if (this.f7876E.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: a */
    private void m31676a(Canvas canvas, Rect rect) {
        if (this.f7895s != null) {
            this.f7895s.setBounds(rect);
            this.f7895s.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m31673a(View view) {
        ViewGroup.LayoutParams m31659b = m31659b(view);
        view.measure(m31659b.width > 0 ? View.MeasureSpec.makeMeasureSpec(m31659b.width, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(this.f7877F, getPaddingTop() + getPaddingBottom(), m31659b.height));
    }

    /* renamed from: a */
    private void m31672a(View view, int i) {
        addViewInLayout(view, i, m31659b(view), true);
        m31673a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31664a(Boolean bool) {
        if (this.f7879H != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f7879H = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private ViewGroup.LayoutParams m31659b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    /* renamed from: b */
    private void m31663b() {
        this.f7898v = -1;
        this.f7899w = -1;
        this.f7889m = 0;
        this.f7885c = 0;
        this.f7886d = 0;
        this.f7897u = Integer.MAX_VALUE;
        setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
    }

    /* renamed from: b */
    private void m31662b(int i) {
        this.f7890n.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f7890n.add(new LinkedList());
        }
    }

    /* renamed from: b */
    private void m31661b(int i, int i2) {
        while ((i + i2) - this.f7894r > 0 && this.f7898v >= 1) {
            this.f7898v--;
            View view = this.f7884b.getView(this.f7898v, m31655c(this.f7898v), this);
            m31672a(view, 0);
            i -= this.f7898v == 0 ? view.getMeasuredWidth() : this.f7894r + view.getMeasuredWidth();
            this.f7889m -= i + i2 == 0 ? view.getMeasuredWidth() : this.f7894r + view.getMeasuredWidth();
        }
    }

    /* renamed from: b */
    private void m31660b(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f7892p;
        this.f7892p.top = getPaddingTop();
        this.f7892p.bottom = this.f7892p.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m31638i(this.f7899w)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f7894r;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m31676a(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m31676a(canvas, rect);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m31654c(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f7892p);
            if (this.f7892p.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private View m31655c(int i) {
        int itemViewType = this.f7884b.getItemViewType(i);
        if (m31651d(itemViewType)) {
            return this.f7890n.get(itemViewType).poll();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m31656c() {
        m31663b();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* renamed from: d */
    private float m31652d() {
        if (Build.VERSION.SDK_INT >= 14) {
            return C2395c.m31635a(this.f7883a);
        }
        return 30.0f;
    }

    /* renamed from: d */
    private boolean m31651d(int i) {
        return i < this.f7890n.size();
    }

    /* renamed from: e */
    private void m31648e(int i) {
        int i2 = 0;
        View rightmostChild = getRightmostChild();
        m31680a(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        if (leftmostChild != null) {
            i2 = leftmostChild.getLeft();
        }
        m31661b(i2, i);
    }

    /* renamed from: e */
    private boolean m31649e() {
        View rightmostChild;
        if (!m31638i(this.f7899w) || (rightmostChild = getRightmostChild()) == null) {
            return false;
        }
        int i = this.f7897u;
        this.f7897u = ((rightmostChild.getRight() - getPaddingLeft()) + this.f7885c) - getRenderWidth();
        if (this.f7897u < 0) {
            this.f7897u = 0;
        }
        return this.f7897u != i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m31646f() {
        if (this.f7893q != null) {
            this.f7893q.setPressed(false);
            refreshDrawableState();
            this.f7893q = null;
        }
    }

    /* renamed from: f */
    private void m31645f(int i) {
        View leftmostChild = getLeftmostChild();
        while (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
            this.f7889m = (m31638i(this.f7898v) ? leftmostChild.getMeasuredWidth() : this.f7894r + leftmostChild.getMeasuredWidth()) + this.f7889m;
            m31679a(this.f7898v, leftmostChild);
            removeViewInLayout(leftmostChild);
            this.f7898v++;
            leftmostChild = getLeftmostChild();
        }
        View rightmostChild = getRightmostChild();
        while (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
            m31679a(this.f7899w, rightmostChild);
            removeViewInLayout(rightmostChild);
            this.f7899w--;
            rightmostChild = getRightmostChild();
        }
    }

    /* renamed from: g */
    private void m31643g() {
        if (this.f7875D != null) {
            this.f7875D.onRelease();
        }
        if (this.f7876E != null) {
            this.f7876E.onRelease();
        }
    }

    /* renamed from: g */
    private void m31642g(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            this.f7889m += i;
            int i2 = this.f7889m;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int paddingLeft = getPaddingLeft() + i2;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i2 += childAt.getMeasuredWidth() + this.f7894r;
            }
        }
    }

    private View getLeftmostChild() {
        return getChildAt(0);
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    /* renamed from: h */
    private View m31640h(int i) {
        if (i < this.f7898v || i > this.f7899w) {
            return null;
        }
        return getChildAt(i - this.f7898v);
    }

    /* renamed from: h */
    private void m31641h() {
        if (this.f7901y == null || this.f7884b == null || this.f7884b.getCount() - (this.f7899w + 1) >= this.f7902z || this.f7872A) {
            return;
        }
        this.f7872A = true;
        this.f7901y.m31633a();
    }

    /* renamed from: i */
    private boolean m31639i() {
        return this.f7884b != null && !this.f7884b.isEmpty() && this.f7897u > 0;
    }

    /* renamed from: i */
    private boolean m31638i(int i) {
        return i == this.f7884b.getCount() + (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m31637j(int i) {
        if (this.f7875D == null || this.f7876E == null) {
            return;
        }
        int i2 = this.f7885c + i;
        if (this.f7883a != null && !this.f7883a.isFinished()) {
            return;
        }
        if (i2 < 0) {
            this.f7875D.onPull(Math.abs(i) / getRenderWidth());
            if (this.f7876E.isFinished()) {
                return;
            }
            this.f7876E.onRelease();
        } else if (i2 <= this.f7897u) {
        } else {
            this.f7876E.onPull(Math.abs(i) / getRenderWidth());
            if (this.f7875D.isFinished()) {
                return;
            }
            this.f7875D.onRelease();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentScrollState(AbstractC2396d.EnumC2397a enumC2397a) {
        if (this.f7874C != enumC2397a && this.f7873B != null) {
            this.f7873B.m31634a(enumC2397a);
        }
        this.f7874C = enumC2397a;
    }

    /* renamed from: a */
    public void m31681a(int i) {
        this.f7883a.startScroll(this.f7886d, 0, i - this.f7886d, 0);
        setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_FLING);
        requestLayout();
    }

    /* renamed from: a */
    public void m31671a(AbstractC2398e abstractC2398e, int i) {
        this.f7901y = abstractC2398e;
        this.f7902z = i;
    }

    /* renamed from: a */
    protected boolean m31675a(MotionEvent motionEvent) {
        int m31654c;
        this.f7878G = !this.f7883a.isFinished();
        this.f7883a.forceFinished(true);
        setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
        m31646f();
        if (!this.f7878G && (m31654c = m31654c((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            this.f7893q = getChildAt(m31654c);
            if (this.f7893q != null) {
                this.f7893q.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* renamed from: a */
    protected boolean m31674a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f7883a.fling(this.f7886d, 0, (int) (-f), 0, 0, this.f7897u, 0, 0);
        setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m31677a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f7884b;
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f7898v;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f7899w;
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f7885c == 0) {
            return 0.0f;
        }
        if (this.f7885c >= horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return this.f7885c / horizontalFadingEdgeLength;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f7885c == this.f7897u) {
            return 0.0f;
        }
        if (this.f7897u - this.f7885c >= horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return (this.f7897u - this.f7885c) / horizontalFadingEdgeLength;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return m31640h(this.f7900x);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m31660b(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7884b == null) {
            return;
        }
        invalidate();
        if (this.f7891o) {
            int i5 = this.f7885c;
            m31663b();
            removeAllViewsInLayout();
            this.f7886d = i5;
            this.f7891o = false;
        }
        if (this.f7896t != null) {
            this.f7886d = this.f7896t.intValue();
            this.f7896t = null;
        }
        if (this.f7883a.computeScrollOffset()) {
            this.f7886d = this.f7883a.getCurrX();
        }
        if (this.f7886d < 0) {
            this.f7886d = 0;
            if (this.f7875D.isFinished()) {
                this.f7875D.onAbsorb((int) m31652d());
            }
            this.f7883a.forceFinished(true);
            setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
        } else if (this.f7886d > this.f7897u) {
            this.f7886d = this.f7897u;
            if (this.f7876E.isFinished()) {
                this.f7876E.onAbsorb((int) m31652d());
            }
            this.f7883a.forceFinished(true);
            setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
        }
        int i6 = this.f7885c - this.f7886d;
        m31645f(i6);
        m31648e(i6);
        m31642g(i6);
        this.f7885c = this.f7886d;
        if (m31649e()) {
            onLayout(z, i, i2, i3, i4);
        } else if (!this.f7883a.isFinished()) {
            ViewCompat.postOnAnimation(this, this.f7882K);
        } else if (this.f7874C != AbstractC2396d.EnumC2397a.SCROLL_STATE_FLING) {
        } else {
            setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f7877F = i2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7896t = Integer.valueOf(bundle.getInt(f7870i));
            super.onRestoreInstanceState(bundle.getParcelable(f7871j));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f7871j, super.onSaveInstanceState());
        bundle.putInt(f7870i, this.f7885c);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f7883a == null || this.f7883a.isFinished()) {
                setCurrentScrollState(AbstractC2396d.EnumC2397a.SCROLL_STATE_IDLE);
            }
            m31664a((Boolean) false);
            m31643g();
        } else if (motionEvent.getAction() == 3) {
            m31646f();
            m31643g();
            m31664a((Boolean) false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (this.f7884b != null) {
            this.f7884b.unregisterDataSetObserver(this.f7881J);
        }
        if (listAdapter != null) {
            this.f7872A = false;
            this.f7884b = listAdapter;
            this.f7884b.registerDataSetObserver(this.f7881J);
        }
        m31662b(this.f7884b.getViewTypeCount());
        m31656c();
    }

    public void setDivider(Drawable drawable) {
        this.f7895s = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f7894r = i;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7880I = onClickListener;
    }

    public void setOnScrollStateChangedListener(AbstractC2396d abstractC2396d) {
        this.f7873B = abstractC2396d;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        this.f7900x = i;
    }
}
