package com.google.firebase.crash.internal;

import android.util.Log;
import com.google.firebase.crash.FirebaseCrash;
import java.lang.Thread;
/* renamed from: com.google.firebase.crash.internal.h */
/* loaded from: classes2.dex */
public class C9825h implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final FirebaseCrash f30640a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f30641b;

    public C9825h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, FirebaseCrash firebaseCrash) {
        this.f30640a = firebaseCrash;
        this.f30641b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Log.e("UncaughtException", "", th);
        try {
            try {
                this.f30640a.m6910c(th);
            } catch (C9811b e) {
                Log.v("UncaughtException", e.getMessage());
            }
        } catch (Exception e2) {
            Log.e("UncaughtException", "Ouch!  My own exception handler threw an exception.", e2);
        }
        if (this.f30641b != null) {
            this.f30641b.uncaughtException(thread, th);
        }
    }
}
