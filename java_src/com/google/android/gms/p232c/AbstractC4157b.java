package com.google.android.gms.p232c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.internal.C4632t;
import com.google.android.gms.p232c.AbstractC4156a;
import java.util.Iterator;
import java.util.LinkedList;
/* renamed from: com.google.android.gms.c.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4157b<T extends AbstractC4156a> {

    /* renamed from: a */
    private T f15748a;

    /* renamed from: b */
    private Bundle f15749b;

    /* renamed from: c */
    private LinkedList<AbstractC4165a> f15750c;

    /* renamed from: d */
    private final AbstractC4174g<T> f15751d = (AbstractC4174g<T>) new AbstractC4174g<T>() { // from class: com.google.android.gms.c.b.1
        @Override // com.google.android.gms.p232c.AbstractC4174g
        /* renamed from: a */
        public void mo25292a(T t) {
            AbstractC4157b.this.f15748a = t;
            Iterator it2 = AbstractC4157b.this.f15750c.iterator();
            while (it2.hasNext()) {
                ((AbstractC4165a) it2.next()).mo25298a(AbstractC4157b.this.f15748a);
            }
            AbstractC4157b.this.f15750c.clear();
            AbstractC4157b.this.f15749b = null;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.c.b$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4165a {
        /* renamed from: a */
        int mo25299a();

        /* renamed from: a */
        void mo25298a(AbstractC4156a abstractC4156a);
    }

    /* renamed from: a */
    private void m25317a(int i) {
        while (!this.f15750c.isEmpty() && this.f15750c.getLast().mo25299a() >= i) {
            this.f15750c.removeLast();
        }
    }

    /* renamed from: a */
    private void m25314a(Bundle bundle, AbstractC4165a abstractC4165a) {
        if (this.f15748a != null) {
            abstractC4165a.mo25298a(this.f15748a);
            return;
        }
        if (this.f15750c == null) {
            this.f15750c = new LinkedList<>();
        }
        this.f15750c.add(abstractC4165a);
        if (bundle != null) {
            if (this.f15749b == null) {
                this.f15749b = (Bundle) bundle.clone();
            } else {
                this.f15749b.putAll(bundle);
            }
        }
        mo8306a(this.f15751d);
    }

    /* renamed from: b */
    public static void m25307b(FrameLayout frameLayout) {
        final Context context = frameLayout.getContext();
        final int m23815a = C4536e.m23815a(context);
        String m23435c = C4632t.m23435c(context, m23815a);
        String m23433e = C4632t.m23433e(context, m23815a);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(m23435c);
        linearLayout.addView(textView);
        if (m23433e != null) {
            Button button = new Button(context);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(m23433e);
            linearLayout.addView(button);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.c.b.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    context.startActivity(C4536e.m23813b(m23815a));
                }
            });
        }
    }

    /* renamed from: a */
    public View m25313a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m25314a(bundle, new AbstractC4165a() { // from class: com.google.android.gms.c.b.4
            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public int mo25299a() {
                return 2;
            }

            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public void mo25298a(AbstractC4156a abstractC4156a) {
                frameLayout.removeAllViews();
                frameLayout.addView(AbstractC4157b.this.f15748a.mo8326a(layoutInflater, viewGroup, bundle));
            }
        });
        if (this.f15748a == null) {
            mo8307a(frameLayout);
        }
        return frameLayout;
    }

    /* renamed from: a */
    public T m25318a() {
        return this.f15748a;
    }

    /* renamed from: a */
    public void m25316a(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        m25314a(bundle2, new AbstractC4165a() { // from class: com.google.android.gms.c.b.2
            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public int mo25299a() {
                return 0;
            }

            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public void mo25298a(AbstractC4156a abstractC4156a) {
                AbstractC4157b.this.f15748a.mo8328a(activity, bundle, bundle2);
            }
        });
    }

    /* renamed from: a */
    public void m25315a(final Bundle bundle) {
        m25314a(bundle, new AbstractC4165a() { // from class: com.google.android.gms.c.b.3
            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public int mo25299a() {
                return 1;
            }

            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public void mo25298a(AbstractC4156a abstractC4156a) {
                AbstractC4157b.this.f15748a.mo8327a(bundle);
            }
        });
    }

    /* renamed from: a */
    protected void mo8307a(FrameLayout frameLayout) {
        m25307b(frameLayout);
    }

    /* renamed from: a */
    protected abstract void mo8306a(AbstractC4174g<T> abstractC4174g);

    /* renamed from: b */
    public void m25309b() {
        m25314a((Bundle) null, new AbstractC4165a() { // from class: com.google.android.gms.c.b.6
            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public int mo25299a() {
                return 4;
            }

            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public void mo25298a(AbstractC4156a abstractC4156a) {
                AbstractC4157b.this.f15748a.mo8330a();
            }
        });
    }

    /* renamed from: b */
    public void m25308b(Bundle bundle) {
        if (this.f15748a != null) {
            this.f15748a.mo8314b(bundle);
        } else if (this.f15749b == null) {
        } else {
            bundle.putAll(this.f15749b);
        }
    }

    /* renamed from: c */
    public void m25305c() {
        m25314a((Bundle) null, new AbstractC4165a() { // from class: com.google.android.gms.c.b.7
            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public int mo25299a() {
                return 5;
            }

            @Override // com.google.android.gms.p232c.AbstractC4157b.AbstractC4165a
            /* renamed from: a */
            public void mo25298a(AbstractC4156a abstractC4156a) {
                AbstractC4157b.this.f15748a.mo8315b();
            }
        });
    }

    /* renamed from: d */
    public void m25304d() {
        if (this.f15748a != null) {
            this.f15748a.mo8313c();
        } else {
            m25317a(5);
        }
    }

    /* renamed from: e */
    public void m25303e() {
        if (this.f15748a != null) {
            this.f15748a.mo8312d();
        } else {
            m25317a(4);
        }
    }

    /* renamed from: f */
    public void m25302f() {
        if (this.f15748a != null) {
            this.f15748a.mo8311e();
        } else {
            m25317a(2);
        }
    }

    /* renamed from: g */
    public void m25301g() {
        if (this.f15748a != null) {
            this.f15748a.mo8310f();
        } else {
            m25317a(1);
        }
    }

    /* renamed from: h */
    public void m25300h() {
        if (this.f15748a != null) {
            this.f15748a.mo8309g();
        }
    }
}
