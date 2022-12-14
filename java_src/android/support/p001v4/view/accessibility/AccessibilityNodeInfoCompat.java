package android.support.p001v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat */
/* loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final AccessibilityNodeInfoImpl IMPL;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private final Object mInfo;

    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl */
    /* loaded from: classes.dex */
    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl {
        AccessibilityNodeInfoIcsImpl() {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, int i) {
            AccessibilityNodeInfoCompatIcs.addAction(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.addChild(obj, view);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByText(Object obj, String str) {
            return AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(obj, str);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getActions(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getActions(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getChild(Object obj, int i) {
            return AccessibilityNodeInfoCompatIcs.getChild(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getChildCount(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getChildCount(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getClassName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getClassName(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getContentDescription(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getPackageName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getParent(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getParent(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getText(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getText(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getWindowId(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getWindowId(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCheckable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isChecked(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isChecked(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isClickable(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEnabled(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocusable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocused(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocused(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isLongClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isPassword(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isPassword(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isScrollable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isSelected(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isSelected(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain() {
            return AccessibilityNodeInfoCompatIcs.obtain();
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view) {
            return AccessibilityNodeInfoCompatIcs.obtain(view);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(Object obj) {
            return AccessibilityNodeInfoCompatIcs.obtain(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i) {
            return AccessibilityNodeInfoCompatIcs.performAction(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void recycle(Object obj) {
            AccessibilityNodeInfoCompatIcs.recycle(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCheckable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setCheckable(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setChecked(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setChecked(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClassName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setClassName(obj, charSequence);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setClickable(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentDescription(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charSequence);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEnabled(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setEnabled(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocusable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocusable(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocused(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLongClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setLongClickable(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPackageName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setPackageName(obj, charSequence);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setParent(obj, view);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPassword(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setPassword(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setScrollable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setScrollable(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSelected(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setSelected(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setSource(obj, view);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setText(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setText(obj, charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl */
    /* loaded from: classes.dex */
    public interface AccessibilityNodeInfoImpl {
        void addAction(Object obj, int i);

        void addChild(Object obj, View view);

        void addChild(Object obj, View view, int i);

        List<Object> findAccessibilityNodeInfosByText(Object obj, String str);

        Object findFocus(Object obj, int i);

        Object focusSearch(Object obj, int i);

        int getActions(Object obj);

        void getBoundsInParent(Object obj, Rect rect);

        void getBoundsInScreen(Object obj, Rect rect);

        Object getChild(Object obj, int i);

        int getChildCount(Object obj);

        CharSequence getClassName(Object obj);

        CharSequence getContentDescription(Object obj);

        int getLiveRegion(Object obj);

        int getMovementGranularities(Object obj);

        CharSequence getPackageName(Object obj);

        Object getParent(Object obj);

        CharSequence getText(Object obj);

        String getViewIdResourceName(Object obj);

        int getWindowId(Object obj);

        boolean isAccessibilityFocused(Object obj);

        boolean isCheckable(Object obj);

        boolean isChecked(Object obj);

        boolean isClickable(Object obj);

        boolean isEnabled(Object obj);

        boolean isFocusable(Object obj);

        boolean isFocused(Object obj);

        boolean isLongClickable(Object obj);

        boolean isPassword(Object obj);

        boolean isScrollable(Object obj);

        boolean isSelected(Object obj);

        boolean isVisibleToUser(Object obj);

        Object obtain();

        Object obtain(View view);

        Object obtain(View view, int i);

        Object obtain(Object obj);

        boolean performAction(Object obj, int i);

        boolean performAction(Object obj, int i, Bundle bundle);

        void recycle(Object obj);

        void setAccessibilityFocused(Object obj, boolean z);

        void setBoundsInParent(Object obj, Rect rect);

        void setBoundsInScreen(Object obj, Rect rect);

        void setCheckable(Object obj, boolean z);

        void setChecked(Object obj, boolean z);

        void setClassName(Object obj, CharSequence charSequence);

        void setClickable(Object obj, boolean z);

        void setContentDescription(Object obj, CharSequence charSequence);

        void setEnabled(Object obj, boolean z);

        void setFocusable(Object obj, boolean z);

        void setFocused(Object obj, boolean z);

        void setLiveRegion(Object obj, int i);

        void setLongClickable(Object obj, boolean z);

        void setMovementGranularities(Object obj, int i);

        void setPackageName(Object obj, CharSequence charSequence);

        void setParent(Object obj, View view);

        void setParent(Object obj, View view, int i);

        void setPassword(Object obj, boolean z);

        void setScrollable(Object obj, boolean z);

        void setSelected(Object obj, boolean z);

        void setSource(Object obj, View view);

        void setSource(Object obj, View view, int i);

        void setText(Object obj, CharSequence charSequence);

        void setViewIdResourceName(Object obj, String str);

        void setVisibleToUser(Object obj, boolean z);
    }

    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl */
    /* loaded from: classes.dex */
    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl {
        AccessibilityNodeInfoJellybeanImpl() {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.addChild(obj, view, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object findFocus(Object obj, int i) {
            return AccessibilityNodeInfoCompatJellyBean.findFocus(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object focusSearch(Object obj, int i) {
            return AccessibilityNodeInfoCompatJellyBean.focusSearch(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMovementGranularities(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isAccessibilityFocused(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isVisibleToUser(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view, int i) {
            return AccessibilityNodeInfoCompatJellyBean.obtain(view, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i, Bundle bundle) {
            return AccessibilityNodeInfoCompatJellyBean.performAction(obj, i, bundle);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setAccessibilityFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, z);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMovementGranularities(Object obj, int i) {
            AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.setParent(obj, view, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view, int i) {
            AccessibilityNodeInfoCompatJellyBean.setSource(obj, view, i);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setVisibleToUser(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, z);
        }
    }

    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl */
    /* loaded from: classes.dex */
    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl {
        AccessibilityNodeInfoJellybeanMr2Impl() {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public String getViewIdResourceName(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setViewIdResourceName(Object obj, String str) {
            AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(obj, str);
        }
    }

    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl */
    /* loaded from: classes.dex */
    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl {
        AccessibilityNodeInfoKitKatImpl() {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getLiveRegion(Object obj) {
            return AccessibilityNodeInfoCompatKitKat.getLiveRegion(obj);
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl, android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLiveRegion(Object obj, int i) {
            AccessibilityNodeInfoCompatKitKat.setLiveRegion(obj, i);
        }
    }

    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl */
    /* loaded from: classes.dex */
    static class AccessibilityNodeInfoStubImpl implements AccessibilityNodeInfoImpl {
        AccessibilityNodeInfoStubImpl() {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addAction(Object obj, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void addChild(Object obj, View view, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public List<Object> findAccessibilityNodeInfosByText(Object obj, String str) {
            return Collections.emptyList();
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object findFocus(Object obj, int i) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object focusSearch(Object obj, int i) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getActions(Object obj) {
            return 0;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInParent(Object obj, Rect rect) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void getBoundsInScreen(Object obj, Rect rect) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getChild(Object obj, int i) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getChildCount(Object obj) {
            return 0;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getClassName(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getContentDescription(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getLiveRegion(Object obj) {
            return 0;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getMovementGranularities(Object obj) {
            return 0;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getPackageName(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object getParent(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public CharSequence getText(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public String getViewIdResourceName(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public int getWindowId(Object obj) {
            return 0;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isAccessibilityFocused(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isCheckable(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isChecked(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isClickable(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isEnabled(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocusable(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isFocused(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isLongClickable(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isPassword(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isScrollable(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isSelected(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean isVisibleToUser(Object obj) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain() {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(View view, int i) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public Object obtain(Object obj) {
            return null;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public boolean performAction(Object obj, int i, Bundle bundle) {
            return false;
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void recycle(Object obj) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setAccessibilityFocused(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInParent(Object obj, Rect rect) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setBoundsInScreen(Object obj, Rect rect) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setCheckable(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setChecked(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClassName(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setClickable(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setContentDescription(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setEnabled(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocusable(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setFocused(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLiveRegion(Object obj, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setLongClickable(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setMovementGranularities(Object obj, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPackageName(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setParent(Object obj, View view, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setPassword(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setScrollable(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSelected(Object obj, boolean z) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setSource(Object obj, View view, int i) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setText(Object obj, CharSequence charSequence) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setViewIdResourceName(Object obj, String str) {
        }

        @Override // android.support.p001v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
        public void setVisibleToUser(Object obj, boolean z) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new AccessibilityNodeInfoKitKatImpl();
        } else if (Build.VERSION.SDK_INT >= 18) {
            IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
        } else if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeInfoJellybeanImpl();
        } else if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = obj;
    }

    private static String getActionSymbolicName(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrapNonNullInstance(IMPL.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrapNonNullInstance(IMPL.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrapNonNullInstance(IMPL.obtain(view));
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i) {
        return wrapNonNullInstance(IMPL.obtain(view, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public void addAction(int i) {
        IMPL.addAction(this.mInfo, i);
    }

    public void addChild(View view) {
        IMPL.addChild(this.mInfo, view);
    }

    public void addChild(View view, int i) {
        IMPL.addChild(this.mInfo, view, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
            return this.mInfo == null ? accessibilityNodeInfoCompat.mInfo == null : this.mInfo.equals(accessibilityNodeInfoCompat.mInfo);
        }
        return false;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<Object> findAccessibilityNodeInfosByText = IMPL.findAccessibilityNodeInfosByText(this.mInfo, str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new AccessibilityNodeInfoCompat(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return wrapNonNullInstance(IMPL.findFocus(this.mInfo, i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i) {
        return wrapNonNullInstance(IMPL.focusSearch(this.mInfo, i));
    }

    public int getActions() {
        return IMPL.getActions(this.mInfo);
    }

    public void getBoundsInParent(Rect rect) {
        IMPL.getBoundsInParent(this.mInfo, rect);
    }

    public void getBoundsInScreen(Rect rect) {
        IMPL.getBoundsInScreen(this.mInfo, rect);
    }

    public AccessibilityNodeInfoCompat getChild(int i) {
        return wrapNonNullInstance(IMPL.getChild(this.mInfo, i));
    }

    public int getChildCount() {
        return IMPL.getChildCount(this.mInfo);
    }

    public CharSequence getClassName() {
        return IMPL.getClassName(this.mInfo);
    }

    public CharSequence getContentDescription() {
        return IMPL.getContentDescription(this.mInfo);
    }

    public Object getInfo() {
        return this.mInfo;
    }

    public int getLiveRegion() {
        return IMPL.getLiveRegion(this.mInfo);
    }

    public int getMovementGranularities() {
        return IMPL.getMovementGranularities(this.mInfo);
    }

    public CharSequence getPackageName() {
        return IMPL.getPackageName(this.mInfo);
    }

    public AccessibilityNodeInfoCompat getParent() {
        return wrapNonNullInstance(IMPL.getParent(this.mInfo));
    }

    public CharSequence getText() {
        return IMPL.getText(this.mInfo);
    }

    public String getViewIdResourceName() {
        return IMPL.getViewIdResourceName(this.mInfo);
    }

    public int getWindowId() {
        return IMPL.getWindowId(this.mInfo);
    }

    public int hashCode() {
        if (this.mInfo == null) {
            return 0;
        }
        return this.mInfo.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return IMPL.isAccessibilityFocused(this.mInfo);
    }

    public boolean isCheckable() {
        return IMPL.isCheckable(this.mInfo);
    }

    public boolean isChecked() {
        return IMPL.isChecked(this.mInfo);
    }

    public boolean isClickable() {
        return IMPL.isClickable(this.mInfo);
    }

    public boolean isEnabled() {
        return IMPL.isEnabled(this.mInfo);
    }

    public boolean isFocusable() {
        return IMPL.isFocusable(this.mInfo);
    }

    public boolean isFocused() {
        return IMPL.isFocused(this.mInfo);
    }

    public boolean isLongClickable() {
        return IMPL.isLongClickable(this.mInfo);
    }

    public boolean isPassword() {
        return IMPL.isPassword(this.mInfo);
    }

    public boolean isScrollable() {
        return IMPL.isScrollable(this.mInfo);
    }

    public boolean isSelected() {
        return IMPL.isSelected(this.mInfo);
    }

    public boolean isVisibleToUser() {
        return IMPL.isVisibleToUser(this.mInfo);
    }

    public boolean performAction(int i) {
        return IMPL.performAction(this.mInfo, i);
    }

    public boolean performAction(int i, Bundle bundle) {
        return IMPL.performAction(this.mInfo, i, bundle);
    }

    public void recycle() {
        IMPL.recycle(this.mInfo);
    }

    public void setAccessibilityFocused(boolean z) {
        IMPL.setAccessibilityFocused(this.mInfo, z);
    }

    public void setBoundsInParent(Rect rect) {
        IMPL.setBoundsInParent(this.mInfo, rect);
    }

    public void setBoundsInScreen(Rect rect) {
        IMPL.setBoundsInScreen(this.mInfo, rect);
    }

    public void setCheckable(boolean z) {
        IMPL.setCheckable(this.mInfo, z);
    }

    public void setChecked(boolean z) {
        IMPL.setChecked(this.mInfo, z);
    }

    public void setClassName(CharSequence charSequence) {
        IMPL.setClassName(this.mInfo, charSequence);
    }

    public void setClickable(boolean z) {
        IMPL.setClickable(this.mInfo, z);
    }

    public void setContentDescription(CharSequence charSequence) {
        IMPL.setContentDescription(this.mInfo, charSequence);
    }

    public void setEnabled(boolean z) {
        IMPL.setEnabled(this.mInfo, z);
    }

    public void setFocusable(boolean z) {
        IMPL.setFocusable(this.mInfo, z);
    }

    public void setFocused(boolean z) {
        IMPL.setFocused(this.mInfo, z);
    }

    public void setLiveRegion(int i) {
        IMPL.setLiveRegion(this.mInfo, i);
    }

    public void setLongClickable(boolean z) {
        IMPL.setLongClickable(this.mInfo, z);
    }

    public void setMovementGranularities(int i) {
        IMPL.setMovementGranularities(this.mInfo, i);
    }

    public void setPackageName(CharSequence charSequence) {
        IMPL.setPackageName(this.mInfo, charSequence);
    }

    public void setParent(View view) {
        IMPL.setParent(this.mInfo, view);
    }

    public void setParent(View view, int i) {
        IMPL.setParent(this.mInfo, view, i);
    }

    public void setPassword(boolean z) {
        IMPL.setPassword(this.mInfo, z);
    }

    public void setScrollable(boolean z) {
        IMPL.setScrollable(this.mInfo, z);
    }

    public void setSelected(boolean z) {
        IMPL.setSelected(this.mInfo, z);
    }

    public void setSource(View view) {
        IMPL.setSource(this.mInfo, view);
    }

    public void setSource(View view, int i) {
        IMPL.setSource(this.mInfo, view, i);
    }

    public void setText(CharSequence charSequence) {
        IMPL.setText(this.mInfo, charSequence);
    }

    public void setViewIdResourceName(String str) {
        IMPL.setViewIdResourceName(this.mInfo, str);
    }

    public void setVisibleToUser(boolean z) {
        IMPL.setVisibleToUser(this.mInfo, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(getPackageName());
        sb.append("; className: ").append(getClassName());
        sb.append("; text: ").append(getText());
        sb.append("; contentDescription: ").append(getContentDescription());
        sb.append("; viewId: ").append(getViewIdResourceName());
        sb.append("; checkable: ").append(isCheckable());
        sb.append("; checked: ").append(isChecked());
        sb.append("; focusable: ").append(isFocusable());
        sb.append("; focused: ").append(isFocused());
        sb.append("; selected: ").append(isSelected());
        sb.append("; clickable: ").append(isClickable());
        sb.append("; longClickable: ").append(isLongClickable());
        sb.append("; enabled: ").append(isEnabled());
        sb.append("; password: ").append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; [");
        int actions = getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ (-1);
            sb.append(getActionSymbolicName(numberOfTrailingZeros));
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
