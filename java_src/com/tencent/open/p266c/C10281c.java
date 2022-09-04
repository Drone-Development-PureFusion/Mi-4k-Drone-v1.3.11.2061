package com.tencent.open.p266c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.web.security.C10291a;
import com.tencent.open.web.security.SecureJsInterface;
/* renamed from: com.tencent.open.c.c */
/* loaded from: classes2.dex */
public class C10281c extends C10280b {

    /* renamed from: a */
    public static boolean f31969a;

    /* renamed from: b */
    private KeyEvent f31970b;

    /* renamed from: c */
    private C10291a f31971c;

    public C10281c(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        C10257f.m5673b("SecureWebView", "-->dispatchKeyEvent, is device support: " + f31969a);
        if (f31969a && keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 4:
                    return super.dispatchKeyEvent(keyEvent);
                case 66:
                    return super.dispatchKeyEvent(keyEvent);
                case 67:
                    C10291a.f32035b = true;
                    return super.dispatchKeyEvent(keyEvent);
                default:
                    if (keyEvent.getUnicodeChar() == 0) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    this.f31970b = new KeyEvent(0, 17);
                    return super.dispatchKeyEvent(this.f31970b);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C10257f.m5670c("SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C10257f.m5673b("SecureWebView", "-->onCreateInputConnection, inputConn is " + onCreateInputConnection);
        if (onCreateInputConnection == null) {
            f31969a = false;
            return onCreateInputConnection;
        }
        f31969a = true;
        this.f31971c = new C10291a(super.onCreateInputConnection(editorInfo), false);
        return this.f31971c;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int unicodeChar;
        C10257f.m5673b("SecureWebView", "-->onKeyDown, is device support: " + f31969a);
        if (f31969a && keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 4:
                    return super.onKeyDown(i, keyEvent);
                case 66:
                    return super.onKeyDown(i, keyEvent);
                case 67:
                    C10291a.f32035b = true;
                    return super.onKeyDown(i, keyEvent);
                default:
                    if (keyEvent.getUnicodeChar() == 0) {
                        return super.onKeyDown(i, keyEvent);
                    }
                    if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
                        return super.onKeyDown(i, keyEvent);
                    }
                    this.f31970b = new KeyEvent(0, 17);
                    return super.onKeyDown(this.f31970b.getKeyCode(), this.f31970b);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
