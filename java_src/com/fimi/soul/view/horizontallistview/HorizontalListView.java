package com.fimi.soul.view.horizontallistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes2.dex */
public class HorizontalListView extends AdapterView<ListAdapter> {

    /* renamed from: b */
    protected ListAdapter f12722b;

    /* renamed from: c */
    protected int f12723c;

    /* renamed from: d */
    protected int f12724d;

    /* renamed from: e */
    protected Scroller f12725e;

    /* renamed from: j */
    private GestureDetector f12730j;

    /* renamed from: l */
    private AdapterView.OnItemSelectedListener f12732l;

    /* renamed from: m */
    private AdapterView.OnItemClickListener f12733m;

    /* renamed from: n */
    private AdapterView.OnItemLongClickListener f12734n;

    /* renamed from: p */
    private AbstractC3270a f12736p;

    /* renamed from: q */
    private AbstractC3271b f12737q;

    /* renamed from: a */
    public boolean f12721a = true;

    /* renamed from: f */
    private int f12726f = -1;

    /* renamed from: g */
    private int f12727g = 0;

    /* renamed from: h */
    private int f12728h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f12729i = 0;

    /* renamed from: k */
    private Queue<View> f12731k = new LinkedList();

    /* renamed from: o */
    private boolean f12735o = false;

    /* renamed from: r */
    private DataSetObserver f12738r = new DataSetObserver() { // from class: com.fimi.soul.view.horizontallistview.HorizontalListView.1
        @Override // android.database.DataSetObserver
        public void onChanged() {
            synchronized (HorizontalListView.this) {
                HorizontalListView.this.f12735o = true;
            }
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HorizontalListView.this.m28546c();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    };

    /* renamed from: s */
    private final int f12739s = 270;

    /* renamed from: t */
    private GestureDetector.OnGestureListener f12740t = new GestureDetector.SimpleOnGestureListener() { // from class: com.fimi.soul.view.horizontallistview.HorizontalListView.4
        /* renamed from: a */
        private boolean m28539a(MotionEvent motionEvent, View view) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            rect.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
            return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.m28555a(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return HorizontalListView.this.m28554a(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            int childCount = HorizontalListView.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = HorizontalListView.this.getChildAt(i);
                if (m28539a(motionEvent, childAt)) {
                    if (HorizontalListView.this.f12734n == null) {
                        return;
                    }
                    HorizontalListView.this.f12734n.onItemLongClick(HorizontalListView.this, childAt, HorizontalListView.this.f12726f + 1 + i, HorizontalListView.this.f12722b.getItemId(i + HorizontalListView.this.f12726f + 1));
                    return;
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            synchronized (HorizontalListView.this) {
                HorizontalListView.this.f12724d += (int) f;
            }
            HorizontalListView.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < HorizontalListView.this.getChildCount()) {
                    View childAt = HorizontalListView.this.getChildAt(i2);
                    if (m28539a(motionEvent, childAt)) {
                        if (HorizontalListView.this.f12733m != null) {
                            HorizontalListView.this.f12733m.onItemClick(HorizontalListView.this, childAt, HorizontalListView.this.f12726f + 1 + i2, HorizontalListView.this.f12722b.getItemId(HorizontalListView.this.f12726f + 1 + i2));
                        }
                        if (HorizontalListView.this.f12732l == null) {
                            return true;
                        }
                        HorizontalListView.this.f12732l.onItemSelected(HorizontalListView.this, childAt, HorizontalListView.this.f12726f + 1 + i2, HorizontalListView.this.f12722b.getItemId(HorizontalListView.this.f12726f + 1 + i2));
                        return true;
                    }
                    i = i2 + 1;
                } else {
                    return true;
                }
            }
        }
    };

    /* renamed from: com.fimi.soul.view.horizontallistview.HorizontalListView$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3270a {
        /* renamed from: a */
        void mo28538a();
    }

    /* renamed from: com.fimi.soul.view.horizontallistview.HorizontalListView$b */
    /* loaded from: classes2.dex */
    public interface AbstractC3271b {
        /* renamed from: a */
        void mo28537a(int i);
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28550b();
    }

