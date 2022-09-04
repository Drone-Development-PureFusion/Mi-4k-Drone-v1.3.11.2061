package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes2.dex */
public class SeekBar extends AbsSeekBar {

    /* renamed from: n */
    private AbstractC3299a f13102n;

    /* renamed from: com.fimi.soul.view.myhorizontalseebar.SeekBar$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3299a {
        /* renamed from: a */
        void mo28392a(SeekBar seekBar);

        /* renamed from: a */
        void mo28391a(SeekBar seekBar, int i, boolean z);

        /* renamed from: b */
        void mo28390b(SeekBar seekBar);
    }

    public SeekBar(Context context) {
        this(context, null);
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.fimi.soul.view.myhorizontalseebar.AbsSeekBar
    /* renamed from: a */
    public void mo28395a() {
        super.mo28395a();
        if (this.f13102n != null) {
            this.f13102n.mo28392a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.fimi.soul.view.myhorizontalseebar.AbsSeekBar, com.fimi.soul.view.myhorizontalseebar.ProgressBar
    /* renamed from: a */
    public void mo28394a(float f, boolean z) {
        super.mo28394a(f, z);
        if (this.f13102n != null) {
            this.f13102n.mo28391a(this, getProgress(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.fimi.soul.view.myhorizontalseebar.AbsSeekBar
    /* renamed from: b */
    public void mo28393b() {
        super.mo28393b();
        if (this.f13102n != null) {
            this.f13102n.mo28390b(this);
        }
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbsSeekBar, com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbsSeekBar, com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
    }

    public void setOnSeekBarChangeListener(AbstractC3299a abstractC3299a) {
        this.f13102n = abstractC3299a;
    }
}
