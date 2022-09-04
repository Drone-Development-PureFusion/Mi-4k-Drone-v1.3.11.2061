package com.fimi.soul.view;

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
/* loaded from: classes2.dex */
public class HorizontalListView extends AdapterView<ListAdapter> {

    /* renamed from: e */
    private static final int f12058e = -1;

    /* renamed from: f */
    private static final int f12059f = 0;

    /* renamed from: g */
    private static final float f12060g = 30.0f;

    /* renamed from: h */
    private static final float f12061h = 0.009f;

    /* renamed from: i */
    private static final String f12062i = "BUNDLE_ID_CURRENT_X";

    /* renamed from: j */
    private static final String f12063j = "BUNDLE_ID_PARENT_STATE";

    /* renamed from: D */
    private EdgeEffectCompat f12067D;

    /* renamed from: E */
    private EdgeEffectCompat f12068E;

    /* renamed from: F */
    private int f12069F;

    /* renamed from: I */
    private View.OnClickListener f12072I;

    /* renamed from: b */
    protected ListAdapter f12076b;

    /* renamed from: c */
    protected int f12077c;

    /* renamed from: d */
    protected int f12078d;

    /* renamed from: l */
    private GestureDetector f12080l;

    /* renamed from: m */
    private int f12081m;

    /* renamed from: v */
    private int f12090v;

    /* renamed from: w */
    private int f12091w;

    /* renamed from: x */
    private int f12092x;

    /* renamed from: a */
    protected Scroller f12075a = new Scroller(getContext());

    /* renamed from: k */
    private final C3163a f12079k = new C3163a();

    /* renamed from: n */
    private List<Queue<View>> f12082n = new ArrayList();

    /* renamed from: o */
    private boolean f12083o = false;

    /* renamed from: p */
    private Rect f12084p = new Rect();

    /* renamed from: q */
    private View f12085q = null;

    /* renamed from: r */
    private int f12086r = 0;

    /* renamed from: s */
    private Drawable f12087s = null;

    /* renamed from: t */
    private Integer f12088t = null;

    /* renamed from: u */
    private int f12089u = Integer.MAX_VALUE;

    /* renamed from: y */
    private AbstractC3168e f12093y = null;

    /* renamed from: z */
    private int f12094z = 0;

    /* renamed from: A */
    private boolean f12064A = false;

    /* renamed from: B */
    private AbstractC3166d f12065B = null;

    /* renamed from: C */
    private AbstractC3166d.EnumC3167a f12066C = AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE;

    /* renamed from: G */
    private boolean f12070G = false;

    /* renamed from: H */
    private boolean f12071H = false;

