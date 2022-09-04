package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.GridView;
/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableGridView */
/* loaded from: classes2.dex */
public class ScrollableGridView extends GridView implements AbstractC10989i {

    /* renamed from: a */
    private AbstractC10979c f35391a;

    /* renamed from: b */
    private boolean f35392b;

    public ScrollableGridView(Context context) {
        super(context);
        m2423a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2423a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2423a(context);
    }

    /* renamed from: a */
    private void m2423a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f35391a = new AbstractC10979c() { // from class: m.framework.ui.widget.pulltorefresh.ScrollableGridView.1
            @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10979c
            /* renamed from: a */
            public void mo2414a(AbstractC10989i abstractC10989i, int i, int i2, int i3, int i4) {
                ScrollableGridView.this.f35392b = i2 <= 0 && i4 <= 0;
            }
        };
    }

    /* renamed from: a */
    public boolean m2424a() {
        return this.f35392b;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f35391a != null) {
            this.f35391a.mo2414a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
