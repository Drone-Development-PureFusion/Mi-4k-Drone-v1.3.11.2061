package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
/* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView */
/* loaded from: classes2.dex */
public class GroupListView extends ListView {

    /* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10971a {

        /* renamed from: a */
        private BaseAdapter f35375a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2439a(BaseAdapter baseAdapter) {
            this.f35375a = baseAdapter;
        }

        /* renamed from: a */
        public abstract int mo2385a();

        /* renamed from: a */
        public abstract View mo2382a(int i, int i2, View view, ViewGroup viewGroup);

        /* renamed from: a */
        public abstract View mo2381a(int i, View view, ViewGroup viewGroup);

        /* renamed from: a */
        public abstract Object mo2383a(int i, int i2);

        /* renamed from: a */
        public abstract String mo2384a(int i);

        /* renamed from: b */
        public abstract int mo2380b(int i);

        /* renamed from: b */
        public void m2437b() {
            this.f35375a.notifyDataSetChanged();
        }
    }

    /* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView$b */
    /* loaded from: classes2.dex */
    private static class C10972b {

        /* renamed from: a */
        public LinearLayout f35376a;

        /* renamed from: b */
        public View f35377b;

        /* renamed from: c */
        public View f35378c;

        private C10972b() {
        }

        /* synthetic */ C10972b(C10972b c10972b) {
            this();
        }
    }

    public GroupListView(Context context) {
        super(context);
    }

    public GroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdapter(final AbstractC10971a abstractC10971a) {
        BaseAdapter baseAdapter = new BaseAdapter() { // from class: m.framework.ui.widget.pulltorefresh.GroupListView.1
            /* renamed from: a */
            private int[] m2440a(int i) {
                int[] iArr = {-1, -2};
                int mo2385a = abstractC10971a.mo2385a();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= mo2385a) {
                        break;
                    }
                    int mo2380b = abstractC10971a.mo2380b(i2) + 1;
                    if (i3 + mo2380b > i) {
                        iArr[0] = i2;
                        iArr[1] = (i - i3) - 1;
                        break;
                    }
                    i3 += mo2380b;
                    i2++;
                }
                return iArr;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                int mo2385a = abstractC10971a.mo2385a();
                int i = 0;
                for (int i2 = 0; i2 < mo2385a; i2++) {
                    i += abstractC10971a.mo2380b(i2) + 1;
                }
                return i;
            }

            @Override // android.widget.Adapter
            public Object getItem(int i) {
                int[] m2440a = m2440a(i);
                int i2 = m2440a[0];
                int i3 = m2440a[1];
                if (i2 > -1) {
                    if (i3 == -1) {
                        return abstractC10971a.mo2384a(i3);
                    }
                    if (i3 > -1) {
                        return abstractC10971a.mo2383a(i2, i3);
                    }
                }
                return null;
            }

            @Override // android.widget.Adapter
            public long getItemId(int i) {
                return i;
            }

            @Override // android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                int[] m2440a = m2440a(i);
                int i2 = m2440a[0];
                int i3 = m2440a[1];
                if (view == null) {
                    C10972b c10972b = new C10972b(null);
                    c10972b.f35376a = new LinearLayout(viewGroup.getContext());
                    c10972b.f35376a.setOrientation(1);
                    c10972b.f35376a.setTag(c10972b);
                    if (i2 > -1) {
                        if (i3 == -1) {
                            c10972b.f35377b = abstractC10971a.mo2381a(i2, c10972b.f35377b, c10972b.f35376a);
                            c10972b.f35376a.addView(c10972b.f35377b);
                        } else if (i3 > -1) {
                            c10972b.f35378c = abstractC10971a.mo2382a(i2, i3, c10972b.f35378c, c10972b.f35376a);
                            c10972b.f35376a.addView(c10972b.f35378c);
                        }
                    }
                    return c10972b.f35376a;
                }
                C10972b c10972b2 = (C10972b) view.getTag();
                if (i2 <= -1) {
                    return view;
                }
                if (i3 == -1) {
                    c10972b2.f35377b = abstractC10971a.mo2381a(i2, c10972b2.f35377b, c10972b2.f35376a);
                    if (c10972b2.f35378c == null) {
                        return view;
                    }
                    c10972b2.f35376a.removeView(c10972b2.f35378c);
                    return view;
                } else if (i3 <= -1) {
                    return view;
                } else {
                    c10972b2.f35378c = abstractC10971a.mo2382a(i2, i3, c10972b2.f35378c, c10972b2.f35376a);
                    if (c10972b2.f35377b == null) {
                        return view;
                    }
                    c10972b2.f35376a.removeView(c10972b2.f35377b);
                    return view;
                }
            }
        };
        abstractC10971a.m2439a(baseAdapter);
        super.setAdapter((ListAdapter) baseAdapter);
    }
}
