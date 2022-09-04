package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import it.sephiroth.android.library.C10884R;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.ExpandableHListConnector;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class ExpandableHListView extends HListView {

    /* renamed from: aX */
    public static final int f35139aX = 0;

    /* renamed from: aY */
    public static final int f35140aY = 1;

    /* renamed from: aZ */
    public static final int f35141aZ = 2;

    /* renamed from: bA */
    private static final int[] f35142bA = new int[0];

    /* renamed from: bB */
    private static final int[] f35143bB = {16842920};

    /* renamed from: bC */
    private static final int[] f35144bC = {16842921};

    /* renamed from: bD */
    private static final int[] f35145bD = {16842920, 16842921};

    /* renamed from: bE */
    private static final int[][] f35146bE = {f35142bA, f35143bB, f35144bC, f35145bD};

    /* renamed from: bF */
    private static final int[] f35147bF = {16842918};

    /* renamed from: ba */
    public static final long f35148ba = 4294967295L;

    /* renamed from: bb */
    public static final int f35149bb = -1;

    /* renamed from: bi */
    private static final long f35150bi = 4294967295L;

    /* renamed from: bj */
    private static final long f35151bj = 9223372032559808512L;

    /* renamed from: bk */
    private static final long f35152bk = Long.MIN_VALUE;

    /* renamed from: bl */
    private static final long f35153bl = 32;

    /* renamed from: bm */
    private static final long f35154bm = 63;

    /* renamed from: bn */
    private static final long f35155bn = -1;

    /* renamed from: bo */
    private static final long f35156bo = 2147483647L;

    /* renamed from: bx */
    private static final int f35157bx = -2;

    /* renamed from: bG */
    private Drawable f35158bG;

    /* renamed from: bH */
    private final Rect f35159bH;

    /* renamed from: bI */
    private final Rect f35160bI;

    /* renamed from: bJ */
    private int f35161bJ;

    /* renamed from: bK */
    private int f35162bK;

    /* renamed from: bL */
    private int f35163bL;

    /* renamed from: bM */
    private int f35164bM;

    /* renamed from: bN */
    private AbstractC10930d f35165bN;

    /* renamed from: bO */
    private AbstractC10931e f35166bO;

    /* renamed from: bP */
    private AbstractC10929c f35167bP;

    /* renamed from: bQ */
    private AbstractC10928b f35168bQ;

    /* renamed from: bp */
    private ExpandableHListConnector f35169bp;

    /* renamed from: bq */
    private ExpandableListAdapter f35170bq;

    /* renamed from: br */
    private int f35171br;

    /* renamed from: bs */
    private int f35172bs;

    /* renamed from: bt */
    private int f35173bt;

    /* renamed from: bu */
    private int f35174bu;

    /* renamed from: bv */
    private int f35175bv;

    /* renamed from: bw */
    private int f35176bw;

    /* renamed from: by */
    private Drawable f35177by;

    /* renamed from: bz */
    private Drawable f35178bz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: it.sephiroth.android.library.widget.ExpandableHListView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        ArrayList<ExpandableHListConnector.GroupMetadata> f35179a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35179a = new ArrayList<>();
            parcel.readList(this.f35179a, ExpandableHListConnector.class.getClassLoader());
        }

        SavedState(Parcelable parcelable, ArrayList<ExpandableHListConnector.GroupMetadata> arrayList) {
            super(parcelable);
            this.f35179a = arrayList;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeList(this.f35179a);
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListView$a */
    /* loaded from: classes2.dex */
    public static class ContextMenu$ContextMenuInfoC10927a implements ContextMenu.ContextMenuInfo {

        /* renamed from: a */
        public View f35180a;

        /* renamed from: b */
        public long f35181b;

        /* renamed from: c */
        public long f35182c;

        public ContextMenu$ContextMenuInfoC10927a(View view, long j, long j2) {
            this.f35180a = view;
            this.f35181b = j;
            this.f35182c = j2;
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListView$b */
    /* loaded from: classes2.dex */
    public interface AbstractC10928b {
        /* renamed from: a */
        boolean m2736a(ExpandableHListView expandableHListView, View view, int i, int i2, long j);
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListView$c */
    /* loaded from: classes2.dex */
    public interface AbstractC10929c {
        /* renamed from: a */
        boolean m2735a(ExpandableHListView expandableHListView, View view, int i, long j);
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListView$d */
    /* loaded from: classes2.dex */
    public interface AbstractC10930d {
        /* renamed from: a */
        void m2734a(int i);
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListView$e */
    /* loaded from: classes2.dex */
    public interface AbstractC10931e {
        /* renamed from: a */
        void m2733a(int i);
    }

    public ExpandableHListView(Context context) {
        this(context, null);
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10884R.attr.hlv_expandableListViewStyle);
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35159bH = new Rect();
        this.f35160bI = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10884R.styleable.ExpandableHListView, i, 0);
        setGroupIndicator(obtainStyledAttributes.getDrawable(3));
        setChildIndicator(obtainStyledAttributes.getDrawable(4));
        this.f35172bs = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f35171br = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f35173bt = obtainStyledAttributes.getInt(0, 0);
        this.f35174bu = obtainStyledAttributes.getInt(1, 0);
        this.f35176bw = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f35175bv = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f35158bG = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: D */
    private void m2760D() {
        if (this.f35177by != null) {
            this.f35161bJ = this.f35177by.getIntrinsicWidth();
            this.f35162bK = this.f35177by.getIntrinsicHeight();
            return;
        }
        this.f35161bJ = 0;
        this.f35162bK = 0;
    }

    /* renamed from: E */
    private void m2759E() {
        if (this.f35178bz != null) {
            this.f35163bL = this.f35178bz.getIntrinsicWidth();
            this.f35164bM = this.f35178bz.getIntrinsicHeight();
            return;
        }
        this.f35163bL = 0;
        this.f35164bM = 0;
    }

    /* renamed from: a */
    private long m2755a(C10937b c10937b) {
        return c10937b.f35273f == 1 ? this.f35170bq.getChildId(c10937b.f35270c, c10937b.f35271d) : this.f35170bq.getGroupId(c10937b.f35270c);
    }

    /* renamed from: a */
    private Drawable m2756a(ExpandableHListConnector.C10924b c10924b) {
        char c = 1;
        char c2 = 0;
        if (c10924b.f35136a.f35273f != 2) {
            Drawable drawable = this.f35178bz;
            if (drawable != null && drawable.isStateful()) {
                drawable.setState(c10924b.f35136a.f35272e == c10924b.f35137b.f35130c ? f35147bF : f35142bA);
            }
            return drawable;
        }
        Drawable drawable2 = this.f35177by;
        if (drawable2 == null || !drawable2.isStateful()) {
            return drawable2;
        }
        boolean z = c10924b.f35137b == null || c10924b.f35137b.f35130c == c10924b.f35137b.f35129b;
        if (!c10924b.m2763b()) {
            c = 0;
        }
        if (z) {
            c2 = 2;
        }
        drawable2.setState(f35146bE[c | c2]);
        return drawable2;
    }

    /* renamed from: b */
    public static int m2753b(long j) {
        if (j == 4294967295L) {
            return 2;
        }
        return (j & Long.MIN_VALUE) == Long.MIN_VALUE ? 1 : 0;
    }

    /* renamed from: c */
    public static int m2750c(long j) {
        if (j == 4294967295L) {
            return -1;
        }
        return (int) ((f35151bj & j) >> 32);
    }

    /* renamed from: d */
    public static int m2749d(long j) {
        if (j != 4294967295L && (j & Long.MIN_VALUE) == Long.MIN_VALUE) {
            return (int) (j & 4294967295L);
        }
        return -1;
    }

    /* renamed from: i */
    public static long m2747i(int i, int i2) {
        return Long.MIN_VALUE | ((i & f35156bo) << 32) | (i2 & (-1));
    }

    /* renamed from: n */
    public static long m2742n(int i) {
        return (i & f35156bo) << 32;
    }

    /* renamed from: r */
    private boolean m2741r(int i) {
        return i < getHeaderViewsCount() || i >= this.f35103aP - getFooterViewsCount();
    }

    /* renamed from: s */
    private int m2740s(int i) {
        return i - getHeaderViewsCount();
    }

    /* renamed from: t */
    private int m2739t(int i) {
        return getHeaderViewsCount() + i;
    }

    /* renamed from: a */
    public int m2758a(long j) {
        C10937b m2650a = C10937b.m2650a(j);
        ExpandableHListConnector.C10924b m2778a = this.f35169bp.m2778a(m2650a);
        m2650a.m2649b();
        int i = m2778a.f35136a.f35272e;
        m2778a.m2765a();
        return m2739t(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // it.sephiroth.android.library.widget.HListView
    /* renamed from: a */
    public void mo2722a(Canvas canvas, Rect rect, int i) {
        int i2 = this.f35109aw + i;
        if (i2 >= 0) {
            ExpandableHListConnector.C10924b m2783a = this.f35169bp.m2783a(m2740s(i2));
            if (m2783a.f35136a.f35273f == 1 || (m2783a.m2763b() && m2783a.f35137b.f35130c != m2783a.f35137b.f35129b)) {
                Drawable drawable = this.f35158bG;
                drawable.setBounds(rect);
                drawable.draw(canvas);
                m2783a.m2765a();
                return;
            }
            m2783a.m2765a();
        }
        super.mo2722a(canvas, rect, i2);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView
    /* renamed from: a */
    public boolean mo2757a(View view, int i, long j) {
        return m2741r(i) ? super.a(view, i, j) : m2748d(view, m2740s(i), j);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    /* renamed from: b */
    ContextMenu.ContextMenuInfo mo2752b(View view, int i, long j) {
        if (m2741r(i)) {
            return new AdapterView.ContextMenu$ContextMenuInfoC10916a(view, i, j);
        }
        ExpandableHListConnector.C10924b m2783a = this.f35169bp.m2783a(m2740s(i));
        C10937b c10937b = m2783a.f35136a;
        long m2755a = m2755a(c10937b);
        long m2654a = c10937b.m2654a();
        m2783a.m2765a();
        return new ContextMenu$ContextMenuInfoC10927a(view, m2654a, m2755a);
    }

    /* renamed from: b */
    public boolean m2754b(int i, int i2, boolean z) {
        C10937b m2652a = C10937b.m2652a(i, i2);
        ExpandableHListConnector.C10924b m2778a = this.f35169bp.m2778a(m2652a);
        if (m2778a == null) {
            if (!z) {
                return false;
            }
            m2746j(i);
            m2778a = this.f35169bp.m2778a(m2652a);
            if (m2778a == null) {
                throw new IllegalStateException("Could not find child");
            }
        }
        super.setSelection(m2739t(m2778a.f35136a.f35272e));
        m2652a.m2649b();
        m2778a.m2765a();
        return true;
    }

    /* renamed from: c */
    public boolean m2751c(int i, boolean z) {
        C10937b m2651a = C10937b.m2651a(2, i, -1, -1);
        ExpandableHListConnector.C10924b m2778a = this.f35169bp.m2778a(m2651a);
        m2651a.m2649b();
        boolean m2773b = this.f35169bp.m2773b(m2778a);
        if (this.f35166bO != null) {
            this.f35166bO.m2733a(i);
        }
        if (z) {
            int headerViewsCount = m2778a.f35136a.f35272e + getHeaderViewsCount();
            e(this.f35170bq.getChildrenCount(i) + headerViewsCount, headerViewsCount);
        }
        m2778a.m2765a();
        return m2773b;
    }

    /* renamed from: d */
    boolean m2748d(View view, int i, long j) {
        boolean z;
        ExpandableHListConnector.C10924b m2783a = this.f35169bp.m2783a(i);
        long m2755a = m2755a(m2783a.f35136a);
        if (m2783a.f35136a.f35273f == 2) {
            if (this.f35167bP != null && this.f35167bP.m2735a(this, view, m2783a.f35136a.f35270c, m2755a)) {
                m2783a.m2765a();
                return true;
            }
            if (m2783a.m2763b()) {
                this.f35169bp.m2780a(m2783a);
                playSoundEffect(0);
                if (this.f35165bN != null) {
                    this.f35165bN.m2734a(m2783a.f35136a.f35270c);
                }
            } else {
                this.f35169bp.m2773b(m2783a);
                playSoundEffect(0);
                if (this.f35166bO != null) {
                    this.f35166bO.m2733a(m2783a.f35136a.f35270c);
                }
                int i2 = m2783a.f35136a.f35270c;
                int headerViewsCount = m2783a.f35136a.f35272e + getHeaderViewsCount();
                e(this.f35170bq.getChildrenCount(i2) + headerViewsCount, headerViewsCount);
            }
            z = true;
        } else if (this.f35168bQ != null) {
            playSoundEffect(0);
            return this.f35168bQ.m2736a(this, view, m2783a.f35136a.f35270c, m2783a.f35136a.f35271d, m2755a);
        } else {
            z = false;
        }
        m2783a.m2765a();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f35178bz == null && this.f35177by == null) {
            return;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = ((this.f35103aP - getFooterViewsCount()) - headerViewsCount) - 1;
        int right = getRight();
        Rect rect = this.f35159bH;
        int childCount = getChildCount();
        int i = this.f35109aw - headerViewsCount;
        int i2 = -4;
        int i3 = 0;
        int i4 = i;
        while (i3 < childCount) {
            if (i4 >= 0) {
                if (i4 > footerViewsCount) {
                    return;
                }
                View childAt = getChildAt(i3);
                int left = childAt.getLeft();
                int right2 = childAt.getRight();
                if (right2 >= 0 && left <= right) {
                    ExpandableHListConnector.C10924b m2783a = this.f35169bp.m2783a(i4);
                    if (m2783a.f35136a.f35273f != i2) {
                        if (m2783a.f35136a.f35273f == 1) {
                            rect.top = childAt.getTop() + this.f35175bv;
                            rect.bottom = childAt.getBottom() + this.f35175bv;
                        } else {
                            rect.top = childAt.getTop() + this.f35171br;
                            rect.bottom = childAt.getBottom() + this.f35171br;
                        }
                        i2 = m2783a.f35136a.f35273f;
                    }
                    if (rect.top != rect.bottom) {
                        if (m2783a.f35136a.f35273f == 1) {
                            rect.left = this.f35176bw + left;
                            rect.right = this.f35176bw + right2;
                        } else {
                            rect.left = this.f35172bs + left;
                            rect.right = this.f35172bs + right2;
                        }
                        Drawable m2756a = m2756a(m2783a);
                        if (m2756a != null) {
                            if (m2783a.f35136a.f35273f == 1) {
                                Gravity.apply(this.f35174bu, this.f35163bL, this.f35164bM, rect, this.f35160bI);
                            } else {
                                Gravity.apply(this.f35173bt, this.f35161bJ, this.f35162bK, rect, this.f35160bI);
                            }
                            m2756a.setBounds(this.f35160bI);
                            m2756a.draw(canvas);
                        }
                    }
                    m2783a.m2765a();
                }
            }
            i3++;
            i4++;
        }
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AdapterView
    public ListAdapter getAdapter() {
        return super.getAdapter();
    }

    public ExpandableListAdapter getExpandableListAdapter() {
        return this.f35170bq;
    }

    public long getSelectedId() {
        long selectedPosition = getSelectedPosition();
        if (selectedPosition == 4294967295L) {
            return -1L;
        }
        int m2750c = m2750c(selectedPosition);
        return m2753b(selectedPosition) == 0 ? this.f35170bq.getGroupId(m2750c) : this.f35170bq.getChildId(m2750c, m2749d(selectedPosition));
    }

    public long getSelectedPosition() {
        return m2744l(getSelectedItemPosition());
    }

    /* renamed from: j */
    public boolean m2746j(int i) {
        return m2751c(i, false);
    }

    /* renamed from: k */
    public boolean m2745k(int i) {
        boolean m2774b = this.f35169bp.m2774b(i);
        if (this.f35165bN != null) {
            this.f35165bN.m2734a(i);
        }
        return m2774b;
    }

    /* renamed from: l */
    public long m2744l(int i) {
        if (m2741r(i)) {
            return 4294967295L;
        }
        ExpandableHListConnector.C10924b m2783a = this.f35169bp.m2783a(m2740s(i));
        long m2654a = m2783a.f35136a.m2654a();
        m2783a.m2765a();
        return m2654a;
    }

    /* renamed from: m */
    public boolean m2743m(int i) {
        return this.f35169bp.m2771d(i);
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ExpandableHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ExpandableHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f35169bp == null || savedState.f35179a == null) {
            return;
        }
        this.f35169bp.m2777a(savedState.f35179a);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m2760D();
        m2759E();
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f35169bp != null ? this.f35169bp.m2775b() : null);
    }

    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        this.f35170bq = expandableListAdapter;
        if (expandableListAdapter != null) {
            this.f35169bp = new ExpandableHListConnector(expandableListAdapter);
        } else {
            this.f35169bp = null;
        }
        super.setAdapter((ListAdapter) this.f35169bp);
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        throw new RuntimeException("For ExpandableListView, use setAdapter(ExpandableListAdapter) instead of setAdapter(ListAdapter)");
    }

    public void setChildDivider(Drawable drawable) {
        this.f35158bG = drawable;
    }

    public void setChildIndicator(Drawable drawable) {
        this.f35178bz = drawable;
        m2759E();
    }

    public void setGroupIndicator(Drawable drawable) {
        this.f35177by = drawable;
        m2760D();
    }

    public void setOnChildClickListener(AbstractC10928b abstractC10928b) {
        this.f35168bQ = abstractC10928b;
    }

    public void setOnGroupClickListener(AbstractC10929c abstractC10929c) {
        this.f35167bP = abstractC10929c;
    }

    public void setOnGroupCollapseListener(AbstractC10930d abstractC10930d) {
        this.f35165bN = abstractC10930d;
    }

    public void setOnGroupExpandListener(AbstractC10931e abstractC10931e) {
        this.f35166bO = abstractC10931e;
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    public void setOnItemClickListener(AdapterView.AbstractC10918c abstractC10918c) {
        super.setOnItemClickListener(abstractC10918c);
    }

    public void setSelectedGroup(int i) {
        C10937b m2653a = C10937b.m2653a(i);
        ExpandableHListConnector.C10924b m2778a = this.f35169bp.m2778a(m2653a);
        m2653a.m2649b();
        super.setSelection(m2739t(m2778a.f35136a.f35272e));
        m2778a.m2765a();
    }
}
