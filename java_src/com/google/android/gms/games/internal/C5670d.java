package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.view.View;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.AbstractC5376e;
import com.google.android.gms.games.AbstractC5385g;
import com.google.android.gms.games.AbstractC5390h;
import com.google.android.gms.games.AbstractC5978n;
import com.google.android.gms.games.C5311a;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.C5384f;
import com.google.android.gms.games.C5932j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AbstractC5335c;
import com.google.android.gms.games.achievement.C5333a;
import com.google.android.gms.games.appcontent.AbstractC5351i;
import com.google.android.gms.games.event.AbstractC5382c;
import com.google.android.gms.games.event.C5380a;
import com.google.android.gms.games.internal.AbstractC5913k;
import com.google.android.gms.games.internal.experience.C5845a;
import com.google.android.gms.games.internal.game.C5901d;
import com.google.android.gms.games.internal.game.C5904g;
import com.google.android.gms.games.internal.p242b.C5659r;
import com.google.android.gms.games.internal.p244d.AbstractC5837a;
import com.google.android.gms.games.internal.p244d.AbstractC5840c;
import com.google.android.gms.games.internal.player.C5926d;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.request.C5929b;
import com.google.android.gms.games.multiplayer.AbstractC5940c;
import com.google.android.gms.games.multiplayer.AbstractC5943e;
import com.google.android.gms.games.multiplayer.C5938a;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5951a;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5952b;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5955d;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5960g;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5961h;
import com.google.android.gms.games.multiplayer.realtime.C5954c;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5964b;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g;
import com.google.android.gms.games.multiplayer.turnbased.C5963a;
import com.google.android.gms.games.multiplayer.turnbased.C5965c;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.p240a.AbstractC5312a;
import com.google.android.gms.games.p240a.AbstractC5316e;
import com.google.android.gms.games.p240a.AbstractC5326m;
import com.google.android.gms.games.p240a.C5313b;
import com.google.android.gms.games.p240a.C5314c;
import com.google.android.gms.games.p240a.C5317f;
import com.google.android.gms.games.p240a.C5321h;
import com.google.android.gms.games.p240a.C5331n;
import com.google.android.gms.games.quest.AbstractC5990e;
import com.google.android.gms.games.quest.AbstractC5991f;
import com.google.android.gms.games.quest.C5988c;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.request.AbstractC6000f;
import com.google.android.gms.games.request.AbstractC6001g;
import com.google.android.gms.games.request.C5995a;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.snapshot.AbstractC6009d;
import com.google.android.gms.games.snapshot.AbstractC6013g;
import com.google.android.gms.games.snapshot.C6008c;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.social.AbstractC6018a;
import com.google.android.gms.games.social.AbstractC6019b;
import com.google.android.gms.games.social.C6024c;
import com.google.android.gms.games.social.SocialInvite;
import com.google.android.gms.games.social.SocialInviteEntity;
import com.google.android.gms.games.stats.AbstractC6028c;
import com.google.android.gms.games.stats.C6026a;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.games.video.AbstractC6037f;
import com.google.android.gms.games.video.C6032a;
import com.google.android.gms.games.video.C6033b;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ahs;
import com.google.android.gms.internal.aht;
import com.google.android.gms.internal.ail;
import com.google.android.gms.signin.internal.C9016g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.games.internal.d */
/* loaded from: classes2.dex */
public final class C5670d extends AbstractC4638w<AbstractC5913k> {

    /* renamed from: e */
    private final String f19800e;

    /* renamed from: f */
    private PlayerEntity f19801f;

    /* renamed from: g */
    private GameEntity f19802g;

    /* renamed from: h */
    private final C5919n f19803h;

    /* renamed from: l */
    private final C5355c.C5365c f19807l;

    /* renamed from: a */
    AbstractC5840c f19799a = new AbstractC5840c() { // from class: com.google.android.gms.games.internal.d.1
        @Override // com.google.android.gms.games.internal.p244d.AbstractC5840c
        /* renamed from: a */
        public AbstractC5837a mo20026a() {
            return new C5688ap();
        }
    };

    /* renamed from: i */
    private boolean f19804i = false;

    /* renamed from: j */
    private final Binder f19805j = new Binder();

    /* renamed from: k */
    private final long f19806k = hashCode();

    /* renamed from: com.google.android.gms.games.internal.d$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5672a extends AbstractC5726c {

        /* renamed from: a */
        private final ArrayList<String> f19809a = new ArrayList<>();

