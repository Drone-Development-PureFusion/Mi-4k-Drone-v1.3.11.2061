package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.l */
/* loaded from: classes.dex */
public class View$OnClickListenerC3616l extends AbstractC7817uw.AbstractBinderC7818a implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    int f14161b;

    /* renamed from: c */
    int f14162c;

    /* renamed from: e */
    private final FrameLayout f14164e;
    @Nullable

    /* renamed from: f */
    private FrameLayout f14165f;
    @Nullable

    /* renamed from: h */
    private C3596b f14167h;
    @Nullable

    /* renamed from: i */
    private AbstractC3603i f14168i;

    /* renamed from: d */
    private final Object f14163d = new Object();

    /* renamed from: g */
    private Map<String, WeakReference<View>> f14166g = new HashMap();

    /* renamed from: a */
    boolean f14160a = false;

    public View$OnClickListenerC3616l(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f14164e = frameLayout;
        this.f14165f = frameLayout2;
        C3779u.m26897C().m18196a((View) this.f14164e, (ViewTreeObserver.OnGlobalLayoutListener) this);
        C3779u.m26897C().m18195a((View) this.f14164e, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f14164e.setOnTouchListener(this);
        this.f14164e.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m27346b(C3605j c3605j) {
        if (!this.f14166g.containsKey("2011")) {
            c3605j.m27360g();
            return;
        }
        final View view = this.f14166g.get("2011").get();
        if (!(view instanceof FrameLayout)) {
            c3605j.m27360g();
        } else {
            c3605j.m27374a(view, new AbstractC3601g() { // from class: com.google.android.gms.ads.internal.formats.l.2
                @Override // com.google.android.gms.ads.internal.formats.AbstractC3601g
                /* renamed from: a */
                public void mo27344a() {
                    View$OnClickListenerC3616l.this.onClick(view);
                }

                @Override // com.google.android.gms.ads.internal.formats.AbstractC3601g
                /* renamed from: a */
                public void mo27343a(MotionEvent motionEvent) {
                    View$OnClickListenerC3616l.this.onTouch(null, motionEvent);
                }
            });
        }
    }

    /* renamed from: a */
    int m27354a(int i) {
        return C3514ac.m27586a().m26852b(this.f14168i.mo27361f(), i);
    }

    /* renamed from: a */
    Point m27353a(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        this.f14164e.getLocationOnScreen(iArr);
        return new Point((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
    }

    @Nullable
    /* renamed from: a */
    C3596b m27351a(C3605j c3605j) {
        return c3605j.mo27376a((View.OnClickListener) this);
    }

    @Override // com.google.android.gms.internal.AbstractC7817uw
    /* renamed from: a */
    public AbstractC4170e mo13398a(String str) {
        AbstractC4170e m25293a;
        synchronized (this.f14163d) {
            WeakReference<View> weakReference = this.f14166g.get(str);
            m25293a = BinderC4173f.m25293a(weakReference == null ? null : weakReference.get());
        }
        return m25293a;
    }

    @Override // com.google.android.gms.internal.AbstractC7817uw
    /* renamed from: a */
    public void mo13400a() {
        synchronized (this.f14163d) {
            if (this.f14165f != null) {
                this.f14165f.removeAllViews();
            }
            this.f14165f = null;
            this.f14166g = null;
            this.f14167h = null;
            this.f14168i = null;
        }
    }

    /* renamed from: a */
    void m27352a(@Nullable View view) {
        if (this.f14168i != null) {
            AbstractC3603i m27382c = this.f14168i instanceof C3602h ? ((C3602h) this.f14168i).m27382c() : this.f14168i;
            if (m27382c == null) {
                return;
            }
            m27382c.mo27365b(view);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7817uw
    /* renamed from: a */
    public void mo13399a(AbstractC4170e abstractC4170e) {
        synchronized (this.f14163d) {
            m27352a((View) null);
            Object m25294a = BinderC4173f.m25294a(abstractC4170e);
            if (!(m25294a instanceof C3605j)) {
                abr.d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            if (this.f14165f != null) {
                this.f14165f.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                this.f14164e.requestLayout();
            }
            this.f14160a = true;
            final C3605j c3605j = (C3605j) m25294a;
            if (this.f14168i != null && C7788uf.f25808bM.m13486c().booleanValue()) {
                this.f14168i.mo27372a(this.f14164e, this.f14166g);
            }
            if (!(this.f14168i instanceof C3602h) || !((C3602h) this.f14168i).m27383b()) {
                this.f14168i = c3605j;
                if (c3605j instanceof C3602h) {
                    ((C3602h) c3605j).m27384a((AbstractC3603i) null);
                }
            } else {
                ((C3602h) this.f14168i).m27384a((AbstractC3603i) c3605j);
            }
            if (C7788uf.f25808bM.m13486c().booleanValue()) {
                this.f14165f.setClickable(false);
            }
            this.f14165f.removeAllViews();
            this.f14167h = m27351a(c3605j);
            if (this.f14167h != null) {
                this.f14166g.put("1007", new WeakReference<>(this.f14167h.m27386a()));
                this.f14165f.addView(this.f14167h);
            }
            c3605j.mo27371a(this.f14164e, this.f14166g, this, this);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.formats.l.1
                @Override // java.lang.Runnable
                public void run() {
                    acy mo27363d = c3605j.mo27363d();
                    if (mo27363d != null && View$OnClickListenerC3616l.this.f14165f != null) {
                        View$OnClickListenerC3616l.this.f14165f.addView(mo27363d.mo18105b());
                    }
                    if (!(c3605j instanceof C3602h)) {
                        View$OnClickListenerC3616l.this.m27346b(c3605j);
                    }
                }
            });
            m27352a(this.f14164e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7817uw
    /* renamed from: a */
    public void mo13397a(String str, AbstractC4170e abstractC4170e) {
        View view = (View) BinderC4173f.m25294a(abstractC4170e);
        synchronized (this.f14163d) {
            if (view == null) {
                this.f14166g.remove(str);
            } else {
                this.f14166g.put(str, new WeakReference<>(view));
                view.setOnTouchListener(this);
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    /* renamed from: b */
    int m27348b() {
        return this.f14164e.getMeasuredWidth();
    }

    /* renamed from: b */
    Point m27347b(View view) {
        if (this.f14167h == null || !this.f14167h.m27386a().equals(view)) {
            Point point = new Point();
            view.getGlobalVisibleRect(new Rect(), point);
            return point;
        }
        Point point2 = new Point();
        this.f14164e.getGlobalVisibleRect(new Rect(), point2);
        Point point3 = new Point();
        view.getGlobalVisibleRect(new Rect(), point3);
        return new Point(point3.x - point2.x, point3.y - point2.y);
    }

    /* renamed from: c */
    int m27345c() {
        return this.f14164e.getMeasuredHeight();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        synchronized (this.f14163d) {
            if (this.f14168i == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, WeakReference<View>> entry : this.f14166g.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    Point m27347b = m27347b(view2);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(FimiMediaMeta.IJKM_KEY_WIDTH, m27354a(view2.getWidth()));
                        jSONObject2.put(FimiMediaMeta.IJKM_KEY_HEIGHT, m27354a(view2.getHeight()));
                        jSONObject2.put("x", m27354a(m27347b.x));
                        jSONObject2.put("y", m27354a(m27347b.y));
                        jSONObject.put(entry.getKey(), jSONObject2);
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(entry.getKey());
                        abr.d(valueOf.length() != 0 ? "Unable to get view rectangle for view ".concat(valueOf) : new String("Unable to get view rectangle for view "));
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", m27354a(this.f14161b));
                jSONObject3.put("y", m27354a(this.f14162c));
            } catch (JSONException e2) {
                abr.d("Unable to get click location");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put(FimiMediaMeta.IJKM_KEY_WIDTH, m27354a(m27348b()));
                jSONObject4.put(FimiMediaMeta.IJKM_KEY_HEIGHT, m27354a(m27345c()));
            } catch (JSONException e3) {
                abr.d("Unable to get native ad view bounding box");
            }
            if (this.f14167h == null || !this.f14167h.m27386a().equals(view)) {
                this.f14168i.mo27370a(view, this.f14166g, jSONObject, jSONObject3, jSONObject4);
            } else if (!(this.f14168i instanceof C3602h) || ((C3602h) this.f14168i).m27382c() == null) {
                this.f14168i.mo27373a(view, "1007", jSONObject, jSONObject3, jSONObject4);
            } else {
                ((C3602h) this.f14168i).m27382c().mo27373a(view, "1007", jSONObject, jSONObject3, jSONObject4);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        synchronized (this.f14163d) {
            if (this.f14160a) {
                int m27348b = m27348b();
                int m27345c = m27345c();
                if (m27348b != 0 && m27345c != 0 && this.f14165f != null) {
                    this.f14165f.setLayoutParams(new FrameLayout.LayoutParams(m27348b, m27345c));
                    this.f14160a = false;
                }
            }
            if (this.f14168i != null) {
                this.f14168i.mo27375a(this.f14164e);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        synchronized (this.f14163d) {
            if (this.f14168i != null) {
                this.f14168i.mo27375a(this.f14164e);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f14163d) {
            if (this.f14168i != null) {
                Point m27353a = m27353a(motionEvent);
                this.f14161b = m27353a.x;
                this.f14162c = m27353a.y;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(m27353a.x, m27353a.y);
                this.f14168i.mo27377a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
