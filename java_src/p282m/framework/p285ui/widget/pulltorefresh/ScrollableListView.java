package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.ListView;
/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableListView */
/* loaded from: classes2.dex */
public class ScrollableListView extends ListView implements AbstractC10989i {

    /* renamed from: a */
    private AbstractC10979c f35397a;

    /* renamed from: b */
    private boolean f35398b;

    public ScrollableListView(Context context) {
        super(context);
        m2417a(context);
    }

    public ScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2417a(context);
    }

    public ScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2417a(context);
    }

    /* renamed from: a */
    private void m2417a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f35397a = new AbstractC10979c() { // from class: m.framework.ui.widget.pulltorefresh.ScrollableListView.1
            @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10979c
            /* renamed from: a */
            public void mo2414a(AbstractC10989i abstractC10989i, int i, int i2, int i3, int i4) {
                ScrollableListView.this.f35398b = i2 <= 0 && i4 <= 0;
            }
        };
    }

    /* renamed from: a */
    public boolean m2418a() {
        return this.f35398b;
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f35397a != null) {
            this.f35397a.mo2414a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
