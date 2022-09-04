package com.fimi.soul.view;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class TextViewFixTouchConsume extends TextView {

    /* renamed from: a */
    boolean f12258a = true;

    /* renamed from: b */
    boolean f12259b;

    /* renamed from: com.fimi.soul.view.TextViewFixTouchConsume$a */
    /* loaded from: classes2.dex */
    public static class C3177a extends LinkMovementMethod {

        /* renamed from: a */
        static C3177a f12260a;

        /* renamed from: a */
        public static C3177a m28855a() {
            if (f12260a == null) {
                f12260a = new C3177a();
            }
            return f12260a;
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                Object[] objArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (objArr.length == 0) {
                    Selection.removeSelection(spannable);
                    Touch.onTouchEvent(textView, spannable, motionEvent);
                    return false;
                }
                if (action == 1) {
                    objArr[0].onClick(textView);
                } else if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(objArr[0]), spannable.getSpanEnd(objArr[0]));
                }
                if (textView instanceof TextViewFixTouchConsume) {
                    ((TextViewFixTouchConsume) textView).f12259b = true;
                }
                return true;
            }
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    public TextViewFixTouchConsume(Context context) {
        super(context);
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean hasFocus() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12259b = false;
        return this.f12258a ? this.f12259b : super.onTouchEvent(motionEvent);
    }
}
