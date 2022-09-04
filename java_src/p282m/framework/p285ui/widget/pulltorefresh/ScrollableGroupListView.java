package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableGroupListView */
/* loaded from: classes2.dex */
public class ScrollableGroupListView extends GroupListView implements AbstractC10989i {

    /* renamed from: a */
    private AbstractC10979c f35394a;

    /* renamed from: b */
    private boolean f35395b;

    public ScrollableGroupListView(Context context) {
        super(context);
        m2420a(context);
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2420a(context);
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2420a(context);
    }

    /* renamed from: a */
    private void m2420a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f35394a = new AbstractC10979c() { // from class: m.framework.ui.widget.pulltorefresh.ScrollableGroupListView.1
            @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10979c
            /* renamed from: a */
            public void mo2414a(AbstractC10989i abstractC10989i, int i, int i2, int i3, int i4) {
                ScrollableGroupListView.this.f35395b = i2 <= 0 && i4 <= 0;
            }
        };
    }

    /* renamed from: a */
    public boolean m2421a() {
        return this.f35395b;
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f35394a != null) {
            this.f35394a.mo2414a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
