package com.fimi.soul.module.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1708a;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1977m;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.drive.AbstractC4808e;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class DroipMessageReceiver extends PushMessageReceiver {

    /* renamed from: a */
    private String f9947a;

    /* renamed from: b */
    private long f9948b = -1;

    /* renamed from: c */
    private String f9949c;

    /* renamed from: d */
    private String f9950d;

    /* renamed from: e */
    private String f9951e;

    /* renamed from: f */
    private String f9952f;

    /* renamed from: g */
    private String f9953g;

    /* renamed from: h */
    private String f9954h;

    /* renamed from: i */
    private String f9955i;

    /* renamed from: j */
    private String f9956j;

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        String str2 = (commandArguments == null || commandArguments.size() <= 1) ? null : commandArguments.get(1);
        if (MiPushClient.COMMAND_REGISTER.equals(command)) {
            if (miPushCommandMessage.getResultCode() != 0) {
                return;
            }
            this.f9947a = str;
            if (this.f9947a == null) {
                return;
            }
            C1977m m33357a = C1977m.m33357a(context);
            MessagePush messagePush = new MessagePush();
            messagePush.setUserID(C1756a.m34259c(context).getUserID());
            messagePush.setMiRegID(this.f9947a);
            messagePush.setAppType("0");
            m33357a.m33355a(messagePush, new AbstractC1945k() { // from class: com.fimi.soul.module.push.DroipMessageReceiver.1
                @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                /* renamed from: a */
                public void mo28106a(PlaneMsg planeMsg, File file) {
                }
            });
        } else if (MiPushClient.COMMAND_SET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() != 0) {
                return;
            }
            this.f9953g = str;
        } else if (MiPushClient.COMMAND_UNSET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() != 0) {
                return;
            }
            this.f9953g = str;
        } else if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() != 0) {
                return;
            }
            this.f9952f = str;
        } else if (MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() != 0) {
                return;
            }
            this.f9952f = str;
        } else if (!MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command) || miPushCommandMessage.getResultCode() != 0) {
        } else {
            this.f9955i = str;
            this.f9956j = str2;
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        this.f9951e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f9952f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.f9953g = miPushMessage.getAlias();
        } else if (!TextUtils.isEmpty(miPushMessage.getUserAccount())) {
            this.f9954h = miPushMessage.getUserAccount();
        }
        C3070c m29392a = C3070c.m29392a(context);
        HistoryPushMessage historyPushMessage = new HistoryPushMessage();
        historyPushMessage.setId(miPushMessage.getExtra().get("id"));
        if (m29392a.m29390b(historyPushMessage)) {
            return;
        }
        historyPushMessage.setTitle(miPushMessage.getTitle());
        historyPushMessage.setPayload(miPushMessage.getDescription());
        historyPushMessage.setRedirectURL(miPushMessage.getExtra().get("redirectURL"));
        historyPushMessage.setMsgType(miPushMessage.getExtra().get("msgType"));
        historyPushMessage.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
        m29392a.m29391a(historyPushMessage);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        this.f9951e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f9952f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.f9953g = miPushMessage.getAlias();
        } else if (TextUtils.isEmpty(miPushMessage.getUserAccount())) {
        } else {
            this.f9954h = miPushMessage.getUserAccount();
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceiveMessage(context, miPushMessage);
        String str = miPushMessage.getExtra().get("redirectURL");
        if (C3103au.m29237a(context, FlightActivity.class)) {
            if (!C3103au.m29184r(context)) {
                Intent intent = new Intent(context, MessageDetailActivity.class);
                intent.setFlags(AbstractC4808e.f17570a_);
                intent.putExtra("redirectURL", str);
                context.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent(context, FlightActivity.class);
            intent2.setFlags(AbstractC4808e.f17570a_);
            Intent intent3 = new Intent(context, MessageDetailActivity.class);
            intent3.putExtra("redirectURL", str);
            context.startActivities(new Intent[]{intent2, intent3});
        } else if (!C3103au.m29237a(context, LoginActivity.class)) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(C1708a.f4288b);
            launchIntentForPackage.setFlags(270532608);
            Bundle bundle = new Bundle();
            bundle.putString("redirectURL", str);
            bundle.putBoolean("islaunch", true);
            launchIntentForPackage.putExtra("launchBundle", bundle);
            context.startActivity(launchIntentForPackage);
        } else if (!C3103au.m29184r(context)) {
            Intent intent4 = new Intent(context, MessageDetailActivity.class);
            intent4.setFlags(AbstractC4808e.f17570a_);
            intent4.putExtra("redirectURL", str);
            context.startActivity(intent4);
        } else {
            Intent intent5 = new Intent(context, LoginActivity.class);
            if (C1642c.m34885e().m34499r() == 0) {
                intent5.putExtra(AbstractC1493b.f3577j, 2);
            } else {
                intent5.putExtra(AbstractC1493b.f3577j, 3);
            }
            intent5.setFlags(AbstractC4808e.f17570a_);
            Intent intent6 = new Intent(context, MessageDetailActivity.class);
            intent6.putExtra("redirectURL", str);
            context.startActivities(new Intent[]{intent5, intent6});
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        this.f9951e = miPushMessage.getContent();
        if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
            this.f9952f = miPushMessage.getTopic();
        } else if (!TextUtils.isEmpty(miPushMessage.getAlias())) {
            this.f9953g = miPushMessage.getAlias();
        } else if (TextUtils.isEmpty(miPushMessage.getUserAccount())) {
        } else {
            this.f9954h = miPushMessage.getUserAccount();
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            commandArguments.get(1);
        }
        if (!MiPushClient.COMMAND_REGISTER.equals(command) || miPushCommandMessage.getResultCode() != 0) {
            return;
        }
        this.f9947a = str;
    }
}
