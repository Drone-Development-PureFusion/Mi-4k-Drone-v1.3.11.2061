package android.support.p001v4.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: android.support.v4.view.ViewParentCompatICS */
/* loaded from: classes.dex */
public class ViewParentCompatICS {
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
