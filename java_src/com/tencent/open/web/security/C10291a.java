package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.p264a.C10257f;
/* renamed from: com.tencent.open.web.security.a */
/* loaded from: classes2.dex */
public class C10291a extends InputConnectionWrapper {

    /* renamed from: a */
    public static String f32034a;

    /* renamed from: b */
    public static boolean f32035b = false;

    /* renamed from: c */
    public static boolean f32036c = false;

    public C10291a(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        f32036c = true;
        f32034a = charSequence.toString();
        C10257f.m5673b("CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            C10257f.m5670c("CaptureInputConnection", "sendKeyEvent");
            f32034a = String.valueOf((char) keyEvent.getUnicodeChar());
            f32036c = true;
            C10257f.m5670c("CaptureInputConnection", "s: " + f32034a);
        }
        C10257f.m5673b("CaptureInputConnection", "-->sendKeyEvent: " + f32034a);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        f32036c = true;
        f32034a = charSequence.toString();
        C10257f.m5673b("CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }
}