    /* renamed from: a */
    private void m28553a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i, layoutParams, true);
        view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    /* renamed from: b */
    private synchronized void m28550b() {
        this.f12726f = -1;
        this.f12727g = 0;
        this.f12729i = 0;
        this.f12723c = 0;
        this.f12724d = 0;
        this.f12728h = Integer.MAX_VALUE;
        this.f12725e = new Scroller(getContext());
        this.f12730j = new GestureDetector(getContext(), this.f12740t);
    }

    /* renamed from: b */
    private void m28549b(int i) {
        int i2 = 0;
        View childAt = getChildAt(getChildCount() - 1);
        m28548b(childAt != null ? childAt.getRight() : 0, i);
        View childAt2 = getChildAt(0);
        if (childAt2 != null) {
            i2 = childAt2.getLeft();
        }
        m28544c(i2, i);
        if (this.f12736p != null) {
            this.f12736p.mo28538a();
        }
    }

    /* renamed from: b */
    private void m28548b(int i, int i2) {
        while (i + i2 < getWidth() && this.f12727g < this.f12722b.getCount()) {
            View view = this.f12722b.getView(this.f12727g, this.f12731k.poll(), this);
            m28553a(view, -1);
            i += view.getMeasuredWidth();
            if (this.f12727g == this.f12722b.getCount() - 1) {
                this.f12728h = (this.f12723c + i) - getWidth();
            }
            if (this.f12728h < 0) {
                this.f12728h = 0;
            }
            this.f12727g++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m28546c() {
        m28550b();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* renamed from: c */
    private void m28545c(int i) {
        View childAt = getChildAt(0);
        while (childAt != null && childAt.getRight() + i <= 0) {
            this.f12729i += childAt.getMeasuredWidth();
            this.f12731k.offer(childAt);
            removeViewInLayout(childAt);
            this.f12726f++;
            childAt = getChildAt(0);
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i >= getWidth()) {
            this.f12731k.offer(childAt2);
            removeViewInLayout(childAt2);
            this.f12727g--;
            childAt2 = getChildAt(getChildCount() - 1);
        }
    }

    /* renamed from: c */
    private void m28544c(int i, int i2) {
        while (i + i2 > 0 && this.f12726f >= 0) {
            View view = this.f12722b.getView(this.f12726f, this.f12731k.poll(), this);
            m28553a(view, 0);
            i -= view.getMeasuredWidth();
            this.f12726f--;
            this.f12729i -= view.getMeasuredWidth();
        }
    }

    /* renamed from: d */
    private void m28542d(int i) {
        if (getChildCount() > 0) {
            this.f12729i += i;
            int i2 = this.f12729i;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(i2, 0, i2 + measuredWidth, childAt.getMeasuredHeight());
                i2 += childAt.getPaddingRight() + measuredWidth;
            }
        }
    }

    /* renamed from: a */
    public void m28558a() {
        if (this.f12722b == null || this.f12737q == null) {
            return;
        }
        if (this.f12726f == -1) {
            this.f12737q.mo28537a(0);
        } else if (this.f12727g == this.f12722b.getCount()) {
            this.f12737q.mo28537a(2);
        } else {
            this.f12737q.mo28537a(1);
        }
    }

    /* renamed from: a */
    public synchronized void m28557a(int i) {
        this.f12725e.startScroll(this.f12724d, 0, i - this.f12724d, 0);
        requestLayout();
    }

    /* renamed from: a */
    public synchronized void m28556a(int i, int i2) {
        final int i3 = (i == 0 ? 0 : i == i2 + (-1) ? i - 2 : i - 1) * 270;
        post(new Runnable() { // from class: com.fimi.soul.view.horizontallistview.HorizontalListView.3
            @Override // java.lang.Runnable
            public void run() {
                HorizontalListView.this.f12725e.startScroll(HorizontalListView.this.f12723c, 0, 0, 0, 500);
                HorizontalListView.this.f12725e.setFinalX(i3);
                HorizontalListView.this.requestLayout();
            }
        });
    }

    /* renamed from: a */
    protected boolean m28555a(MotionEvent motionEvent) {
        this.f12725e.forceFinished(true);
        return true;
    }

    /* renamed from: a */
    protected boolean m28554a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        synchronized (this) {
            this.f12725e.fling(this.f12724d, 0, (int) (-f), 0, 0, this.f12728h, 0, 0);
        }
        requestLayout();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent) | this.f12730j.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f12722b;
    }

    public AbstractC3270a getOnChangeListener() {
        return this.f12736p;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected synchronized void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12722b != null) {
            if (this.f12735o) {
                int i5 = this.f12723c;
                m28550b();
                removeAllViewsInLayout();
                this.f12724d = i5;
                this.f12735o = false;
            }
            if (this.f12725e.computeScrollOffset()) {
                this.f12724d = this.f12725e.getCurrX();
            }
            if (this.f12724d <= 0) {
                this.f12724d = 0;
                this.f12725e.forceFinished(true);
            }
            if (this.f12724d >= this.f12728h) {
                this.f12724d = this.f12728h;
                this.f12725e.forceFinished(true);
            }
            int i6 = this.f12723c - this.f12724d;
            m28545c(i6);
            m28549b(i6);
            m28542d(i6);
            this.f12723c = this.f12724d;
            m28558a();
            if (!this.f12725e.isFinished()) {
                post(new Runnable() { // from class: com.fimi.soul.view.horizontallistview.HorizontalListView.2
                    @Override // java.lang.Runnable
                    public void run() {
                        HorizontalListView.this.requestLayout();
                    }
                });
            }
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (this.f12722b != null) {
            this.f12722b.unregisterDataSetObserver(this.f12738r);
        }
        this.f12722b = listAdapter;
        this.f12722b.registerDataSetObserver(this.f12738r);
        m28546c();
    }

    public void setOnChangeListener(AbstractC3270a abstractC3270a) {
        this.f12736p = abstractC3270a;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f12733m = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f12734n = onItemLongClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f12732l = onItemSelectedListener;
    }

    public void setOnListViewGuide(AbstractC3271b abstractC3271b) {
        this.f12737q = abstractC3271b;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
    }
}
