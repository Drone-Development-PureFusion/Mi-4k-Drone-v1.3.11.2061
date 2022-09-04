package p282m.framework.p285ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/* renamed from: m.framework.ui.widget.pulltorefresh.a */
/* loaded from: classes2.dex */
public class C10977a extends BaseAdapter {

    /* renamed from: a */
    private AbstractC10981e f35400a;

    public C10977a(AbstractC10981e abstractC10981e) {
        this.f35400a = abstractC10981e;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35400a.m2404i();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f35400a.m2405c(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.f35400a.m2406b(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f35400a.m2407a(i, view, viewGroup);
    }
}
