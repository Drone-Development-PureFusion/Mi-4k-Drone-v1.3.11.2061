package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.C4989m;
import com.google.android.gms.drive.events.AbstractC4813a;
import com.google.android.gms.drive.events.AbstractC4814b;
import com.google.android.gms.drive.events.AbstractC4817e;
import com.google.android.gms.drive.events.AbstractC4820h;
import com.google.android.gms.drive.events.AbstractC4826k;
import com.google.android.gms.drive.events.AbstractC4828m;
import com.google.android.gms.drive.events.AbstractC4830o;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.C4822a;
import com.google.android.gms.drive.internal.AbstractC4970p;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.drive.internal.f */
/* loaded from: classes2.dex */
public class BinderC4953f extends AbstractC4970p.AbstractBinderC4971a {

    /* renamed from: a */
    private final int f17948a;

    /* renamed from: b */
    private final AbstractC4820h f17949b;

    /* renamed from: c */
    private final HandlerC4955a f17950c;

    /* renamed from: d */
    private final List<Integer> f17951d = new ArrayList();

    /* renamed from: com.google.android.gms.drive.internal.f$a */
    /* loaded from: classes2.dex */
    private static class HandlerC4955a extends Handler {

        /* renamed from: a */
        private final Context f17952a;

        private HandlerC4955a(Looper looper, Context context) {
            super(looper);
            this.f17952a = context;
        }

        /* renamed from: a */
        private static void m22348a(AbstractC4830o abstractC4830o, QueryResultEventParcelable queryResultEventParcelable) {
            DataHolder m22672b = queryResultEventParcelable.m22672b();
            if (m22672b != null) {
                final C4989m c4989m = new C4989m(m22672b);
                abstractC4830o.m22637a(new AbstractC4828m() { // from class: com.google.android.gms.drive.internal.f.a.1
                });
            }
            if (queryResultEventParcelable.m22671c()) {
                abstractC4830o.m22638a(queryResultEventParcelable.m22670d());
            }
        }

        /* renamed from: a */
        public void m22349a(AbstractC4820h abstractC4820h, DriveEvent driveEvent) {
            sendMessage(obtainMessage(1, new Pair(abstractC4820h, driveEvent)));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    AbstractC4820h abstractC4820h = (AbstractC4820h) pair.first;
                    DriveEvent driveEvent = (DriveEvent) pair.second;
                    switch (driveEvent.mo22667a()) {
                        case 1:
                            ((AbstractC4813a) abstractC4820h).mo22666a((ChangeEvent) driveEvent);
                            return;
                        case 2:
                            ((AbstractC4814b) abstractC4820h).mo22665a((CompletionEvent) driveEvent);
                            return;
                        case 3:
                            m22348a((AbstractC4830o) abstractC4820h, (QueryResultEventParcelable) driveEvent);
                            return;
                        case 4:
                            ((AbstractC4817e) abstractC4820h).mo22658a((ChangesAvailableEvent) driveEvent);
                            return;
                        case 5:
                        case 6:
                        case 7:
                        default:
                            String valueOf = String.valueOf(driveEvent);
                            C4938by.m22378b("EventCallback", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unexpected event: ").append(valueOf).toString());
                            return;
                        case 8:
                            ((AbstractC4826k) abstractC4820h).m22642a(new C4822a(((TransferProgressEvent) driveEvent).m22668b()));
                            return;
                    }
                default:
                    C4938by.m22382a(this.f17952a, "EventCallback", "Don't know how to handle this event");
                    return;
            }
        }
    }

    public BinderC4953f(Looper looper, Context context, int i, AbstractC4820h abstractC4820h) {
        this.f17948a = i;
        this.f17949b = abstractC4820h;
        this.f17950c = new HandlerC4955a(looper, context);
    }

    /* renamed from: a */
    public void m22351a(int i) {
        this.f17951d.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.drive.internal.AbstractC4970p
    /* renamed from: a */
    public void mo22255a(OnEventResponse onEventResponse) {
        DriveEvent m22610a = onEventResponse.m22610a();
        C4588d.m23623a(this.f17948a == m22610a.mo22667a());
        C4588d.m23623a(this.f17951d.contains(Integer.valueOf(m22610a.mo22667a())));
        this.f17950c.m22349a(this.f17949b, m22610a);
    }

    /* renamed from: b */
    public boolean m22350b(int i) {
        return this.f17951d.contains(Integer.valueOf(i));
    }
}
