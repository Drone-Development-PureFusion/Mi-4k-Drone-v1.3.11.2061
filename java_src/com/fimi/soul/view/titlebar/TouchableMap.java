package com.fimi.soul.view.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public class TouchableMap extends FrameLayout {

    /* renamed from: a */
    private AbstractC3323a f13235a;

    /* renamed from: com.fimi.soul.view.titlebar.TouchableMap$a */
    /* loaded from: classes.dex */
    public interface AbstractC3323a {
        /* renamed from: a */
        void mo28295a(MotionEvent motionEvent);
    }

    public TouchableMap(Context context) {
        super(context);
    }

    public TouchableMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchableMap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13235a != null) {
            this.f13235a.mo28295a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNonConsumingTouchListener(AbstractC3323a abstractC3323a) {
        this.f13235a = abstractC3323a;
    }
}
