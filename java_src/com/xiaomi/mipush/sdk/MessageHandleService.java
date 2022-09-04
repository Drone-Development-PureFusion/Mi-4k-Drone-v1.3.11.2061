package com.xiaomi.mipush.sdk;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public class MessageHandleService extends IntentService {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C10467a> f32537a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    /* loaded from: classes.dex */
    public static class C10467a {

        /* renamed from: a */
        private PushMessageReceiver f32538a;

        /* renamed from: b */
        private Intent f32539b;

        public C10467a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f32538a = pushMessageReceiver;
            this.f32539b = intent;
        }

        /* renamed from: a */
        public PushMessageReceiver m5048a() {
            return this.f32538a;
        }

        /* renamed from: b */
        public Intent m5047b() {
            return this.f32539b;
        }
    }

    public MessageHandleService() {
        super("MessageHandleThread");
    }

    public static void addJob(C10467a c10467a) {
        if (c10467a != null) {
            f32537a.add(c10467a);
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C10467a poll;
        if (intent == null || (poll = f32537a.poll()) == null) {
            return;
        }
        try {
            PushMessageReceiver m5048a = poll.m5048a();
            Intent m5047b = poll.m5047b();
            switch (m5047b.getIntExtra(PushMessageHelper.MESSAGE_TYPE, 1)) {
                case 1:
                    PushMessageHandler.AbstractC10468a m4952a = C10492s.m4955a(this).m4952a(m5047b);
                    if (m4952a == null) {
                        return;
                    }
                    if (!(m4952a instanceof MiPushMessage)) {
                        if (!(m4952a instanceof MiPushCommandMessage)) {
                            return;
                        }
                        MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) m4952a;
                        m5048a.onCommandResult(this, miPushCommandMessage);
                        if (!TextUtils.equals(miPushCommandMessage.getCommand(), MiPushClient.COMMAND_REGISTER)) {
                            return;
                        }
                        m5048a.onReceiveRegisterResult(this, miPushCommandMessage);
                        return;
                    }
                    MiPushMessage miPushMessage = (MiPushMessage) m4952a;
                    if (!miPushMessage.isArrivedMessage()) {
                        m5048a.onReceiveMessage(this, miPushMessage);
                    }
                    if (miPushMessage.getPassThrough() == 1) {
                        m5048a.onReceivePassThroughMessage(this, miPushMessage);
                        return;
                    } else if (miPushMessage.isNotified()) {
                        m5048a.onNotificationMessageClicked(this, miPushMessage);
                        return;
                    } else {
                        m5048a.onNotificationMessageArrived(this, miPushMessage);
                        return;
                    }
                case 2:
                default:
                    return;
                case 3:
                    MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) m5047b.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                    m5048a.onCommandResult(this, miPushCommandMessage2);
                    if (!TextUtils.equals(miPushCommandMessage2.getCommand(), MiPushClient.COMMAND_REGISTER)) {
                        return;
                    }
                    m5048a.onReceiveRegisterResult(this, miPushCommandMessage2);
                    return;
                case 4:
                    return;
            }
        } catch (RuntimeException e) {
            AbstractC10404b.m5267a(e);
        }
    }
}
