package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
/* loaded from: classes2.dex */
public class MyEditView extends EditText {

    /* renamed from: a */
    private AbstractC3171b f12148a;

    /* renamed from: com.fimi.soul.view.MyEditView$a */
    /* loaded from: classes2.dex */
    public class C3170a extends InputConnectionWrapper {
        public C3170a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean finishComposingText() {
            boolean finishComposingText = super.finishComposingText();
            if (MyEditView.this.f12148a != null && MyEditView.this.isFocusable()) {
                MyEditView.this.f12148a.m28874a();
            }
            return finishComposingText;
        }
    }

    /* renamed from: com.fimi.soul.view.MyEditView$b */
    /* loaded from: classes2.dex */
    public interface AbstractC3171b {
        /* renamed from: a */
        void m28874a();
    }

    public MyEditView(Context context) {
        super(context);
    }

    public MyEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C3170a(super.onCreateInputConnection(editorInfo), false);
    }

    public void setOnFinishComposingListener(AbstractC3171b abstractC3171b) {
        this.f12148a = abstractC3171b;
    }
}