        AbstractC5672a(DataHolder dataHolder, String[] strArr) {
            super(dataHolder);
            for (String str : strArr) {
                this.f19809a.add(str);
            }
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5726c
        /* renamed from: a */
        protected void mo20006a(AbstractC5960g abstractC5960g, Room room) {
            mo20012a(abstractC5960g, room, this.f19809a);
        }

        /* renamed from: a */
        protected abstract void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList);
    }

    /* renamed from: com.google.android.gms.games.internal.d$aa */
    /* loaded from: classes2.dex */
    private static final class C5673aa implements AbstractC4502m {
        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return null;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ab */
    /* loaded from: classes2.dex */
    private static final class BinderC5674ab extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6045h> f19810a;

        BinderC5674ab(ahl.AbstractC6344b<AbstractC6037f.AbstractC6045h> abstractC6344b) {
            this.f19810a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19902a(int i, String str, String str2) {
            this.f19810a.mo7413a(new C5675ac(new Status(i), str, str2));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ac */
    /* loaded from: classes2.dex */
    private static final class C5675ac implements AbstractC6037f.AbstractC6045h {

        /* renamed from: a */
        private final Status f19811a;

        /* renamed from: b */
        private final String f19812b;

        /* renamed from: c */
        private final String f19813c;

        C5675ac(Status status, String str, String str2) {
            this.f19811a = status;
            this.f19812b = str;
            this.f19813c = str2;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19811a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ad */
    /* loaded from: classes2.dex */
    private static final class BinderC5676ad extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6046i> f19814a;

        BinderC5676ad(ahl.AbstractC6344b<AbstractC6037f.AbstractC6046i> abstractC6344b) {
            this.f19814a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: f */
        public void mo19859f(int i, String str) {
            this.f19814a.mo7413a(new C5677ae(new Status(i), str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ae */
    /* loaded from: classes2.dex */
    private static final class C5677ae implements AbstractC6037f.AbstractC6046i {

        /* renamed from: a */
        private final Status f19815a;

        /* renamed from: b */
        private final String f19816b;

        C5677ae(Status status, String str) {
            this.f19815a = status;
            this.f19816b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19815a;
        }

        @Override // com.google.android.gms.games.video.AbstractC6037f.AbstractC6046i
        /* renamed from: b */
        public String mo18964b() {
            return this.f19816b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$af */
    /* loaded from: classes2.dex */
    private static final class C5678af extends AbstractC5696ax implements AbstractC5991f.AbstractC5993b {

        /* renamed from: a */
        private final Milestone f19817a;

        /* renamed from: d */
        private final Quest f19818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5678af(DataHolder dataHolder, String str) {
            super(dataHolder);
            C5988c c5988c = new C5988c(dataHolder);
            try {
                if (c5988c.c() > 0) {
                    this.f19818d = new QuestEntity(c5988c.a(0));
                    List<Milestone> mo19224i = this.f19818d.mo19224i();
                    int size = mo19224i.size();
                    for (int i = 0; i < size; i++) {
                        if (mo19224i.get(i).mo19245c().equals(str)) {
                            this.f19817a = mo19224i.get(i);
                            return;
                        }
                    }
                    this.f19817a = null;
                } else {
                    this.f19817a = null;
                    this.f19818d = null;
                }
            } finally {
                c5988c.b();
            }
        }

        @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5993b
        /* renamed from: c */
        public Milestone mo19194c() {
            return this.f19817a;
        }

        @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5993b
        /* renamed from: d */
        public Quest mo19193d() {
            return this.f19818d;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ag */
    /* loaded from: classes2.dex */
    private static final class C5679ag extends AbstractC5696ax implements AbstractC6013g.AbstractC6014a {

        /* renamed from: a */
        private final SnapshotMetadata f19819a;

        C5679ag(DataHolder dataHolder) {
            super(dataHolder);
            C6008c c6008c = new C6008c(dataHolder);
            try {
                if (c6008c.c() > 0) {
                    this.f19819a = new SnapshotMetadataEntity((SnapshotMetadata) c6008c.mo9715a(0));
                } else {
                    this.f19819a = null;
                }
            } finally {
                c6008c.b();
            }
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6014a
        /* renamed from: c */
        public SnapshotMetadata mo19072c() {
            return this.f19819a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ah */
    /* loaded from: classes2.dex */
    private static final class C5680ah extends AbstractC5726c {
        C5680ah(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5726c
        /* renamed from: a */
        public void mo20006a(AbstractC5960g abstractC5960g, Room room) {
            abstractC5960g.m19372c(room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ai */
    /* loaded from: classes2.dex */
    private static final class C5681ai extends AbstractC5696ax implements AbstractC5385g.AbstractC5386a {
        C5681ai(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$aj */
    /* loaded from: classes2.dex */
    private static final class BinderC5682aj extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5385g.AbstractC5386a> f19820a;

        BinderC5682aj(ahl.AbstractC6344b<AbstractC5385g.AbstractC5386a> abstractC6344b) {
            this.f19820a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: B */
        public void mo19934B(DataHolder dataHolder) {
            this.f19820a.mo7413a(new C5681ai(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ak */
    /* loaded from: classes2.dex */
    private static final class BinderC5683ak extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19821a;

        BinderC5683ak(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19821a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19888b(int i) {
            this.f19821a.mo7413a(C5384f.m20457a(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$al */
    /* loaded from: classes2.dex */
    private static final class BinderC5684al extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19822a;

        BinderC5684al(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19822a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: f */
        public void mo19861f(int i) {
            this.f19822a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$am */
    /* loaded from: classes2.dex */
    private static final class C5685am implements AbstractC6013g.AbstractC6015b {

        /* renamed from: a */
        private final Status f19823a;

        /* renamed from: b */
        private final String f19824b;

        C5685am(int i, String str) {
            this.f19823a = C5384f.m20457a(i);
            this.f19824b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19823a;
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6015b
        /* renamed from: b */
        public String mo19071b() {
            return this.f19824b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$an */
    /* loaded from: classes2.dex */
    private static final class C5686an extends AbstractC5726c {
        C5686an(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5726c
        /* renamed from: a */
        public void mo20006a(AbstractC5960g abstractC5960g, Room room) {
            abstractC5960g.m19370d(room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ao */
    /* loaded from: classes2.dex */
    private static final class BinderC5687ao extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5382c.AbstractC5383a> f19825a;

        BinderC5687ao(ahl.AbstractC6344b<AbstractC5382c.AbstractC5383a> abstractC6344b) {
            this.f19825a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19884b(DataHolder dataHolder) {
            this.f19825a.mo7413a(new C5724by(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ap */
    /* loaded from: classes2.dex */
    private class C5688ap extends AbstractC5837a {
        public C5688ap() {
            super(C5670d.this.B().getMainLooper(), 1000);
        }

        @Override // com.google.android.gms.games.internal.p244d.AbstractC5837a
        /* renamed from: a */
        protected void mo20035a(String str, int i) {
            try {
                if (C5670d.this.t()) {
                    ((AbstractC5913k) C5670d.this.G()).mo19659e(str, i);
                } else {
                    C5906h.m19938b("GamesClientImpl", new StringBuilder(String.valueOf(str).length() + 89).append("Unable to increment event ").append(str).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                }
            } catch (RemoteException e) {
                C5670d.this.m20198a(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$aq */
    /* loaded from: classes2.dex */
    private static final class BinderC5689aq extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5376e.AbstractC5377a> f19827a;

        BinderC5689aq(ahl.AbstractC6344b<AbstractC5376e.AbstractC5377a> abstractC6344b) {
            this.f19827a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: i */
        public void mo19850i(DataHolder dataHolder) {
            this.f19827a.mo7413a(new C5725bz(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ar */
    /* loaded from: classes2.dex */
    private static final class C5690ar implements AbstractC5385g.AbstractC5387b {

        /* renamed from: a */
        private final Status f19828a;

        /* renamed from: b */
        private final String f19829b;

        /* renamed from: c */
        private final boolean f19830c;

        public C5690ar(int i, String str, boolean z) {
            this.f19828a = C5384f.m20457a(i);
            this.f19829b = str;
            this.f19830c = z;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19828a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$as */
    /* loaded from: classes2.dex */
    private static final class BinderC5691as extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5385g.AbstractC5387b> f19831a;

        BinderC5691as(ahl.AbstractC6344b<AbstractC5385g.AbstractC5387b> abstractC6344b) {
            this.f19831a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19901a(int i, String str, boolean z) {
            this.f19831a.mo7413a(new C5690ar(i, str, z));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$at */
    /* loaded from: classes2.dex */
    private static final class C5692at implements AbstractC5385g.AbstractC5388c {

        /* renamed from: a */
        private final Status f19832a;

        /* renamed from: b */
        private final String f19833b;

        /* renamed from: c */
        private final boolean f19834c;

        public C5692at(DataHolder dataHolder) {
            try {
                this.f19832a = C5384f.m20457a(dataHolder.m23883e());
                if (dataHolder.m23879g() > 0) {
                    this.f19833b = dataHolder.m23886c("external_game_id", 0, 0);
                    this.f19834c = dataHolder.m23884d("muted", 0, 0);
                } else {
                    this.f19833b = null;
                    this.f19834c = false;
                }
            } finally {
                dataHolder.close();
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19832a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$au */
    /* loaded from: classes2.dex */
    private static final class BinderC5693au extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5385g.AbstractC5388c> f19835a;

        BinderC5693au(ahl.AbstractC6344b<AbstractC5385g.AbstractC5388c> abstractC6344b) {
            this.f19835a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: z */
        public void mo19831z(DataHolder dataHolder) {
            this.f19835a.mo7413a(new C5692at(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$av */
    /* loaded from: classes2.dex */
    private static final class BinderC5694av extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5376e.AbstractC5378b> f19836a;

        BinderC5694av(ahl.AbstractC6344b<AbstractC5376e.AbstractC5378b> abstractC6344b) {
            this.f19836a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: j */
        public void mo19848j(DataHolder dataHolder) {
            this.f19836a.mo7413a(new C5727ca(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$aw */
    /* loaded from: classes2.dex */
    private static final class BinderC5695aw extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5985g> f19837a;

        BinderC5695aw(ahl.AbstractC6344b<AbstractC5978n.AbstractC5985g> abstractC6344b) {
            this.f19837a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: f */
        public void mo19860f(int i, Bundle bundle) {
            this.f19837a.mo7413a(new C5812fe(i, bundle));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ax */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5696ax extends aht {
        protected AbstractC5696ax(DataHolder dataHolder) {
            super(dataHolder, C5384f.m20457a(dataHolder.m23883e()));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ay */
    /* loaded from: classes2.dex */
    private static final class BinderC5697ay extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5376e.AbstractC5379c> f19838a;

        BinderC5697ay(ahl.AbstractC6344b<AbstractC5376e.AbstractC5379c> abstractC6344b) {
            this.f19838a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: g */
        public void mo19854g(DataHolder dataHolder) {
            this.f19838a.mo7413a(new C5728cb(dataHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.games.internal.d$az */
    /* loaded from: classes2.dex */
    public static final class BinderC5698az extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<C5355c.AbstractC5372g> f19839a;

        public BinderC5698az(ahl.AbstractC6344b<C5355c.AbstractC5372g> abstractC6344b) {
            this.f19839a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19903a(int i, String str) {
            this.f19839a.mo7413a(new C5702bc(C5384f.m20457a(i), str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5699b extends ahs<AbstractC5961h> {
        AbstractC5699b(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahs
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo17424a(AbstractC5961h abstractC5961h, DataHolder dataHolder) {
            mo20005a(abstractC5961h, C5670d.m20135b(dataHolder), dataHolder.m23883e());
        }

        /* renamed from: a */
        protected abstract void mo20005a(AbstractC5961h abstractC5961h, Room room, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.games.internal.d$ba */
    /* loaded from: classes2.dex */
    public static final class BinderC5700ba extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<C5355c.AbstractC5369e> f19840a;

        public BinderC5700ba(ahl.AbstractC6344b<C5355c.AbstractC5369e> abstractC6344b) {
            this.f19840a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19903a(int i, String str) {
            this.f19840a.mo7413a(new C5701bb(C5384f.m20457a(i), str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bb */
    /* loaded from: classes2.dex */
    private static final class C5701bb implements C5355c.AbstractC5369e {

        /* renamed from: a */
        private final Status f19841a;

        /* renamed from: b */
        private final String f19842b;

        C5701bb(Status status, String str) {
            this.f19841a = status;
            this.f19842b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19841a;
        }

        @Override // com.google.android.gms.games.C5355c.AbstractC5369e
        /* renamed from: b */
        public String mo20033b() {
            return this.f19842b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bc */
    /* loaded from: classes2.dex */
    private static final class C5702bc implements C5355c.AbstractC5372g {

        /* renamed from: a */
        private final Status f19843a;

        /* renamed from: b */
        private final String f19844b;

        C5702bc(Status status, String str) {
            this.f19843a = status;
            this.f19844b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19843a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bd */
    /* loaded from: classes2.dex */
    private static final class BinderC5703bd extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19845a;

        BinderC5703bd(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19845a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19885b(Status status) {
            this.f19845a.mo7413a(status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$be */
    /* loaded from: classes2.dex */
    private static final class BinderC5704be extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> f19846a;

        BinderC5704be(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b) {
            this.f19846a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: W */
        public void mo19913W(DataHolder dataHolder) {
            this.f19846a.mo7413a(new C5712bm(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bf */
    /* loaded from: classes2.dex */
    private static final class C5705bf implements AbstractC5385g.AbstractC5389d {

        /* renamed from: a */
        private final Status f19847a;

        /* renamed from: b */
        private final Bundle f19848b;

        C5705bf(Status status, Bundle bundle) {
            this.f19847a = status;
            this.f19848b = bundle;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19847a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bg */
    /* loaded from: classes2.dex */
    private static final class BinderC5706bg extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5385g.AbstractC5389d> f19849a;

        BinderC5706bg(ahl.AbstractC6344b<AbstractC5385g.AbstractC5389d> abstractC6344b) {
            this.f19849a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19866e(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f19849a.mo7413a(new C5705bf(C5384f.m20457a(i), bundle));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bh */
    /* loaded from: classes2.dex */
    private static final class C5707bh extends AbstractC5806ez implements AbstractC5971g.AbstractC5973b {
        C5707bh(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bi */
    /* loaded from: classes2.dex */
    private static final class BinderC5708bi extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<AbstractC5943e> f19850a;

        BinderC5708bi(ail<AbstractC5943e> ailVar) {
            this.f19850a = ailVar;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19891a(String str) {
            this.f19850a.m17214a(new C5710bk(str));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: l */
        public void mo19845l(DataHolder dataHolder) {
            C5938a c5938a = new C5938a(dataHolder);
            Invitation invitation = null;
            try {
                if (c5938a.c() > 0) {
                    invitation = c5938a.a(0).a();
                }
                if (invitation == null) {
                    return;
                }
                this.f19850a.m17214a(new C5709bj(invitation));
            } finally {
                c5938a.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bj */
    /* loaded from: classes2.dex */
    private static final class C5709bj implements ail.AbstractC6386c<AbstractC5943e> {

        /* renamed from: a */
        private final Invitation f19851a;

        C5709bj(Invitation invitation) {
            this.f19851a = invitation;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5943e abstractC5943e) {
            abstractC5943e.m19454a(this.f19851a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bk */
    /* loaded from: classes2.dex */
    private static final class C5710bk implements ail.AbstractC6386c<AbstractC5943e> {

        /* renamed from: a */
        private final String f19852a;

        C5710bk(String str) {
            this.f19852a = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5943e abstractC5943e) {
            abstractC5943e.m19453a(this.f19852a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bl */
    /* loaded from: classes2.dex */
    private static final class BinderC5711bl extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5940c.AbstractC5941a> f19853a;

        BinderC5711bl(ahl.AbstractC6344b<AbstractC5940c.AbstractC5941a> abstractC6344b) {
            this.f19853a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: k */
        public void mo19846k(DataHolder dataHolder) {
            this.f19853a.mo7413a(new C5729cc(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bm */
    /* loaded from: classes2.dex */
    private static final class C5712bm extends AbstractC5696ax implements AbstractC6019b.AbstractC6022c {

        /* renamed from: a */
        private final SocialInvite f19854a;

        C5712bm(DataHolder dataHolder) {
            super(dataHolder);
            C6024c c6024c = new C6024c(dataHolder);
            try {
                if (c6024c.c() > 0) {
                    this.f19854a = new SocialInviteEntity((SocialInvite) c6024c.mo9715a(0));
                } else {
                    this.f19854a = null;
                }
            } finally {
                c6024c.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bn */
    /* loaded from: classes2.dex */
    private static final class BinderC5713bn extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6019b.AbstractC6023d> f19855a;

        BinderC5713bn(ahl.AbstractC6344b<AbstractC6019b.AbstractC6023d> abstractC6344b) {
            this.f19855a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: aa */
        public void mo19889aa(DataHolder dataHolder) {
            this.f19855a.mo7413a(new C5730cd(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bo */
    /* loaded from: classes2.dex */
    private static final class C5714bo extends AbstractC5699b {
        public C5714bo(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5699b
        /* renamed from: a */
        public void mo20005a(AbstractC5961h abstractC5961h, Room room, int i) {
            abstractC5961h.m19364b(i, room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bp */
    /* loaded from: classes2.dex */
    private static final class C5715bp extends AbstractC5696ax implements AbstractC5326m.AbstractC5327a {

        /* renamed from: a */
        private final C5313b f19856a;

        C5715bp(DataHolder dataHolder) {
            super(dataHolder);
            this.f19856a = new C5313b(dataHolder);
        }

        @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5327a
        /* renamed from: c */
        public C5313b mo20030c() {
            return this.f19856a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bq */
    /* loaded from: classes2.dex */
    private static final class BinderC5716bq extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> f19857a;

        BinderC5716bq(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b) {
            this.f19857a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19896a(DataHolder dataHolder, DataHolder dataHolder2) {
            this.f19857a.mo7413a(new C5739cm(dataHolder, dataHolder2));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$br */
    /* loaded from: classes2.dex */
    private static final class BinderC5717br extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> f19858a;

        BinderC5717br(ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> abstractC6344b) {
            this.f19858a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19877c(DataHolder dataHolder) {
            this.f19858a.mo7413a(new C5715bp(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bs */
    /* loaded from: classes2.dex */
    private static final class C5718bs extends AbstractC5806ez implements AbstractC5971g.AbstractC5974c {
        C5718bs(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bt */
    /* loaded from: classes2.dex */
    private static final class C5719bt implements ail.AbstractC6386c<AbstractC5961h> {

        /* renamed from: a */
        private final int f19859a;

        /* renamed from: b */
        private final String f19860b;

        C5719bt(int i, String str) {
            this.f19859a = i;
            this.f19860b = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5961h abstractC5961h) {
            abstractC5961h.m19365a(this.f19859a, this.f19860b);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bu */
    /* loaded from: classes2.dex */
    private static final class BinderC5720bu extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6047j> f19861a;

        BinderC5720bu(ahl.AbstractC6344b<AbstractC6037f.AbstractC6047j> abstractC6344b) {
            this.f19861a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: Q */
        public void mo19919Q(DataHolder dataHolder) {
            this.f19861a.mo7413a(new C5721bv(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bv */
    /* loaded from: classes2.dex */
    private static final class C5721bv extends AbstractC5696ax implements AbstractC6037f.AbstractC6047j {

        /* renamed from: a */
        private final C6033b f19862a;

        public C5721bv(DataHolder dataHolder) {
            super(dataHolder);
            this.f19862a = new C6033b(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bw */
    /* loaded from: classes2.dex */
    private static final class C5722bw extends AbstractC5696ax implements AbstractC5335c.AbstractC5336a {

        /* renamed from: a */
        private final C5333a f19863a;

        C5722bw(DataHolder dataHolder) {
            super(dataHolder);
            this.f19863a = new C5333a(dataHolder);
        }

        @Override // com.google.android.gms.games.achievement.AbstractC5335c.AbstractC5336a
        /* renamed from: c */
        public C5333a mo20028c() {
            return this.f19863a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bx */
    /* loaded from: classes2.dex */
    private static final class C5723bx extends AbstractC5696ax implements AbstractC5351i.AbstractC5352a {

        /* renamed from: a */
        private final ArrayList<DataHolder> f19864a;

        C5723bx(DataHolder[] dataHolderArr) {
            super(dataHolderArr[0]);
            this.f19864a = new ArrayList<>(Arrays.asList(dataHolderArr));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$by */
    /* loaded from: classes2.dex */
    private static final class C5724by extends AbstractC5696ax implements AbstractC5382c.AbstractC5383a {

        /* renamed from: a */
        private final C5380a f19865a;

        C5724by(DataHolder dataHolder) {
            super(dataHolder);
            this.f19865a = new C5380a(dataHolder);
        }

        @Override // com.google.android.gms.games.event.AbstractC5382c.AbstractC5383a
        /* renamed from: c */
        public C5380a mo20027c() {
            return this.f19865a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$bz */
    /* loaded from: classes2.dex */
    private static final class C5725bz extends AbstractC5696ax implements AbstractC5376e.AbstractC5377a {

        /* renamed from: a */
        private final C5901d f19866a;

        C5725bz(DataHolder dataHolder) {
            super(dataHolder);
            this.f19866a = new C5901d(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5726c extends ahs<AbstractC5960g> {
        AbstractC5726c(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahs
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo17424a(AbstractC5960g abstractC5960g, DataHolder dataHolder) {
            mo20006a(abstractC5960g, C5670d.m20135b(dataHolder));
        }

        /* renamed from: a */
        protected abstract void mo20006a(AbstractC5960g abstractC5960g, Room room);
    }

    /* renamed from: com.google.android.gms.games.internal.d$ca */
    /* loaded from: classes2.dex */
    private static final class C5727ca extends AbstractC5696ax implements AbstractC5376e.AbstractC5378b {

        /* renamed from: a */
        private final C5904g f19867a;

        C5727ca(DataHolder dataHolder) {
            super(dataHolder);
            this.f19867a = new C5904g(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cb */
    /* loaded from: classes2.dex */
    private static final class C5728cb extends AbstractC5696ax implements AbstractC5376e.AbstractC5379c {

        /* renamed from: a */
        private final C5311a f19868a;

        C5728cb(DataHolder dataHolder) {
            super(dataHolder);
            this.f19868a = new C5311a(dataHolder);
        }

        @Override // com.google.android.gms.games.AbstractC5376e.AbstractC5379c
        /* renamed from: c */
        public C5311a mo20022c() {
            return this.f19868a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cc */
    /* loaded from: classes2.dex */
    private static final class C5729cc extends AbstractC5696ax implements AbstractC5940c.AbstractC5941a {

        /* renamed from: a */
        private final C5938a f19869a;

        C5729cc(DataHolder dataHolder) {
            super(dataHolder);
            this.f19869a = new C5938a(dataHolder);
        }

        @Override // com.google.android.gms.games.multiplayer.AbstractC5940c.AbstractC5941a
        /* renamed from: c */
        public C5938a mo19455c() {
            return this.f19869a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cd */
    /* loaded from: classes2.dex */
    private static final class C5730cd extends AbstractC5696ax implements AbstractC6019b.AbstractC6023d {

        /* renamed from: a */
        private final C6024c f19870a;

        C5730cd(DataHolder dataHolder) {
            super(dataHolder);
            this.f19870a = new C6024c(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ce */
    /* loaded from: classes2.dex */
    private static final class C5731ce extends AbstractC5806ez implements AbstractC5971g.AbstractC5975d {
        C5731ce(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cf */
    /* loaded from: classes2.dex */
    private static final class C5732cf implements AbstractC5971g.AbstractC5976e {

        /* renamed from: a */
        private final Status f19871a;

        /* renamed from: b */
        private final C5963a f19872b;

        C5732cf(Status status, Bundle bundle) {
            this.f19871a = status;
            this.f19872b = new C5963a(bundle);
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19871a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            this.f19872b.m19318f();
        }

        @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5976e
        /* renamed from: c */
        public C5963a mo19271c() {
            return this.f19872b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cg */
    /* loaded from: classes2.dex */
    private static final class C5733cg extends AbstractC5696ax implements AbstractC5326m.AbstractC5328b {

        /* renamed from: a */
        private final C5321h f19873a;

        C5733cg(DataHolder dataHolder) {
            super(dataHolder);
            C5317f c5317f = new C5317f(dataHolder);
            try {
                if (c5317f.c() > 0) {
                    this.f19873a = (C5321h) ((AbstractC5316e) c5317f.mo9715a(0)).a();
                } else {
                    this.f19873a = null;
                }
            } finally {
                c5317f.b();
            }
        }

        @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5328b
        /* renamed from: c */
        public AbstractC5316e mo20021c() {
            return this.f19873a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ch */
    /* loaded from: classes2.dex */
    private static final class C5734ch extends AbstractC5696ax implements AbstractC6028c.AbstractC6029a {

        /* renamed from: a */
        private final PlayerStats f19874a;

        C5734ch(DataHolder dataHolder) {
            super(dataHolder);
            C6026a c6026a = new C6026a(dataHolder);
            try {
                if (c6026a.c() > 0) {
                    this.f19874a = new PlayerStatsEntity((PlayerStats) c6026a.mo9715a(0));
                } else {
                    this.f19874a = null;
                }
            } finally {
                c6026a.b();
            }
        }

        @Override // com.google.android.gms.games.stats.AbstractC6028c.AbstractC6029a
        /* renamed from: c */
        public PlayerStats mo19026c() {
            return this.f19874a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ci */
    /* loaded from: classes2.dex */
    private static final class C5735ci extends AbstractC5696ax implements AbstractC5978n.AbstractC5979a {

        /* renamed from: a */
        private final C5932j f19875a;

        C5735ci(DataHolder dataHolder) {
            super(dataHolder);
            this.f19875a = new C5932j(dataHolder);
        }

        @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5979a
        /* renamed from: c */
        public C5932j mo19258c() {
            return this.f19875a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cj */
    /* loaded from: classes2.dex */
    private static final class C5736cj extends AbstractC5696ax implements AbstractC5991f.AbstractC5994c {

        /* renamed from: a */
        private final DataHolder f19876a;

        C5736cj(DataHolder dataHolder) {
            super(dataHolder);
            this.f19876a = dataHolder;
        }

        @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5994c
        /* renamed from: c */
        public C5988c mo19192c() {
            return new C5988c(this.f19876a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ck */
    /* loaded from: classes2.dex */
    private static final class C5737ck extends AbstractC5696ax implements AbstractC6001g.AbstractC6002a {
        C5737ck(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cl */
    /* loaded from: classes2.dex */
    private static final class C5738cl implements AbstractC6001g.AbstractC6003b {

        /* renamed from: a */
        private final Status f19877a;

        /* renamed from: b */
        private final Bundle f19878b;

        C5738cl(Status status, Bundle bundle) {
            this.f19877a = status;
            this.f19878b = bundle;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19877a;
        }

        @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6003b
        /* renamed from: a */
        public C5995a mo19152a(int i) {
            String m20226a = C5659r.m20226a(i);
            if (!this.f19878b.containsKey(m20226a)) {
                return null;
            }
            return new C5995a((DataHolder) this.f19878b.get(m20226a));
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            for (String str : this.f19878b.keySet()) {
                DataHolder dataHolder = (DataHolder) this.f19878b.getParcelable(str);
                if (dataHolder != null) {
                    dataHolder.close();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cm */
    /* loaded from: classes2.dex */
    private static final class C5739cm extends AbstractC5696ax implements AbstractC5326m.AbstractC5329c {

        /* renamed from: a */
        private final C5314c f19879a;

        /* renamed from: d */
        private final C5317f f19880d;

        C5739cm(DataHolder dataHolder, DataHolder dataHolder2) {
            super(dataHolder2);
            C5313b c5313b = new C5313b(dataHolder);
            try {
                if (c5313b.c() > 0) {
                    this.f19879a = (C5314c) c5313b.a(0).a();
                } else {
                    this.f19879a = null;
                }
                c5313b.b();
                this.f19880d = new C5317f(dataHolder2);
            } catch (Throwable th) {
                c5313b.b();
                throw th;
            }
        }

        @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5329c
        /* renamed from: c */
        public AbstractC5312a mo20020c() {
            return this.f19879a;
        }

        @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5329c
        /* renamed from: d */
        public C5317f mo20019d() {
            return this.f19880d;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cn */
    /* loaded from: classes2.dex */
    private static final class C5740cn extends AbstractC5696ax implements AbstractC6013g.AbstractC6016c {
        C5740cn(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6016c
        /* renamed from: c */
        public C6008c mo19070c() {
            return new C6008c(this.f21788c);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$co */
    /* loaded from: classes2.dex */
    private static final class C5741co extends AbstractC5696ax implements AbstractC5978n.AbstractC5981c {

        /* renamed from: a */
        private final C5926d f19881a;

        C5741co(DataHolder dataHolder) {
            super(dataHolder);
            this.f19881a = new C5926d(dataHolder);
        }

        @Override // com.google.android.gms.internal.aht, com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21787b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cp */
    /* loaded from: classes2.dex */
    private static final class C5742cp implements AbstractC5978n.AbstractC5982d {

        /* renamed from: a */
        private final Status f19882a;

        /* renamed from: b */
        private final List<String> f19883b;

        /* renamed from: c */
        private final Bundle f19884c;

        C5742cp(Status status, Bundle bundle) {
            this.f19882a = status;
            this.f19883b = bundle.getStringArrayList("game_category_list");
            this.f19884c = bundle;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19882a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cq */
    /* loaded from: classes2.dex */
    private static final class C5743cq extends AbstractC5696ax implements AbstractC5978n.AbstractC5984f {

        /* renamed from: a */
        private final C5845a f19885a;

        C5743cq(DataHolder dataHolder) {
            super(dataHolder);
            this.f19885a = new C5845a(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cr */
    /* loaded from: classes2.dex */
    private static final class C5744cr implements ail.AbstractC6386c<AbstractC5964b> {

        /* renamed from: a */
        private final String f19886a;

        C5744cr(String str) {
            this.f19886a = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5964b abstractC5964b) {
            abstractC5964b.m19315a(this.f19886a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cs */
    /* loaded from: classes2.dex */
    private static final class BinderC5745cs extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<AbstractC5964b> f19887a;

        BinderC5745cs(ail<AbstractC5964b> ailVar) {
            this.f19887a = ailVar;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19875c(String str) {
            this.f19887a.m17214a(new C5744cr(str));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: r */
        public void mo19839r(DataHolder dataHolder) {
            C5965c c5965c = new C5965c(dataHolder);
            TurnBasedMatch turnBasedMatch = null;
            try {
                if (c5965c.c() > 0) {
                    turnBasedMatch = c5965c.a(0).a();
                }
                if (turnBasedMatch == null) {
                    return;
                }
                this.f19887a.m17214a(new C5746ct(turnBasedMatch));
            } finally {
                c5965c.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ct */
    /* loaded from: classes2.dex */
    private static final class C5746ct implements ail.AbstractC6386c<AbstractC5964b> {

        /* renamed from: a */
        private final TurnBasedMatch f19888a;

        C5746ct(TurnBasedMatch turnBasedMatch) {
            this.f19888a = turnBasedMatch;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5964b abstractC5964b) {
            abstractC5964b.m19316a(this.f19888a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cu */
    /* loaded from: classes2.dex */
    private static final class C5747cu implements ail.AbstractC6386c<AbstractC5951a> {

        /* renamed from: a */
        private final RealTimeMessage f19889a;

        C5747cu(RealTimeMessage realTimeMessage) {
            this.f19889a = realTimeMessage;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5951a abstractC5951a) {
            abstractC5951a.m19413a(this.f19889a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cv */
    /* loaded from: classes2.dex */
    private static final class C5748cv implements ail.AbstractC6386c<AbstractC5390h> {
        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5390h abstractC5390h) {
            abstractC5390h.m20455a(null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cw */
    /* loaded from: classes2.dex */
    private static final class C5749cw extends AbstractC5696ax implements AbstractC6013g.AbstractC6017d {

        /* renamed from: a */
        private final Snapshot f19890a;

        /* renamed from: d */
        private final String f19891d;

        /* renamed from: e */
        private final Snapshot f19892e;

        /* renamed from: f */
        private final Contents f19893f;

        /* renamed from: g */
        private final SnapshotContents f19894g;

        C5749cw(DataHolder dataHolder, Contents contents) {
            this(dataHolder, null, contents, null, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5749cw(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            super(dataHolder);
            boolean z = true;
            C6008c c6008c = new C6008c(dataHolder);
            try {
                if (c6008c.c() == 0) {
                    this.f19890a = null;
                    this.f19892e = null;
                } else if (c6008c.c() == 1) {
                    C4598n.m23593a(dataHolder.m23883e() == 4004 ? false : z);
                    this.f19890a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) c6008c.mo9715a(0)), new SnapshotContentsEntity(contents));
                    this.f19892e = null;
                } else {
                    this.f19890a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) c6008c.mo9715a(0)), new SnapshotContentsEntity(contents));
                    this.f19892e = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) c6008c.mo9715a(1)), new SnapshotContentsEntity(contents2));
                }
                c6008c.b();
                this.f19891d = str;
                this.f19893f = contents3;
                this.f19894g = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                c6008c.b();
                throw th;
            }
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
        /* renamed from: c */
        public Snapshot mo19069c() {
            return this.f19890a;
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
        /* renamed from: d */
        public String mo19068d() {
            return this.f19891d;
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
        /* renamed from: e */
        public Snapshot mo19067e() {
            return this.f19892e;
        }

        @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
        /* renamed from: f */
        public SnapshotContents mo19066f() {
            return this.f19894g;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cx */
    /* loaded from: classes2.dex */
    private static final class C5750cx implements ail.AbstractC6386c<AbstractC5960g> {

        /* renamed from: a */
        private final String f19895a;

        C5750cx(String str) {
            this.f19895a = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5960g abstractC5960g) {
            abstractC5960g.m19376a(this.f19895a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cy */
    /* loaded from: classes2.dex */
    private static final class C5751cy implements ail.AbstractC6386c<AbstractC5960g> {

        /* renamed from: a */
        private final String f19896a;

        C5751cy(String str) {
            this.f19896a = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5960g abstractC5960g) {
            abstractC5960g.m19373b(this.f19896a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$cz */
    /* loaded from: classes2.dex */
    private static final class C5752cz extends AbstractC5672a {
        C5752cz(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19368e(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$d */
    /* loaded from: classes2.dex */
    private static final class BinderC5753d extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> f19897a;

        BinderC5753d(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b) {
            this.f19897a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: T */
        public void mo19916T(DataHolder dataHolder) {
            this.f19897a.mo7413a(new C5712bm(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$da */
    /* loaded from: classes2.dex */
    private static final class C5754da extends AbstractC5672a {
        C5754da(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19374b(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$db */
    /* loaded from: classes2.dex */
    private static final class C5755db extends AbstractC5672a {
        C5755db(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19367f(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dc */
    /* loaded from: classes2.dex */
    private static final class C5756dc extends AbstractC5672a {
        C5756dc(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19377a(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dd */
    /* loaded from: classes2.dex */
    private static final class C5757dd extends AbstractC5672a {
        C5757dd(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19371c(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$de */
    /* loaded from: classes2.dex */
    private static final class C5758de extends AbstractC5672a {
        C5758de(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5672a
        /* renamed from: a */
        protected void mo20012a(AbstractC5960g abstractC5960g, Room room, ArrayList<String> arrayList) {
            abstractC5960g.m19369d(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$df */
    /* loaded from: classes2.dex */
    private static final class BinderC5759df extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5326m.AbstractC5328b> f19898a;

        BinderC5759df(ahl.AbstractC6344b<AbstractC5326m.AbstractC5328b> abstractC6344b) {
            this.f19898a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: C */
        public void mo19933C(DataHolder dataHolder) {
            this.f19898a.mo7413a(new C5733cg(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dg */
    /* loaded from: classes2.dex */
    private static final class BinderC5760dg extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6028c.AbstractC6029a> f19899a;

        public BinderC5760dg(ahl.AbstractC6344b<AbstractC6028c.AbstractC6029a> abstractC6344b) {
            this.f19899a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: P */
        public void mo19920P(DataHolder dataHolder) {
            this.f19899a.mo7413a(new C5734ch(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dh */
    /* loaded from: classes2.dex */
    private static final class BinderC5761dh extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> f19900a;

        BinderC5761dh(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b) {
            this.f19900a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: Y */
        public void mo19911Y(DataHolder dataHolder) {
            this.f19900a.mo7413a(new C5735ci(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$di */
    /* loaded from: classes2.dex */
    private static final class BinderC5762di extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5982d> f19901a;

        BinderC5762di(ahl.AbstractC6344b<AbstractC5978n.AbstractC5982d> abstractC6344b) {
            this.f19901a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19873d(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f19901a.mo7413a(new C5742cp(C5384f.m20457a(i), bundle));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dj */
    /* loaded from: classes2.dex */
    static final class BinderC5763dj extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5984f> f19902a;

        BinderC5763dj(ahl.AbstractC6344b<AbstractC5978n.AbstractC5984f> abstractC6344b) {
            this.f19902a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: N */
        public void mo19922N(DataHolder dataHolder) {
            this.f19902a.mo7413a(new C5743cq(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dk */
    /* loaded from: classes2.dex */
    private static final class BinderC5764dk extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> f19903a;

        BinderC5764dk(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b) {
            this.f19903a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19864e(DataHolder dataHolder) {
            this.f19903a.mo7413a(new C5735ci(dataHolder));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: f */
        public void mo19858f(DataHolder dataHolder) {
            this.f19903a.mo7413a(new C5735ci(dataHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.games.internal.d$dl */
    /* loaded from: classes2.dex */
    public static final class BinderC5765dl extends AbstractBinderC5641b {

        /* renamed from: a */
        private final C5919n f19904a;

        public BinderC5765dl(C5919n c5919n) {
            this.f19904a = c5919n;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5641b, com.google.android.gms.games.internal.AbstractC5910j
        /* renamed from: a */
        public PopupLocationInfoParcelable mo19829a() {
            return new PopupLocationInfoParcelable(this.f19904a.m19562d());
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dm */
    /* loaded from: classes2.dex */
    private static final class BinderC5766dm extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5980b> f19905a;

        BinderC5766dm(ahl.AbstractC6344b<AbstractC5978n.AbstractC5980b> abstractC6344b) {
            this.f19905a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: O */
        public void mo19921O(DataHolder dataHolder) {
            this.f19905a.mo7413a(new ProfileSettingsEntity(dataHolder));
            dataHolder.close();
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dn */
    /* loaded from: classes2.dex */
    private static final class BinderC5767dn extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19906a;

        BinderC5767dn(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19906a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19881c(int i) {
            this.f19906a.mo7413a(C5384f.m20457a(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$do */
    /* loaded from: classes2.dex */
    private static final class BinderC5768do extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5991f.AbstractC5992a> f19907a;

        public BinderC5768do(ahl.AbstractC6344b<AbstractC5991f.AbstractC5992a> abstractC6344b) {
            this.f19907a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: J */
        public void mo19926J(DataHolder dataHolder) {
            this.f19907a.mo7413a(new C5780e(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dp */
    /* loaded from: classes2.dex */
    private static final class C5769dp implements ail.AbstractC6386c<AbstractC5990e> {

        /* renamed from: a */
        private final Quest f19908a;

        C5769dp(Quest quest) {
            this.f19908a = quest;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5990e abstractC5990e) {
            abstractC5990e.m19205a(this.f19908a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dq */
    /* loaded from: classes2.dex */
    private static final class BinderC5770dq extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5991f.AbstractC5993b> f19909a;

        /* renamed from: b */
        private final String f19910b;

        public BinderC5770dq(ahl.AbstractC6344b<AbstractC5991f.AbstractC5993b> abstractC6344b, String str) {
            this.f19909a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
            this.f19910b = (String) C4588d.m23626a(str, (Object) "MilestoneId must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: I */
        public void mo19927I(DataHolder dataHolder) {
            this.f19909a.mo7413a(new C5678af(dataHolder, this.f19910b));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dr */
    /* loaded from: classes2.dex */
    private static final class BinderC5771dr extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<AbstractC5990e> f19911a;

        BinderC5771dr(ail<AbstractC5990e> ailVar) {
            this.f19911a = ailVar;
        }

        /* renamed from: ab */
        private Quest m20010ab(DataHolder dataHolder) {
            C5988c c5988c = new C5988c(dataHolder);
            Quest quest = null;
            try {
                if (c5988c.c() > 0) {
                    quest = c5988c.a(0).a();
                }
                return quest;
            } finally {
                c5988c.b();
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: K */
        public void mo19925K(DataHolder dataHolder) {
            Quest m20010ab = m20010ab(dataHolder);
            if (m20010ab != null) {
                this.f19911a.m17214a(new C5769dp(m20010ab));
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ds */
    /* loaded from: classes2.dex */
    private static final class BinderC5772ds extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> f19912a;

        public BinderC5772ds(ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> abstractC6344b) {
            this.f19912a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: M */
        public void mo19923M(DataHolder dataHolder) {
            this.f19912a.mo7413a(new C5736cj(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dt */
    /* loaded from: classes2.dex */
    private static final class C5773dt implements ail.AbstractC6386c<AbstractC5952b.AbstractC5953a> {

        /* renamed from: a */
        private final int f19913a;

        /* renamed from: b */
        private final String f19914b;

        /* renamed from: c */
        private final int f19915c;

        C5773dt(int i, int i2, String str) {
            this.f19913a = i;
            this.f19915c = i2;
            this.f19914b = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC5952b.AbstractC5953a abstractC5953a) {
            if (abstractC5953a != null) {
                abstractC5953a.m19400a(this.f19913a, this.f19915c, this.f19914b);
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$du */
    /* loaded from: classes2.dex */
    private static final class BinderC5774du extends AbstractBinderC5392a {

        /* renamed from: a */
        final ail<AbstractC5952b.AbstractC5953a> f19916a;

        public BinderC5774du(ail<AbstractC5952b.AbstractC5953a> ailVar) {
            this.f19916a = ailVar;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19907a(int i, int i2, String str) {
            if (this.f19916a != null) {
                this.f19916a.m17214a(new C5773dt(i, i2, str));
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dv */
    /* loaded from: classes2.dex */
    private static final class BinderC5775dv extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<AbstractC6000f> f19917a;

        BinderC5775dv(ail<AbstractC6000f> ailVar) {
            this.f19917a = ailVar;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19882b(String str) {
            this.f19917a.m17214a(new C5777dx(str));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: m */
        public void mo19844m(DataHolder dataHolder) {
            C5995a c5995a = new C5995a(dataHolder);
            GameRequest gameRequest = null;
            try {
                if (c5995a.c() > 0) {
                    gameRequest = c5995a.a(0).a();
                }
                if (gameRequest == null) {
                    return;
                }
                this.f19917a.m17214a(new C5776dw(gameRequest));
            } finally {
                c5995a.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dw */
    /* loaded from: classes2.dex */
    private static final class C5776dw implements ail.AbstractC6386c<AbstractC6000f> {

        /* renamed from: a */
        private final GameRequest f19918a;

        C5776dw(GameRequest gameRequest) {
            this.f19918a = gameRequest;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC6000f abstractC6000f) {
            abstractC6000f.m19167a(this.f19918a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dx */
    /* loaded from: classes2.dex */
    private static final class C5777dx implements ail.AbstractC6386c<AbstractC6000f> {

        /* renamed from: a */
        private final String f19919a;

        C5777dx(String str) {
            this.f19919a = str;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC6000f abstractC6000f) {
            abstractC6000f.m19166a(this.f19919a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dy */
    /* loaded from: classes2.dex */
    private static final class BinderC5778dy extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6001g.AbstractC6004c> f19920a;

        public BinderC5778dy(ahl.AbstractC6344b<AbstractC6001g.AbstractC6004c> abstractC6344b) {
            this.f19920a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: E */
        public void mo19931E(DataHolder dataHolder) {
            this.f19920a.mo7413a(new C5789ei(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$dz */
    /* loaded from: classes2.dex */
    private static final class BinderC5779dz extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6001g.AbstractC6002a> f19921a;

        public BinderC5779dz(ahl.AbstractC6344b<AbstractC6001g.AbstractC6002a> abstractC6344b) {
            this.f19921a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: F */
        public void mo19930F(DataHolder dataHolder) {
            this.f19921a.mo7413a(new C5737ck(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$e */
    /* loaded from: classes2.dex */
    private static final class C5780e extends AbstractC5696ax implements AbstractC5991f.AbstractC5992a {

        /* renamed from: a */
        private final Quest f19922a;

        C5780e(DataHolder dataHolder) {
            super(dataHolder);
            C5988c c5988c = new C5988c(dataHolder);
            try {
                if (c5988c.c() > 0) {
                    this.f19922a = new QuestEntity(c5988c.a(0));
                } else {
                    this.f19922a = null;
                }
            } finally {
                c5988c.b();
            }
        }

        @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5992a
        /* renamed from: c */
        public Quest mo19195c() {
            return this.f19922a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ea */
    /* loaded from: classes2.dex */
    private static final class BinderC5781ea extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6001g.AbstractC6003b> f19923a;

        public BinderC5781ea(ahl.AbstractC6344b<AbstractC6001g.AbstractC6003b> abstractC6344b) {
            this.f19923a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19887b(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f19923a.mo7413a(new C5738cl(C5384f.m20457a(i), bundle));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eb */
    /* loaded from: classes2.dex */
    private static final class BinderC5782eb extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6001g.AbstractC6005d> f19924a;

        public BinderC5782eb(ahl.AbstractC6344b<AbstractC6001g.AbstractC6005d> abstractC6344b) {
            this.f19924a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: D */
        public void mo19932D(DataHolder dataHolder) {
            this.f19924a.mo7413a(new C5816fi(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ec */
    /* loaded from: classes2.dex */
    private static final class C5783ec extends AbstractC5726c {
        C5783ec(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5726c
        /* renamed from: a */
        public void mo20006a(AbstractC5960g abstractC5960g, Room room) {
            abstractC5960g.m19375b(room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ed */
    /* loaded from: classes2.dex */
    private static final class BinderC5784ed extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<? extends AbstractC5961h> f19925a;

        /* renamed from: b */
        private final ail<? extends AbstractC5960g> f19926b;

        /* renamed from: c */
        private final ail<AbstractC5951a> f19927c;

        public BinderC5784ed(ail<AbstractC5961h> ailVar) {
            this.f19925a = (ail) C4588d.m23626a(ailVar, "Callbacks must not be null");
            this.f19926b = null;
            this.f19927c = null;
        }

        public BinderC5784ed(ail<? extends AbstractC5961h> ailVar, ail<? extends AbstractC5960g> ailVar2, ail<AbstractC5951a> ailVar3) {
            this.f19925a = (ail) C4588d.m23626a(ailVar, "Callbacks must not be null");
            this.f19926b = ailVar2;
            this.f19927c = ailVar3;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19893a(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5756dc(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19892a(RealTimeMessage realTimeMessage) {
            if (this.f19927c != null) {
                this.f19927c.m17214a(new C5747cu(realTimeMessage));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19883b(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5757dd(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19876c(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5758de(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19872d(int i, String str) {
            this.f19925a.m17214a(new C5719bt(i, str));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19869d(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5754da(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19868d(String str) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5750cx(str));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19863e(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5752cz(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19862e(String str) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5751cy(str));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: f */
        public void mo19857f(DataHolder dataHolder, String[] strArr) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5755db(dataHolder, strArr));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: s */
        public void mo19838s(DataHolder dataHolder) {
            this.f19925a.m17214a(new C5787eg(dataHolder));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: t */
        public void mo19837t(DataHolder dataHolder) {
            this.f19925a.m17214a(new C5714bo(dataHolder));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: u */
        public void mo19836u(DataHolder dataHolder) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5786ef(dataHolder));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: v */
        public void mo19835v(DataHolder dataHolder) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5783ec(dataHolder));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: w */
        public void mo19834w(DataHolder dataHolder) {
            this.f19925a.m17214a(new C5785ee(dataHolder));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: x */
        public void mo19833x(DataHolder dataHolder) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5680ah(dataHolder));
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: y */
        public void mo19832y(DataHolder dataHolder) {
            if (this.f19926b != null) {
                this.f19926b.m17214a(new C5686an(dataHolder));
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ee */
    /* loaded from: classes2.dex */
    private static final class C5785ee extends AbstractC5699b {
        C5785ee(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5699b
        /* renamed from: a */
        public void mo20005a(AbstractC5961h abstractC5961h, Room room, int i) {
            abstractC5961h.m19363c(i, room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ef */
    /* loaded from: classes2.dex */
    private static final class C5786ef extends AbstractC5726c {
        C5786ef(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5726c
        /* renamed from: a */
        public void mo20006a(AbstractC5960g abstractC5960g, Room room) {
            abstractC5960g.m19378a(room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eg */
    /* loaded from: classes2.dex */
    private static final class C5787eg extends AbstractC5699b {
        public C5787eg(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.internal.C5670d.AbstractC5699b
        /* renamed from: a */
        public void mo20005a(AbstractC5961h abstractC5961h, Room room, int i) {
            abstractC5961h.m19366a(i, room);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eh */
    /* loaded from: classes2.dex */
    private static final class BinderC5788eh extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> f19928a;

        BinderC5788eh(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b) {
            this.f19928a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: S */
        public void mo19917S(DataHolder dataHolder) {
            this.f19928a.mo7413a(new C5712bm(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ei */
    /* loaded from: classes2.dex */
    private static final class C5789ei extends AbstractC5696ax implements AbstractC6001g.AbstractC6004c {

        /* renamed from: a */
        private final GameRequest f19929a;

        C5789ei(DataHolder dataHolder) {
            super(dataHolder);
            C5995a c5995a = new C5995a(dataHolder);
            try {
                if (c5995a.c() > 0) {
                    this.f19929a = c5995a.a(0).a();
                } else {
                    this.f19929a = null;
                }
            } finally {
                c5995a.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ej */
    /* loaded from: classes2.dex */
    private static final class BinderC5790ej extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> f19930a;

        BinderC5790ej(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b) {
            this.f19930a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: Z */
        public void mo19910Z(DataHolder dataHolder) {
            this.f19930a.mo7413a(new C5735ci(dataHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.games.internal.d$ek */
    /* loaded from: classes2.dex */
    public static final class BinderC5791ek extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19931a;

        public BinderC5791ek(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19931a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19909a() {
            this.f19931a.mo7413a(C5384f.m20457a(0));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$el */
    /* loaded from: classes2.dex */
    private static final class BinderC5792el extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6013g.AbstractC6014a> f19932a;

        public BinderC5792el(ahl.AbstractC6344b<AbstractC6013g.AbstractC6014a> abstractC6344b) {
            this.f19932a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: H */
        public void mo19928H(DataHolder dataHolder) {
            this.f19932a.mo7413a(new C5679ag(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$em */
    /* loaded from: classes2.dex */
    static final class BinderC5793em extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6013g.AbstractC6015b> f19933a;

        public BinderC5793em(ahl.AbstractC6344b<AbstractC6013g.AbstractC6015b> abstractC6344b) {
            this.f19933a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19865e(int i, String str) {
            this.f19933a.mo7413a(new C5685am(i, str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$en */
    /* loaded from: classes2.dex */
    private static final class BinderC5794en extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6013g.AbstractC6017d> f19934a;

        public BinderC5794en(ahl.AbstractC6344b<AbstractC6013g.AbstractC6017d> abstractC6344b) {
            this.f19934a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19895a(DataHolder dataHolder, Contents contents) {
            this.f19934a.mo7413a(new C5749cw(dataHolder, contents));
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19894a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            this.f19934a.mo7413a(new C5749cw(dataHolder, str, contents, contents2, contents3));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eo */
    /* loaded from: classes2.dex */
    private static final class BinderC5795eo extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6013g.AbstractC6016c> f19935a;

        public BinderC5795eo(ahl.AbstractC6344b<AbstractC6013g.AbstractC6016c> abstractC6344b) {
            this.f19935a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: G */
        public void mo19929G(DataHolder dataHolder) {
            this.f19935a.mo7413a(new C5740cn(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ep */
    /* loaded from: classes2.dex */
    private static final class C5796ep implements ail.AbstractC6386c<AbstractC6018a> {

        /* renamed from: a */
        private final SocialInvite f19936a;

        C5796ep(SocialInvite socialInvite) {
            this.f19936a = socialInvite;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC6018a abstractC6018a) {
            abstractC6018a.m19053b(this.f19936a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eq */
    /* loaded from: classes2.dex */
    private static final class BinderC5797eq extends AbstractBinderC5392a {
        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: U */
        public void mo19915U(DataHolder dataHolder) {
            ail ailVar = null;
            C6024c c6024c = new C6024c(dataHolder);
            try {
                SocialInvite a = c6024c.c() > 0 ? ((SocialInvite) c6024c.mo9715a(0)).a() : null;
                if (a == null) {
                    return;
                }
                ailVar.m17214a(new C5798er(a));
            } finally {
                c6024c.b();
            }
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: V */
        public void mo19914V(DataHolder dataHolder) {
            ail ailVar = null;
            C6024c c6024c = new C6024c(dataHolder);
            try {
                SocialInvite a = c6024c.c() > 0 ? ((SocialInvite) c6024c.mo9715a(0)).a() : null;
                if (a == null) {
                    return;
                }
                ailVar.m17214a(new C5796ep(a));
            } finally {
                c6024c.b();
            }
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$er */
    /* loaded from: classes2.dex */
    private static final class C5798er implements ail.AbstractC6386c<AbstractC6018a> {

        /* renamed from: a */
        private final SocialInvite f19937a;

        C5798er(SocialInvite socialInvite) {
            this.f19937a = socialInvite;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC6018a abstractC6018a) {
            abstractC6018a.m19054a(this.f19937a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$es */
    /* loaded from: classes2.dex */
    private static final class BinderC5799es extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5978n.AbstractC5981c> f19938a;

        BinderC5799es(ahl.AbstractC6344b<AbstractC5978n.AbstractC5981c> abstractC6344b) {
            this.f19938a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: R */
        public void mo19918R(DataHolder dataHolder) {
            this.f19938a.mo7413a(new C5741co(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$et */
    /* loaded from: classes2.dex */
    private static final class BinderC5800et extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5326m.AbstractC5330d> f19939a;

        public BinderC5800et(ahl.AbstractC6344b<AbstractC5326m.AbstractC5330d> abstractC6344b) {
            this.f19939a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19870d(DataHolder dataHolder) {
            this.f19939a.mo7413a(new C5801eu(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$eu */
    /* loaded from: classes2.dex */
    private static final class C5801eu extends AbstractC5696ax implements AbstractC5326m.AbstractC5330d {

        /* renamed from: a */
        private final C5331n f19940a;

        public C5801eu(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.f19940a = new C5331n(dataHolder);
            } finally {
                dataHolder.close();
            }
        }

        @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5330d
        /* renamed from: c */
        public C5331n mo20002c() {
            return this.f19940a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ev */
    /* loaded from: classes2.dex */
    private static final class BinderC5802ev extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5972a> f19941a;

        public BinderC5802ev(ahl.AbstractC6344b<AbstractC5971g.AbstractC5972a> abstractC6344b) {
            this.f19941a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19879c(int i, String str) {
            this.f19941a.mo7413a(new C5820j(C5384f.m20457a(i), str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ew */
    /* loaded from: classes2.dex */
    private static final class BinderC5803ew extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> f19942a;

        public BinderC5803ew(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b) {
            this.f19942a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: o */
        public void mo19842o(DataHolder dataHolder) {
            this.f19942a.mo7413a(new C5707bh(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ex */
    /* loaded from: classes2.dex */
    private static final class BinderC5804ex extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5974c> f19943a;

        public BinderC5804ex(ahl.AbstractC6344b<AbstractC5971g.AbstractC5974c> abstractC6344b) {
            this.f19943a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: q */
        public void mo19840q(DataHolder dataHolder) {
            this.f19943a.mo7413a(new C5718bs(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ey */
    /* loaded from: classes2.dex */
    private static final class BinderC5805ey extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5975d> f19944a;

        public BinderC5805ey(ahl.AbstractC6344b<AbstractC5971g.AbstractC5975d> abstractC6344b) {
            this.f19944a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: n */
        public void mo19843n(DataHolder dataHolder) {
            this.f19944a.mo7413a(new C5731ce(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ez */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5806ez extends AbstractC5696ax {

        /* renamed from: a */
        final TurnBasedMatch f19945a;

        AbstractC5806ez(DataHolder dataHolder) {
            super(dataHolder);
            C5965c c5965c = new C5965c(dataHolder);
            try {
                if (c5965c.c() > 0) {
                    this.f19945a = c5965c.a(0).a();
                } else {
                    this.f19945a = null;
                }
            } finally {
                c5965c.b();
            }
        }

        /* renamed from: c */
        public TurnBasedMatch m20001c() {
            return this.f19945a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$f */
    /* loaded from: classes2.dex */
    private static final class BinderC5807f extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> f19946a;

        BinderC5807f(ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> abstractC6344b) {
            this.f19946a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: b */
        public void mo19886b(int i, String str) {
            this.f19946a.mo7413a(new C5810fc(i, str));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fa */
    /* loaded from: classes2.dex */
    private static final class BinderC5808fa extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5977f> f19947a;

        public BinderC5808fa(ahl.AbstractC6344b<AbstractC5971g.AbstractC5977f> abstractC6344b) {
            this.f19947a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: p */
        public void mo19841p(DataHolder dataHolder) {
            this.f19947a.mo7413a(new C5814fg(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fb */
    /* loaded from: classes2.dex */
    private static final class BinderC5809fb extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5971g.AbstractC5976e> f19948a;

        public BinderC5809fb(ahl.AbstractC6344b<AbstractC5971g.AbstractC5976e> abstractC6344b) {
            this.f19948a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19905a(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f19948a.mo7413a(new C5732cf(C5384f.m20457a(i), bundle));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fc */
    /* loaded from: classes2.dex */
    private static final class C5810fc implements AbstractC5335c.AbstractC5337b {

        /* renamed from: a */
        private final Status f19949a;

        /* renamed from: b */
        private final String f19950b;

        C5810fc(int i, String str) {
            this.f19949a = C5384f.m20457a(i);
            this.f19950b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19949a;
        }

        @Override // com.google.android.gms.games.achievement.AbstractC5335c.AbstractC5337b
        /* renamed from: b */
        public String mo20000b() {
            return this.f19950b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fd */
    /* loaded from: classes2.dex */
    private static final class BinderC5811fd extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19951a;

        BinderC5811fd(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19951a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: g */
        public void mo19856g(int i) {
            this.f19951a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fe */
    /* loaded from: classes2.dex */
    private static final class C5812fe implements AbstractC5978n.AbstractC5985g {

        /* renamed from: a */
        private final Status f19952a;

        /* renamed from: b */
        private final Bundle f19953b;

        C5812fe(int i, Bundle bundle) {
            this.f19952a = new Status(i);
            this.f19953b = bundle;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19952a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$ff */
    /* loaded from: classes2.dex */
    private static final class BinderC5813ff extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19954a;

        BinderC5813ff(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19954a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: c */
        public void mo19878c(Status status) {
            this.f19954a.mo7413a(status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fg */
    /* loaded from: classes2.dex */
    private static final class C5814fg extends AbstractC5806ez implements AbstractC5971g.AbstractC5977f {
        C5814fg(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fh */
    /* loaded from: classes2.dex */
    private static final class BinderC5815fh extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19955a;

        BinderC5815fh(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19955a = abstractC6344b;
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: h */
        public void mo19853h(int i) {
            this.f19955a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$fi */
    /* loaded from: classes2.dex */
    private static final class C5816fi extends AbstractC5696ax implements AbstractC6001g.AbstractC6005d {

        /* renamed from: a */
        private final C5929b f19956a;

        C5816fi(DataHolder dataHolder) {
            super(dataHolder);
            this.f19956a = C5929b.m19519a(dataHolder);
        }

        @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6005d
        /* renamed from: a */
        public int mo19151a(String str) {
            return this.f19956a.m19518a(str);
        }

        @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6005d
        /* renamed from: c */
        public Set<String> mo19150c() {
            return this.f19956a.m19520a();
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$g */
    /* loaded from: classes2.dex */
    private static final class BinderC5817g extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5335c.AbstractC5336a> f19957a;

        BinderC5817g(ahl.AbstractC6344b<AbstractC5335c.AbstractC5336a> abstractC6344b) {
            this.f19957a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19897a(DataHolder dataHolder) {
            this.f19957a.mo7413a(new C5722bw(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$h */
    /* loaded from: classes2.dex */
    private static final class BinderC5818h extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5351i.AbstractC5352a> f19958a;

        public BinderC5818h(ahl.AbstractC6344b<AbstractC5351i.AbstractC5352a> abstractC6344b) {
            this.f19958a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19890a(DataHolder[] dataHolderArr) {
            this.f19958a.mo7413a(new C5723bx(dataHolderArr));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$i */
    /* loaded from: classes2.dex */
    private static final class BinderC5819i extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> f19959a;

        BinderC5819i(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b) {
            this.f19959a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: X */
        public void mo19912X(DataHolder dataHolder) {
            this.f19959a.mo7413a(new C5712bm(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$j */
    /* loaded from: classes2.dex */
    private static final class C5820j implements AbstractC5971g.AbstractC5972a {

        /* renamed from: a */
        private final Status f19960a;

        /* renamed from: b */
        private final String f19961b;

        C5820j(Status status, String str) {
            this.f19960a = status;
            this.f19961b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19960a;
        }

        @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5972a
        /* renamed from: b */
        public String mo19275b() {
            return this.f19961b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$k */
    /* loaded from: classes2.dex */
    private static final class BinderC5821k extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6038a> f19962a;

        BinderC5821k(ahl.AbstractC6344b<AbstractC6037f.AbstractC6038a> abstractC6344b) {
            this.f19962a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19900a(int i, boolean z) {
            this.f19962a.mo7413a(new C5822l(new Status(i), z));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$l */
    /* loaded from: classes2.dex */
    private static final class C5822l implements AbstractC6037f.AbstractC6038a {

        /* renamed from: a */
        private final Status f19963a;

        /* renamed from: b */
        private final boolean f19964b;

        C5822l(Status status, boolean z) {
            this.f19963a = status;
            this.f19964b = z;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19963a;
        }

        @Override // com.google.android.gms.games.video.AbstractC6037f.AbstractC6038a
        /* renamed from: b */
        public boolean mo18969b() {
            return this.f19964b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$m */
    /* loaded from: classes2.dex */
    private static final class BinderC5823m extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6039b> f19965a;

        BinderC5823m(ahl.AbstractC6344b<AbstractC6037f.AbstractC6039b> abstractC6344b) {
            this.f19965a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19904a(int i, VideoCapabilities videoCapabilities) {
            this.f19965a.mo7413a(new C5824n(new Status(i), videoCapabilities));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$n */
    /* loaded from: classes2.dex */
    private static final class C5824n implements AbstractC6037f.AbstractC6039b {

        /* renamed from: a */
        private final Status f19966a;

        /* renamed from: b */
        private final VideoCapabilities f19967b;

        C5824n(Status status, VideoCapabilities videoCapabilities) {
            this.f19966a = status;
            this.f19967b = videoCapabilities;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19966a;
        }

        @Override // com.google.android.gms.games.video.AbstractC6037f.AbstractC6039b
        /* renamed from: b */
        public VideoCapabilities mo18968b() {
            return this.f19967b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$o */
    /* loaded from: classes2.dex */
    private static final class BinderC5825o extends AbstractBinderC5392a {

        /* renamed from: a */
        private final C5355c.AbstractC5363a<Status> f19968a;

        BinderC5825o(C5355c.AbstractC5363a<Status> abstractC5363a) {
            this.f19968a = (C5355c.AbstractC5363a) C4588d.m23626a(abstractC5363a, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19898a(Status status) {
            this.f19968a.b((C5355c.AbstractC5363a<Status>) status);
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19874d(int i) {
            this.f19968a.b((C5355c.AbstractC5363a<Status>) new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$p */
    /* loaded from: classes2.dex */
    private static final class BinderC5826p extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ail<AbstractC6037f.AbstractC6040c> f19969a;

        BinderC5826p(ail<AbstractC6037f.AbstractC6040c> ailVar) {
            this.f19969a = (ail) C4588d.m23626a(ailVar, "Callback must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: k */
        public void mo19847k(int i) {
            this.f19969a.m17214a(new C5827q(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$q */
    /* loaded from: classes2.dex */
    private static final class C5827q implements ail.AbstractC6386c<AbstractC6037f.AbstractC6040c> {

        /* renamed from: a */
        private final int f19970a;

        C5827q(int i) {
            this.f19970a = i;
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7917a(AbstractC6037f.AbstractC6040c abstractC6040c) {
            abstractC6040c.m18967a(this.f19970a);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$r */
    /* loaded from: classes2.dex */
    private static final class BinderC5828r extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19971a;

        public BinderC5828r(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19971a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: j */
        public void mo19849j(int i) {
            this.f19971a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$s */
    /* loaded from: classes2.dex */
    private static final class BinderC5829s extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19972a;

        /* renamed from: b */
        private final AbstractC6037f.AbstractC6041d f19973b;

        public BinderC5829s(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC6037f.AbstractC6041d abstractC6041d) {
            this.f19972a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
            this.f19973b = (AbstractC6037f.AbstractC6041d) C4588d.m23626a(abstractC6041d, "Callback must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: d */
        public void mo19871d(Status status) {
            this.f19972a.mo7413a(status);
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: i */
        public void mo19851i(int i) {
            this.f19973b.m18966a(i);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$t */
    /* loaded from: classes2.dex */
    private static final class BinderC5830t extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6042e> f19974a;

        public BinderC5830t(ahl.AbstractC6344b<AbstractC6037f.AbstractC6042e> abstractC6344b) {
            this.f19974a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: g */
        public void mo19855g(int i, Bundle bundle) {
            this.f19974a.mo7413a(new C5831u(new Status(i), C6032a.m18991a(bundle)));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$u */
    /* loaded from: classes2.dex */
    private static final class C5831u implements AbstractC6037f.AbstractC6042e {

        /* renamed from: a */
        private final Status f19975a;

        /* renamed from: b */
        private final C6032a f19976b;

        C5831u(Status status, C6032a c6032a) {
            this.f19975a = status;
            this.f19976b = c6032a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19975a;
        }

        @Override // com.google.android.gms.games.video.AbstractC6037f.AbstractC6042e
        /* renamed from: b */
        public C6032a mo18965b() {
            return this.f19976b;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$v */
    /* loaded from: classes2.dex */
    private static final class BinderC5832v extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6043f> f19977a;

        public BinderC5832v(ahl.AbstractC6344b<AbstractC6037f.AbstractC6043f> abstractC6344b) {
            this.f19977a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19906a(int i, Uri uri) {
            this.f19977a.mo7413a(new C5833w(new Status(i), uri));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$w */
    /* loaded from: classes2.dex */
    private static final class C5833w implements AbstractC6037f.AbstractC6043f {

        /* renamed from: a */
        private final Status f19978a;

        /* renamed from: b */
        private final Uri f19979b;

        C5833w(Status status, Uri uri) {
            this.f19978a = status;
            this.f19979b = uri;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19978a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$x */
    /* loaded from: classes2.dex */
    private static final class BinderC5834x extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC6037f.AbstractC6044g> f19980a;

        BinderC5834x(ahl.AbstractC6344b<AbstractC6037f.AbstractC6044g> abstractC6344b) {
            this.f19980a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: a */
        public void mo19899a(int i, boolean z, boolean z2) {
            this.f19980a.mo7413a(new C5835y(new Status(i), z, z2));
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$y */
    /* loaded from: classes2.dex */
    private static final class C5835y implements AbstractC6037f.AbstractC6044g {

        /* renamed from: a */
        private final Status f19981a;

        /* renamed from: b */
        private final boolean f19982b;

        /* renamed from: c */
        private final boolean f19983c;

        C5835y(Status status, boolean z, boolean z2) {
            this.f19981a = status;
            this.f19982b = z;
            this.f19983c = z2;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f19981a;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.d$z */
    /* loaded from: classes2.dex */
    private static final class BinderC5836z extends AbstractBinderC5392a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f19984a;

        BinderC5836z(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f19984a = (ahl.AbstractC6344b) C4588d.m23626a(abstractC6344b, "Holder must not be null");
        }

        @Override // com.google.android.gms.games.internal.AbstractBinderC5392a, com.google.android.gms.games.internal.AbstractC5907i
        /* renamed from: e */
        public void mo19867e(int i) {
            this.f19984a.mo7413a(new Status(i));
        }
    }

    public C5670d(Context context, Looper looper, C4626s c4626s, C5355c.C5365c c5365c, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 1, c4626s, abstractC4491b, abstractC4492c);
        this.f19800e = c4626s.m23527h();
        this.f19803h = C5919n.m19566a(this, c4626s.m23531d());
        m20197a(c4626s.m23525j());
        this.f19807l = c5365c;
    }

    /* renamed from: X */
    private void m20206X() {
        this.f19801f = null;
        this.f19802g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m20198a(RemoteException remoteException) {
        C5906h.m19937b("GamesClientImpl", "service died", remoteException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Room m20135b(DataHolder dataHolder) {
        C5954c c5954c = new C5954c(dataHolder);
        Room room = null;
        try {
            if (c5954c.c() > 0) {
                room = c5954c.a(0).a();
            }
            return room;
        } finally {
            c5954c.b();
        }
    }

    /* renamed from: K */
    public Intent m20219K() {
        try {
            return ((AbstractC5913k) G()).mo19604p();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: L */
    public int m20218L() {
        try {
            return ((AbstractC5913k) G()).mo19598r();
        } catch (RemoteException e) {
            m20198a(e);
            return 4368;
        }
    }

    /* renamed from: M */
    public String m20217M() {
        try {
            return ((AbstractC5913k) G()).mo19823a();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: N */
    public int m20216N() {
        try {
            return ((AbstractC5913k) G()).mo19632i();
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: O */
    public Intent m20215O() {
        try {
            return ((AbstractC5913k) G()).mo19589u();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: P */
    public int m20214P() {
        try {
            return ((AbstractC5913k) G()).mo19595s();
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: Q */
    public int m20213Q() {
        try {
            return ((AbstractC5913k) G()).mo19592t();
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: R */
    public int m20212R() {
        try {
            return ((AbstractC5913k) G()).mo19583w();
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: S */
    public int m20211S() {
        try {
            return ((AbstractC5913k) G()).mo19581x();
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: T */
    public Intent m20210T() {
        try {
            return ((AbstractC5913k) G()).mo19827A();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: U */
    public boolean m20209U() {
        try {
            return ((AbstractC5913k) G()).mo19825C();
        } catch (RemoteException e) {
            m20198a(e);
            return false;
        }
    }

    /* renamed from: V */
    public void m20208V() {
        try {
            ((AbstractC5913k) G()).mo19638h(this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: W */
    public void m20207W() {
        if (t()) {
            try {
                ((AbstractC5913k) G()).mo19704c();
            } catch (RemoteException e) {
                m20198a(e);
            }
        }
    }

    /* renamed from: a */
    public int m20146a(ail<AbstractC5952b.AbstractC5953a> ailVar, byte[] bArr, String str, String str2) {
        try {
            return ((AbstractC5913k) G()).mo19760a(new BinderC5774du(ailVar), bArr, str, str2);
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public int m20139a(byte[] bArr, String str) {
        try {
            return ((AbstractC5913k) G()).mo19739a(bArr, str, (String[]) null);
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public int m20138a(byte[] bArr, String str, String[] strArr) {
        C4588d.m23626a(strArr, "Participant IDs must not be null");
        try {
            return ((AbstractC5913k) G()).mo19739a(bArr, str, strArr);
        } catch (RemoteException e) {
            m20198a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public Intent m20205a(int i, int i2, boolean z) {
        try {
            return ((AbstractC5913k) G()).mo19821a(i, i2, z);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20204a(int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        try {
            Intent mo19820a = ((AbstractC5913k) G()).mo19820a(i, bArr, i2, str);
            C4588d.m23626a(bitmap, "Must provide a non null icon");
            mo19820a.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
            return mo19820a;
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20194a(PlayerEntity playerEntity) {
        try {
            return ((AbstractC5913k) G()).mo19812a(playerEntity);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20190a(Room room, int i) {
        try {
            return ((AbstractC5913k) G()).mo19750a((RoomEntity) room.a(), i);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20143a(String str, int i, int i2) {
        try {
            return ((AbstractC5913k) G()).mo19747a(str, i, i2);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20141a(String str, boolean z, boolean z2, int i) {
        try {
            return ((AbstractC5913k) G()).mo19741a(str, z, z2, i);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: a */
    public Intent m20137a(int[] iArr) {
        try {
            return ((AbstractC5913k) G()).mo19738a(iArr);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC5913k mo7440b(IBinder iBinder) {
        return AbstractC5913k.AbstractBinderC5914a.m19828a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.games.service.START";
    }

    /* renamed from: a */
    public String m20140a(boolean z) {
        if (!z || this.f19801f == null) {
            try {
                return ((AbstractC5913k) G()).mo19670e();
            } catch (RemoteException e) {
                m20198a(e);
                return null;
            }
        }
        return this.f19801f.mo20734c();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4638w
    /* renamed from: a */
    protected Set<Scope> mo17015a(Set<Scope> set) {
        boolean z;
        boolean z2;
        Scope scope = new Scope(C4538f.f16926f);
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        boolean z3 = false;
        boolean z4 = false;
        for (Scope scope3 : set) {
            if (scope3.equals(scope)) {
                z = z3;
                z2 = true;
            } else if (scope3.equals(scope2)) {
                z = true;
                z2 = z4;
            } else {
                z = z3;
                z2 = z4;
            }
            z4 = z2;
            z3 = z;
        }
        if (z3) {
            C4588d.m23621a(!z4, "Cannot have both %s and %s!", C4538f.f16926f, "https://www.googleapis.com/auth/games.firstparty");
        } else {
            C4588d.m23621a(z4, "Games APIs requires %s to function.", C4538f.f16926f);
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(C5670d.class.getClassLoader());
            this.f19804i = bundle.getBoolean("show_welcome_popup");
            this.f19801f = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.f19802g = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public void m20203a(Account account) {
        ((AbstractC5913k) G()).mo19817a(account);
    }

    /* renamed from: a */
    public void m20202a(Account account, byte[] bArr) {
        ((AbstractC5913k) G()).mo19816a(account, bArr);
    }

    /* renamed from: a */
    public void m20200a(IBinder iBinder, Bundle bundle) {
        if (t()) {
            try {
                ((AbstractC5913k) G()).mo19814a(iBinder, bundle);
            } catch (RemoteException e) {
                m20198a(e);
            }
        }
    }

    /* renamed from: a */
    public void m20197a(View view) {
        this.f19803h.mo19558a(view);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo20196a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        this.f19804i = false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: a */
    public void mo7977a(AbstractC4600p.AbstractC4606f abstractC4606f) {
        m20206X();
        super.a(abstractC4606f);
    }

    /* renamed from: a */
    public void m20193a(C5355c.AbstractC5363a<Status> abstractC5363a, String str, VideoConfiguration videoConfiguration) {
        ((AbstractC5913k) G()).mo19783a(new BinderC5825o(abstractC5363a), str, videoConfiguration);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo20199a(@NonNull AbstractC5913k abstractC5913k) {
        super.a((C5670d) abstractC5913k);
        if (this.f19804i) {
            this.f19803h.mo19560a();
            this.f19804i = false;
        }
        if (this.f19807l.f19429a || this.f19807l.f19437i) {
            return;
        }
        m20134b(abstractC5913k);
    }

    /* renamed from: a */
    public void m20189a(Snapshot snapshot) {
        SnapshotContents mo19136d = snapshot.mo19136d();
        C4588d.m23622a(!mo19136d.mo19143d(), "Snapshot already closed");
        Contents mo19145b = mo19136d.mo19145b();
        mo19136d.mo19144c();
        try {
            ((AbstractC5913k) G()).mo19813a(mo19145b);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: a */
    public void m20188a(ahl.AbstractC6344b<C5355c.AbstractC5372g> abstractC6344b) {
        ((AbstractC5913k) G()).mo19626j(new BinderC5698az(abstractC6344b));
    }

    /* renamed from: a */
    public void m20187a(ahl.AbstractC6344b<AbstractC5940c.AbstractC5941a> abstractC6344b, int i) {
        ((AbstractC5913k) G()).mo19809a((AbstractC5907i) new BinderC5711bl(abstractC6344b), i);
    }

    /* renamed from: a */
    public void m20186a(ahl.AbstractC6344b<AbstractC6001g.AbstractC6003b> abstractC6344b, int i, int i2, int i3) {
        ((AbstractC5913k) G()).mo19808a(new BinderC5781ea(abstractC6344b), i, i2, i3);
    }

    /* renamed from: a */
    public void m20185a(ahl.AbstractC6344b<AbstractC5351i.AbstractC5352a> abstractC6344b, int i, String str, String[] strArr, boolean z) {
        ((AbstractC5913k) G()).mo19805a(new BinderC5818h(abstractC6344b), i, str, strArr, z);
    }

    /* renamed from: a */
    public void m20184a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19804a(new BinderC5764dk(abstractC6344b), i, z, z2);
    }

    /* renamed from: a */
    public void m20183a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5976e> abstractC6344b, int i, int[] iArr) {
        ((AbstractC5913k) G()).mo19803a(new BinderC5809fb(abstractC6344b), i, iArr);
    }

    /* renamed from: a */
    public void m20182a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, Account account) {
        ((AbstractC5913k) G()).mo19800a(new BinderC5764dk(abstractC6344b), account);
    }

    /* renamed from: a */
    public void m20181a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b, C5317f c5317f, int i, int i2) {
        ((AbstractC5913k) G()).mo19799a(new BinderC5716bq(abstractC6344b), c5317f.m20697a().m20695a(), i, i2);
    }

    /* renamed from: a */
    public void m20180a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b, AbstractC5966d abstractC5966d) {
        ((AbstractC5913k) G()).mo19806a(new BinderC5803ew(abstractC6344b), abstractC5966d.mo19306a(), abstractC5966d.mo19305b(), abstractC5966d.mo19304c(), abstractC5966d.mo19303d());
    }

    /* renamed from: a */
    public void m20179a(ahl.AbstractC6344b<AbstractC6013g.AbstractC6014a> abstractC6344b, Snapshot snapshot, AbstractC6009d abstractC6009d) {
        SnapshotContents mo19136d = snapshot.mo19136d();
        C4588d.m23622a(!mo19136d.mo19143d(), "Snapshot already closed");
        BitmapTeleporter mo19101c = abstractC6009d.mo19101c();
        if (mo19101c != null) {
            mo19101c.m23902a(B().getCacheDir());
        }
        Contents mo19145b = mo19136d.mo19145b();
        mo19136d.mo19144c();
        ((AbstractC5913k) G()).mo19784a(new BinderC5792el(abstractC6344b), snapshot.mo19137c().mo19122e(), (SnapshotMetadataChangeEntity) abstractC6009d, mo19145b);
    }

    /* renamed from: a */
    public void m20178a(ahl.AbstractC6344b<Status> abstractC6344b, VideoConfiguration videoConfiguration, AbstractC6037f.AbstractC6041d abstractC6041d) {
        ((AbstractC5913k) G()).mo19796a(new BinderC5829s(abstractC6344b, abstractC6041d), videoConfiguration);
    }

    /* renamed from: a */
    public void m20177a(ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19785a(abstractC6344b == null ? null : new BinderC5807f(abstractC6344b), str, this.f19803h.m19563c(), this.f19803h.m19565b());
    }

    /* renamed from: a */
    public void m20176a(ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19792a(abstractC6344b == null ? null : new BinderC5807f(abstractC6344b), str, i, this.f19803h.m19563c(), this.f19803h.m19565b());
    }

    /* renamed from: a */
    public void m20175a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b, String str, int i, int i2, int i3, boolean z) {
        ((AbstractC5913k) G()).mo19793a(new BinderC5716bq(abstractC6344b), str, i, i2, i3, z);
    }

    /* renamed from: a */
    public void m20174a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, int i, boolean z, boolean z2) {
        char c = 65535;
        switch (str.hashCode()) {
            case 156408498:
                if (str.equals("played_with")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((AbstractC5913k) G()).mo19676d(new BinderC5764dk(abstractC6344b), str, i, z, z2);
                return;
            default:
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid player collection: ".concat(valueOf) : new String("Invalid player collection: "));
        }
    }

    /* renamed from: a */
    public void m20173a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5976e> abstractC6344b, String str, int i, int[] iArr) {
        ((AbstractC5913k) G()).mo19788a(new BinderC5809fb(abstractC6344b), str, i, iArr);
    }

    /* renamed from: a */
    public void m20172a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5330d> abstractC6344b, String str, long j, String str2) {
        ((AbstractC5913k) G()).mo19786a(abstractC6344b == null ? null : new BinderC5800et(abstractC6344b), str, j, str2);
    }

    /* renamed from: a */
    public void m20171a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5974c> abstractC6344b, String str, String str2) {
        ((AbstractC5913k) G()).mo19693c(new BinderC5804ex(abstractC6344b), str, str2);
    }

    /* renamed from: a */
    public void m20170a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5328b> abstractC6344b, String str, String str2, int i, int i2) {
        ((AbstractC5913k) G()).mo19781a(new BinderC5759df(abstractC6344b), str, str2, i, i2);
    }

    /* renamed from: a */
    public void m20169a(ahl.AbstractC6344b<AbstractC6001g.AbstractC6003b> abstractC6344b, String str, String str2, int i, int i2, int i3) {
        ((AbstractC5913k) G()).mo19780a(new BinderC5781ea(abstractC6344b), str, str2, i, i2, i3);
    }

    /* renamed from: a */
    public void m20168a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b, String str, String str2, int i, int i2, int i3, boolean z) {
        ((AbstractC5913k) G()).mo19779a(new BinderC5716bq(abstractC6344b), str, str2, i, i2, i3, z);
    }

    /* renamed from: a */
    public void m20167a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, String str2, int i, boolean z, boolean z2) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1049482625:
                if (str.equals("nearby")) {
                    c = 2;
                    break;
                }
                break;
            case 156408498:
                if (str.equals("played_with")) {
                    c = 1;
                    break;
                }
                break;
            case 782949780:
                if (str.equals("circled")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                ((AbstractC5913k) G()).mo19778a(new BinderC5764dk(abstractC6344b), str, str2, i, z, z2);
                return;
            default:
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid player collection: ".concat(valueOf) : new String("Invalid player collection: "));
        }
    }

    /* renamed from: a */
    public void m20166a(ahl.AbstractC6344b<AbstractC6013g.AbstractC6017d> abstractC6344b, String str, String str2, AbstractC6009d abstractC6009d, SnapshotContents snapshotContents) {
        C4588d.m23622a(!snapshotContents.mo19143d(), "SnapshotContents already closed");
        BitmapTeleporter mo19101c = abstractC6009d.mo19101c();
        if (mo19101c != null) {
            mo19101c.m23902a(B().getCacheDir());
        }
        Contents mo19145b = snapshotContents.mo19145b();
        snapshotContents.mo19144c();
        ((AbstractC5913k) G()).mo19777a(new BinderC5794en(abstractC6344b), str, str2, (SnapshotMetadataChangeEntity) abstractC6009d, mo19145b);
    }

    /* renamed from: a */
    public void m20165a(ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> abstractC6344b, String str, String str2, boolean z) {
        ((AbstractC5913k) G()).mo19713b(new BinderC5717br(abstractC6344b), str, str2, z);
    }

    /* renamed from: a */
    public void m20164a(ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> abstractC6344b, String str, String str2, boolean z, String[] strArr) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19772a(new BinderC5772ds(abstractC6344b), str, str2, strArr, z);
    }

    /* renamed from: a */
    public void m20163a(ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> abstractC6344b, String str, String str2, int[] iArr, int i, boolean z) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19774a(new BinderC5772ds(abstractC6344b), str, str2, iArr, i, z);
    }

    /* renamed from: a */
    public void m20162a(ahl.AbstractC6344b<AbstractC6001g.AbstractC6005d> abstractC6344b, String str, String str2, String[] strArr) {
        ((AbstractC5913k) G()).mo19773a(new BinderC5782eb(abstractC6344b), str, str2, strArr);
    }

    /* renamed from: a */
    public void m20161a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19650f(new BinderC5764dk(abstractC6344b), str, z);
    }

    /* renamed from: a */
    public void m20160a(ahl.AbstractC6344b<AbstractC6013g.AbstractC6017d> abstractC6344b, String str, boolean z, int i) {
        ((AbstractC5913k) G()).mo19770a(new BinderC5794en(abstractC6344b), str, z, i);
    }

    /* renamed from: a */
    public void m20159a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5985g> abstractC6344b, String str, boolean z, String str2, boolean z2, boolean z3) {
        ((AbstractC5913k) G()).mo19769a(new BinderC5695aw(abstractC6344b), str, z, str2, z2, z3);
    }

    /* renamed from: a */
    public void m20158a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5977f> abstractC6344b, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
        ((AbstractC5913k) G()).mo19768a(new BinderC5808fa(abstractC6344b), str, bArr, str2, participantResultArr);
    }

    /* renamed from: a */
    public void m20157a(ahl.AbstractC6344b<AbstractC5971g.AbstractC5977f> abstractC6344b, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
        ((AbstractC5913k) G()).mo19767a(new BinderC5808fa(abstractC6344b), str, bArr, participantResultArr);
    }

    /* renamed from: a */
    public void m20156a(ahl.AbstractC6344b<AbstractC6001g.AbstractC6004c> abstractC6344b, String str, String[] strArr, int i, byte[] bArr, int i2) {
        ((AbstractC5913k) G()).mo19765a(new BinderC5778dy(abstractC6344b), str, strArr, i, bArr, i2);
    }

    /* renamed from: a */
    public void m20155a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19690c(new BinderC5764dk(abstractC6344b), z);
    }

    /* renamed from: a */
    public void m20154a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5980b> abstractC6344b, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19763a(new BinderC5766dm(abstractC6344b), z, z2);
    }

    /* renamed from: a */
    public void m20153a(ahl.AbstractC6344b<Status> abstractC6344b, boolean z, boolean z2, Bundle bundle) {
        ((AbstractC5913k) G()).mo19762a(new BinderC5683ak(abstractC6344b), z, z2, bundle);
    }

    /* renamed from: a */
    public void m20152a(ahl.AbstractC6344b<AbstractC5382c.AbstractC5383a> abstractC6344b, boolean z, String... strArr) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19761a(new BinderC5687ao(abstractC6344b), z, strArr);
    }

    /* renamed from: a */
    public void m20151a(ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> abstractC6344b, int[] iArr, int i, boolean z) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19758a(new BinderC5772ds(abstractC6344b), iArr, i, z);
    }

    /* renamed from: a */
    public void m20150a(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String[] strArr) {
        ((AbstractC5913k) G()).mo19689c(new BinderC5764dk(abstractC6344b), strArr);
    }

    /* renamed from: a */
    public void m20149a(ail<AbstractC5943e> ailVar) {
        try {
            ((AbstractC5913k) G()).mo19802a(new BinderC5708bi(ailVar), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: a */
    public void m20148a(ail<AbstractC5961h> ailVar, ail<AbstractC5960g> ailVar2, ail<AbstractC5951a> ailVar3, AbstractC5955d abstractC5955d) {
        try {
            ((AbstractC5913k) G()).mo19798a((AbstractC5907i) new BinderC5784ed(ailVar, ailVar2, ailVar3), (IBinder) this.f19805j, abstractC5955d.mo19384e(), abstractC5955d.mo19383f(), abstractC5955d.mo19382g(), false, this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: a */
    public void m20147a(ail<AbstractC5961h> ailVar, String str) {
        try {
            ((AbstractC5913k) G()).mo19696c(new BinderC5784ed(ailVar), str);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: a */
    public void m20145a(String str) {
        try {
            ((AbstractC5913k) G()).mo19648f(str);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: a */
    public void m20144a(String str, int i) {
        this.f19799a.m20024a(str, i);
    }

    /* renamed from: a */
    public void m20142a(String str, ahl.AbstractC6344b<C5355c.AbstractC5369e> abstractC6344b) {
        C4588d.m23624a(str, (Object) "Please provide a valid serverClientId");
        ((AbstractC5913k) G()).mo19744a(str, new BinderC5700ba(abstractC6344b));
    }

    /* renamed from: b */
    public Intent m20136b(int i, int i2, boolean z) {
        try {
            return ((AbstractC5913k) G()).mo19732b(i, i2, z);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: b */
    public Intent m20116b(String str) {
        try {
            return ((AbstractC5913k) G()).mo19628i(str);
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* renamed from: b */
    public void m20134b(AbstractC5913k abstractC5913k) {
        try {
            abstractC5913k.mo19755a(new BinderC5765dl(this.f19803h), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: b */
    public void m20133b(ahl.AbstractC6344b<AbstractC5376e.AbstractC5379c> abstractC6344b) {
        ((AbstractC5913k) G()).mo19682d(new BinderC5697ay(abstractC6344b));
    }

    /* renamed from: b */
    public void m20132b(ahl.AbstractC6344b<AbstractC6037f.AbstractC6038a> abstractC6344b, int i) {
        ((AbstractC5913k) G()).mo19700c((AbstractC5907i) new BinderC5821k(abstractC6344b), i);
    }

    /* renamed from: b */
    public void m20131b(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19726b(new BinderC5764dk(abstractC6344b), i, z, z2);
    }

    /* renamed from: b */
    public void m20130b(ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19717b(abstractC6344b == null ? null : new BinderC5807f(abstractC6344b), str, this.f19803h.m19563c(), this.f19803h.m19565b());
    }

    /* renamed from: b */
    public void m20129b(ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19720b(abstractC6344b == null ? null : new BinderC5807f(abstractC6344b), str, i, this.f19803h.m19563c(), this.f19803h.m19565b());
    }

    /* renamed from: b */
    public void m20128b(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b, String str, int i, int i2, int i3, boolean z) {
        ((AbstractC5913k) G()).mo19721b(new BinderC5716bq(abstractC6344b), str, i, i2, i3, z);
    }

    /* renamed from: b */
    public void m20127b(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19718b(new BinderC5764dk(abstractC6344b), str, i, z, z2);
    }

    /* renamed from: b */
    public void m20126b(ahl.AbstractC6344b<AbstractC5991f.AbstractC5993b> abstractC6344b, String str, String str2) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19651f(new BinderC5770dq(abstractC6344b, str2), str, str2);
    }

    /* renamed from: b */
    public void m20125b(ahl.AbstractC6344b<AbstractC5326m.AbstractC5329c> abstractC6344b, String str, String str2, int i, int i2, int i3, boolean z) {
        ((AbstractC5913k) G()).mo19715b(new BinderC5716bq(abstractC6344b), str, str2, i, i2, i3, z);
    }

    /* renamed from: b */
    public void m20124b(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, String str2, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19714b(new BinderC5764dk(abstractC6344b), str, str2, i, z, z2);
    }

    /* renamed from: b */
    public void m20123b(ahl.AbstractC6344b<AbstractC5335c.AbstractC5336a> abstractC6344b, String str, String str2, boolean z) {
        ((AbstractC5913k) G()).mo19775a(new BinderC5817g(abstractC6344b), str, str2, z);
    }

    /* renamed from: b */
    public void m20122b(ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19691c(new BinderC5717br(abstractC6344b), str, z);
    }

    /* renamed from: b */
    public void m20121b(ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19711b(new BinderC5717br(abstractC6344b), z);
    }

    /* renamed from: b */
    public void m20120b(ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c> abstractC6344b, boolean z, String[] strArr) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19756a(new BinderC5772ds(abstractC6344b), strArr, z);
    }

    /* renamed from: b */
    public void m20119b(ahl.AbstractC6344b<AbstractC6001g.AbstractC6005d> abstractC6344b, String[] strArr) {
        ((AbstractC5913k) G()).mo19757a(new BinderC5782eb(abstractC6344b), strArr);
    }

    /* renamed from: b */
    public void m20118b(ail<AbstractC5964b> ailVar) {
        try {
            ((AbstractC5913k) G()).mo19725b(new BinderC5745cs(ailVar), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: b */
    public void m20117b(ail<AbstractC5961h> ailVar, ail<AbstractC5960g> ailVar2, ail<AbstractC5951a> ailVar3, AbstractC5955d abstractC5955d) {
        try {
            ((AbstractC5913k) G()).mo19797a((AbstractC5907i) new BinderC5784ed(ailVar, ailVar2, ailVar3), (IBinder) this.f19805j, abstractC5955d.mo19387b(), false, this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: b */
    public void m20115b(String str, int i) {
        try {
            ((AbstractC5913k) G()).mo19708b(str, i);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        String locale = B().getResources().getConfiguration().locale.toString();
        Bundle m20489a = this.f19807l.m20489a();
        m20489a.putString("com.google.android.gms.games.key.gamePackageName", this.f19800e);
        m20489a.putString("com.google.android.gms.games.key.desiredLocale", locale);
        m20489a.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f19803h.m19563c()));
        m20489a.putInt("com.google.android.gms.games.key.API_VERSION", 4);
        m20489a.putBundle("com.google.android.gms.games.key.signInOptions", C9016g.m9369a(J()));
        return m20489a;
    }

    /* renamed from: c */
    public void m20114c(int i) {
        this.f19803h.m19564b(i);
    }

    /* renamed from: c */
    public void m20113c(ahl.AbstractC6344b<Status> abstractC6344b) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19810a(new BinderC5791ek(abstractC6344b));
    }

    /* renamed from: c */
    public void m20112c(ahl.AbstractC6344b<AbstractC6019b.AbstractC6023d> abstractC6344b, int i) {
        ((AbstractC5913k) G()).mo19727b((AbstractC5907i) new BinderC5713bn(abstractC6344b), i);
    }

    /* renamed from: c */
    public void m20111c(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19699c(new BinderC5764dk(abstractC6344b), i, z, z2);
    }

    /* renamed from: c */
    public void m20110c(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19620k(new BinderC5803ew(abstractC6344b), str);
    }

    /* renamed from: c */
    public void m20109c(ahl.AbstractC6344b<AbstractC6037f.AbstractC6047j> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19677d(new BinderC5720bu(abstractC6344b), str, i);
    }

    /* renamed from: c */
    public void m20108c(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b, String str, String str2) {
        ((AbstractC5913k) G()).mo19675d(new BinderC5803ew(abstractC6344b), str, str2);
    }

    /* renamed from: c */
    public void m20107c(ahl.AbstractC6344b<AbstractC6013g.AbstractC6016c> abstractC6344b, String str, String str2, boolean z) {
        ((AbstractC5913k) G()).mo19692c(new BinderC5795eo(abstractC6344b), str, str2, z);
    }

    /* renamed from: c */
    public void m20106c(ahl.AbstractC6344b<Status> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19635h(new BinderC5813ff(abstractC6344b), str, z);
    }

    /* renamed from: c */
    public void m20105c(ahl.AbstractC6344b<AbstractC5335c.AbstractC5336a> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19764a(new BinderC5817g(abstractC6344b), z);
    }

    /* renamed from: c */
    public void m20104c(ahl.AbstractC6344b<AbstractC6001g.AbstractC6005d> abstractC6344b, String[] strArr) {
        ((AbstractC5913k) G()).mo19710b(new BinderC5782eb(abstractC6344b), strArr);
    }

    /* renamed from: c */
    public void m20103c(ail<AbstractC5990e> ailVar) {
        try {
            ((AbstractC5913k) G()).mo19680d(new BinderC5771dr(ailVar), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: c */
    public void m20102c(String str) {
        try {
            ((AbstractC5913k) G()).mo19745a(str, this.f19803h.m19563c(), this.f19803h.m19565b());
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: c */
    public void m20101c(String str, int i) {
        try {
            ((AbstractC5913k) G()).mo19748a(str, i);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: d */
    public void m20100d(int i) {
        try {
            ((AbstractC5913k) G()).mo19822a(i);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: d */
    public void m20099d(ahl.AbstractC6344b<AbstractC6037f.AbstractC6039b> abstractC6344b) {
        ((AbstractC5913k) G()).mo19617l(new BinderC5823m(abstractC6344b));
    }

    /* renamed from: d */
    public void m20098d(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19667e(new BinderC5764dk(abstractC6344b), i, z, z2);
    }

    /* renamed from: d */
    public void m20097d(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19616l(new BinderC5803ew(abstractC6344b), str);
    }

    /* renamed from: d */
    public void m20096d(ahl.AbstractC6344b<AbstractC5978n.AbstractC5984f> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19722b(new BinderC5763dj(abstractC6344b), str, i);
    }

    /* renamed from: d */
    public void m20095d(ahl.AbstractC6344b<AbstractC5971g.AbstractC5973b> abstractC6344b, String str, String str2) {
        ((AbstractC5913k) G()).mo19663e(new BinderC5803ew(abstractC6344b), str, str2);
    }

    /* renamed from: d */
    public void m20094d(ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19674d(new BinderC5717br(abstractC6344b), str, z);
    }

    /* renamed from: d */
    public void m20093d(ahl.AbstractC6344b<AbstractC5382c.AbstractC5383a> abstractC6344b, boolean z) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19649f(new BinderC5687ao(abstractC6344b), z);
    }

    /* renamed from: d */
    public void m20092d(ail<AbstractC6000f> ailVar) {
        try {
            ((AbstractC5913k) G()).mo19698c(new BinderC5775dv(ailVar), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: e */
    public void m20091e(ahl.AbstractC6344b<AbstractC6037f.AbstractC6042e> abstractC6344b) {
        ((AbstractC5913k) G()).mo19585v(new BinderC5830t(abstractC6344b));
    }

    /* renamed from: e */
    public void m20090e(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, int i, boolean z, boolean z2) {
        ((AbstractC5913k) G()).mo19655f(new BinderC5764dk(abstractC6344b), i, z, z2);
    }

    /* renamed from: e */
    public void m20089e(ahl.AbstractC6344b<AbstractC5971g.AbstractC5974c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19608n(new BinderC5804ex(abstractC6344b), str);
    }

    /* renamed from: e */
    public void m20088e(ahl.AbstractC6344b<AbstractC5978n.AbstractC5984f> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19695c(new BinderC5763dj(abstractC6344b), str, i);
    }

    /* renamed from: e */
    public void m20087e(ahl.AbstractC6344b<AbstractC5385g.AbstractC5387b> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19771a(new BinderC5691as(abstractC6344b), str, z);
    }

    /* renamed from: e */
    public void m20086e(ahl.AbstractC6344b<AbstractC6028c.AbstractC6029a> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19629i(new BinderC5760dg(abstractC6344b), z);
    }

    /* renamed from: e */
    public void m20085e(ail<AbstractC6037f.AbstractC6040c> ailVar) {
        try {
            ((AbstractC5913k) G()).mo19654f(new BinderC5826p(ailVar), this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        this.f19804i = false;
        if (t()) {
            try {
                AbstractC5913k abstractC5913k = (AbstractC5913k) G();
                abstractC5913k.mo19704c();
                this.f19799a.m20023b();
                abstractC5913k.mo19819a(this.f19806k);
            } catch (RemoteException e) {
                C5906h.m19940a("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.f();
    }

    /* renamed from: f */
    public void m20084f(ahl.AbstractC6344b<AbstractC6037f.AbstractC6044g> abstractC6344b) {
        ((AbstractC5913k) G()).mo19594s(new BinderC5834x(abstractC6344b));
    }

    /* renamed from: f */
    public void m20083f(ahl.AbstractC6344b<AbstractC5971g.AbstractC5972a> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19612m(new BinderC5802ev(abstractC6344b), str);
    }

    /* renamed from: f */
    public void m20082f(ahl.AbstractC6344b<AbstractC5940c.AbstractC5941a> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19719b((AbstractC5907i) new BinderC5711bl(abstractC6344b), str, i, false);
    }

    /* renamed from: f */
    public void m20081f(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str, boolean z) {
        ((AbstractC5913k) G()).mo19642g(new BinderC5790ej(abstractC6344b), str, z);
    }

    /* renamed from: f */
    public void m20080f(ahl.AbstractC6344b<AbstractC6013g.AbstractC6016c> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19673d(new BinderC5795eo(abstractC6344b), z);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.internal.C4641x.AbstractC4642a
    /* renamed from: g */
    public Bundle mo17342g() {
        try {
            Bundle mo19733b = ((AbstractC5913k) G()).mo19733b();
            if (mo19733b == null) {
                return mo19733b;
            }
            mo19733b.setClassLoader(C5670d.class.getClassLoader());
            return mo19733b;
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: g */
    public void m20079g(ahl.AbstractC6344b<AbstractC6037f.AbstractC6045h> abstractC6344b) {
        ((AbstractC5913k) G()).mo19600q(new BinderC5674ab(abstractC6344b));
    }

    /* renamed from: g */
    public void m20078g(ahl.AbstractC6344b<AbstractC5971g.AbstractC5975d> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19605o(new BinderC5805ey(abstractC6344b), str);
    }

    /* renamed from: g */
    public void m20077g(ahl.AbstractC6344b<AbstractC6001g.AbstractC6002a> abstractC6344b, String str, int i) {
        ((AbstractC5913k) G()).mo19794a((AbstractC5907i) new BinderC5779dz(abstractC6344b), str, i);
    }

    /* renamed from: g */
    public void m20076g(ahl.AbstractC6344b<Status> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19611m(new BinderC5828r(abstractC6344b), z);
    }

    /* renamed from: h */
    public String m20075h() {
        try {
            return ((AbstractC5913k) G()).mo19685d();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: h */
    public void m20074h(ahl.AbstractC6344b<AbstractC6037f.AbstractC6046i> abstractC6344b) {
        ((AbstractC5913k) G()).mo19597r(new BinderC5676ad(abstractC6344b));
    }

    /* renamed from: h */
    public void m20073h(ahl.AbstractC6344b<AbstractC5991f.AbstractC5992a> abstractC6344b, String str) {
        this.f19799a.m20023b();
        ((AbstractC5913k) G()).mo19590t(new BinderC5768do(abstractC6344b), str);
    }

    /* renamed from: h */
    public void m20072h(ahl.AbstractC6344b<Status> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19634h(new BinderC5767dn(abstractC6344b), z);
    }

    /* renamed from: i */
    public Player m20071i() {
        F();
        synchronized (this) {
            if (this.f19801f == null) {
                try {
                    C5932j c5932j = new C5932j(((AbstractC5913k) G()).mo19658f());
                    try {
                        if (c5932j.c() > 0) {
                            this.f19801f = (PlayerEntity) ((Player) c5932j.mo9715a(0)).a();
                        }
                    } finally {
                        c5932j.b();
                    }
                } catch (RemoteException e) {
                    m20198a(e);
                }
            }
        }
        return this.f19801f;
    }

    /* renamed from: i */
    public void m20070i(ahl.AbstractC6344b<Status> abstractC6344b) {
        ((AbstractC5913k) G()).mo19591t(new BinderC5703bd(abstractC6344b));
    }

    /* renamed from: i */
    public void m20069i(ahl.AbstractC6344b<AbstractC6013g.AbstractC6015b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19599q(new BinderC5793em(abstractC6344b), str);
    }

    /* renamed from: i */
    public void m20068i(ahl.AbstractC6344b<Status> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19624j(new BinderC5684al(abstractC6344b), z);
    }

    /* renamed from: j */
    public Game m20067j() {
        F();
        synchronized (this) {
            if (this.f19802g == null) {
                try {
                    C5311a c5311a = new C5311a(((AbstractC5913k) G()).mo19639h());
                    try {
                        if (c5311a.c() > 0) {
                            this.f19802g = (GameEntity) ((Game) c5311a.mo9715a(0)).a();
                        }
                    } finally {
                        c5311a.b();
                    }
                } catch (RemoteException e) {
                    m20198a(e);
                }
            }
        }
        return this.f19802g;
    }

    /* renamed from: j */
    public void m20066j(ahl.AbstractC6344b<Status> abstractC6344b) {
        ((AbstractC5913k) G()).mo19606o(new BinderC5836z(abstractC6344b));
    }

    /* renamed from: j */
    public void m20065j(ahl.AbstractC6344b<AbstractC5376e.AbstractC5377a> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19653f(new BinderC5689aq(abstractC6344b), str);
    }

    /* renamed from: j */
    public void m20064j(ahl.AbstractC6344b<Status> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19619k(new BinderC5811fd(abstractC6344b), z);
    }

    /* renamed from: k */
    public Intent m20063k() {
        try {
            return ((AbstractC5913k) G()).mo19622k();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: k */
    public void m20062k(ahl.AbstractC6344b<AbstractC6037f.AbstractC6047j> abstractC6344b) {
        ((AbstractC5913k) G()).mo19621k(new BinderC5720bu(abstractC6344b));
    }

    /* renamed from: k */
    public void m20061k(ahl.AbstractC6344b<AbstractC5376e.AbstractC5378b> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19602p(new BinderC5694av(abstractC6344b), str);
    }

    /* renamed from: k */
    public void m20060k(ahl.AbstractC6344b<Status> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19615l(new BinderC5815fh(abstractC6344b), z);
    }

    /* renamed from: l */
    public Intent m20059l() {
        try {
            return ((AbstractC5913k) G()).mo19618l();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: l */
    public void m20058l(ahl.AbstractC6344b<AbstractC6037f.AbstractC6043f> abstractC6344b) {
        ((AbstractC5913k) G()).mo19588u(new BinderC5832v(abstractC6344b));
    }

    /* renamed from: l */
    public void m20057l(ahl.AbstractC6344b<AbstractC5978n.AbstractC5982d> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19596r(new BinderC5762di(abstractC6344b), str);
    }

    /* renamed from: l */
    public void m20056l(ahl.AbstractC6344b<AbstractC5385g.AbstractC5386a> abstractC6344b, boolean z) {
        ((AbstractC5913k) G()).mo19661e(new BinderC5682aj(abstractC6344b), z);
    }

    /* renamed from: m */
    public Intent m20055m() {
        try {
            return ((AbstractC5913k) G()).mo19614m();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: m */
    public void m20054m(ahl.AbstractC6344b<AbstractC5978n.AbstractC5981c> abstractC6344b) {
        ((AbstractC5913k) G()).mo19603p(new BinderC5799es(abstractC6344b));
    }

    /* renamed from: m */
    public void m20053m(ahl.AbstractC6344b<AbstractC5940c.AbstractC5941a> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19625j(new BinderC5711bl(abstractC6344b), str);
    }

    /* renamed from: n */
    public Intent m20052n() {
        try {
            return ((AbstractC5913k) G()).mo19610n();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: n */
    public void m20051n(ahl.AbstractC6344b<AbstractC5385g.AbstractC5389d> abstractC6344b) {
        ((AbstractC5913k) G()).mo19593s(new BinderC5706bg(abstractC6344b), null);
    }

    /* renamed from: n */
    public void m20050n(ahl.AbstractC6344b<AbstractC5385g.AbstractC5388c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19630i(new BinderC5693au(abstractC6344b), str);
    }

    /* renamed from: o */
    public void m20049o() {
        try {
            ((AbstractC5913k) G()).mo19731b(this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: o */
    public void m20048o(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19587u(new BinderC5788eh(abstractC6344b), str);
    }

    /* renamed from: p */
    public void m20047p() {
        try {
            ((AbstractC5913k) G()).mo19703c(this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: p */
    public void m20046p(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19584v(new BinderC5753d(abstractC6344b), str);
    }

    /* renamed from: q */
    public void m20045q() {
        try {
            ((AbstractC5913k) G()).mo19669e(this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: q */
    public void m20044q(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19582w(new BinderC5704be(abstractC6344b), str);
    }

    /* renamed from: r */
    public void m20043r() {
        try {
            ((AbstractC5913k) G()).mo19684d(this.f19806k);
        } catch (RemoteException e) {
            m20198a(e);
        }
    }

    /* renamed from: r */
    public void m20042r(ahl.AbstractC6344b<AbstractC6019b.AbstractC6022c> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19580x(new BinderC5819i(abstractC6344b), str);
    }

    /* renamed from: s */
    public Intent m20041s() {
        try {
            return ((AbstractC5913k) G()).mo19607o();
        } catch (RemoteException e) {
            m20198a(e);
            return null;
        }
    }

    /* renamed from: s */
    public void m20040s(ahl.AbstractC6344b<AbstractC5978n.AbstractC5979a> abstractC6344b, String str) {
        ((AbstractC5913k) G()).mo19578y(new BinderC5761dh(abstractC6344b), str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        return true;
    }
}