    /* renamed from: J */
    private DataSetObserver f12073J = new DataSetObserver() { // from class: com.fimi.soul.view.HorizontalListView.2
        @Override // android.database.DataSetObserver
        public void onChanged() {
            HorizontalListView.this.f12083o = true;
            HorizontalListView.this.f12064A = false;
            HorizontalListView.this.m28901f();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HorizontalListView.this.f12064A = false;
            HorizontalListView.this.m28901f();
            HorizontalListView.this.m28911c();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    };

    /* renamed from: K */
    private Runnable f12074K = new Runnable() { // from class: com.fimi.soul.view.HorizontalListView.3
        @Override // java.lang.Runnable
        public void run() {
            HorizontalListView.this.requestLayout();
        }
    };

    /* renamed from: com.fimi.soul.view.HorizontalListView$a */
    /* loaded from: classes2.dex */
    private class C3163a extends GestureDetector.SimpleOnGestureListener {
        private C3163a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.m28930a(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return HorizontalListView.this.m28929a(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            HorizontalListView.this.m28901f();
            int m28909c = HorizontalListView.this.m28909c((int) motionEvent.getX(), (int) motionEvent.getY());
            if (m28909c < 0 || HorizontalListView.this.f12070G) {
                return;
            }
            View childAt = HorizontalListView.this.getChildAt(m28909c);
            AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListView.this.getOnItemLongClickListener();
            if (onItemLongClickListener == null) {
                return;
            }
            int i = HorizontalListView.this.f12090v + m28909c;
            if (!onItemLongClickListener.onItemLongClick(HorizontalListView.this, childAt, i, HorizontalListView.this.f12076b.getItemId(i))) {
                return;
            }
            HorizontalListView.this.performHapticFeedback(0);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView.this.m28919a((Boolean) true);
            HorizontalListView.this.setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_TOUCH_SCROLL);
            HorizontalListView.this.m28901f();
            HorizontalListView.this.f12078d += (int) f;
            HorizontalListView.this.m28892j(Math.round(f));
            HorizontalListView.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            HorizontalListView.this.m28901f();
            AdapterView.OnItemClickListener onItemClickListener = HorizontalListView.this.getOnItemClickListener();
            int m28909c = HorizontalListView.this.m28909c((int) motionEvent.getX(), (int) motionEvent.getY());
            if (m28909c >= 0 && !HorizontalListView.this.f12070G) {
                View childAt = HorizontalListView.this.getChildAt(m28909c);
                int i = HorizontalListView.this.f12090v + m28909c;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(HorizontalListView.this, childAt, i, HorizontalListView.this.f12076b.getItemId(i));
                    return true;
                }
            }
            if (HorizontalListView.this.f12072I != null && !HorizontalListView.this.f12070G) {
                HorizontalListView.this.f12072I.onClick(HorizontalListView.this);
            }
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.fimi.soul.view.HorizontalListView$b */
    /* loaded from: classes2.dex */
    private static final class C3164b {
        static {
            if (Build.VERSION.SDK_INT < 11) {
                throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
            }
        }

        private C3164b() {
        }

        /* renamed from: a */
        public static void m28891a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.fimi.soul.view.HorizontalListView$c */
    /* loaded from: classes2.dex */
    public static final class C3165c {
        static {
            if (Build.VERSION.SDK_INT < 14) {
                throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
            }
        }

        private C3165c() {
        }

        /* renamed from: a */
        public static float m28890a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    /* renamed from: com.fimi.soul.view.HorizontalListView$d */
    /* loaded from: classes2.dex */
    public interface AbstractC3166d {

        /* renamed from: com.fimi.soul.view.HorizontalListView$d$a */
        /* loaded from: classes2.dex */
        public enum EnumC3167a {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }

        /* renamed from: a */
        void m28889a(EnumC3167a enumC3167a);
    }

    /* renamed from: com.fimi.soul.view.HorizontalListView$e */
    /* loaded from: classes2.dex */
    public interface AbstractC3168e {
        /* renamed from: a */
        void m28888a();
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12067D = new EdgeEffectCompat(context);
        this.f12068E = new EdgeEffectCompat(context);
        this.f12080l = new GestureDetector(context, this.f12079k);
        m28937a();
        m28918b();
        m28933a(context, attributeSet);
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT >= 11) {
            C3164b.m28891a(this.f12075a, f12061h);
        }
    }

    /* renamed from: a */
    private void m28937a() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.view.HorizontalListView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return HorizontalListView.this.f12080l.onTouchEvent(motionEvent);
            }
        });
    }

    /* renamed from: a */
    private void m28935a(int i, int i2) {
        while (i + i2 + this.f12086r < getWidth() && this.f12091w + 1 < this.f12076b.getCount()) {
            this.f12091w++;
            if (this.f12090v < 0) {
                this.f12090v = this.f12091w;
            }
            View view = this.f12076b.getView(this.f12091w, m28910c(this.f12091w), this);
            m28927a(view, -1);
            i += (this.f12091w == 0 ? 0 : this.f12086r) + view.getMeasuredWidth();
            m28896h();
        }
    }

    /* renamed from: a */
    private void m28934a(int i, View view) {
        int itemViewType = this.f12076b.getItemViewType(i);
        if (m28906d(itemViewType)) {
            this.f12082n.get(itemViewType).offer(view);
        }
    }

    /* renamed from: a */
    private void m28933a(Context context, AttributeSet attributeSet) {
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
    private void m28932a(Canvas canvas) {
        if (this.f12067D != null && !this.f12067D.isFinished() && m28894i()) {
            int save = canvas.save();
            int height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((-height) + getPaddingBottom(), 0.0f);
            this.f12067D.setSize(getRenderHeight(), getRenderWidth());
            if (this.f12067D.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save);
        } else if (this.f12068E == null || this.f12068E.isFinished() || !m28894i()) {
        } else {
            int save2 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f, 0.0f, 0.0f);
            canvas.translate(getPaddingTop(), -width);
            this.f12068E.setSize(getRenderHeight(), getRenderWidth());
            if (this.f12068E.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: a */
    private void m28931a(Canvas canvas, Rect rect) {
        if (this.f12087s != null) {
            this.f12087s.setBounds(rect);
            this.f12087s.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m28928a(View view) {
        ViewGroup.LayoutParams m28914b = m28914b(view);
        view.measure(m28914b.width > 0 ? View.MeasureSpec.makeMeasureSpec(m28914b.width, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(this.f12069F, getPaddingTop() + getPaddingBottom(), m28914b.height));
    }

    /* renamed from: a */
    private void m28927a(View view, int i) {
        addViewInLayout(view, i, m28914b(view), true);
        m28928a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28919a(Boolean bool) {
        if (this.f12071H != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f12071H = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private ViewGroup.LayoutParams m28914b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    /* renamed from: b */
    private void m28918b() {
        this.f12090v = -1;
        this.f12091w = -1;
        this.f12081m = 0;
        this.f12077c = 0;
        this.f12078d = 0;
        this.f12089u = Integer.MAX_VALUE;
        setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
    }

    /* renamed from: b */
    private void m28917b(int i) {
        this.f12082n.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f12082n.add(new LinkedList());
        }
    }

    /* renamed from: b */
    private void m28916b(int i, int i2) {
        while ((i + i2) - this.f12086r > 0 && this.f12090v >= 1) {
            this.f12090v--;
            View view = this.f12076b.getView(this.f12090v, m28910c(this.f12090v), this);
            m28927a(view, 0);
            i -= this.f12090v == 0 ? view.getMeasuredWidth() : this.f12086r + view.getMeasuredWidth();
            this.f12081m -= i + i2 == 0 ? view.getMeasuredWidth() : this.f12086r + view.getMeasuredWidth();
        }
    }

    /* renamed from: b */
    private void m28915b(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f12084p;
        this.f12084p.top = getPaddingTop();
        this.f12084p.bottom = this.f12084p.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m28893i(this.f12091w)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f12086r;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m28931a(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m28931a(canvas, rect);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m28909c(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f12084p);
            if (this.f12084p.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private View m28910c(int i) {
        int itemViewType = this.f12076b.getItemViewType(i);
        if (m28906d(itemViewType)) {
            return this.f12082n.get(itemViewType).poll();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m28911c() {
        m28918b();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* renamed from: d */
    private float m28907d() {
        if (Build.VERSION.SDK_INT >= 14) {
            return C3165c.m28890a(this.f12075a);
        }
        return 30.0f;
    }

    /* renamed from: d */
    private boolean m28906d(int i) {
        return i < this.f12082n.size();
    }

    /* renamed from: e */
    private void m28903e(int i) {
        int i2 = 0;
        View rightmostChild = getRightmostChild();
        m28935a(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        if (leftmostChild != null) {
            i2 = leftmostChild.getLeft();
        }
        m28916b(i2, i);
    }

    /* renamed from: e */
    private boolean m28904e() {
        View rightmostChild;
        if (!m28893i(this.f12091w) || (rightmostChild = getRightmostChild()) == null) {
            return false;
        }
        int i = this.f12089u;
        this.f12089u = ((rightmostChild.getRight() - getPaddingLeft()) + this.f12077c) - getRenderWidth();
        if (this.f12089u < 0) {
            this.f12089u = 0;
        }
        return this.f12089u != i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m28901f() {
        if (this.f12085q != null) {
            this.f12085q.setPressed(false);
            refreshDrawableState();
            this.f12085q = null;
        }
    }

    /* renamed from: f */
    private void m28900f(int i) {
        View leftmostChild = getLeftmostChild();
        while (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
            this.f12081m = (m28893i(this.f12090v) ? leftmostChild.getMeasuredWidth() : this.f12086r + leftmostChild.getMeasuredWidth()) + this.f12081m;
            m28934a(this.f12090v, leftmostChild);
            removeViewInLayout(leftmostChild);
            this.f12090v++;
            leftmostChild = getLeftmostChild();
        }
        View rightmostChild = getRightmostChild();
        while (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
            m28934a(this.f12091w, rightmostChild);
            removeViewInLayout(rightmostChild);
            this.f12091w--;
            rightmostChild = getRightmostChild();
        }
    }

    /* renamed from: g */
    private void m28898g() {
        if (this.f12067D != null) {
            this.f12067D.onRelease();
        }
        if (this.f12068E != null) {
            this.f12068E.onRelease();
        }
    }

    /* renamed from: g */
    private void m28897g(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            this.f12081m += i;
            int i2 = this.f12081m;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int paddingLeft = getPaddingLeft() + i2;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i2 += childAt.getMeasuredWidth() + this.f12086r;
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
    private View m28895h(int i) {
        if (i < this.f12090v || i > this.f12091w) {
            return null;
        }
        return getChildAt(i - this.f12090v);
    }

    /* renamed from: h */
    private void m28896h() {
        if (this.f12093y == null || this.f12076b == null || this.f12076b.getCount() - (this.f12091w + 1) >= this.f12094z || this.f12064A) {
            return;
        }
        this.f12064A = true;
        this.f12093y.m28888a();
    }

    /* renamed from: i */
    private boolean m28894i() {
        return this.f12076b != null && !this.f12076b.isEmpty() && this.f12089u > 0;
    }

    /* renamed from: i */
    private boolean m28893i(int i) {
        return i == this.f12076b.getCount() + (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m28892j(int i) {
        if (this.f12067D == null || this.f12068E == null) {
            return;
        }
        int i2 = this.f12077c + i;
        if (this.f12075a != null && !this.f12075a.isFinished()) {
            return;
        }
        if (i2 < 0) {
            this.f12067D.onPull(Math.abs(i) / getRenderWidth());
            if (this.f12068E.isFinished()) {
                return;
            }
            this.f12068E.onRelease();
        } else if (i2 <= this.f12089u) {
        } else {
            this.f12068E.onPull(Math.abs(i) / getRenderWidth());
            if (this.f12067D.isFinished()) {
                return;
            }
            this.f12067D.onRelease();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentScrollState(AbstractC3166d.EnumC3167a enumC3167a) {
        if (this.f12066C != enumC3167a && this.f12065B != null) {
            this.f12065B.m28889a(enumC3167a);
        }
        this.f12066C = enumC3167a;
    }

    /* renamed from: a */
    public void m28936a(int i) {
        this.f12075a.startScroll(this.f12078d, 0, i - this.f12078d, 0);
        setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_FLING);
        requestLayout();
    }

    /* renamed from: a */
    public void m28926a(AbstractC3168e abstractC3168e, int i) {
        this.f12093y = abstractC3168e;
        this.f12094z = i;
    }

    /* renamed from: a */
    protected boolean m28930a(MotionEvent motionEvent) {
        int m28909c;
        this.f12070G = !this.f12075a.isFinished();
        this.f12075a.forceFinished(true);
        setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
        m28901f();
        if (!this.f12070G && (m28909c = m28909c((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            this.f12085q = getChildAt(m28909c);
            if (this.f12085q != null) {
                this.f12085q.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* renamed from: a */
    protected boolean m28929a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f12075a.fling(this.f12078d, 0, (int) (-f), 0, 0, this.f12089u, 0, 0);
        setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m28932a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f12076b;
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f12090v;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f12091w;
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f12077c == 0) {
            return 0.0f;
        }
        if (this.f12077c >= horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return this.f12077c / horizontalFadingEdgeLength;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f12077c == this.f12089u) {
            return 0.0f;
        }
        if (this.f12089u - this.f12077c >= horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return (this.f12089u - this.f12077c) / horizontalFadingEdgeLength;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return m28895h(this.f12092x);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m28915b(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12076b == null) {
            return;
        }
        invalidate();
        if (this.f12083o) {
            int i5 = this.f12077c;
            m28918b();
            removeAllViewsInLayout();
            this.f12078d = i5;
            this.f12083o = false;
        }
        if (this.f12088t != null) {
            this.f12078d = this.f12088t.intValue();
            this.f12088t = null;
        }
        if (this.f12075a.computeScrollOffset()) {
            this.f12078d = this.f12075a.getCurrX();
        }
        if (this.f12078d < 0) {
            this.f12078d = 0;
            if (this.f12067D.isFinished()) {
                this.f12067D.onAbsorb((int) m28907d());
            }
            this.f12075a.forceFinished(true);
            setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
        } else if (this.f12078d > this.f12089u) {
            this.f12078d = this.f12089u;
            if (this.f12068E.isFinished()) {
                this.f12068E.onAbsorb((int) m28907d());
            }
            this.f12075a.forceFinished(true);
            setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
        }
        int i6 = this.f12077c - this.f12078d;
        m28900f(i6);
        m28903e(i6);
        m28897g(i6);
        this.f12077c = this.f12078d;
        if (m28904e()) {
            onLayout(z, i, i2, i3, i4);
        } else if (!this.f12075a.isFinished()) {
            ViewCompat.postOnAnimation(this, this.f12074K);
        } else if (this.f12066C != AbstractC3166d.EnumC3167a.SCROLL_STATE_FLING) {
        } else {
            setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12069F = i2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12088t = Integer.valueOf(bundle.getInt(f12062i));
            super.onRestoreInstanceState(bundle.getParcelable(f12063j));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f12063j, super.onSaveInstanceState());
        bundle.putInt(f12062i, this.f12077c);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f12075a == null || this.f12075a.isFinished()) {
                setCurrentScrollState(AbstractC3166d.EnumC3167a.SCROLL_STATE_IDLE);
            }
            m28919a((Boolean) false);
            m28898g();
        } else if (motionEvent.getAction() == 3) {
            m28901f();
            m28898g();
            m28919a((Boolean) false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (this.f12076b != null) {
            this.f12076b.unregisterDataSetObserver(this.f12073J);
        }
        if (listAdapter != null) {
            this.f12064A = false;
            this.f12076b = listAdapter;
            this.f12076b.registerDataSetObserver(this.f12073J);
        }
        m28917b(this.f12076b.getViewTypeCount());
        m28911c();
    }

    public void setDivider(Drawable drawable) {
        this.f12087s = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f12086r = i;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12072I = onClickListener;
    }

    public void setOnScrollStateChangedListener(AbstractC3166d abstractC3166d) {
        this.f12065B = abstractC3166d;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        this.f12092x = i;
    }
}
