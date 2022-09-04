package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.util.C4702y;
import com.google.android.gms.drive.internal.AbstractC4970p;
import com.google.android.gms.drive.internal.C4938by;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public abstract class DriveEventService extends Service implements AbstractC4813a, AbstractC4814b, AbstractC4817e, AbstractC4834s {

    /* renamed from: a */
    public static final String f17600a = "com.google.android.gms.drive.events.HANDLE_EVENT";

    /* renamed from: b */
    HandlerC4811a f17601b;

    /* renamed from: c */
    boolean f17602c;

    /* renamed from: d */
    int f17603d;

    /* renamed from: e */
    private final String f17604e;

    /* renamed from: f */
    private CountDownLatch f17605f;

    /* renamed from: com.google.android.gms.drive.events.DriveEventService$a */
    /* loaded from: classes2.dex */
    final class HandlerC4811a extends Handler {
        HandlerC4811a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Message m22676a() {
            return obtainMessage(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Message m22673a(OnEventResponse onEventResponse) {
            return obtainMessage(1, onEventResponse);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4938by.m22380a("DriveEventService", new StringBuilder(38).append("handleMessage message type:").append(message.what).toString());
            switch (message.what) {
                case 1:
                    DriveEventService.this.m22679a((OnEventResponse) message.obj);
                    return;
                case 2:
                    getLooper().quit();
                    return;
                default:
                    C4938by.m22378b("DriveEventService", new StringBuilder(35).append("Unexpected message type:").append(message.what).toString());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.drive.events.DriveEventService$b */
    /* loaded from: classes2.dex */
    final class BinderC4812b extends AbstractC4970p.AbstractBinderC4971a {
        BinderC4812b() {
        }

        @Override // com.google.android.gms.drive.internal.AbstractC4970p
        /* renamed from: a */
        public void mo22255a(OnEventResponse onEventResponse) {
            synchronized (DriveEventService.this) {
                String valueOf = String.valueOf(onEventResponse);
                C4938by.m22380a("DriveEventService", new StringBuilder(String.valueOf(valueOf).length() + 9).append("onEvent: ").append(valueOf).toString());
                DriveEventService.this.m22678b();
                if (DriveEventService.this.f17601b != null) {
                    DriveEventService.this.f17601b.sendMessage(DriveEventService.this.f17601b.m22673a(onEventResponse));
                } else {
                    C4938by.m22377c("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.f17602c = false;
        this.f17603d = -1;
        this.f17604e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m22679a(OnEventResponse onEventResponse) {
        DriveEvent m22610a = onEventResponse.m22610a();
        String valueOf = String.valueOf(m22610a);
        C4938by.m22380a("DriveEventService", new StringBuilder(String.valueOf(valueOf).length() + 20).append("handleEventMessage: ").append(valueOf).toString());
        try {
            switch (m22610a.mo22667a()) {
                case 1:
                    mo22666a((ChangeEvent) m22610a);
                    break;
                case 2:
                    mo22665a((CompletionEvent) m22610a);
                    break;
                case 3:
                case 5:
                case 6:
                default:
                    String str = this.f17604e;
                    String valueOf2 = String.valueOf(m22610a);
                    C4938by.m22378b(str, new StringBuilder(String.valueOf(valueOf2).length() + 17).append("Unhandled event: ").append(valueOf2).toString());
                    break;
                case 4:
                    mo22658a((ChangesAvailableEvent) m22610a);
                    break;
                case 7:
                    m22680a((TransferStateEvent) m22610a);
                    break;
            }
        } catch (Exception e) {
            String str2 = this.f17604e;
            String valueOf3 = String.valueOf(m22610a);
            C4938by.m22379a(str2, e, new StringBuilder(String.valueOf(valueOf3).length() + 22).append("Error handling event: ").append(valueOf3).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m22678b() {
        int m22683a = m22683a();
        if (m22683a == this.f17603d) {
            return;
        }
        if (!C4702y.m23090a(this, m22683a)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.f17603d = m22683a;
    }

    /* renamed from: a */
    protected int m22683a() {
        return Binder.getCallingUid();
    }

    @Override // com.google.android.gms.drive.events.AbstractC4813a
    /* renamed from: a */
    public void mo22666a(ChangeEvent changeEvent) {
        String str = this.f17604e;
        String valueOf = String.valueOf(changeEvent);
        C4938by.m22378b(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unhandled change event: ").append(valueOf).toString());
    }

    @Override // com.google.android.gms.drive.events.AbstractC4817e
    /* renamed from: a */
    public void mo22658a(ChangesAvailableEvent changesAvailableEvent) {
        String str = this.f17604e;
        String valueOf = String.valueOf(changesAvailableEvent);
        C4938by.m22378b(str, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Unhandled changes available event: ").append(valueOf).toString());
    }

    @Override // com.google.android.gms.drive.events.AbstractC4814b
    /* renamed from: a */
    public void mo22665a(CompletionEvent completionEvent) {
        String str = this.f17604e;
        String valueOf = String.valueOf(completionEvent);
        C4938by.m22378b(str, new StringBuilder(String.valueOf(valueOf).length() + 28).append("Unhandled completion event: ").append(valueOf).toString());
    }

    /* renamed from: a */
    public void m22680a(TransferStateEvent transferStateEvent) {
        String str = this.f17604e;
        String valueOf = String.valueOf(transferStateEvent);
        C4938by.m22378b(str, new StringBuilder(String.valueOf(valueOf).length() + 32).append("Unhandled transfer state event: ").append(valueOf).toString());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.drive.events.DriveEventService$1] */
    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        IBinder iBinder;
        if (f17600a.equals(intent.getAction())) {
            if (this.f17601b == null && !this.f17602c) {
                this.f17602c = true;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f17605f = new CountDownLatch(1);
                new Thread() { // from class: com.google.android.gms.drive.events.DriveEventService.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Looper.prepare();
                            DriveEventService.this.f17601b = new HandlerC4811a();
                            DriveEventService.this.f17602c = false;
                            countDownLatch.countDown();
                            C4938by.m22380a("DriveEventService", "Bound and starting loop");
                            Looper.loop();
                            C4938by.m22380a("DriveEventService", "Finished loop");
                        } finally {
                            if (DriveEventService.this.f17605f != null) {
                                DriveEventService.this.f17605f.countDown();
                            }
                        }
                    }
                }.start();
                try {
                    if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                        C4938by.m22377c("DriveEventService", "Failed to synchronously initialize event handler.");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException("Unable to start event handler", e);
                }
            }
            iBinder = new BinderC4812b().asBinder();
        } else {
            iBinder = null;
        }
        return iBinder;
    }

    @Override // android.app.Service
    public synchronized void onDestroy() {
        C4938by.m22380a("DriveEventService", "onDestroy");
        if (this.f17601b != null) {
            this.f17601b.sendMessage(this.f17601b.m22676a());
            this.f17601b = null;
            try {
                if (!this.f17605f.await(5000L, TimeUnit.MILLISECONDS)) {
                    C4938by.m22378b("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (InterruptedException e) {
            }
            this.f17605f = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }
}
