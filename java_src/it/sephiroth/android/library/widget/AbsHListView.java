package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.util.LongSparseArray;
import android.support.p001v4.util.SparseArrayCompat;
import android.support.p001v4.view.AccessibilityDelegateCompat;
import android.support.p001v4.view.MotionEventCompat;
import android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import it.sephiroth.android.library.C10884R;
import it.sephiroth.android.library.p278a.C10890b;
import it.sephiroth.android.library.p278a.p279a.AbstractActionMode$CallbackC10888a;
import it.sephiroth.android.library.p278a.p279a.C10889b;
import it.sephiroth.android.library.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;
@TargetApi(11)
/* loaded from: classes.dex */
public abstract class AbsHListView extends AdapterView<ListAdapter> implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a */
    public static final int f34903a = 0;

    /* renamed from: aX */
    private static final String f34904aX = "AbsListView";

    /* renamed from: ak */
    protected static final int f34905ak = 3;

    /* renamed from: aq */
    static final Interpolator f34906aq = new LinearInterpolator();

    /* renamed from: ar */
    public static final int[] f34907ar = {0};

    /* renamed from: b */
    public static final int f34908b = 1;

    /* renamed from: be */
    private static final int f34909be = 20;

    /* renamed from: bf */
    private static final int f34910bf = -1;

    /* renamed from: bg */
    private static final int f34911bg = 0;

    /* renamed from: bh */
    private static final int f34912bh = 1;

    /* renamed from: by */
    private static final int f34913by = -1;

    /* renamed from: c */
    public static final int f34914c = 2;

    /* renamed from: d */
    public static final int f34915d = -1;

    /* renamed from: e */
    public static final int f34916e = 0;

    /* renamed from: f */
    public static final int f34917f = 1;

    /* renamed from: g */
    public static final int f34918g = 2;

    /* renamed from: h */
    public static final int f34919h = 3;

    /* renamed from: i */
    public static final int f34920i = 4;

    /* renamed from: j */
    public static final int f34921j = 5;

    /* renamed from: k */
    public static final int f34922k = 6;

    /* renamed from: l */
    public static final int f34923l = 0;

    /* renamed from: m */
    public static final int f34924m = 1;

    /* renamed from: n */
    public static final int f34925n = 2;

    /* renamed from: o */
    public static final int f34926o = 3;

    /* renamed from: p */
    public static final int f34927p = 4;

    /* renamed from: q */
    public static final int f34928q = 5;

    /* renamed from: r */
    public static final int f34929r = 6;

    /* renamed from: A */
    protected C10898a f34930A;

    /* renamed from: B */
    protected ListAdapter f34931B;

    /* renamed from: C */
    boolean f34932C;

    /* renamed from: D */
    boolean f34933D;

    /* renamed from: E */
    Drawable f34934E;

    /* renamed from: F */
    int f34935F;

    /* renamed from: G */
    protected Rect f34936G;

    /* renamed from: H */
    protected final C10911j f34937H;

    /* renamed from: I */
    int f34938I;

    /* renamed from: J */
    int f34939J;

    /* renamed from: K */
    int f34940K;

    /* renamed from: L */
    int f34941L;

    /* renamed from: M */
    protected Rect f34942M;

    /* renamed from: N */
    protected int f34943N;

    /* renamed from: O */
    View f34944O;

    /* renamed from: P */
    View f34945P;

    /* renamed from: Q */
    protected boolean f34946Q;

    /* renamed from: R */
    protected boolean f34947R;

    /* renamed from: S */
    protected int f34948S;

    /* renamed from: T */
    int f34949T;

    /* renamed from: U */
    int f34950U;

    /* renamed from: V */
    int f34951V;

    /* renamed from: W */
    int f34952W;

    /* renamed from: aY */
    private VelocityTracker f34953aY;

    /* renamed from: aZ */
    private RunnableC10902e f34954aZ;

    /* renamed from: aa */
    protected int f34955aa;

    /* renamed from: ab */
    int f34956ab;

    /* renamed from: ac */
    int f34957ac;

    /* renamed from: ad */
    protected RunnableC10907i f34958ad;

    /* renamed from: ae */
    protected int f34959ae;

    /* renamed from: af */
    protected boolean f34960af;

    /* renamed from: ag */
    boolean f34961ag;

    /* renamed from: ah */
    boolean f34962ah;

    /* renamed from: ai */
    protected int f34963ai;

    /* renamed from: aj */
    protected int f34964aj;

    /* renamed from: al */
    protected Runnable f34965al;

    /* renamed from: am */
    protected final boolean[] f34966am;

    /* renamed from: an */
    int f34967an;

    /* renamed from: ao */
    int f34968ao;

    /* renamed from: ap */
    protected boolean f34969ap;

    /* renamed from: bA */
    private C10936a f34970bA;

    /* renamed from: bB */
    private int f34971bB;

    /* renamed from: bC */
    private int f34972bC;

    /* renamed from: bD */
    private int f34973bD;

    /* renamed from: bE */
    private boolean f34974bE;

    /* renamed from: bF */
    private int f34975bF;

    /* renamed from: bG */
    private int f34976bG;

    /* renamed from: bH */
    private C10904f f34977bH;

    /* renamed from: bI */
    private int f34978bI;

    /* renamed from: bJ */
    private int f34979bJ;

    /* renamed from: bK */
    private int f34980bK;

    /* renamed from: bL */
    private SavedState f34981bL;

    /* renamed from: bM */
    private float f34982bM;

    /* renamed from: ba */
    private AbstractC10905g f34983ba;

    /* renamed from: bb */
    private boolean f34984bb;

    /* renamed from: bc */
    private Rect f34985bc;

    /* renamed from: bd */
    private ContextMenu.ContextMenuInfo f34986bd;

    /* renamed from: bi */
    private int f34987bi;

    /* renamed from: bj */
    private RunnableC10900c f34988bj;

    /* renamed from: bk */
    private Runnable f34989bk;

    /* renamed from: bl */
    private RunnableC10899b f34990bl;

    /* renamed from: bm */
    private RunnableC10906h f34991bm;

    /* renamed from: bn */
    private Runnable f34992bn;

    /* renamed from: bo */
    private int f34993bo;

    /* renamed from: bp */
    private int f34994bp;

    /* renamed from: bq */
    private boolean f34995bq;

    /* renamed from: br */
    private int f34996br;

    /* renamed from: bs */
    private int f34997bs;

    /* renamed from: bt */
    private Runnable f34998bt;

    /* renamed from: bu */
    private int f34999bu;

    /* renamed from: bv */
    private int f35000bv;

    /* renamed from: bw */
    private float f35001bw;

    /* renamed from: bx */
    private int f35002bx;

    /* renamed from: bz */
    private C10936a f35003bz;

    /* renamed from: s */
    C10890b.AbstractC10891a f35004s;

    /* renamed from: t */
    protected int f35005t;

    /* renamed from: u */
    public Object f35006u;

    /* renamed from: v */
    Object f35007v;

    /* renamed from: w */
    int f35008w;

    /* renamed from: x */
    protected SparseArrayCompat<Boolean> f35009x;

    /* renamed from: y */
    LongSparseArray<Integer> f35010y;

    /* renamed from: z */
    protected int f35011z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f35016a;

        /* renamed from: b */
        public boolean f35017b;

        /* renamed from: c */
        public boolean f35018c;

        /* renamed from: d */
        public int f35019d;

        /* renamed from: e */
        public long f35020e = -1;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f35016a = i3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: it.sephiroth.android.library.widget.AbsHListView.SavedState.1
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
        long f35021a;

        /* renamed from: b */
        long f35022b;

        /* renamed from: c */
        int f35023c;

        /* renamed from: d */
        int f35024d;

        /* renamed from: e */
        int f35025e;

        /* renamed from: f */
        String f35026f;

        /* renamed from: g */
        boolean f35027g;

        /* renamed from: h */
        int f35028h;

        /* renamed from: i */
        SparseArrayCompat<Boolean> f35029i;

        /* renamed from: j */
        LongSparseArray<Integer> f35030j;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35021a = parcel.readLong();
            this.f35022b = parcel.readLong();
            this.f35023c = parcel.readInt();
            this.f35024d = parcel.readInt();
            this.f35025e = parcel.readInt();
            this.f35026f = parcel.readString();
            this.f35027g = parcel.readByte() != 0;
            this.f35028h = parcel.readInt();
            this.f35029i = m2847b(parcel);
            this.f35030j = m2852a(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private LongSparseArray<Integer> m2852a(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt <= 0) {
                return null;
            }
            LongSparseArray<Integer> longSparseArray = new LongSparseArray<>(readInt);
            m2850a(longSparseArray, parcel, readInt);
            return longSparseArray;
        }

        /* renamed from: a */
        private void m2851a(LongSparseArray<Integer> longSparseArray, Parcel parcel) {
            int size = longSparseArray != null ? longSparseArray.size() : 0;
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                parcel.writeLong(longSparseArray.keyAt(i));
                parcel.writeInt(longSparseArray.valueAt(i).intValue());
            }
        }

        /* renamed from: a */
        private void m2850a(LongSparseArray<Integer> longSparseArray, Parcel parcel, int i) {
            while (i > 0) {
                longSparseArray.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
                i--;
            }
        }

        /* renamed from: a */
        private void m2849a(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel) {
            if (sparseArrayCompat == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = sparseArrayCompat.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                parcel.writeInt(sparseArrayCompat.keyAt(i));
                parcel.writeByte((byte) (sparseArrayCompat.valueAt(i).booleanValue() ? 1 : 0));
            }
        }

        /* renamed from: a */
        private void m2848a(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel, int i) {
            while (i > 0) {
                sparseArrayCompat.append(parcel.readInt(), Boolean.valueOf(parcel.readByte() == 1));
                i--;
            }
        }

        /* renamed from: b */
        private SparseArrayCompat<Boolean> m2847b(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt < 0) {
                return null;
            }
            SparseArrayCompat<Boolean> sparseArrayCompat = new SparseArrayCompat<>(readInt);
            m2848a(sparseArrayCompat, parcel, readInt);
            return sparseArrayCompat;
        }

        public String toString() {
            return "AbsListView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f35021a + " firstId=" + this.f35022b + " viewLeft=" + this.f35023c + " position=" + this.f35024d + " width=" + this.f35025e + " filter=" + this.f35026f + " checkState=" + this.f35029i + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f35021a);
            parcel.writeLong(this.f35022b);
            parcel.writeInt(this.f35023c);
            parcel.writeInt(this.f35024d);
            parcel.writeInt(this.f35025e);
            parcel.writeString(this.f35026f);
            parcel.writeByte((byte) (this.f35027g ? 1 : 0));
            parcel.writeInt(this.f35028h);
            m2849a(this.f35029i, parcel);
            m2851a(this.f35030j, parcel);
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$a */
    /* loaded from: classes2.dex */
    public class C10898a extends AdapterView<ListAdapter>.C10917b {
        public C10898a() {
            super();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.C10917b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo2789a() {
            super.mo2789a();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.C10917b, android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.C10917b, android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$b */
    /* loaded from: classes2.dex */
    private class RunnableC10899b extends C10914m implements Runnable {
        private RunnableC10899b() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbsHListView.this.isPressed() || AbsHListView.this.f35101aN < 0) {
                return;
            }
            View childAt = AbsHListView.this.getChildAt(AbsHListView.this.f35101aN - AbsHListView.this.f35109aw);
            if (!AbsHListView.this.f35098aK) {
                if (!(b() ? AbsHListView.this.m2890c(childAt, AbsHListView.this.f35101aN, AbsHListView.this.f35102aO) : false)) {
                    return;
                }
                AbsHListView.this.setPressed(false);
                childAt.setPressed(false);
                return;
            }
            AbsHListView.this.setPressed(false);
            if (childAt == null) {
                return;
            }
            childAt.setPressed(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$c */
    /* loaded from: classes2.dex */
    public class RunnableC10900c extends C10914m implements Runnable {
        private RunnableC10900c() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt = AbsHListView.this.getChildAt(AbsHListView.this.f34948S - AbsHListView.this.f35109aw);
            if (childAt != null) {
                if (!((!b() || AbsHListView.this.f35098aK) ? false : AbsHListView.this.m2890c(childAt, AbsHListView.this.f34948S, AbsHListView.this.f34931B.getItemId(AbsHListView.this.f34948S)))) {
                    AbsHListView.this.f34955aa = 2;
                    return;
                }
                AbsHListView.this.f34955aa = -1;
                AbsHListView.this.setPressed(false);
                childAt.setPressed(false);
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$d */
    /* loaded from: classes2.dex */
    final class RunnableC10901d implements Runnable {
        RunnableC10901d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Drawable current;
            if (AbsHListView.this.f34955aa == 0) {
                AbsHListView.this.f34955aa = 1;
                View childAt = AbsHListView.this.getChildAt(AbsHListView.this.f34948S - AbsHListView.this.f35109aw);
                if (childAt == null || childAt.hasFocusable()) {
                    return;
                }
                AbsHListView.this.f35011z = 0;
                if (AbsHListView.this.f35098aK) {
                    AbsHListView.this.f34955aa = 2;
                    return;
                }
                childAt.setPressed(true);
                AbsHListView.this.setPressed(true);
                AbsHListView.this.mo2691h();
                AbsHListView.this.m2915a(AbsHListView.this.f34948S, childAt);
                AbsHListView.this.refreshDrawableState();
                int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                boolean isLongClickable = AbsHListView.this.isLongClickable();
                if (AbsHListView.this.f34934E != null && (current = AbsHListView.this.f34934E.getCurrent()) != null && (current instanceof TransitionDrawable)) {
                    if (isLongClickable) {
                        ((TransitionDrawable) current).startTransition(longPressTimeout);
                    } else {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                if (!isLongClickable) {
                    AbsHListView.this.f34955aa = 2;
                    return;
                }
                if (AbsHListView.this.f34988bj == null) {
                    AbsHListView.this.f34988bj = new RunnableC10900c();
                }
                AbsHListView.this.f34988bj.a();
                AbsHListView.this.postDelayed(AbsHListView.this.f34988bj, longPressTimeout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$e */
    /* loaded from: classes2.dex */
    public class RunnableC10902e implements Runnable {

        /* renamed from: e */
        private static final int f35035e = 40;

        /* renamed from: b */
        private final C10939d f35037b;

        /* renamed from: c */
        private int f35038c;

        /* renamed from: d */
        private final Runnable f35039d = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.e.1
            @Override // java.lang.Runnable
            public void run() {
                int i = AbsHListView.this.f35002bx;
                VelocityTracker velocityTracker = AbsHListView.this.f34953aY;
                C10939d c10939d = RunnableC10902e.this.f35037b;
                if (velocityTracker == null || i == -1) {
                    return;
                }
                velocityTracker.computeCurrentVelocity(1000, AbsHListView.this.f35000bv);
                float f = -velocityTracker.getXVelocity(i);
                if (Math.abs(f) >= AbsHListView.this.f34999bu && c10939d.m2639a(f, 0.0f)) {
                    AbsHListView.this.postDelayed(this, 40L);
                    return;
                }
                RunnableC10902e.this.m2840b();
                AbsHListView.this.f34955aa = 3;
                AbsHListView.this.m2899b(1);
            }
        };

        RunnableC10902e() {
            this.f35037b = new C10939d(AbsHListView.this.getContext());
        }

        /* renamed from: a */
        void m2844a() {
            if (!this.f35037b.m2634a(AbsHListView.this.getScrollX(), 0, 0, 0, 0, 0)) {
                AbsHListView.this.f34955aa = -1;
                AbsHListView.this.m2899b(0);
                return;
            }
            AbsHListView.this.f34955aa = 6;
            AbsHListView.this.invalidate();
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: a */
        void m2843a(int i) {
            int i2 = i < 0 ? Integer.MAX_VALUE : 0;
            this.f35038c = i2;
            this.f35037b.m2631a((Interpolator) null);
            this.f35037b.m2633a(i2, 0, i, 0, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            AbsHListView.this.f34955aa = 4;
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: a */
        void m2842a(int i, int i2, boolean z) {
            int i3 = i < 0 ? Integer.MAX_VALUE : 0;
            this.f35038c = i3;
            this.f35037b.m2631a(z ? AbsHListView.f34906aq : null);
            this.f35037b.m2635a(i3, 0, i, 0, i2);
            AbsHListView.this.f34955aa = 4;
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: b */
        void m2840b() {
            AbsHListView.this.f34955aa = -1;
            AbsHListView.this.removeCallbacks(this);
            AbsHListView.this.removeCallbacks(this.f35039d);
            AbsHListView.this.m2899b(0);
            AbsHListView.this.m2924J();
            this.f35037b.m2615l();
            AbsHListView.this.overScrollBy(0, 0, 0, 0, 0, 0, 0, 0, false);
        }

        /* renamed from: b */
        void m2839b(int i) {
            this.f35037b.m2631a((Interpolator) null);
            this.f35037b.m2632a(AbsHListView.this.getScrollX(), 0, i, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, AbsHListView.this.getWidth(), 0);
            AbsHListView.this.f34955aa = 6;
            AbsHListView.this.invalidate();
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: c */
        void m2838c() {
            AbsHListView.this.postDelayed(this.f35039d, 40L);
        }

        /* renamed from: c */
        void m2837c(int i) {
            this.f35037b.m2637a(AbsHListView.this.getScrollX(), 0, AbsHListView.this.f34968ao);
            int overScrollMode = AbsHListView.this.getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && !AbsHListView.this.m2930D())) {
                AbsHListView.this.f34955aa = 6;
                int m2623d = (int) this.f35037b.m2623d();
                if (i > 0) {
                    AbsHListView.this.f35003bz.m2662a(m2623d);
                } else {
                    AbsHListView.this.f34970bA.m2662a(m2623d);
                }
            } else {
                AbsHListView.this.f34955aa = -1;
                if (AbsHListView.this.f34958ad != null) {
                    AbsHListView.this.f34958ad.m2834a();
                }
            }
            AbsHListView.this.invalidate();
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.Runnable
        public void run() {
            int max;
            boolean z = true;
            boolean z2 = false;
            switch (AbsHListView.this.f34955aa) {
                case 3:
                    if (this.f35037b.m2641a()) {
                        return;
                    }
                    break;
                case 4:
                    break;
                case 5:
                default:
                    m2840b();
                    return;
                case 6:
                    C10939d c10939d = this.f35037b;
                    if (!c10939d.m2617j()) {
                        m2840b();
                        return;
                    }
                    int scrollX = AbsHListView.this.getScrollX();
                    int m2629b = c10939d.m2629b();
                    if (!AbsHListView.this.overScrollBy(m2629b - scrollX, 0, scrollX, 0, 0, 0, AbsHListView.this.f34968ao, 0, false)) {
                        AbsHListView.this.invalidate();
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    boolean z3 = scrollX <= 0 && m2629b > 0;
                    if (scrollX >= 0 && m2629b < 0) {
                        z2 = true;
                    }
                    if (!z3 && !z2) {
                        m2844a();
                        return;
                    }
                    int m2623d = (int) c10939d.m2623d();
                    if (z2) {
                        m2623d = -m2623d;
                    }
                    c10939d.m2615l();
                    m2843a(m2623d);
                    return;
            }
            if (AbsHListView.this.f35098aK) {
                AbsHListView.this.mo2691h();
            }
            if (AbsHListView.this.f35103aP == 0 || AbsHListView.this.getChildCount() == 0) {
                m2840b();
                return;
            }
            C10939d c10939d2 = this.f35037b;
            boolean m2617j = c10939d2.m2617j();
            int m2629b2 = c10939d2.m2629b();
            int i = this.f35038c - m2629b2;
            if (i > 0) {
                AbsHListView.this.f34948S = AbsHListView.this.f35109aw;
                AbsHListView.this.f34949T = AbsHListView.this.getChildAt(0).getLeft();
                max = Math.min(((AbsHListView.this.getWidth() - AbsHListView.this.getPaddingRight()) - AbsHListView.this.getPaddingLeft()) - 1, i);
            } else {
                int childCount = AbsHListView.this.getChildCount() - 1;
                AbsHListView.this.f34948S = AbsHListView.this.f35109aw + childCount;
                AbsHListView.this.f34949T = AbsHListView.this.getChildAt(childCount).getLeft();
                max = Math.max(-(((AbsHListView.this.getWidth() - AbsHListView.this.getPaddingRight()) - AbsHListView.this.getPaddingLeft()) - 1), i);
            }
            View childAt = AbsHListView.this.getChildAt(AbsHListView.this.f34948S - AbsHListView.this.f35109aw);
            int left = childAt != null ? childAt.getLeft() : 0;
            boolean m2873g = AbsHListView.this.m2873g(max, max);
            if (!m2873g || max == 0) {
                z = false;
            }
            if (z) {
                if (childAt != null) {
                    AbsHListView.this.overScrollBy(-(max - (childAt.getLeft() - left)), 0, AbsHListView.this.getScrollX(), 0, 0, 0, AbsHListView.this.f34968ao, 0, false);
                }
                if (!m2617j) {
                    return;
                }
                m2837c(max);
            } else if (!m2617j || z) {
                m2840b();
            } else {
                if (m2873g) {
                    AbsHListView.this.invalidate();
                }
                this.f35038c = m2629b2;
                AbsHListView.this.f35004s.mo2933a(this);
            }
        }
    }

    @TargetApi(14)
    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$f */
    /* loaded from: classes2.dex */
    class C10904f extends AccessibilityDelegateCompat {
        C10904f() {
        }

        @Override // android.support.p001v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int a = AbsHListView.this.a(view);
            ListAdapter adapter = AbsHListView.this.getAdapter();
            if (a == -1 || adapter == null || !AbsHListView.this.isEnabled() || !adapter.isEnabled(a)) {
                return;
            }
            if (a == AbsHListView.this.getSelectedItemPosition()) {
                accessibilityNodeInfoCompat.setSelected(true);
                accessibilityNodeInfoCompat.addAction(8);
            } else {
                accessibilityNodeInfoCompat.addAction(4);
            }
            if (AbsHListView.this.isClickable()) {
                accessibilityNodeInfoCompat.addAction(16);
                accessibilityNodeInfoCompat.setClickable(true);
            }
            if (!AbsHListView.this.isLongClickable()) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(32);
            accessibilityNodeInfoCompat.setLongClickable(true);
        }

        @Override // android.support.p001v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            int a = AbsHListView.this.a(view);
            ListAdapter adapter = AbsHListView.this.getAdapter();
            if (a == -1 || adapter == null) {
                return false;
            }
            if (!AbsHListView.this.isEnabled() || !adapter.isEnabled(a)) {
                return false;
            }
            long i2 = AbsHListView.this.i(a);
            switch (i) {
                case 4:
                    if (AbsHListView.this.getSelectedItemPosition() == a) {
                        return false;
                    }
                    AbsHListView.this.setSelection(a);
                    return true;
                case 8:
                    if (AbsHListView.this.getSelectedItemPosition() != a) {
                        return false;
                    }
                    AbsHListView.this.setSelection(-1);
                    return true;
                case 16:
                    if (!AbsHListView.this.isClickable()) {
                        return false;
                    }
                    return AbsHListView.this.mo2757a(view, a, i2);
                case 32:
                    if (!AbsHListView.this.isLongClickable()) {
                        return false;
                    }
                    return AbsHListView.this.m2890c(view, a, i2);
                default:
                    return false;
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$g */
    /* loaded from: classes2.dex */
    public interface AbstractC10905g {

        /* renamed from: a */
        public static final int f35042a = 0;

        /* renamed from: b */
        public static final int f35043b = 1;

        /* renamed from: c */
        public static final int f35044c = 2;

        /* renamed from: a */
        void m2836a(AbsHListView absHListView, int i);

        /* renamed from: a */
        void m2835a(AbsHListView absHListView, int i, int i2, int i3);
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$h */
    /* loaded from: classes2.dex */
    private class RunnableC10906h extends C10914m implements Runnable {

        /* renamed from: a */
        int f35045a;

        private RunnableC10906h() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            if (AbsHListView.this.f35098aK) {
                return;
            }
            ListAdapter listAdapter = AbsHListView.this.f34931B;
            int i = this.f35045a;
            if (listAdapter == null || AbsHListView.this.f35103aP <= 0 || i == -1 || i >= listAdapter.getCount() || !b() || (childAt = AbsHListView.this.getChildAt(i - AbsHListView.this.f35109aw)) == null) {
                return;
            }
            AbsHListView.this.mo2757a(childAt, i, listAdapter.getItemId(i));
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$i */
    /* loaded from: classes2.dex */
    public class RunnableC10907i implements Runnable {

        /* renamed from: b */
        private static final int f35047b = 200;

        /* renamed from: c */
        private static final int f35048c = 1;

        /* renamed from: d */
        private static final int f35049d = 2;

        /* renamed from: e */
        private static final int f35050e = 3;

        /* renamed from: f */
        private static final int f35051f = 4;

        /* renamed from: g */
        private static final int f35052g = 5;

        /* renamed from: h */
        private int f35054h;

        /* renamed from: i */
        private int f35055i;

        /* renamed from: j */
        private int f35056j;

        /* renamed from: k */
        private int f35057k;

        /* renamed from: l */
        private int f35058l;

        /* renamed from: m */
        private final int f35059m;

        /* renamed from: n */
        private int f35060n;

        RunnableC10907i() {
            this.f35059m = ViewConfiguration.get(AbsHListView.this.getContext()).getScaledFadingEdgeLength();
        }

        /* renamed from: a */
        public void m2834a() {
            AbsHListView.this.removeCallbacks(this);
        }

        /* renamed from: a */
        void m2833a(final int i) {
            int i2;
            m2834a();
            if (AbsHListView.this.f35098aK) {
                AbsHListView.this.f34965al = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.i.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC10907i.this.m2833a(i);
                    }
                };
                return;
            }
            int childCount = AbsHListView.this.getChildCount();
            if (childCount == 0) {
                return;
            }
            int i3 = AbsHListView.this.f35109aw;
            int i4 = (childCount + i3) - 1;
            int max = Math.max(0, Math.min(AbsHListView.this.getCount() - 1, i));
            if (max < i3) {
                i2 = (i3 - max) + 1;
                this.f35054h = 2;
            } else if (max <= i4) {
                m2829b(max, -1, 200);
                return;
            } else {
                i2 = (max - i4) + 1;
                this.f35054h = 1;
            }
            if (i2 > 0) {
                this.f35058l = 200 / i2;
            } else {
                this.f35058l = 200;
            }
            this.f35055i = max;
            this.f35056j = -1;
            this.f35057k = -1;
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: a */
        void m2832a(final int i, final int i2) {
            int i3;
            int i4;
            m2834a();
            if (i2 == -1) {
                m2833a(i);
            } else if (AbsHListView.this.f35098aK) {
                AbsHListView.this.f34965al = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.i.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC10907i.this.m2832a(i, i2);
                    }
                };
            } else {
                int childCount = AbsHListView.this.getChildCount();
                if (childCount == 0) {
                    return;
                }
                int i5 = AbsHListView.this.f35109aw;
                int i6 = (childCount + i5) - 1;
                int max = Math.max(0, Math.min(AbsHListView.this.getCount() - 1, i));
                if (max < i5) {
                    int i7 = i6 - i2;
                    if (i7 < 1) {
                        return;
                    }
                    i3 = (i5 - max) + 1;
                    i4 = i7 - 1;
                    if (i4 < i3) {
                        this.f35054h = 4;
                    } else {
                        this.f35054h = 2;
                        i4 = i3;
                    }
                } else if (max <= i6) {
                    m2829b(max, i2, 200);
                    return;
                } else {
                    int i8 = i2 - i5;
                    if (i8 < 1) {
                        return;
                    }
                    i3 = (max - i6) + 1;
                    i4 = i8 - 1;
                    if (i4 < i3) {
                        this.f35054h = 3;
                    } else {
                        this.f35054h = 1;
                        i4 = i3;
                    }
                }
                if (i4 > 0) {
                    this.f35058l = 200 / i4;
                } else {
                    this.f35058l = 200;
                }
                this.f35055i = max;
                this.f35056j = i2;
                this.f35057k = -1;
                AbsHListView.this.f35004s.mo2933a(this);
            }
        }

        /* renamed from: a */
        void m2831a(final int i, final int i2, final int i3) {
            int i4;
            m2834a();
            if (AbsHListView.this.f35098aK) {
                AbsHListView.this.f34965al = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.i.3
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC10907i.this.m2831a(i, i2, i3);
                    }
                };
                return;
            }
            int childCount = AbsHListView.this.getChildCount();
            if (childCount == 0) {
                return;
            }
            int paddingLeft = AbsHListView.this.getPaddingLeft() + i2;
            this.f35055i = Math.max(0, Math.min(AbsHListView.this.getCount() - 1, i));
            this.f35060n = paddingLeft;
            this.f35056j = -1;
            this.f35057k = -1;
            this.f35054h = 5;
            int i5 = AbsHListView.this.f35109aw;
            int i6 = (i5 + childCount) - 1;
            if (this.f35055i < i5) {
                i4 = i5 - this.f35055i;
            } else if (this.f35055i <= i6) {
                AbsHListView.this.m2916a(AbsHListView.this.getChildAt(this.f35055i - i5).getLeft() - paddingLeft, i3, false);
                return;
            } else {
                i4 = this.f35055i - i6;
            }
            float f = i4 / childCount;
            if (f >= 1.0f) {
                i3 = (int) (i3 / f);
            }
            this.f35058l = i3;
            this.f35057k = -1;
            AbsHListView.this.f35004s.mo2933a(this);
        }

        /* renamed from: b */
        void m2830b(int i, int i2) {
            m2831a(i, i2, 200);
        }

        /* renamed from: b */
        void m2829b(int i, int i2, int i3) {
            int i4 = AbsHListView.this.f35109aw;
            int childCount = (AbsHListView.this.getChildCount() + i4) - 1;
            int i5 = AbsHListView.this.f34942M.left;
            int width = AbsHListView.this.getWidth() - AbsHListView.this.f34942M.right;
            if (i < i4 || i > childCount) {
                Log.w(AbsHListView.f34904aX, "scrollToVisible called with targetPos " + i + " not visible [" + i4 + ", " + childCount + "]");
            }
            if (i2 < i4 || i2 > childCount) {
                i2 = -1;
            }
            View childAt = AbsHListView.this.getChildAt(i - i4);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int i6 = right > width ? right - width : 0;
            if (left < i5) {
                i6 = left - i5;
            }
            if (i6 == 0) {
                return;
            }
            if (i2 >= 0) {
                View childAt2 = AbsHListView.this.getChildAt(i2 - i4);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                int abs = Math.abs(i6);
                if (i6 < 0 && right2 + abs > width) {
                    i6 = Math.max(0, right2 - width);
                } else if (i6 > 0 && left2 - abs < i5) {
                    i6 = Math.min(0, left2 - i5);
                }
            }
            AbsHListView.this.m2876f(i6, i3);
        }

        @Override // java.lang.Runnable
        public void run() {
            int left;
            int i = 0;
            int width = AbsHListView.this.getWidth();
            int i2 = AbsHListView.this.f35109aw;
            switch (this.f35054h) {
                case 1:
                    int childCount = AbsHListView.this.getChildCount() - 1;
                    int i3 = i2 + childCount;
                    if (childCount < 0) {
                        return;
                    }
                    if (i3 == this.f35057k) {
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    View childAt = AbsHListView.this.getChildAt(childCount);
                    AbsHListView.this.m2916a((i3 < AbsHListView.this.f35103aP + (-1) ? Math.max(AbsHListView.this.f34942M.right, this.f35059m) : AbsHListView.this.f34942M.right) + (childAt.getWidth() - (width - childAt.getLeft())), this.f35058l, true);
                    this.f35057k = i3;
                    if (i3 >= this.f35055i) {
                        return;
                    }
                    AbsHListView.this.f35004s.mo2933a(this);
                    return;
                case 2:
                    if (i2 == this.f35057k) {
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    View childAt2 = AbsHListView.this.getChildAt(0);
                    if (childAt2 == null) {
                        return;
                    }
                    AbsHListView.this.m2916a(childAt2.getLeft() - (i2 > 0 ? Math.max(this.f35059m, AbsHListView.this.f34942M.left) : AbsHListView.this.f34942M.left), this.f35058l, true);
                    this.f35057k = i2;
                    if (i2 <= this.f35055i) {
                        return;
                    }
                    AbsHListView.this.f35004s.mo2933a(this);
                    return;
                case 3:
                    int childCount2 = AbsHListView.this.getChildCount();
                    if (i2 == this.f35056j || childCount2 <= 1 || childCount2 + i2 >= AbsHListView.this.f35103aP) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 == this.f35057k) {
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    View childAt3 = AbsHListView.this.getChildAt(1);
                    int width2 = childAt3.getWidth();
                    int left2 = childAt3.getLeft();
                    int max = Math.max(AbsHListView.this.f34942M.right, this.f35059m);
                    if (i4 < this.f35056j) {
                        AbsHListView.this.m2916a(Math.max(0, (left2 + width2) - max), this.f35058l, true);
                        this.f35057k = i4;
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    } else if (left2 <= max) {
                        return;
                    } else {
                        AbsHListView.this.m2916a(left2 - max, this.f35058l, true);
                        return;
                    }
                case 4:
                    int childCount3 = AbsHListView.this.getChildCount() - 2;
                    if (childCount3 < 0) {
                        return;
                    }
                    int i5 = i2 + childCount3;
                    if (i5 == this.f35057k) {
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    View childAt4 = AbsHListView.this.getChildAt(childCount3);
                    int width3 = childAt4.getWidth();
                    int left3 = childAt4.getLeft();
                    int i6 = width - left3;
                    int max2 = Math.max(AbsHListView.this.f34942M.left, this.f35059m);
                    this.f35057k = i5;
                    if (i5 > this.f35056j) {
                        AbsHListView.this.m2916a(-(i6 - max2), this.f35058l, true);
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    int i7 = width - max2;
                    int i8 = left3 + width3;
                    if (i7 <= i8) {
                        return;
                    }
                    AbsHListView.this.m2916a(-(i7 - i8), this.f35058l, true);
                    return;
                case 5:
                    if (this.f35057k == i2) {
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    }
                    this.f35057k = i2;
                    int childCount4 = AbsHListView.this.getChildCount();
                    int i9 = this.f35055i;
                    int i10 = (i2 + childCount4) - 1;
                    if (i9 < i2) {
                        i = (i2 - i9) + 1;
                    } else if (i9 > i10) {
                        i = i9 - i10;
                    }
                    float min = Math.min(Math.abs(i / childCount4), 1.0f);
                    if (i9 < i2) {
                        AbsHListView.this.m2916a((int) ((-AbsHListView.this.getWidth()) * min), (int) (min * this.f35058l), true);
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    } else if (i9 > i10) {
                        AbsHListView.this.m2916a((int) (AbsHListView.this.getWidth() * min), (int) (min * this.f35058l), true);
                        AbsHListView.this.f35004s.mo2933a(this);
                        return;
                    } else {
                        AbsHListView.this.m2916a(AbsHListView.this.getChildAt(i9 - i2).getLeft() - this.f35060n, (int) (this.f35058l * (Math.abs(left) / AbsHListView.this.getWidth())), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$j */
    /* loaded from: classes2.dex */
    public class C10911j {

        /* renamed from: b */
        private AbstractC10912k f35071b;

        /* renamed from: c */
        private int f35072c;

        /* renamed from: d */
        private View[] f35073d = new View[0];

        /* renamed from: e */
        private ArrayList<View>[] f35074e;

        /* renamed from: f */
        private int f35075f;

        /* renamed from: g */
        private ArrayList<View> f35076g;

        /* renamed from: h */
        private ArrayList<View> f35077h;

        /* renamed from: i */
        private SparseArrayCompat<View> f35078i;

        public C10911j() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: f */
        private void m2813f() {
            int i = 0;
            int length = this.f35073d.length;
            int i2 = this.f35075f;
            ArrayList<View>[] arrayListArr = this.f35074e;
            for (int i3 = 0; i3 < i2; i3++) {
                ArrayList<View> arrayList = arrayListArr[i3];
                int size = arrayList.size();
                int i4 = size - length;
                int i5 = size - 1;
                int i6 = 0;
                while (i6 < i4) {
                    AbsHListView.this.removeDetachedView(arrayList.remove(i5), false);
                    i6++;
                    i5--;
                }
            }
            if (this.f35078i != null) {
                while (i < this.f35078i.size()) {
                    if (!this.f35078i.valueAt(i).hasTransientState()) {
                        this.f35078i.removeAt(i);
                        i--;
                    }
                    i++;
                }
            }
        }

        /* renamed from: a */
        public void m2828a() {
            if (this.f35075f == 1) {
                ArrayList<View> arrayList = this.f35076g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.get(i).forceLayout();
                }
            } else {
                int i2 = this.f35075f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ArrayList<View> arrayList2 = this.f35074e[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList2.get(i4).forceLayout();
                    }
                }
            }
            if (this.f35078i != null) {
                int size3 = this.f35078i.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    this.f35078i.valueAt(i5).forceLayout();
                }
            }
        }

        /* renamed from: a */
        public void m2827a(int i) {
            if (i < 1) {
                throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
            }
            ArrayList<View>[] arrayListArr = new ArrayList[i];
            for (int i2 = 0; i2 < i; i2++) {
                arrayListArr[i2] = new ArrayList<>();
            }
            this.f35075f = i;
            this.f35076g = arrayListArr[0];
            this.f35074e = arrayListArr;
        }

        /* renamed from: a */
        public void m2826a(int i, int i2) {
            if (this.f35073d.length < i) {
                this.f35073d = new View[i];
            }
            this.f35072c = i2;
            View[] viewArr = this.f35073d;
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = AbsHListView.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f35016a != -2) {
                    viewArr[i3] = childAt;
                }
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public void m2825a(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.f35019d = i;
            int i2 = layoutParams.f35016a;
            boolean hasTransientState = Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false;
            if (m2820b(i2) && !hasTransientState) {
                view.onStartTemporaryDetach();
                if (this.f35075f == 1) {
                    this.f35076g.add(view);
                } else {
                    this.f35074e[i2].add(view);
                }
                if (Build.VERSION.SDK_INT >= 14) {
                    view.setAccessibilityDelegate(null);
                }
                if (this.f35071b == null) {
                    return;
                }
                this.f35071b.m2811a(view);
                return;
            }
            if (i2 != -2 || hasTransientState) {
                if (this.f35077h == null) {
                    this.f35077h = new ArrayList<>();
                }
                this.f35077h.add(view);
            }
            if (!hasTransientState) {
                return;
            }
            if (this.f35078i == null) {
                this.f35078i = new SparseArrayCompat<>();
            }
            view.onStartTemporaryDetach();
            this.f35078i.put(i, view);
        }

        /* renamed from: a */
        void m2822a(List<View> list) {
            if (this.f35075f == 1) {
                list.addAll(this.f35076g);
                return;
            }
            int i = this.f35075f;
            ArrayList<View>[] arrayListArr = this.f35074e;
            for (int i2 = 0; i2 < i; i2++) {
                list.addAll(arrayListArr[i2]);
            }
        }

        /* renamed from: b */
        public void m2821b() {
            if (this.f35075f == 1) {
                ArrayList<View> arrayList = this.f35076g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbsHListView.this.removeDetachedView(arrayList.remove((size - 1) - i), false);
                }
            } else {
                int i2 = this.f35075f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ArrayList<View> arrayList2 = this.f35074e[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        AbsHListView.this.removeDetachedView(arrayList2.remove((size2 - 1) - i4), false);
                    }
                }
            }
            if (this.f35078i != null) {
                this.f35078i.clear();
            }
        }

        /* renamed from: b */
        public boolean m2820b(int i) {
            return i >= 0;
        }

        /* renamed from: c */
        public View m2818c(int i) {
            int i2 = i - this.f35072c;
            View[] viewArr = this.f35073d;
            if (i2 < 0 || i2 >= viewArr.length) {
                return null;
            }
            View view = viewArr[i2];
            viewArr[i2] = null;
            return view;
        }

        /* renamed from: c */
        void m2819c() {
            if (this.f35078i != null) {
                this.f35078i.clear();
            }
        }

        /* renamed from: d */
        View m2816d(int i) {
            int indexOfKey;
            if (this.f35078i != null && (indexOfKey = this.f35078i.indexOfKey(i)) >= 0) {
                View valueAt = this.f35078i.valueAt(indexOfKey);
                this.f35078i.removeAt(indexOfKey);
                return valueAt;
            }
            return null;
        }

        /* renamed from: d */
        public void m2817d() {
            if (this.f35077h == null) {
                return;
            }
            int size = this.f35077h.size();
            for (int i = 0; i < size; i++) {
                AbsHListView.this.removeDetachedView(this.f35077h.get(i), false);
            }
            this.f35077h.clear();
        }

        /* renamed from: e */
        View m2814e(int i) {
            if (this.f35075f == 1) {
                return AbsHListView.m2902a(this.f35076g, i);
            }
            int itemViewType = AbsHListView.this.f34931B.getItemViewType(i);
            if (itemViewType >= 0 && itemViewType < this.f35074e.length) {
                return AbsHListView.m2902a(this.f35074e[itemViewType], i);
            }
            return null;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: e */
        public void m2815e() {
            View[] viewArr = this.f35073d;
            boolean z = this.f35071b != null;
            boolean z2 = this.f35075f > 1;
            ArrayList<View> arrayList = this.f35076g;
            for (int length = viewArr.length - 1; length >= 0; length--) {
                View view = viewArr[length];
                if (view != null) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i = layoutParams.f35016a;
                    viewArr[length] = null;
                    boolean hasTransientState = Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false;
                    if (!m2820b(i) || hasTransientState) {
                        if (i != -2 || hasTransientState) {
                            AbsHListView.this.removeDetachedView(view, false);
                        }
                        if (hasTransientState) {
                            if (this.f35078i == null) {
                                this.f35078i = new SparseArrayCompat<>();
                            }
                            this.f35078i.put(this.f35072c + length, view);
                        }
                    } else {
                        ArrayList<View> arrayList2 = z2 ? this.f35074e[i] : arrayList;
                        view.onStartTemporaryDetach();
                        layoutParams.f35019d = this.f35072c + length;
                        arrayList2.add(view);
                        if (Build.VERSION.SDK_INT >= 14) {
                            view.setAccessibilityDelegate(null);
                        }
                        if (z) {
                            this.f35071b.m2811a(view);
                        }
                        arrayList = arrayList2;
                    }
                }
            }
            m2813f();
        }

        /* renamed from: f */
        void m2812f(int i) {
            View[] viewArr;
            if (this.f35075f == 1) {
                ArrayList<View> arrayList = this.f35076g;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2).setDrawingCacheBackgroundColor(i);
                }
            } else {
                int i3 = this.f35075f;
                for (int i4 = 0; i4 < i3; i4++) {
                    ArrayList<View> arrayList2 = this.f35074e[i4];
                    int size2 = arrayList2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        arrayList2.get(i5).setDrawingCacheBackgroundColor(i);
                    }
                }
            }
            for (View view : this.f35073d) {
                if (view != null) {
                    view.setDrawingCacheBackgroundColor(i);
                }
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$k */
    /* loaded from: classes2.dex */
    public interface AbstractC10912k {
        /* renamed from: a */
        void m2811a(View view);
    }

    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$l */
    /* loaded from: classes2.dex */
    public interface AbstractC10913l {
        /* renamed from: a */
        void m2810a(Rect rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: it.sephiroth.android.library.widget.AbsHListView$m */
    /* loaded from: classes2.dex */
    public class C10914m {

        /* renamed from: a */
        private int f35079a;

        private C10914m() {
        }

        /* renamed from: a */
        public void m2809a() {
            this.f35079a = AbsHListView.this.getWindowAttachCount();
        }

        /* renamed from: b */
        public boolean m2808b() {
            return AbsHListView.this.hasWindowFocus() && AbsHListView.this.getWindowAttachCount() == this.f35079a;
        }
    }

    public AbsHListView(Context context) {
        super(context);
        this.f35005t = 0;
        this.f35011z = 0;
        this.f34933D = false;
        this.f34935F = -1;
        this.f34936G = new Rect();
        this.f34937H = new C10911j();
        this.f34938I = 0;
        this.f34939J = 0;
        this.f34940K = 0;
        this.f34941L = 0;
        this.f34942M = new Rect();
        this.f34943N = 0;
        this.f34955aa = -1;
        this.f34959ae = 0;
        this.f34984bb = true;
        this.f34963ai = -1;
        this.f34986bd = null;
        this.f34987bi = -1;
        this.f34996br = 0;
        this.f35001bw = 1.0f;
        this.f34966am = new boolean[1];
        this.f35002bx = -1;
        this.f34973bD = 0;
        m2932B();
    }

    public AbsHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10884R.attr.hlv_absHListViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsHListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Drawable drawable;
        int i3;
        boolean z4 = true;
        int i4 = 0;
        this.f35005t = 0;
        this.f35011z = 0;
        this.f34933D = false;
        this.f34935F = -1;
        this.f34936G = new Rect();
        this.f34937H = new C10911j();
        this.f34938I = 0;
        this.f34939J = 0;
        this.f34940K = 0;
        this.f34941L = 0;
        this.f34942M = new Rect();
        this.f34943N = 0;
        this.f34955aa = -1;
        this.f34959ae = 0;
        this.f34984bb = true;
        this.f34963ai = -1;
        this.f34986bd = null;
        this.f34987bi = -1;
        this.f34996br = 0;
        this.f35001bw = 1.0f;
        this.f34966am = new boolean[1];
        this.f35002bx = -1;
        this.f34973bD = 0;
        m2932B();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10884R.styleable.AbsHListView, i, 0);
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            z3 = obtainStyledAttributes.getBoolean(1, false);
            z2 = obtainStyledAttributes.getBoolean(6, false);
            z = obtainStyledAttributes.getBoolean(2, true);
            i2 = obtainStyledAttributes.getInt(7, 0);
            i3 = obtainStyledAttributes.getColor(3, 0);
            z4 = obtainStyledAttributes.getBoolean(5, true);
            i4 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        } else {
            i2 = 0;
            z = true;
            z2 = false;
            z3 = false;
            drawable = null;
            i3 = 0;
        }
        if (drawable != null) {
            setSelector(drawable);
        }
        this.f34933D = z3;
        setStackFromRight(z2);
        setScrollingCacheEnabled(z);
        setTranscriptMode(i2);
        setCacheColorHint(i3);
        setSmoothScrollbarEnabled(z4);
        setChoiceMode(i4);
    }

    /* renamed from: B */
    private void m2932B() {
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setScrollingCacheEnabled(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f34997bs = viewConfiguration.getScaledTouchSlop();
        this.f34999bu = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35000bv = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f34967an = viewConfiguration.getScaledOverscrollDistance();
        this.f34968ao = viewConfiguration.getScaledOverflingDistance();
        this.f35004s = C10890b.m2936a(this);
    }

    /* renamed from: C */
    private void m2931C() {
        int i = this.f35109aw;
        int childCount = getChildCount();
        boolean z = Build.VERSION.SDK_INT >= 11;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int i3 = i + i2;
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(this.f35009x.get(i3, false).booleanValue());
            } else if (z) {
                childAt.setActivated(this.f35009x.get(i3, false).booleanValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public boolean m2930D() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (childCount != this.f35103aP) {
            return false;
        }
        return getChildAt(0).getLeft() >= this.f34942M.left && getChildAt(childCount + (-1)).getRight() <= getWidth() - this.f34942M.right;
    }

    /* renamed from: E */
    private void m2929E() {
        setSelector(getResources().getDrawable(17301602));
    }

    /* renamed from: F */
    private void m2928F() {
        if (this.f34953aY == null) {
            this.f34953aY = VelocityTracker.obtain();
        } else {
            this.f34953aY.clear();
        }
    }

    /* renamed from: G */
    private void m2927G() {
        if (this.f34953aY == null) {
            this.f34953aY = VelocityTracker.obtain();
        }
    }

    /* renamed from: H */
    private void m2926H() {
        if (this.f34953aY != null) {
            this.f34953aY.recycle();
            this.f34953aY = null;
        }
    }

    /* renamed from: I */
    private void m2925I() {
        if (!this.f34961ag || this.f34946Q || this.f35004s.mo2935a()) {
            return;
        }
        setChildrenDrawnWithCacheEnabled(true);
        setChildrenDrawingCacheEnabled(true);
        this.f34947R = true;
        this.f34946Q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m2924J() {
        if (!this.f35004s.mo2935a()) {
            if (this.f34998bt == null) {
                this.f34998bt = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AbsHListView.this.f34946Q) {
                            AbsHListView absHListView = AbsHListView.this;
                            AbsHListView.this.f34947R = false;
                            absHListView.f34946Q = false;
                            AbsHListView.this.setChildrenDrawnWithCacheEnabled(false);
                            if ((AbsHListView.this.getPersistentDrawingCache() & 2) == 0) {
                                AbsHListView.this.setChildrenDrawingCacheEnabled(false);
                            }
                            if (AbsHListView.this.isAlwaysDrawnWithCacheEnabled()) {
                                return;
                            }
                            AbsHListView.this.invalidate();
                        }
                    }
                };
            }
            post(this.f34998bt);
        }
    }

    /* renamed from: K */
    private void m2923K() {
        if (this.f35003bz != null) {
            this.f35003bz.m2658b();
            this.f34970bA.m2658b();
        }
    }

    /* renamed from: a */
    public static int m2911a(Rect rect, Rect rect2, int i) {
        int width;
        int height;
        int width2;
        int height2;
        switch (i) {
            case 1:
            case 2:
                width = rect.right + (rect.width() / 2);
                height = rect.top + (rect.height() / 2);
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 17:
                width = rect.left;
                height = rect.top + (rect.height() / 2);
                width2 = rect2.right;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 33:
                width = rect.left + (rect.width() / 2);
                height = rect.top;
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.bottom;
                break;
            case 66:
                width = rect.right;
                height = rect.top + (rect.height() / 2);
                width2 = rect2.left;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 130:
                width = rect.left + (rect.width() / 2);
                height = rect.bottom;
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.top;
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        int i2 = width2 - width;
        int i3 = height2 - height;
        return (i3 * i3) + (i2 * i2);
    }

    /* renamed from: a */
    static View m2902a(ArrayList<View> arrayList, int i) {
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                View view = arrayList.get(i2);
                if (((LayoutParams) view.getLayoutParams()).f35019d == i) {
                    arrayList.remove(i2);
                    return view;
                }
            }
            return arrayList.remove(size - 1);
        }
        return null;
    }

    /* renamed from: a */
    private void m2917a(int i, int i2, int i3, int i4) {
        this.f34936G.set(i - this.f34938I, i2 - this.f34939J, this.f34940K + i3, this.f34941L + i4);
    }

    /* renamed from: a */
    private void m2912a(Canvas canvas) {
        if (!this.f34936G.isEmpty()) {
            Drawable drawable = this.f34934E;
            drawable.setBounds(this.f34936G);
            drawable.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m2897b(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (motionEvent.getPointerId(action) == this.f35002bx) {
            int i = action == 0 ? 1 : 0;
            this.f34951V = (int) motionEvent.getX(i);
            this.f34952W = (int) motionEvent.getY(i);
            this.f34957ac = 0;
            this.f35002bx = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: j */
    private boolean m2866j(int i) {
        int i2 = i - this.f34951V;
        int abs = Math.abs(i2);
        boolean z = getScrollX() != 0;
        if (z || abs > this.f34997bs) {
            m2925I();
            if (z) {
                this.f34955aa = 5;
                this.f34957ac = 0;
            } else {
                this.f34955aa = 3;
                this.f34957ac = i2 > 0 ? this.f34997bs : -this.f34997bs;
            }
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.f34988bj);
            }
            setPressed(false);
            View childAt = getChildAt(this.f34948S - this.f35109aw);
            if (childAt != null) {
                childAt.setPressed(false);
            }
            m2899b(1);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            m2863k(i);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m2863k(int i) {
        int i2;
        ViewParent parent;
        int i3 = 0;
        int i4 = i - this.f34951V;
        int i5 = i4 - this.f34957ac;
        int i6 = this.f34956ab != Integer.MIN_VALUE ? i - this.f34956ab : i5;
        if (this.f34955aa == 3) {
            if (i == this.f34956ab) {
                return;
            }
            if (Math.abs(i4) > this.f34997bs && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int childCount = this.f34948S >= 0 ? this.f34948S - this.f35109aw : getChildCount() / 2;
            View childAt = getChildAt(childCount);
            int left = childAt != null ? childAt.getLeft() : 0;
            boolean m2873g = i6 != 0 ? m2873g(i5, i6) : false;
            View childAt2 = getChildAt(childCount);
            if (childAt2 != null) {
                int left2 = childAt2.getLeft();
                if (m2873g) {
                    int i7 = (-i6) - (left2 - left);
                    overScrollBy(i7, 0, getScrollX(), 0, 0, 0, this.f34967an, 0, true);
                    if (Math.abs(this.f34967an) == Math.abs(getScrollX()) && this.f34953aY != null) {
                        this.f34953aY.clear();
                    }
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && !m2930D())) {
                        this.f34973bD = 0;
                        this.f34955aa = 5;
                        if (i4 > 0) {
                            this.f35003bz.m2663a(i7 / getWidth());
                            if (!this.f34970bA.m2664a()) {
                                this.f34970bA.m2656c();
                            }
                            invalidate(this.f35003bz.m2659a(false));
                        } else if (i4 < 0) {
                            this.f34970bA.m2663a(i7 / getWidth());
                            if (!this.f35003bz.m2664a()) {
                                this.f35003bz.m2656c();
                            }
                            invalidate(this.f34970bA.m2659a(true));
                        }
                    }
                }
                this.f34951V = i;
            }
            this.f34956ab = i;
        } else if (this.f34955aa != 5 || i == this.f34956ab) {
        } else {
            int scrollX = getScrollX();
            int i8 = scrollX - i6;
            int i9 = i > this.f34956ab ? 1 : -1;
            if (this.f34973bD == 0) {
                this.f34973bD = i9;
            }
            int i10 = -i6;
            if ((i8 >= 0 || scrollX < 0) && (i8 <= 0 || scrollX > 0)) {
                i2 = 0;
            } else {
                i10 = -scrollX;
                i2 = i6 + i10;
            }
            if (i10 != 0) {
                overScrollBy(i10, 0, getScrollX(), 0, 0, 0, this.f34967an, 0, true);
                int overScrollMode2 = getOverScrollMode();
                if (overScrollMode2 == 0 || (overScrollMode2 == 1 && !m2930D())) {
                    if (i4 > 0) {
                        this.f35003bz.m2663a(i10 / getWidth());
                        if (!this.f34970bA.m2664a()) {
                            this.f34970bA.m2656c();
                        }
                        invalidate(this.f35003bz.m2659a(false));
                    } else if (i4 < 0) {
                        this.f34970bA.m2663a(i10 / getWidth());
                        if (!this.f35003bz.m2664a()) {
                            this.f35003bz.m2656c();
                        }
                        invalidate(this.f34970bA.m2659a(true));
                    }
                }
            }
            if (i2 != 0) {
                if (getScrollX() != 0) {
                    this.f35004s.mo2934a(0);
                    m2859n();
                }
                m2873g(i2, i2);
                this.f34955aa = 3;
                int m2874g = m2874g(i);
                this.f34957ac = 0;
                View childAt3 = getChildAt(m2874g - this.f35109aw);
                if (childAt3 != null) {
                    i3 = childAt3.getLeft();
                }
                this.f34949T = i3;
                this.f34951V = i;
                this.f34948S = m2874g;
            }
            this.f34956ab = i;
            this.f34973bD = i9;
        }
    }

    /* renamed from: a */
    public int m2919a(int i, int i2) {
        Rect rect = this.f34985bc;
        if (rect == null) {
            this.f34985bc = new Rect();
            rect = this.f34985bc;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    return this.f35109aw + childCount;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m2913a(int i, boolean[] zArr) {
        View view;
        zArr[0] = false;
        View m2816d = this.f34937H.m2816d(i);
        if (m2816d == null) {
            View m2814e = this.f34937H.m2814e(i);
            if (m2814e != null) {
                view = this.f34931B.getView(i, m2814e, this);
                if (Build.VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                if (view != m2814e) {
                    this.f34937H.m2825a(m2814e, i);
                    if (this.f34994bp != 0) {
                        view.setDrawingCacheBackgroundColor(this.f34994bp);
                        m2816d = view;
                    }
                } else {
                    zArr[0] = true;
                    view.onFinishTemporaryDetach();
                    m2816d = view;
                }
                if (this.f34932C) {
                    ViewGroup.LayoutParams layoutParams = m2816d.getLayoutParams();
                    LayoutParams layoutParams2 = layoutParams == null ? (LayoutParams) generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? (LayoutParams) generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
                    layoutParams2.f35020e = this.f34931B.getItemId(i);
                    m2816d.setLayoutParams(layoutParams2);
                }
                if (this.f35105aR.isEnabled() && this.f34977bH == null) {
                    this.f34977bH = new C10904f();
                }
            } else {
                view = this.f34931B.getView(i, null, this);
                if (Build.VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                if (this.f34994bp != 0) {
                    view.setDrawingCacheBackgroundColor(this.f34994bp);
                }
            }
            m2816d = view;
            if (this.f34932C) {
            }
            if (this.f35105aR.isEnabled()) {
                this.f34977bH = new C10904f();
            }
        }
        return m2816d;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void m2922a() {
        if (this.f35009x != null) {
            this.f35009x.clear();
        }
        if (this.f35010y != null) {
            this.f35010y.clear();
        }
        this.f35008w = 0;
    }

    /* renamed from: a */
    public void m2918a(int i, int i2, int i3) {
        if (this.f34958ad == null) {
            this.f34958ad = new RunnableC10907i();
        }
        this.f34958ad.m2831a(i, i2, i3);
    }

    /* renamed from: a */
    public void m2916a(int i, int i2, boolean z) {
        if (this.f34954aZ == null) {
            this.f34954aZ = new RunnableC10902e();
        }
        int i3 = this.f35109aw;
        int childCount = getChildCount();
        int i4 = i3 + childCount;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        if (i != 0 && this.f35103aP != 0 && childCount != 0 && ((i3 != 0 || getChildAt(0).getLeft() != paddingLeft || i >= 0) && (i4 != this.f35103aP || getChildAt(childCount - 1).getRight() != width || i <= 0))) {
            m2899b(2);
            this.f34954aZ.m2842a(i, i2, z);
            return;
        }
        this.f34954aZ.m2840b();
        if (this.f34958ad == null) {
            return;
        }
        this.f34958ad.m2834a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2915a(int i, View view) {
        if (i != -1) {
            this.f34935F = i;
        }
        Rect rect = this.f34936G;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (view instanceof AbstractC10913l) {
            ((AbstractC10913l) view).m2810a(rect);
        }
        m2917a(rect.left, rect.top, rect.right, rect.bottom);
        boolean z = this.f34995bq;
        if (view.isEnabled() != z) {
            this.f34995bq = !z;
            if (getSelectedItemPosition() == -1) {
                return;
            }
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void m2914a(int i, boolean z) {
        if (this.f35005t == 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 11 && z && this.f35005t == 3 && this.f35006u == null) {
            if (this.f35007v == null || !((C10889b) this.f35007v).m2939a()) {
                throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
            }
            this.f35006u = startActionMode((C10889b) this.f35007v);
        }
        if (this.f35005t == 2 || (Build.VERSION.SDK_INT >= 11 && this.f35005t == 3)) {
            boolean booleanValue = this.f35009x.get(i, false).booleanValue();
            this.f35009x.put(i, Boolean.valueOf(z));
            if (this.f35010y != null && this.f34931B.hasStableIds()) {
                if (z) {
                    this.f35010y.put(this.f34931B.getItemId(i), Integer.valueOf(i));
                } else {
                    this.f35010y.delete(this.f34931B.getItemId(i));
                }
            }
            if (booleanValue != z) {
                if (z) {
                    this.f35008w++;
                } else {
                    this.f35008w--;
                }
            }
            if (this.f35006u != null) {
                ((C10889b) this.f35007v).mo2938a((ActionMode) this.f35006u, i, this.f34931B.getItemId(i), z);
            }
        } else {
            boolean z2 = this.f35010y != null && this.f34931B.hasStableIds();
            if (z || m2920a(i)) {
                this.f35009x.clear();
                if (z2) {
                    this.f35010y.clear();
                }
            }
            if (z) {
                this.f35009x.put(i, true);
                if (z2) {
                    this.f35010y.put(this.f34931B.getItemId(i), Integer.valueOf(i));
                }
                this.f35008w = 1;
            } else if (this.f35009x.size() == 0 || !this.f35009x.valueAt(0).booleanValue()) {
                this.f35008w = 0;
            }
        }
        if (this.f35094aG || this.f35108aW) {
            return;
        }
        this.f35098aK = true;
        A();
        requestLayout();
    }

    /* renamed from: a */
    public void m2908a(View view, View view2) {
        this.f34944O = view;
        this.f34945P = view2;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m2901a(List<View> list) {
        int childCount = getChildCount();
        AbstractC10912k abstractC10912k = this.f34937H.f35071b;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams != null && this.f34937H.m2820b(layoutParams.f35016a)) {
                list.add(childAt);
                if (Build.VERSION.SDK_INT >= 14) {
                    childAt.setAccessibilityDelegate(null);
                }
                if (abstractC10912k != null) {
                    abstractC10912k.m2811a(childAt);
                }
            }
        }
        this.f34937H.m2822a(list);
        removeAllViewsInLayout();
    }

    /* renamed from: a */
    protected abstract void mo2712a(boolean z);

    /* renamed from: a */
    public boolean m2921a(float f, float f2, int i) {
        int m2919a = m2919a((int) f, (int) f2);
        if (m2919a != -1) {
            long itemId = this.f34931B.getItemId(m2919a);
            View childAt = getChildAt(m2919a - this.f35109aw);
            if (childAt != null) {
                this.f34986bd = mo2752b(childAt, m2919a, itemId);
                return super.showContextMenuForChild(this);
            }
        }
        return m2921a(f, f2, i);
    }

    /* renamed from: a */
    public boolean m2920a(int i) {
        if (this.f35005t == 0 || this.f35009x == null) {
            return false;
        }
        return this.f35009x.get(i, false).booleanValue();
    }

    @TargetApi(14)
    /* renamed from: a */
    protected boolean m2909a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 14 && (motionEvent.getButtonState() & 2) != 0 && m2921a(motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    /* renamed from: a */
    public boolean mo2757a(View view, int i, long j) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (this.f35005t != 0) {
            if (this.f35005t == 2 || (Build.VERSION.SDK_INT >= 11 && this.f35005t == 3 && this.f35006u != null)) {
                boolean z5 = !this.f35009x.get(i, false).booleanValue();
                this.f35009x.put(i, Boolean.valueOf(z5));
                if (this.f35010y != null && this.f34931B.hasStableIds()) {
                    if (z5) {
                        this.f35010y.put(this.f34931B.getItemId(i), Integer.valueOf(i));
                    } else {
                        this.f35010y.delete(this.f34931B.getItemId(i));
                    }
                }
                if (z5) {
                    this.f35008w++;
                } else {
                    this.f35008w--;
                }
                if (this.f35006u != null) {
                    ((C10889b) this.f35007v).mo2938a((ActionMode) this.f35006u, i, j, z5);
                } else {
                    z4 = true;
                }
                z2 = z4;
                z4 = true;
            } else if (this.f35005t == 1) {
                if (!this.f35009x.get(i, false).booleanValue()) {
                    this.f35009x.clear();
                    this.f35009x.put(i, true);
                    if (this.f35010y != null && this.f34931B.hasStableIds()) {
                        this.f35010y.clear();
                        this.f35010y.put(this.f34931B.getItemId(i), Integer.valueOf(i));
                    }
                    this.f35008w = 1;
                } else if (this.f35009x.size() == 0 || !this.f35009x.valueAt(0).booleanValue()) {
                    this.f35008w = 0;
                }
                z4 = true;
                z2 = true;
            } else {
                z2 = true;
            }
            if (z4) {
                m2931C();
            }
            boolean z6 = z2;
            z = true;
            z3 = z6;
        } else {
            z = false;
        }
        return z3 ? z | super.mo2757a(view, i, j) : z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        int childCount = getChildCount();
        int i = this.f35109aw;
        ListAdapter listAdapter = this.f34931B;
        if (listAdapter == null) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (listAdapter.isEnabled(i + i2)) {
                arrayList.add(childAt);
            }
            childAt.addTouchables(arrayList);
        }
    }

    /* renamed from: b */
    public long m2898b(int i, int i2) {
        int m2919a = m2919a(i, i2);
        if (m2919a >= 0) {
            return this.f34931B.getItemId(m2919a);
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    ContextMenu.ContextMenuInfo mo2752b(View view, int i, long j) {
        return new AdapterView.ContextMenu$ContextMenuInfoC10916a(view, i, j);
    }

    /* renamed from: b */
    void m2899b(int i) {
        if (i == this.f34996br || this.f34983ba == null) {
            return;
        }
        this.f34996br = i;
        this.f34983ba.m2836a(this, i);
    }

    @ViewDebug.ExportedProperty
    /* renamed from: b */
    public boolean m2900b() {
        return this.f34984bb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m2892c() {
        if (this.f34983ba != null) {
            this.f34983ba.m2835a(this, this.f35109aw, getChildCount(), this.f35103aP);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    /* renamed from: c */
    public void mo2703c(int i) {
        if (this.f34958ad == null) {
            this.f34958ad = new RunnableC10907i();
        }
        this.f34958ad.m2833a(i);
    }

    /* renamed from: c */
    public void m2891c(int i, int i2) {
        this.f34975bF = i;
        this.f34976bG = i2;
    }

    /* renamed from: c */
    boolean m2890c(View view, int i, long j) {
        if (Build.VERSION.SDK_INT >= 11 && this.f35005t == 3) {
            if (this.f35006u == null) {
                ActionMode startActionMode = startActionMode((C10889b) this.f35007v);
                this.f35006u = startActionMode;
                if (startActionMode != null) {
                    m2914a(i, true);
                    performHapticFeedback(0);
                }
            }
            return true;
        }
        boolean m2787a = this.f35097aJ != null ? this.f35097aJ.m2787a(this, view, i, j) : false;
        if (!m2787a) {
            this.f34986bd = mo2752b(view, i, j);
            m2787a = super.showContextMenuForChild(this);
        }
        if (!m2787a) {
            return m2787a;
        }
        performHapticFeedback(0);
        return m2787a;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        int childCount = getChildCount();
        if (childCount > 0) {
            if (!this.f34984bb) {
                return 1;
            }
            int i = childCount * 100;
            View childAt = getChildAt(0);
            int left = childAt.getLeft();
            int width = childAt.getWidth();
            if (width > 0) {
                i += (left * 100) / width;
            }
            View childAt2 = getChildAt(childCount - 1);
            int right = childAt2.getRight();
            int width2 = childAt2.getWidth();
            return width2 > 0 ? i - (((right - getWidth()) * 100) / width2) : i;
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        int i = 0;
        int i2 = this.f35109aw;
        int childCount = getChildCount();
        if (i2 < 0 || childCount <= 0) {
            return 0;
        }
        if (!this.f34984bb) {
            int i3 = this.f35103aP;
            if (i2 != 0) {
                i = i2 + childCount == i3 ? i3 : (childCount / 2) + i2;
            }
            return (int) (((i / i3) * childCount) + i2);
        }
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int width = childAt.getWidth();
        if (width <= 0) {
            return 0;
        }
        return Math.max(((i2 * 100) - ((left * 100) / width)) + ((int) ((getScrollX() / getWidth()) * this.f35103aP * 100.0f)), 0);
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        if (this.f34984bb) {
            int max = Math.max(this.f35103aP * 100, 0);
            return getScrollX() != 0 ? max + Math.abs((int) ((getScrollX() / getWidth()) * this.f35103aP * 100.0f)) : max;
        }
        return this.f35103aP;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2699d(int i) {
        View childAt;
        Rect rect;
        int firstVisiblePosition = i < 0 ? getFirstVisiblePosition() : i > 0 ? getLastVisiblePosition() : -1;
        if (firstVisiblePosition <= -1 || (childAt = getChildAt(firstVisiblePosition - getFirstVisiblePosition())) == null) {
            return;
        }
        if (childAt.getGlobalVisibleRect(new Rect())) {
            float height = (rect.height() * rect.width()) / (childAt.getHeight() * childAt.getWidth());
            if (i < 0 && height < 0.75f) {
                firstVisiblePosition++;
            } else if (i > 0 && height < 0.75f) {
                firstVisiblePosition--;
            }
        }
        mo2703c(Math.max(0, Math.min(getCount(), firstVisiblePosition + i)));
    }

    /* renamed from: d */
    public void m2885d(int i, int i2) {
        if (this.f34958ad == null) {
            this.f34958ad = new RunnableC10907i();
        }
        this.f34958ad.m2830b(i, i2);
    }

    @ViewDebug.ExportedProperty
    /* renamed from: d */
    public boolean m2886d() {
        return this.f34961ag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z = this.f34933D;
        if (!z) {
            m2912a(canvas);
        }
        super.dispatchDraw(canvas);
        if (z) {
            m2912a(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f35003bz != null) {
            int scrollX = getScrollX();
            if (!this.f35003bz.m2664a()) {
                int save = canvas.save();
                int i = this.f34942M.top + this.f34975bF;
                int height = (getHeight() - i) - (this.f34942M.bottom + this.f34976bG);
                int min = Math.min(0, this.f34971bB + scrollX);
                canvas.rotate(-90.0f);
                canvas.translate((-getHeight()) + i, min);
                this.f35003bz.m2661a(height, height);
                if (this.f35003bz.m2660a(canvas)) {
                    this.f35003bz.m2657b(min, i);
                    invalidate();
                }
                canvas.restoreToCount(save);
            }
            if (this.f34970bA.m2664a()) {
                return;
            }
            int save2 = canvas.save();
            int i2 = this.f34942M.left + this.f34975bF;
            int height2 = (getHeight() - i2) - (this.f34942M.right + this.f34976bG);
            int max = Math.max(getWidth(), scrollX + this.f34972bC);
            canvas.rotate(90.0f);
            canvas.translate(-i2, -max);
            this.f34970bA.m2661a(height2, height2);
            if (this.f34970bA.m2660a(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m2860m();
    }

    /* renamed from: e */
    public void m2881e(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: e */
    public void m2880e(int i, int i2) {
        if (this.f34958ad == null) {
            this.f34958ad = new RunnableC10907i();
        }
        this.f34958ad.m2832a(i, i2);
    }

    /* renamed from: e */
    public boolean m2882e() {
        return this.f34960af;
    }

    /* renamed from: f */
    protected abstract int mo2695f(int i);

    /* renamed from: f */
    void m2877f() {
        if (getChildCount() > 0) {
            mo2693g();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: f */
    public void m2876f(int i, int i2) {
        m2916a(i, i2, false);
    }

    /* renamed from: g */
    protected int m2874g(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        int mo2695f = mo2695f(i);
        return mo2695f == -1 ? (this.f35109aw + childCount) - 1 : mo2695f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2693g() {
        removeAllViewsInLayout();
        this.f35109aw = 0;
        this.f35098aK = false;
        this.f34965al = null;
        this.f35092aB = false;
        this.f34981bL = null;
        this.f35106aU = -1;
        this.f35107aV = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        this.f34959ae = 0;
        this.f34935F = -1;
        this.f34936G.setEmpty();
        invalidate();
    }

    /* renamed from: g */
    boolean m2873g(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        int left = getChildAt(0).getLeft();
        int right = getChildAt(childCount - 1).getRight();
        Rect rect = this.f34942M;
        int i4 = 0 - left;
        int width = right - (getWidth() - 0);
        int width2 = (getWidth() - getPaddingRight()) - getPaddingLeft();
        int max = i < 0 ? Math.max(-(width2 - 1), i) : Math.min(width2 - 1, i);
        int max2 = i2 < 0 ? Math.max(-(width2 - 1), i2) : Math.min(width2 - 1, i2);
        int i5 = this.f35109aw;
        if (i5 == 0) {
            this.f34971bB = left - rect.left;
        } else {
            this.f34971bB += max2;
        }
        if (i5 + childCount == this.f35103aP) {
            this.f34972bC = rect.right + right;
        } else {
            this.f34972bC += max2;
        }
        boolean z = i5 == 0 && left >= rect.left && max2 >= 0;
        boolean z2 = i5 + childCount == this.f35103aP && right <= getWidth() - rect.right && max2 <= 0;
        if (z || z2) {
            return max2 != 0;
        }
        boolean z3 = max2 < 0;
        boolean isInTouchMode = isInTouchMode();
        if (isInTouchMode) {
            m2858o();
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = this.f35103aP - getFooterViewsCount();
        int i6 = 0;
        if (!z3) {
            int width3 = getWidth() - max2;
            i3 = 0;
            for (int i7 = childCount - 1; i7 >= 0; i7--) {
                View childAt = getChildAt(i7);
                if (childAt.getLeft() <= width3) {
                    break;
                }
                int i8 = i3 + 1;
                int i9 = i5 + i7;
                if (i9 >= headerViewsCount && i9 < footerViewsCount) {
                    this.f34937H.m2825a(childAt, i9);
                }
                i3 = i8;
                i6 = i7;
            }
        } else {
            int i10 = -max2;
            i3 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getRight() >= i10) {
                    break;
                }
                int i12 = i3 + 1;
                int i13 = i5 + i11;
                if (i13 >= headerViewsCount && i13 < footerViewsCount) {
                    this.f34937H.m2825a(childAt2, i13);
                }
                i11++;
                i3 = i12;
            }
        }
        this.f34950U = this.f34949T + max;
        this.f35108aW = true;
        if (i3 > 0) {
            detachViewsFromParent(i6, i3);
            this.f34937H.m2817d();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        m2881e(max2);
        if (z3) {
            this.f35109aw = i3 + this.f35109aw;
        }
        int abs = Math.abs(max2);
        if (i4 < abs || width < abs) {
            mo2712a(z3);
        }
        if (!isInTouchMode && this.f35101aN != -1) {
            int i14 = this.f35101aN - this.f35109aw;
            if (i14 >= 0 && i14 < getChildCount()) {
                m2915a(this.f35101aN, getChildAt(i14));
            }
        } else if (this.f34935F != -1) {
            int i15 = this.f34935F - this.f35109aw;
            if (i15 >= 0 && i15 < getChildCount()) {
                m2915a(-1, getChildAt(i15));
            }
        } else {
            this.f34936G.setEmpty();
        }
        this.f35108aW = false;
        m2892c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -1, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @ViewDebug.ExportedProperty(category = "drawing")
    public int getCacheColorHint() {
        return this.f34994bp;
    }

    public int getCheckedItemCount() {
        return this.f35008w;
    }

    public long[] getCheckedItemIds() {
        if (this.f35005t == 0 || this.f35010y == null || this.f34931B == null) {
            return new long[0];
        }
        LongSparseArray<Integer> longSparseArray = this.f35010y;
        int size = longSparseArray.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = longSparseArray.keyAt(i);
        }
        return jArr;
    }

    public int getCheckedItemPosition() {
        if (this.f35005t == 1 && this.f35009x != null && this.f35009x.size() == 1) {
            return this.f35009x.keyAt(0);
        }
        return -1;
    }

    public SparseArrayCompat<Boolean> getCheckedItemPositions() {
        if (this.f35005t != 0) {
            return this.f35009x;
        }
        return null;
    }

    public int getChoiceMode() {
        return this.f35005t;
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.f34986bd;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getParent() != this) {
            super.getFocusedRect(rect);
            return;
        }
        selectedView.getFocusedRect(rect);
        offsetDescendantRectToMyCoords(selectedView, rect);
    }

    protected int getFooterViewsCount() {
        return 0;
    }

    protected int getHeaderViewsCount() {
        return 0;
    }

    protected float getHorizontalScrollFactor() {
        if (this.f34982bM == 0.0f) {
            TypedValue typedValue = new TypedValue();
            if (!getContext().getTheme().resolveAttribute(C10884R.attr.hlv_listPreferredItemWidth, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
            }
            this.f34982bM = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        }
        return this.f34982bM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public int getHorizontalScrollbarHeight() {
        return super.getHorizontalScrollbarHeight();
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        int childCount = getChildCount();
        float leftFadingEdgeStrength = super.getLeftFadingEdgeStrength();
        if (childCount == 0) {
            return leftFadingEdgeStrength;
        }
        if (this.f35109aw > 0) {
            return 1.0f;
        }
        int left = getChildAt(0).getLeft();
        return left < getPaddingLeft() ? (-(left - getPaddingLeft())) / getHorizontalFadingEdgeLength() : leftFadingEdgeStrength;
    }

    public int getListPaddingBottom() {
        return this.f34942M.bottom;
    }

    public int getListPaddingLeft() {
        return this.f34942M.left;
    }

    public int getListPaddingRight() {
        return this.f34942M.right;
    }

    public int getListPaddingTop() {
        return this.f34942M.top;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        int childCount = getChildCount();
        float rightFadingEdgeStrength = super.getRightFadingEdgeStrength();
        if (childCount == 0) {
            return rightFadingEdgeStrength;
        }
        if ((this.f35109aw + childCount) - 1 < this.f35103aP - 1) {
            return 1.0f;
        }
        int right = getChildAt(childCount - 1).getRight();
        int width = getWidth();
        return right > width - getPaddingRight() ? ((right - width) + getPaddingRight()) / getHorizontalFadingEdgeLength() : rightFadingEdgeStrength;
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    @ViewDebug.ExportedProperty
    public View getSelectedView() {
        if (this.f35103aP <= 0 || this.f35101aN < 0) {
            return null;
        }
        return getChildAt(this.f35101aN - this.f35109aw);
    }

    public Drawable getSelector() {
        return this.f34934E;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.f34994bp;
    }

    public int getTranscriptMode() {
        return this.f34993bo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2691h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m2871h(int i, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m2869i() {
        boolean z = true;
        int i = 0;
        if (this.f34944O != null) {
            boolean z2 = this.f35109aw > 0;
            if (!z2 && getChildCount() > 0) {
                z2 = getChildAt(0).getLeft() < this.f34942M.left;
            }
            this.f34944O.setVisibility(z2 ? 0 : 4);
        }
        if (this.f34945P != null) {
            int childCount = getChildCount();
            boolean z3 = this.f35109aw + childCount < this.f35103aP;
            if (z3 || childCount <= 0) {
                z = z3;
            } else if (getChildAt(childCount - 1).getRight() <= getRight() - this.f34942M.right) {
                z = false;
            }
            View view = this.f34945P;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: j */
    boolean m2867j() {
        switch (this.f34955aa) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f34934E != null) {
            this.f34934E.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public boolean m2864k() {
        return (hasFocus() && !isInTouchMode()) || m2867j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m2861l() {
        if (!isEnabled() || !isClickable()) {
            return;
        }
        Drawable drawable = this.f34934E;
        Rect rect = this.f34936G;
        if (drawable == null) {
            return;
        }
        if ((!isFocused() && !m2867j()) || rect.isEmpty()) {
            return;
        }
        View childAt = getChildAt(this.f35101aN - this.f35109aw);
        if (childAt != null) {
            if (childAt.hasFocusable()) {
                return;
            }
            childAt.setPressed(true);
        }
        setPressed(true);
        boolean isLongClickable = isLongClickable();
        Drawable current = drawable.getCurrent();
        if (current != null && (current instanceof TransitionDrawable)) {
            if (isLongClickable) {
                ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
            } else {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        if (!isLongClickable || this.f35098aK) {
            return;
        }
        if (this.f34990bl == null) {
            this.f34990bl = new RunnableC10899b();
        }
        this.f34990bl.a();
        postDelayed(this.f34990bl, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: m */
    void m2860m() {
        if (this.f34934E != null) {
            if (m2864k()) {
                this.f34934E.setState(getDrawableState());
            } else {
                this.f34934E.setState(f34907ar);
            }
        }
    }

    @TargetApi(11)
    /* renamed from: n */
    protected void m2859n() {
        if (!this.f35004s.mo2935a() || !(getParent() instanceof View)) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m2858o() {
        if (this.f35101aN != -1) {
            if (this.f35011z != 4) {
                this.f34963ai = this.f35101aN;
            }
            if (this.f35099aL >= 0 && this.f35099aL != this.f35101aN) {
                this.f34963ai = this.f35099aL;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.f34959ae = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (this.f34931B != null && this.f34930A == null) {
            this.f34930A = new C10898a();
            this.f34931B.registerDataSetObserver(this.f34930A);
            this.f35098aK = true;
            this.f35104aQ = this.f35103aP;
            this.f35103aP = this.f34931B.getCount();
        }
        this.f34969ap = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"Override"})
    protected int[] onCreateDrawableState(int i) {
        if (this.f34995bq) {
            return super.onCreateDrawableState(i);
        }
        int i2 = ENABLED_STATE_SET[0];
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int length = onCreateDrawableState.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            } else if (onCreateDrawableState[length] == i2) {
                break;
            } else {
                length--;
            }
        }
        if (length < 0) {
            return onCreateDrawableState;
        }
        System.arraycopy(onCreateDrawableState, length + 1, onCreateDrawableState, length, (onCreateDrawableState.length - length) - 1);
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34937H.m2821b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        if (this.f34931B != null && this.f34930A != null) {
            this.f34931B.unregisterDataSetObserver(this.f34930A);
            this.f34930A = null;
        }
        if (this.f34954aZ != null) {
            removeCallbacks(this.f34954aZ);
        }
        if (this.f34958ad != null) {
            this.f34958ad.m2834a();
        }
        if (this.f34998bt != null) {
            removeCallbacks(this.f34998bt);
        }
        if (this.f34991bm != null) {
            removeCallbacks(this.f34991bm);
        }
        if (this.f34992bn != null) {
            removeCallbacks(this.f34992bn);
            this.f34992bn = null;
        }
        this.f34969ap = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z || this.f35101aN >= 0 || isInTouchMode()) {
            return;
        }
        if (!this.f34969ap && this.f34931B != null) {
            this.f35098aK = true;
            this.f35104aQ = this.f35103aP;
            this.f35103aP = this.f34931B.getCount();
        }
        m2854s();
    }

    @Override // android.view.View
    @TargetApi(12)
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (this.f34955aa == -1) {
                        float axisValue = motionEvent.getAxisValue(10);
                        if (axisValue != 0.0f) {
                            int horizontalScrollFactor = (int) (axisValue * getHorizontalScrollFactor());
                            if (!m2873g(horizontalScrollFactor, horizontalScrollFactor)) {
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbsHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.View
    @SuppressLint({"Override"})
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbsHListView.class.getName());
        if (isEnabled()) {
            if (getFirstVisiblePosition() > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (getLastVisiblePosition() >= getCount() - 1) {
                return;
            }
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f34958ad != null) {
            this.f34958ad.m2834a();
        }
        if (!this.f34969ap) {
            return false;
        }
        switch (action & 255) {
            case 0:
                int i = this.f34955aa;
                if (i == 6 || i == 5) {
                    this.f34957ac = 0;
                    return true;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.f35002bx = motionEvent.getPointerId(0);
                int mo2695f = mo2695f(x);
                if (i != 4 && mo2695f >= 0) {
                    this.f34949T = getChildAt(mo2695f - this.f35109aw).getLeft();
                    this.f34951V = x;
                    this.f34952W = y;
                    this.f34948S = mo2695f;
                    this.f34955aa = 0;
                    m2924J();
                }
                this.f34956ab = Integer.MIN_VALUE;
                m2928F();
                this.f34953aY.addMovement(motionEvent);
                return i == 4;
            case 1:
            case 3:
                this.f34955aa = -1;
                this.f35002bx = -1;
                m2926H();
                m2899b(0);
                return false;
            case 2:
                switch (this.f34955aa) {
                    case 0:
                        int findPointerIndex = motionEvent.findPointerIndex(this.f35002bx);
                        if (findPointerIndex == -1) {
                            this.f35002bx = motionEvent.getPointerId(0);
                            findPointerIndex = 0;
                        }
                        m2927G();
                        this.f34953aY.addMovement(motionEvent);
                        return m2866j((int) motionEvent.getX(findPointerIndex));
                    default:
                        return false;
                }
            case 4:
            case 5:
            default:
                return false;
            case 6:
                m2897b(motionEvent);
                return false;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
            case 66:
                if (!isEnabled()) {
                    return true;
                }
                if (isClickable() && isPressed() && this.f35101aN >= 0 && this.f34931B != null && this.f35101aN < this.f34931B.getCount()) {
                    View childAt = getChildAt(this.f35101aN - this.f35109aw);
                    if (childAt != null) {
                        mo2757a(childAt, this.f35101aN, this.f35102aO);
                        childAt.setPressed(false);
                    }
                    setPressed(false);
                    return true;
                }
                break;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f35094aG = true;
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).forceLayout();
            }
            this.f34937H.m2828a();
        }
        mo2691h();
        this.f35094aG = false;
        this.f34964aj = (i3 - i) / 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f34934E == null) {
            m2929E();
        }
        Rect rect = this.f34942M;
        rect.left = this.f34938I + getPaddingLeft();
        rect.top = this.f34939J + getPaddingTop();
        rect.right = this.f34940K + getPaddingRight();
        rect.bottom = this.f34941L + getPaddingBottom();
        if (this.f34993bo == 1) {
            int childCount = getChildCount();
            int width = getWidth() - getPaddingRight();
            View childAt = getChildAt(childCount - 1);
            this.f34974bE = childCount + this.f35109aw >= this.f34980bK && (childAt != null ? childAt.getRight() : width) <= width;
        }
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollX() != i) {
            onScrollChanged(i, getScrollY(), getScrollX(), getScrollY());
            this.f35004s.mo2934a(i);
            m2859n();
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35098aK = true;
        this.f35091aA = savedState.f35025e;
        if (savedState.f35021a >= 0) {
            this.f35092aB = true;
            this.f34981bL = savedState;
            this.f35112az = savedState.f35021a;
            this.f35111ay = savedState.f35024d;
            this.f35110ax = savedState.f35023c;
            this.f35093aC = 0;
        } else if (savedState.f35022b >= 0) {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.f34935F = -1;
            this.f35092aB = true;
            this.f34981bL = savedState;
            this.f35112az = savedState.f35022b;
            this.f35111ay = savedState.f35024d;
            this.f35110ax = savedState.f35023c;
            this.f35093aC = 1;
        }
        if (savedState.f35029i != null) {
            this.f35009x = savedState.f35029i;
        }
        if (savedState.f35030j != null) {
            this.f35010y = savedState.f35030j;
        }
        this.f35008w = savedState.f35028h;
        if (Build.VERSION.SDK_INT >= 11 && savedState.f35027g && this.f35005t == 3 && this.f35007v != null) {
            this.f35006u = startActionMode((C10889b) this.f35007v);
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z = true;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f34981bL != null) {
            savedState.f35021a = this.f34981bL.f35021a;
            savedState.f35022b = this.f34981bL.f35022b;
            savedState.f35023c = this.f34981bL.f35023c;
            savedState.f35024d = this.f34981bL.f35024d;
            savedState.f35025e = this.f34981bL.f35025e;
            savedState.f35026f = this.f34981bL.f35026f;
            savedState.f35027g = this.f34981bL.f35027g;
            savedState.f35028h = this.f34981bL.f35028h;
            savedState.f35029i = this.f34981bL.f35029i;
            savedState.f35030j = this.f34981bL.f35030j;
            return savedState;
        }
        boolean z2 = getChildCount() > 0 && this.f35103aP > 0;
        long selectedItemId = getSelectedItemId();
        savedState.f35021a = selectedItemId;
        savedState.f35025e = getWidth();
        if (selectedItemId >= 0) {
            savedState.f35023c = this.f34959ae;
            savedState.f35024d = getSelectedItemPosition();
            savedState.f35022b = -1L;
        } else if (!z2 || this.f35109aw <= 0) {
            savedState.f35023c = 0;
            savedState.f35022b = -1L;
            savedState.f35024d = 0;
        } else {
            savedState.f35023c = getChildAt(0).getLeft();
            int i = this.f35109aw;
            if (i >= this.f35103aP) {
                i = this.f35103aP - 1;
            }
            savedState.f35024d = i;
            savedState.f35022b = this.f34931B.getItemId(i);
        }
        savedState.f35026f = null;
        if (Build.VERSION.SDK_INT < 11 || this.f35005t != 3 || this.f35006u == null) {
            z = false;
        }
        savedState.f35027g = z;
        if (this.f35009x != null) {
            try {
                savedState.f35029i = this.f35009x.m40012clone();
            } catch (NoSuchMethodError e) {
                e.printStackTrace();
                savedState.f35029i = new SparseArrayCompat<>();
            }
        }
        if (this.f35010y != null) {
            LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
            int size = this.f35010y.size();
            for (int i2 = 0; i2 < size; i2++) {
                longSparseArray.put(this.f35010y.keyAt(i2), this.f35010y.valueAt(i2));
            }
            savedState.f35030j = longSparseArray;
        }
        savedState.f35028h = this.f35008w;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            this.f35098aK = true;
            A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    @Override // android.view.View
    @SuppressLint({"Override"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable current;
        int i;
        int i2 = 0;
        if (!isEnabled()) {
            return isClickable() || isLongClickable();
        }
        if (this.f34958ad != null) {
            this.f34958ad.m2834a();
        }
        if (!this.f34969ap) {
            return false;
        }
        int action = motionEvent.getAction();
        m2927G();
        this.f34953aY.addMovement(motionEvent);
        switch (action & 255) {
            case 0:
                switch (this.f34955aa) {
                    case 6:
                        this.f34954aZ.m2840b();
                        if (this.f34958ad != null) {
                            this.f34958ad.m2834a();
                        }
                        this.f34955aa = 5;
                        this.f34952W = (int) motionEvent.getY();
                        int x = (int) motionEvent.getX();
                        this.f34956ab = x;
                        this.f34951V = x;
                        this.f34957ac = 0;
                        this.f35002bx = motionEvent.getPointerId(0);
                        this.f34973bD = 0;
                        break;
                    default:
                        this.f35002bx = motionEvent.getPointerId(0);
                        int x2 = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        int m2919a = m2919a(x2, y);
                        if (!this.f35098aK) {
                            if (this.f34955aa != 4 && m2919a >= 0 && getAdapter().isEnabled(m2919a)) {
                                this.f34955aa = 0;
                                if (this.f34989bk == null) {
                                    this.f34989bk = new RunnableC10901d();
                                }
                                postDelayed(this.f34989bk, ViewConfiguration.getTapTimeout());
                                i = m2919a;
                            } else if (this.f34955aa == 4) {
                                m2925I();
                                this.f34955aa = 3;
                                this.f34957ac = 0;
                                i = mo2695f(x2);
                                this.f34954aZ.m2838c();
                            }
                            if (i >= 0) {
                                this.f34949T = getChildAt(i - this.f35109aw).getLeft();
                            }
                            this.f34951V = x2;
                            this.f34952W = y;
                            this.f34948S = i;
                            this.f34956ab = Integer.MIN_VALUE;
                            break;
                        }
                        i = m2919a;
                        if (i >= 0) {
                        }
                        this.f34951V = x2;
                        this.f34952W = y;
                        this.f34948S = i;
                        this.f34956ab = Integer.MIN_VALUE;
                }
                if (!m2909a(motionEvent) || this.f34955aa != 0) {
                    return true;
                }
                removeCallbacks(this.f34989bk);
                return true;
            case 1:
                switch (this.f34955aa) {
                    case 0:
                    case 1:
                    case 2:
                        int i3 = this.f34948S;
                        final View childAt = getChildAt(i3 - this.f35109aw);
                        float x3 = motionEvent.getX();
                        boolean z = x3 > ((float) this.f34942M.left) && x3 < ((float) (getWidth() - this.f34942M.right));
                        if (childAt != null && !childAt.hasFocusable() && z) {
                            if (this.f34955aa != 0) {
                                childAt.setPressed(false);
                            }
                            if (this.f34991bm == null) {
                                this.f34991bm = new RunnableC10906h();
                            }
                            final RunnableC10906h runnableC10906h = this.f34991bm;
                            runnableC10906h.f35045a = i3;
                            runnableC10906h.a();
                            this.f34963ai = i3;
                            if (this.f34955aa == 0 || this.f34955aa == 1) {
                                Handler handler = getHandler();
                                if (handler != null) {
                                    handler.removeCallbacks(this.f34955aa == 0 ? this.f34989bk : this.f34988bj);
                                }
                                this.f35011z = 0;
                                if (this.f35098aK || !this.f34931B.isEnabled(i3)) {
                                    this.f34955aa = -1;
                                    m2860m();
                                    return true;
                                }
                                this.f34955aa = 1;
                                setSelectedPositionInt(this.f34948S);
                                mo2691h();
                                childAt.setPressed(true);
                                m2915a(this.f34948S, childAt);
                                setPressed(true);
                                if (this.f34934E != null && (current = this.f34934E.getCurrent()) != null && (current instanceof TransitionDrawable)) {
                                    ((TransitionDrawable) current).resetTransition();
                                }
                                if (this.f34992bn != null) {
                                    removeCallbacks(this.f34992bn);
                                }
                                this.f34992bn = new Runnable() { // from class: it.sephiroth.android.library.widget.AbsHListView.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AbsHListView.this.f34955aa = -1;
                                        childAt.setPressed(false);
                                        AbsHListView.this.setPressed(false);
                                        if (!AbsHListView.this.f35098aK) {
                                            runnableC10906h.run();
                                        }
                                    }
                                };
                                postDelayed(this.f34992bn, ViewConfiguration.getPressedStateDuration());
                                return true;
                            } else if (!this.f35098aK && this.f34931B.isEnabled(i3)) {
                                runnableC10906h.run();
                            }
                        }
                        this.f34955aa = -1;
                        m2860m();
                        break;
                    case 3:
                        int childCount = getChildCount();
                        if (childCount <= 0) {
                            this.f34955aa = -1;
                            m2899b(0);
                            break;
                        } else {
                            int left = getChildAt(0).getLeft();
                            int right = getChildAt(childCount - 1).getRight();
                            int i4 = this.f34942M.left;
                            int width = getWidth() - this.f34942M.right;
                            if (this.f35109aw == 0 && left >= i4 && this.f35109aw + childCount < this.f35103aP && right <= getWidth() - width) {
                                this.f34955aa = -1;
                                m2899b(0);
                                break;
                            } else {
                                VelocityTracker velocityTracker = this.f34953aY;
                                velocityTracker.computeCurrentVelocity(1000, this.f35000bv);
                                int xVelocity = (int) (velocityTracker.getXVelocity(this.f35002bx) * this.f35001bw);
                                if (Math.abs(xVelocity) > this.f34999bu && ((this.f35109aw != 0 || left != i4 - this.f34967an) && (childCount + this.f35109aw != this.f35103aP || right != this.f34967an + width))) {
                                    if (this.f34954aZ == null) {
                                        this.f34954aZ = new RunnableC10902e();
                                    }
                                    m2899b(2);
                                    this.f34954aZ.m2843a(-xVelocity);
                                    break;
                                } else {
                                    this.f34955aa = -1;
                                    m2899b(0);
                                    if (this.f34954aZ != null) {
                                        this.f34954aZ.m2840b();
                                    }
                                    if (this.f34958ad != null) {
                                        this.f34958ad.m2834a();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        if (this.f34954aZ == null) {
                            this.f34954aZ = new RunnableC10902e();
                        }
                        VelocityTracker velocityTracker2 = this.f34953aY;
                        velocityTracker2.computeCurrentVelocity(1000, this.f35000bv);
                        int xVelocity2 = (int) velocityTracker2.getXVelocity(this.f35002bx);
                        m2899b(2);
                        if (Math.abs(xVelocity2) <= this.f34999bu) {
                            this.f34954aZ.m2844a();
                            break;
                        } else {
                            this.f34954aZ.m2839b(-xVelocity2);
                            break;
                        }
                }
                setPressed(false);
                if (this.f35003bz != null) {
                    this.f35003bz.m2656c();
                    this.f34970bA.m2656c();
                }
                invalidate();
                Handler handler2 = getHandler();
                if (handler2 != null) {
                    handler2.removeCallbacks(this.f34988bj);
                }
                m2926H();
                this.f35002bx = -1;
                return true;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f35002bx);
                if (findPointerIndex == -1) {
                    this.f35002bx = motionEvent.getPointerId(0);
                } else {
                    i2 = findPointerIndex;
                }
                int x4 = (int) motionEvent.getX(i2);
                if (this.f35098aK) {
                    mo2691h();
                }
                switch (this.f34955aa) {
                    case 0:
                    case 1:
                    case 2:
                        m2866j(x4);
                        return true;
                    case 3:
                    case 5:
                        m2863k(x4);
                        return true;
                    case 4:
                    default:
                        return true;
                }
            case 3:
                switch (this.f34955aa) {
                    case 5:
                        if (this.f34954aZ == null) {
                            this.f34954aZ = new RunnableC10902e();
                        }
                        this.f34954aZ.m2844a();
                        break;
                    case 6:
                        break;
                    default:
                        this.f34955aa = -1;
                        setPressed(false);
                        View childAt2 = getChildAt(this.f34948S - this.f35109aw);
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                        m2924J();
                        Handler handler3 = getHandler();
                        if (handler3 != null) {
                            handler3.removeCallbacks(this.f34988bj);
                        }
                        m2926H();
                        break;
                }
                if (this.f35003bz != null) {
                    this.f35003bz.m2656c();
                    this.f34970bA.m2656c();
                }
                this.f35002bx = -1;
                return true;
            case 4:
            default:
                return true;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                int x5 = (int) motionEvent.getX(actionIndex);
                int y2 = (int) motionEvent.getY(actionIndex);
                this.f34957ac = 0;
                this.f35002bx = pointerId;
                this.f34951V = x5;
                this.f34952W = y2;
                int m2919a2 = m2919a(x5, y2);
                if (m2919a2 >= 0) {
                    this.f34949T = getChildAt(m2919a2 - this.f35109aw).getLeft();
                    this.f34948S = m2919a2;
                }
                this.f34956ab = x5;
                return true;
            case 6:
                m2897b(motionEvent);
                int i5 = this.f34951V;
                int m2919a3 = m2919a(i5, this.f34952W);
                if (m2919a3 >= 0) {
                    this.f34949T = getChildAt(m2919a3 - this.f35109aw).getLeft();
                    this.f34948S = m2919a3;
                }
                this.f34956ab = i5;
                return true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z) {
        if (z) {
            m2858o();
            if (getWidth() > 0 && getChildCount() > 0) {
                mo2691h();
            }
            m2860m();
            return;
        }
        int i = this.f34955aa;
        if (i != 5 && i != 6) {
            return;
        }
        if (this.f34954aZ != null) {
            this.f34954aZ.m2840b();
        }
        if (this.f34958ad != null) {
            this.f34958ad.m2834a();
        }
        if (getScrollX() == 0) {
            return;
        }
        this.f35004s.mo2934a(0);
        m2923K();
        invalidate();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        int i = isInTouchMode() ? 0 : 1;
        if (!z) {
            setChildrenDrawingCacheEnabled(false);
            if (this.f34954aZ != null) {
                removeCallbacks(this.f34954aZ);
                this.f34954aZ.m2840b();
                if (this.f34958ad != null) {
                    this.f34958ad.m2834a();
                }
                if (getScrollX() != 0) {
                    this.f35004s.mo2934a(0);
                    m2923K();
                    invalidate();
                }
            }
            if (i == 1) {
                this.f34963ai = this.f35101aN;
            }
        } else if (i != this.f34987bi && this.f34987bi != -1) {
            if (i == 1) {
                m2854s();
            } else {
                m2858o();
                this.f35011z = 0;
                mo2691h();
            }
        }
        this.f34987bi = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public int m2857p() {
        int i = this.f35101aN;
        if (i < 0) {
            i = this.f34963ai;
        }
        return Math.min(Math.max(0, i), this.f35103aP - 1);
    }

    @Override // android.view.View
    @TargetApi(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!isEnabled() || getLastVisiblePosition() >= getCount() - 1) {
                    return false;
                }
                m2876f((getWidth() - this.f34942M.left) - this.f34942M.right, 200);
                return true;
            case 8192:
                if (!isEnabled() || this.f35109aw <= 0) {
                    return false;
                }
                m2876f(-((getWidth() - this.f34942M.left) - this.f34942M.right), 200);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: q */
    public void m2856q() {
        this.f35098aK = true;
        A();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public boolean m2855r() {
        if (this.f35101aN >= 0 || !m2854s()) {
            return false;
        }
        m2860m();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2926H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f35108aW || this.f35094aG) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    boolean m2854s() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = true;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return false;
        }
        int i8 = this.f34942M.left;
        int right = (getRight() - getLeft()) - this.f34942M.right;
        int i9 = this.f35109aw;
        int i10 = this.f34963ai;
        if (i10 >= i9 && i10 < i9 + childCount) {
            View childAt = getChildAt(i10 - this.f35109aw);
            int left = childAt.getLeft();
            int right2 = childAt.getRight();
            if (left < i8) {
                left = getHorizontalFadingEdgeLength() + i8;
            } else if (right2 > right) {
                left = (right - childAt.getMeasuredWidth()) - getHorizontalFadingEdgeLength();
            }
            i = left;
            z = true;
        } else if (i10 >= i9) {
            int i11 = this.f35103aP;
            int i12 = (i9 + childCount) - 1;
            int i13 = childCount - 1;
            i = 0;
            while (true) {
                if (i13 < 0) {
                    i10 = i12;
                    z = false;
                    break;
                }
                View childAt2 = getChildAt(i13);
                int left2 = childAt2.getLeft();
                int right3 = childAt2.getRight();
                if (i13 != childCount - 1) {
                    int i14 = right;
                    i2 = i;
                    i3 = i14;
                } else if (i9 + childCount < i11 || right3 > right) {
                    i3 = right - getHorizontalFadingEdgeLength();
                    i2 = left2;
                } else {
                    i3 = right;
                    i2 = left2;
                }
                if (right3 <= i3) {
                    i = left2;
                    i10 = i9 + i13;
                    z = false;
                    break;
                }
                i13--;
                int i15 = i3;
                i = i2;
                right = i15;
            }
        } else {
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 >= childCount) {
                    i4 = i17;
                    i5 = i9;
                    break;
                }
                i4 = getChildAt(i16).getLeft();
                if (i16 != 0) {
                    int i18 = i8;
                    i6 = i17;
                    i7 = i18;
                } else if (i9 > 0 || i4 < i8) {
                    i7 = getHorizontalFadingEdgeLength() + i8;
                    i6 = i4;
                } else {
                    i7 = i8;
                    i6 = i4;
                }
                if (i4 >= i7) {
                    i5 = i9 + i16;
                    break;
                }
                i16++;
                int i19 = i7;
                i17 = i6;
                i8 = i19;
            }
            i = i4;
            i10 = i5;
            z = true;
        }
        this.f34963ai = -1;
        removeCallbacks(this.f34954aZ);
        if (this.f34958ad != null) {
            this.f34958ad.m2834a();
        }
        this.f34955aa = -1;
        m2924J();
        this.f35110ax = i;
        int b = b(i10, z);
        if (b < i9 || b > getLastVisiblePosition()) {
            b = -1;
        } else {
            this.f35011z = 4;
            m2860m();
            setSelectionInt(b);
            m2892c();
        }
        m2899b(0);
        if (b < 0) {
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        if (i == 4096) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (this.f34978bI == firstVisiblePosition && this.f34979bJ == lastVisiblePosition) {
                return;
            }
            this.f34978bI = firstVisiblePosition;
            this.f34979bJ = lastVisiblePosition;
        }
        super.sendAccessibilityEvent(i);
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.f34932C = this.f34931B.hasStableIds();
            if (this.f35005t != 0 && this.f34932C && this.f35010y == null) {
                this.f35010y = new LongSparseArray<>();
            }
        }
        if (this.f35009x != null) {
            this.f35009x.clear();
        }
        if (this.f35010y != null) {
            this.f35010y.clear();
        }
    }

    public void setCacheColorHint(int i) {
        if (i != this.f34994bp) {
            this.f34994bp = i;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setDrawingCacheBackgroundColor(i);
            }
            this.f34937H.m2812f(i);
        }
    }

    @TargetApi(11)
    public void setChoiceMode(int i) {
        this.f35005t = i;
        if (Build.VERSION.SDK_INT >= 11 && this.f35006u != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                ((ActionMode) this.f35006u).finish();
            }
            this.f35006u = null;
        }
        if (this.f35005t != 0) {
            if (this.f35009x == null) {
                this.f35009x = new SparseArrayCompat<>();
            }
            if (this.f35010y == null && this.f34931B != null && this.f34931B.hasStableIds()) {
                this.f35010y = new LongSparseArray<>();
            }
            if (Build.VERSION.SDK_INT < 11 || this.f35005t != 3) {
                return;
            }
            m2922a();
            setLongClickable(true);
        }
    }

    public void setDrawSelectorOnTop(boolean z) {
        this.f34933D = z;
    }

    public void setFriction(float f) {
        if (this.f34954aZ == null) {
            this.f34954aZ = new RunnableC10902e();
        }
        this.f34954aZ.f35037b.m2628b(f);
    }

    @TargetApi(11)
    public void setMultiChoiceModeListener(AbstractActionMode$CallbackC10888a abstractActionMode$CallbackC10888a) {
        if (Build.VERSION.SDK_INT < 11) {
            Log.e(f34904aX, "setMultiChoiceModeListener not supported for this version of Android");
            return;
        }
        if (this.f35007v == null) {
            this.f35007v = new C10889b(this);
        }
        ((C10889b) this.f35007v).m2937a(abstractActionMode$CallbackC10888a);
    }

    public void setOnScrollListener(AbstractC10905g abstractC10905g) {
        this.f34983ba = abstractC10905g;
        m2892c();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        if (i == 2) {
            this.f35003bz = null;
            this.f34970bA = null;
        } else if (this.f35003bz == null) {
            Context context = getContext();
            this.f35003bz = new C10936a(context, 1);
            this.f34970bA = new C10936a(context, 1);
        }
        super.setOverScrollMode(i);
    }

    public void setRecyclerListener(AbstractC10912k abstractC10912k) {
        this.f34937H.f35071b = abstractC10912k;
    }

    public void setScrollingCacheEnabled(boolean z) {
        if (this.f34961ag && !z) {
            m2924J();
        }
        this.f34961ag = z;
    }

    public abstract void setSelectionInt(int i);

    public void setSelector(int i) {
        setSelector(getResources().getDrawable(i));
    }

    public void setSelector(Drawable drawable) {
        if (this.f34934E != null) {
            this.f34934E.setCallback(null);
            unscheduleDrawable(this.f34934E);
        }
        this.f34934E = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f34938I = rect.left;
        this.f34939J = rect.top;
        this.f34940K = rect.right;
        this.f34941L = rect.bottom;
        drawable.setCallback(this);
        m2860m();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.f34984bb = z;
    }

    public void setStackFromRight(boolean z) {
        if (this.f34960af != z) {
            this.f34960af = z;
            m2877f();
        }
    }

    public void setTranscriptMode(int i) {
        this.f34993bo = i;
    }

    public void setVelocityScale(float f) {
        this.f35001bw = f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        boolean z = false;
        int a = a(view);
        if (a >= 0) {
            long itemId = this.f34931B.getItemId(a);
            if (this.f35097aJ != null) {
                z = this.f35097aJ.m2787a(this, view, a, itemId);
            }
            if (z) {
                return z;
            }
            this.f34986bd = mo2752b(getChildAt(a - this.f35109aw), a, itemId);
            return super.showContextMenuForChild(view);
        }
        return false;
    }

    /* renamed from: t */
    void m2853t() {
        boolean z;
        this.f35009x.clear();
        int i = 0;
        boolean z2 = false;
        while (i < this.f35010y.size()) {
            long keyAt = this.f35010y.keyAt(i);
            int intValue = this.f35010y.valueAt(i).intValue();
            if (keyAt != this.f34931B.getItemId(intValue)) {
                int max = Math.max(0, intValue - 20);
                int min = Math.min(intValue + 20, this.f35103aP);
                while (true) {
                    if (max >= min) {
                        z = false;
                        break;
                    } else if (keyAt == this.f34931B.getItemId(max)) {
                        this.f35009x.put(max, true);
                        this.f35010y.setValueAt(i, Integer.valueOf(max));
                        z = true;
                        break;
                    } else {
                        max++;
                    }
                }
                if (!z) {
                    this.f35010y.delete(keyAt);
                    int i2 = i - 1;
                    this.f35008w--;
                    if (Build.VERSION.SDK_INT > 11 && this.f35006u != null && this.f35007v != null) {
                        ((C10889b) this.f35007v).mo2938a((ActionMode) this.f35006u, intValue, keyAt, false);
                    }
                    i = i2;
                    z2 = true;
                }
            } else {
                this.f35009x.put(intValue, true);
            }
            z2 = z2;
            i++;
        }
        if (!z2 || this.f35006u == null || Build.VERSION.SDK_INT <= 11) {
            return;
        }
        ((ActionMode) this.f35006u).invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView
    /* renamed from: u */
    public void mo2795u() {
        int i = this.f35103aP;
        int i2 = this.f34980bK;
        this.f34980bK = this.f35103aP;
        if (this.f35005t != 0 && this.f34931B != null && this.f34931B.hasStableIds()) {
            m2853t();
        }
        this.f34937H.m2819c();
        if (i > 0) {
            if (this.f35092aB) {
                this.f35092aB = false;
                this.f34981bL = null;
                if (this.f34993bo != 2) {
                    if (this.f34993bo == 1) {
                        if (this.f34974bE) {
                            this.f34974bE = false;
                            this.f35011z = 3;
                            return;
                        }
                        int childCount = getChildCount();
                        int width = getWidth() - getPaddingRight();
                        View childAt = getChildAt(childCount - 1);
                        int bottom = childAt != null ? childAt.getBottom() : width;
                        if (childCount + this.f35109aw >= i2 && bottom <= width) {
                            this.f35011z = 3;
                            return;
                        }
                        awakenScrollBars();
                    }
                    switch (this.f35093aC) {
                        case 1:
                            this.f35011z = 5;
                            this.f35111ay = Math.min(Math.max(0, this.f35111ay), i - 1);
                            return;
                        case 0:
                            if (isInTouchMode()) {
                                this.f35011z = 5;
                                this.f35111ay = Math.min(Math.max(0, this.f35111ay), i - 1);
                                return;
                            }
                            int z = z();
                            if (z >= 0 && b(z, true) == z) {
                                this.f35111ay = z;
                                if (this.f35091aA == getWidth()) {
                                    this.f35011z = 5;
                                } else {
                                    this.f35011z = 2;
                                }
                                setNextSelectedPositionInt(z);
                                return;
                            }
                            break;
                    }
                } else {
                    this.f35011z = 3;
                    return;
                }
            }
            if (!isInTouchMode()) {
                int selectedItemPosition = getSelectedItemPosition();
                if (selectedItemPosition >= i) {
                    selectedItemPosition = i - 1;
                }
                if (selectedItemPosition < 0) {
                    selectedItemPosition = 0;
                }
                int b = b(selectedItemPosition, true);
                if (b >= 0) {
                    setNextSelectedPositionInt(b);
                    return;
                }
                int b2 = b(selectedItemPosition, false);
                if (b2 >= 0) {
                    setNextSelectedPositionInt(b2);
                    return;
                }
            } else if (this.f34963ai >= 0) {
                return;
            }
        }
        this.f35011z = this.f34960af ? 3 : 1;
        this.f35101aN = -1;
        this.f35102aO = Long.MIN_VALUE;
        this.f35099aL = -1;
        this.f35100aM = Long.MIN_VALUE;
        this.f35092aB = false;
        this.f34981bL = null;
        this.f34935F = -1;
        y();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.f34934E == drawable || super.verifyDrawable(drawable);
    }
}
