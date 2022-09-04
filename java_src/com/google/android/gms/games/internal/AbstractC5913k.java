package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.fitness.C5171e;
import com.google.android.gms.games.C5375d;
import com.google.android.gms.games.C5384f;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.AbstractC5907i;
import com.google.android.gms.games.internal.AbstractC5910j;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.location.places.C8295n;
import com.google.android.gms.nearby.connection.C8761b;
import com.google.android.gms.safetynet.C8995d;
/* renamed from: com.google.android.gms.games.internal.k */
/* loaded from: classes2.dex */
public interface AbstractC5913k extends IInterface {

    /* renamed from: com.google.android.gms.games.internal.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5914a extends Binder implements AbstractC5913k {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.games.internal.k$a$a */
        /* loaded from: classes2.dex */
        public static class C5915a implements AbstractC5913k {

            /* renamed from: a */
            private IBinder f20062a;

            C5915a(IBinder iBinder) {
                this.f20062a = iBinder;
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: A */
            public Intent mo19827A() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(19002, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: B */
            public Account mo19826B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(21001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: C */
            public boolean mo19825C() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(22030, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: D */
            public Account mo19824D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(22025, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public int mo19760a(AbstractC5907i abstractC5907i, byte[] bArr, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public int mo19739a(byte[] bArr, String str, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19821a(int i, int i2, boolean z) {
                int i3 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (z) {
                        i3 = 1;
                    }
                    obtain.writeInt(i3);
                    this.f20062a.transact(C8295n.f27172h, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19820a(int i, byte[] bArr, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f20062a.transact(10012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19812a(PlayerEntity playerEntity) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (playerEntity != null) {
                        obtain.writeInt(1);
                        playerEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(15503, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19811a(AchievementEntity achievementEntity) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (achievementEntity != null) {
                        obtain.writeInt(1);
                        achievementEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(13005, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19754a(ZInvitationCluster zInvitationCluster, Account account, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (zInvitationCluster != null) {
                        obtain.writeInt(1);
                        zInvitationCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f20062a.transact(21006, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19753a(ZInvitationCluster zInvitationCluster, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (zInvitationCluster != null) {
                        obtain.writeInt(1);
                        zInvitationCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(10021, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19752a(GameRequestCluster gameRequestCluster, Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (gameRequestCluster != null) {
                        obtain.writeInt(1);
                        gameRequestCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(21005, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19751a(GameRequestCluster gameRequestCluster, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (gameRequestCluster != null) {
                        obtain.writeInt(1);
                        gameRequestCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f20062a.transact(10022, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19750a(RoomEntity roomEntity, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (roomEntity != null) {
                        obtain.writeInt(1);
                        roomEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(9011, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19747a(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f20062a.transact(18001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19741a(String str, boolean z, boolean z2, int i) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeInt(i);
                    this.f20062a.transact(12001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19738a(int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeIntArray(iArr);
                    this.f20062a.transact(12030, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19737a(ParticipantEntity[] participantEntityArr, Account account, String str, Uri uri, Uri uri2, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeTypedArray(participantEntityArr, 0);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uri2 != null) {
                        obtain.writeInt(1);
                        uri2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    this.f20062a.transact(21004, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19736a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeTypedArray(participantEntityArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uri2 != null) {
                        obtain.writeInt(1);
                        uri2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(9031, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public Intent mo19735a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeTypedArray(participantEntityArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uri2 != null) {
                        obtain.writeInt(1);
                        uri2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    this.f20062a.transact(14003, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public ParcelFileDescriptor mo19815a(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(C5384f.f19482M, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public String mo19823a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18826h, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public String mo19749a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(5064, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19822a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    this.f20062a.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19819a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(C5171e.f18824f, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19818a(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(8019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19817a(Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(22003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19816a(Account account, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.f20062a.transact(22001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19814a(IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(C5171e.f18828j, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19813a(Contents contents) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(12019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19810a(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(C5171e.f18825g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19809a(AbstractC5907i abstractC5907i, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    this.f20062a.transact(10016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19808a(AbstractC5907i abstractC5907i, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f20062a.transact(10009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19807a(AbstractC5907i abstractC5907i, int i, int i2, boolean z, boolean z2) {
                int i3 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    this.f20062a.transact(5044, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19806a(AbstractC5907i abstractC5907i, int i, int i2, String[] strArr, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(C8761b.f28058g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19805a(AbstractC5907i abstractC5907i, int i, String str, String[] strArr, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(14002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19804a(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5171e.f18812J, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19803a(AbstractC5907i abstractC5907i, int i, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeIntArray(iArr);
                    this.f20062a.transact(10018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19802a(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(5058, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19801a(AbstractC5907i abstractC5907i, long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(8018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19800a(AbstractC5907i abstractC5907i, Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(21016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19799a(AbstractC5907i abstractC5907i, Bundle bundle, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5171e.f18816N, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19798a(AbstractC5907i abstractC5907i, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f20062a.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19797a(AbstractC5907i abstractC5907i, IBinder iBinder, String str, boolean z, long j) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f20062a.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19796a(AbstractC5907i abstractC5907i, VideoConfiguration videoConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (videoConfiguration != null) {
                        obtain.writeInt(1);
                        videoConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(22022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19795a(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(C5171e.f18811I, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19794a(AbstractC5907i abstractC5907i, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(10011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19793a(AbstractC5907i abstractC5907i, String str, int i, int i2, int i3, boolean z) {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f20062a.transact(C5171e.f18814L, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19792a(AbstractC5907i abstractC5907i, String str, int i, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19791a(AbstractC5907i abstractC5907i, String str, int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(8023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19790a(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(5045, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19789a(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5384f.f19476G, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19788a(AbstractC5907i abstractC5907i, String str, int i, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeIntArray(iArr);
                    this.f20062a.transact(10019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19787a(AbstractC5907i abstractC5907i, String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f20062a.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19786a(AbstractC5907i abstractC5907i, String str, long j, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeString(str2);
                    this.f20062a.transact(C5384f.f19485P, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19785a(AbstractC5907i abstractC5907i, String str, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(C5171e.f18818P, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19784a(AbstractC5907i abstractC5907i, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (snapshotMetadataChangeEntity != null) {
                        obtain.writeInt(1);
                        snapshotMetadataChangeEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(12007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19783a(AbstractC5907i abstractC5907i, String str, VideoConfiguration videoConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (videoConfiguration != null) {
                        obtain.writeInt(1);
                        videoConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(22031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19782a(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19781a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f20062a.transact(8001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19780a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f20062a.transact(10010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19779a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3, boolean z) {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f20062a.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19778a(AbstractC5907i abstractC5907i, String str, String str2, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(9028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19777a(AbstractC5907i abstractC5907i, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (snapshotMetadataChangeEntity != null) {
                        obtain.writeInt(1);
                        snapshotMetadataChangeEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(12033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19776a(AbstractC5907i abstractC5907i, String str, String str2, VideoConfiguration videoConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (videoConfiguration != null) {
                        obtain.writeInt(1);
                        videoConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(19003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19775a(AbstractC5907i abstractC5907i, String str, String str2, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19472C, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19774a(AbstractC5907i abstractC5907i, String str, String str2, int[] iArr, int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(12015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19773a(AbstractC5907i abstractC5907i, String str, String str2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(C5375d.f19458h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19772a(AbstractC5907i abstractC5907i, String str, String str2, String[] strArr, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19771a(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(5054, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19770a(AbstractC5907i abstractC5907i, String str, boolean z, int i) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    obtain.writeInt(i);
                    this.f20062a.transact(15001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19769a(AbstractC5907i abstractC5907i, String str, boolean z, String str2, boolean z2, boolean z3) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str2);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (!z3) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(21014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19768a(AbstractC5907i abstractC5907i, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str2);
                    obtain.writeTypedArray(participantResultArr, 0);
                    this.f20062a.transact(8007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19767a(AbstractC5907i abstractC5907i, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeTypedArray(participantResultArr, 0);
                    this.f20062a.transact(8008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19766a(AbstractC5907i abstractC5907i, String str, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeIntArray(iArr);
                    this.f20062a.transact(8017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19765a(AbstractC5907i abstractC5907i, String str, String[] strArr, int i, byte[] bArr, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5375d.f19455e, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19764a(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19471B, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19763a(AbstractC5907i abstractC5907i, boolean z, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(22020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19762a(AbstractC5907i abstractC5907i, boolean z, boolean z2, Bundle bundle) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(22032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19761a(AbstractC5907i abstractC5907i, boolean z, String[] strArr) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(12031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19759a(AbstractC5907i abstractC5907i, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    this.f20062a.transact(8003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19758a(AbstractC5907i abstractC5907i, int[] iArr, int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(12010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19757a(AbstractC5907i abstractC5907i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(C5375d.f19456f, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19756a(AbstractC5907i abstractC5907i, String[] strArr, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19755a(AbstractC5910j abstractC5910j, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5910j != null ? abstractC5910j.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(15501, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19748a(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19746a(String str, Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(21003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19745a(String str, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(13002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19744a(String str, AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(20001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19743a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(5065, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19742a(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f20062a.transact(5051, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19740a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(5068, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: a */
            public void mo19734a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(15002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20062a;
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public Intent mo19732b(int i, int i2, boolean z) {
                int i3 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (z) {
                        i3 = 1;
                    }
                    obtain.writeInt(i3);
                    this.f20062a.transact(C5384f.f19501ae, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public Bundle mo19733b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18827i, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public String mo19709b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19731b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(5059, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19730b(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(8021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19729b(Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(22024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19728b(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19727b(AbstractC5907i abstractC5907i, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    this.f20062a.transact(22013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19726b(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(5046, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19725b(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(8012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19724b(AbstractC5907i abstractC5907i, long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(8020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19723b(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(C5171e.f18813K, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19722b(AbstractC5907i abstractC5907i, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(12023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19721b(AbstractC5907i abstractC5907i, String str, int i, int i2, int i3, boolean z) {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f20062a.transact(C5171e.f18815M, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19720b(AbstractC5907i abstractC5907i, String str, int i, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(C5384f.f19486Q, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19719b(AbstractC5907i abstractC5907i, String str, int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(10017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19718b(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(5501, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19717b(AbstractC5907i abstractC5907i, String str, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20062a.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19716b(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(5041, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19715b(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3, boolean z) {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f20062a.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19714b(AbstractC5907i abstractC5907i, String str, String str2, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(12018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19713b(AbstractC5907i abstractC5907i, String str, String str2, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19481L, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19712b(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19477H, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19711b(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19478I, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19710b(AbstractC5907i abstractC5907i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(C5375d.f19457g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19708b(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19707b(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(8025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19706b(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f20062a.transact(8026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: b */
            public void mo19705b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19704c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18803A, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19703c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(8013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19702c(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(C5375d.f19454d, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19701c(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(C5171e.f18817O, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19700c(AbstractC5907i abstractC5907i, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    this.f20062a.transact(22016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19699c(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(5048, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19698c(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(10001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19697c(AbstractC5907i abstractC5907i, long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(C5375d.f19453c, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19696c(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19695c(AbstractC5907i abstractC5907i, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(12024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19694c(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19693c(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(8011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19692c(AbstractC5907i abstractC5907i, String str, String str2, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19691c(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19479J, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19690c(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(8027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19689c(AbstractC5907i abstractC5907i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f20062a.transact(10020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19688c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(5050, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19687c(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(5055, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: c */
            public void mo19686c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(13001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public int mo19672d(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(5060, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public String mo19685d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18804B, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19684d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(C5375d.f19452b, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19683d(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(12014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19682d(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19681d(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5384f.f19473D, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19680d(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(12011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19679d(AbstractC5907i abstractC5907i, long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f20062a.transact(12013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19678d(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19677d(AbstractC5907i abstractC5907i, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(22029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19676d(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(9020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19675d(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(8015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19674d(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C5384f.f19480K, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19673d(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(C8995d.f28626c, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: d */
            public void mo19671d(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(10014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public Uri mo19660e(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(5066, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public String mo19670e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18809G, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19669e(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(12012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19668e(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19667e(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(C5384f.f19474E, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19666e(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(22007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19665e(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5042, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19664e(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(12021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19663e(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(8016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19662e(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19661e(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: e */
            public void mo19659e(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(12017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public Intent mo19647f(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f20062a.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public DataHolder mo19658f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C5171e.f18810H, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19657f(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(15502, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19656f(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5047, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19655f(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(22006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19654f(AbstractC5907i abstractC5907i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeLong(j);
                    this.f20062a.transact(22026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19653f(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5043, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19652f(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20062a.transact(12022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19651f(AbstractC5907i abstractC5907i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20062a.transact(12009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19650f(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(13006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19649f(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(12016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: f */
            public void mo19648f(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(8002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public Intent mo19640g(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(9004, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public void mo19645g(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(22008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public void mo19644g(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5049, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public void mo19643g(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5052, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public void mo19642g(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(22012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public void mo19641g(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(13003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: g */
            public boolean mo19646g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(5067, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public ParcelFileDescriptor mo19633h(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(9030, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public DataHolder mo19639h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(5502, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public RoomEntity mo19636h(AbstractC5907i abstractC5907i, String str) {
                RoomEntity roomEntity = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5053, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        roomEntity = RoomEntity.CREATOR.createFromParcel(obtain2);
                    }
                    return roomEntity;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public void mo19638h(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f20062a.transact(22027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public void mo19637h(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(5062, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public void mo19635h(AbstractC5907i abstractC5907i, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(22019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: h */
            public void mo19634h(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(13004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: i */
            public int mo19632i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(8024, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: i */
            public Intent mo19628i(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(12034, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: i */
            public void mo19631i(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(11001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: i */
            public void mo19630i(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(5061, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: i */
            public void mo19629i(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(17001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: j */
            public Account mo19623j(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f20062a.transact(21002, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: j */
            public void mo19627j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(8022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: j */
            public void mo19626j(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(19001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: j */
            public void mo19625j(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(C5384f.f19484O, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: j */
            public void mo19624j(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(21015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: k */
            public Intent mo19622k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9003, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: k */
            public void mo19621k(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(19004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: k */
            public void mo19620k(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(C8761b.f28059h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: k */
            public void mo19619k(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(21017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: l */
            public Intent mo19618l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C8295n.f27169e, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: l */
            public void mo19617l(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(21007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: l */
            public void mo19616l(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(8006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: l */
            public void mo19615l(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(21018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: m */
            public Intent mo19614m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9006, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: m */
            public void mo19613m(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(21008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: m */
            public void mo19612m(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(8009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: m */
            public void mo19611m(AbstractC5907i abstractC5907i, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f20062a.transact(22021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: n */
            public Intent mo19610n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(C8295n.f27171g, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: n */
            public void mo19609n(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(21009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: n */
            public void mo19608n(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(8010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: o */
            public Intent mo19607o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9010, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: o */
            public void mo19606o(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(21010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: o */
            public void mo19605o(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(8014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: p */
            public Intent mo19604p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: p */
            public void mo19603p(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(21013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: p */
            public void mo19602p(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(9002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: q */
            public Intent mo19601q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: q */
            public void mo19600q(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: q */
            public void mo19599q(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(12020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: r */
            public int mo19598r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(9019, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: r */
            public void mo19597r(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: r */
            public void mo19596r(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(12005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: s */
            public int mo19595s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(10013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: s */
            public void mo19594s(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: s */
            public void mo19593s(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(12027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: t */
            public int mo19592t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(10023, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: t */
            public void mo19591t(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: t */
            public void mo19590t(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(12008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: u */
            public Intent mo19589u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(10015, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: u */
            public void mo19588u(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: u */
            public void mo19587u(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(22004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: v */
            public void mo19586v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(11002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: v */
            public void mo19585v(AbstractC5907i abstractC5907i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    this.f20062a.transact(22028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: v */
            public void mo19584v(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(22005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: w */
            public int mo19583w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(12035, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: w */
            public void mo19582w(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(22009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: x */
            public int mo19581x() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(12036, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: x */
            public void mo19580x(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(22010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: y */
            public void mo19578y(AbstractC5907i abstractC5907i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(abstractC5907i != null ? abstractC5907i.asBinder() : null);
                    obtain.writeString(str);
                    this.f20062a.transact(22011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: y */
            public boolean mo19579y() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(12025, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5913k
            /* renamed from: z */
            public void mo19577z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f20062a.transact(15504, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC5914a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
        }

        /* renamed from: a */
        public static AbstractC5913k m19828a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5913k)) ? new C5915a(iBinder) : (AbstractC5913k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i3 = 0;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            int i4 = 0;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z30 = false;
            boolean z31 = false;
            boolean z32 = false;
            boolean z33 = false;
            boolean z34 = false;
            boolean z35 = false;
            boolean z36 = false;
            boolean z37 = false;
            boolean z38 = false;
            boolean z39 = false;
            boolean z40 = false;
            boolean z41 = false;
            boolean z42 = false;
            boolean z43 = false;
            boolean z44 = false;
            int i5 = 0;
            boolean z45 = false;
            switch (i) {
                case C5171e.f18824f /* 5001 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18825g /* 5002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18826h /* 5003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case C5171e.f18827i /* 5004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Bundle b = b();
                    parcel2.writeNoException();
                    if (b == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                case C5171e.f18828j /* 5005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18803A /* 5006 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c();
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18804B /* 5007 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String d = d();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case C5171e.f18809G /* 5012 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case C5171e.f18810H /* 5013 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    DataHolder f = f();
                    parcel2.writeNoException();
                    if (f == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                case C5171e.f18811I /* 5014 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18812J /* 5015 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    boolean z46 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    a(m19936a, readInt, z46, z2);
                    parcel2.writeNoException();
                    return true;
                case 5016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 5017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18813K /* 5018 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18814L /* 5019 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18815M /* 5020 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18816N /* 5021 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18817O /* 5022 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18818P /* 5023 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5024:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5025:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5026:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5027:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5028:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5029:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5030:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a2 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    int readInt2 = parcel.readInt();
                    String[] createStringArray = parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    a(m19936a2, readStrongBinder, readInt2, createStringArray, bundle, z3, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 5031:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 5032:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5033:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int a2 = a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    return true;
                case 5034:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int a3 = a(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(a3);
                    return true;
                case 5035:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String b2 = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(b2);
                    return true;
                case 5036:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5037:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5038:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5039:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a3 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    a(m19936a3, readString, readString2, readInt3, readInt4, readInt5, z4);
                    parcel2.writeNoException();
                    return true;
                case 5040:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a4 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    int readInt7 = parcel.readInt();
                    int readInt8 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    b(m19936a4, readString3, readString4, readInt6, readInt7, readInt8, z5);
                    parcel2.writeNoException();
                    return true;
                case 5041:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5042:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5043:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5044:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5045:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5046:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a5 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    boolean z47 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    }
                    b(m19936a5, readInt9, z47, z6);
                    parcel2.writeNoException();
                    return true;
                case 5047:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5048:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a6 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    boolean z48 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    }
                    c(m19936a6, readInt10, z48, z7);
                    parcel2.writeNoException();
                    return true;
                case 5049:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    g(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5050:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5051:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5052:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    g(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5053:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    RoomEntity h = h(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    if (h == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    h.writeToParcel(parcel2, 1);
                    return true;
                case 5054:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a7 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    a(m19936a7, readString5, z8);
                    parcel2.writeNoException();
                    return true;
                case 5055:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5058:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 5059:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 5060:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int d2 = d(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(d2);
                    return true;
                case 5061:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    i(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5062:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    h(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5064:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String a4 = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a4);
                    return true;
                case 5065:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5066:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Uri e2 = e(parcel.readString());
                    parcel2.writeNoException();
                    if (e2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    e2.writeToParcel(parcel2, 1);
                    return true;
                case 5067:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    boolean g = g();
                    parcel2.writeNoException();
                    if (g) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5068:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    a(z9);
                    parcel2.writeNoException();
                    return true;
                case 5501:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5502:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    DataHolder h2 = h();
                    parcel2.writeNoException();
                    if (h2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    h2.writeToParcel(parcel2, 1);
                    return true;
                case C5384f.f19471B /* 6001 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a8 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    a(m19936a8, z10);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19472C /* 6002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a9 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    a(m19936a9, readString6, readString7, z11);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19473D /* 6003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a10 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    boolean z49 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z12 = true;
                    }
                    d(m19936a10, readInt11, z49, z12);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19474E /* 6004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a11 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt12 = parcel.readInt();
                    boolean z50 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z13 = true;
                    }
                    e(m19936a11, readInt12, z50, z13);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19476G /* 6501 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a12 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    int readInt13 = parcel.readInt();
                    boolean z51 = parcel.readInt() != 0;
                    boolean z52 = parcel.readInt() != 0;
                    boolean z53 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z14 = true;
                    }
                    a(m19936a12, readString8, readInt13, z51, z52, z53, z14);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19477H /* 6502 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a13 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z15 = true;
                    }
                    b(m19936a13, readString9, z15);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19478I /* 6503 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a14 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z16 = true;
                    }
                    b(m19936a14, z16);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19479J /* 6504 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a15 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z17 = true;
                    }
                    c(m19936a15, readString10, z17);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19480K /* 6505 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a16 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z18 = true;
                    }
                    d(m19936a16, readString11, z18);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19481L /* 6506 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a17 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z19 = true;
                    }
                    b(m19936a17, readString12, readString13, z19);
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19482M /* 6507 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    ParcelFileDescriptor a5 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a5 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a5.writeToParcel(parcel2, 1);
                    return true;
                case C5384f.f19484O /* 7001 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    j(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19485P /* 7002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19486Q /* 7003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case C8761b.f28058g /* 8004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C8761b.f28059h /* 8005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    k(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    l(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readString(), (ParticipantResult[]) parcel.createTypedArray(ParticipantResult.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 8008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), (ParticipantResult[]) parcel.createTypedArray(ParticipantResult.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 8009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    m(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    n(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 8013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 8014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    o(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case 8018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8021:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8022:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    j();
                    parcel2.writeNoException();
                    return true;
                case 8023:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a18 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    int readInt14 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z20 = true;
                    }
                    a(m19936a18, readString14, readInt14, z20);
                    parcel2.writeNoException();
                    return true;
                case 8024:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int i6 = i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i6);
                    return true;
                case 8025:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8026:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8027:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a19 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z21 = true;
                    }
                    c(m19936a19, z21);
                    parcel2.writeNoException();
                    return true;
                case 9001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    p(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent k = k();
                    parcel2.writeNoException();
                    if (k == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    k.writeToParcel(parcel2, 1);
                    return true;
                case 9004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent g2 = g(parcel.readString());
                    parcel2.writeNoException();
                    if (g2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    g2.writeToParcel(parcel2, 1);
                    return true;
                case C8295n.f27169e /* 9005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent l = l();
                    parcel2.writeNoException();
                    if (l == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    l.writeToParcel(parcel2, 1);
                    return true;
                case 9006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent m = m();
                    parcel2.writeNoException();
                    if (m == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    m.writeToParcel(parcel2, 1);
                    return true;
                case C8295n.f27171g /* 9007 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent n = n();
                    parcel2.writeNoException();
                    if (n == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    n.writeToParcel(parcel2, 1);
                    return true;
                case C8295n.f27172h /* 9008 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a6 = a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (a6 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a6.writeToParcel(parcel2, 1);
                    return true;
                case C5384f.f19501ae /* 9009 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent b3 = b(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (b3 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    b3.writeToParcel(parcel2, 1);
                    return true;
                case 9010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent o = o();
                    parcel2.writeNoException();
                    if (o == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    o.writeToParcel(parcel2, 1);
                    return true;
                case 9011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a7 = a(parcel.readInt() != 0 ? RoomEntity.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    if (a7 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a7.writeToParcel(parcel2, 1);
                    return true;
                case 9012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent p = p();
                    parcel2.writeNoException();
                    if (p == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    p.writeToParcel(parcel2, 1);
                    return true;
                case 9013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent q = q();
                    parcel2.writeNoException();
                    if (q == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    q.writeToParcel(parcel2, 1);
                    return true;
                case 9019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int r = r();
                    parcel2.writeNoException();
                    parcel2.writeInt(r);
                    return true;
                case 9020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9028:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9030:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    ParcelFileDescriptor h3 = h(parcel.readString());
                    parcel2.writeNoException();
                    if (h3 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    h3.writeToParcel(parcel2, 1);
                    return true;
                case 9031:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a8 = a((ParticipantEntity[]) parcel.createTypedArray(ParticipantEntity.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a8 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a8.writeToParcel(parcel2, 1);
                    return true;
                case 10001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19452b /* 10002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19453c /* 10003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19454d /* 10004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19455e /* 10005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19456f /* 10006 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19457g /* 10007 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19458h /* 10008 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 10009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a9 = a(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    if (a9 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a9.writeToParcel(parcel2, 1);
                    return true;
                case 10013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int s = s();
                    parcel2.writeNoException();
                    parcel2.writeInt(s);
                    return true;
                case 10014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent u = u();
                    parcel2.writeNoException();
                    if (u == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    u.writeToParcel(parcel2, 1);
                    return true;
                case 10016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a20 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString15 = parcel.readString();
                    int readInt15 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z22 = true;
                    }
                    b(m19936a20, readString15, readInt15, z22);
                    parcel2.writeNoException();
                    return true;
                case 10018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt(), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case 10019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case 10020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 10021:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a10 = a(parcel.readInt() != 0 ? (ZInvitationCluster) ZInvitationCluster.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a10 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a10.writeToParcel(parcel2, 1);
                    return true;
                case 10022:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a11 = a(parcel.readInt() != 0 ? (GameRequestCluster) GameRequestCluster.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    if (a11 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a11.writeToParcel(parcel2, 1);
                    return true;
                case 10023:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int t = t();
                    parcel2.writeNoException();
                    parcel2.writeInt(t);
                    return true;
                case 11001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    i(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    v();
                    parcel2.writeNoException();
                    return true;
                case 12001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a12 = a(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    if (a12 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a12.writeToParcel(parcel2, 1);
                    return true;
                case C8995d.f28626c /* 12002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a21 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z23 = true;
                    }
                    d(m19936a21, z23);
                    parcel2.writeNoException();
                    return true;
                case 12003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a22 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z24 = true;
                    }
                    c(m19936a22, readString16, readString17, z24);
                    parcel2.writeNoException();
                    return true;
                case 12005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    r(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a23 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString18 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z25 = true;
                    }
                    e(m19936a23, readString18, z25);
                    parcel2.writeNoException();
                    return true;
                case 12007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (SnapshotMetadataChangeEntity) SnapshotMetadataChangeEntity.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    t(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a24 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int[] createIntArray = parcel.createIntArray();
                    int readInt16 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z30 = true;
                    }
                    a(m19936a24, createIntArray, readInt16, z30);
                    parcel2.writeNoException();
                    return true;
                case 12011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 12012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 12013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a25 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z28 = true;
                    }
                    f(m19936a25, z28);
                    parcel2.writeNoException();
                    return true;
                case 12017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    q(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12021:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12022:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12023:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12024:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12025:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    boolean y = y();
                    parcel2.writeNoException();
                    if (y) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 12026:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if (parcel.readInt() != 0) {
                        z26 = true;
                    }
                    b(z26);
                    parcel2.writeNoException();
                    return true;
                case 12027:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    s(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12028:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12029:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a26 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String[] createStringArray2 = parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        z31 = true;
                    }
                    a(m19936a26, createStringArray2, z31);
                    parcel2.writeNoException();
                    return true;
                case 12030:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a13 = a(parcel.createIntArray());
                    parcel2.writeNoException();
                    if (a13 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a13.writeToParcel(parcel2, 1);
                    return true;
                case 12031:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a27 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z29 = true;
                    }
                    a(m19936a27, z29, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 12032:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a28 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z27 = true;
                    }
                    e(m19936a28, z27);
                    parcel2.writeNoException();
                    return true;
                case 12033:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (SnapshotMetadataChangeEntity) SnapshotMetadataChangeEntity.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12034:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent i7 = i(parcel.readString());
                    parcel2.writeNoException();
                    if (i7 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    i7.writeToParcel(parcel2, 1);
                    return true;
                case 12035:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int w = w();
                    parcel2.writeNoException();
                    parcel2.writeInt(w);
                    return true;
                case 12036:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int x = x();
                    parcel2.writeNoException();
                    parcel2.writeInt(x);
                    return true;
                case 13001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if (parcel.readInt() != 0) {
                        z32 = true;
                    }
                    c(z32);
                    parcel2.writeNoException();
                    return true;
                case 13002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a29 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z33 = true;
                    }
                    g(m19936a29, z33);
                    parcel2.writeNoException();
                    return true;
                case 13004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a30 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z34 = true;
                    }
                    h(m19936a30, z34);
                    parcel2.writeNoException();
                    return true;
                case 13005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a14 = a(parcel.readInt() != 0 ? AchievementEntity.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a14 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a14.writeToParcel(parcel2, 1);
                    return true;
                case 13006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a31 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString19 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z35 = true;
                    }
                    f(m19936a31, readString19, z35);
                    parcel2.writeNoException();
                    return true;
                case 14001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent f2 = f(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    if (f2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    f2.writeToParcel(parcel2, 1);
                    return true;
                case 14002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 14003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a15 = a((ParticipantEntity[]) parcel.createTypedArray(ParticipantEntity.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    if (a15 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a15.writeToParcel(parcel2, 1);
                    return true;
                case 15001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a32 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString20 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z36 = true;
                    }
                    a(m19936a32, readString20, z36, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 15501:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5910j.AbstractBinderC5911a.m19830a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 15502:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 15503:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a16 = a(parcel.readInt() != 0 ? PlayerEntity.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a16 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a16.writeToParcel(parcel2, 1);
                    return true;
                case 15504:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    z();
                    parcel2.writeNoException();
                    return true;
                case 17001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a33 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z37 = true;
                    }
                    i(m19936a33, z37);
                    parcel2.writeNoException();
                    return true;
                case 18001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a17 = a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (a17 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a17.writeToParcel(parcel2, 1);
                    return true;
                case 19001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    j(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent A = A();
                    parcel2.writeNoException();
                    if (A == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    A.writeToParcel(parcel2, 1);
                    return true;
                case 19003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? VideoConfiguration.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 19004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    k(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Account B = B();
                    parcel2.writeNoException();
                    if (B == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    B.writeToParcel(parcel2, 1);
                    return true;
                case 21002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Account j = j(parcel.readString());
                    parcel2.writeNoException();
                    if (j == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                case 21003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readString(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 21004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a18 = a((ParticipantEntity[]) parcel.createTypedArray(ParticipantEntity.CREATOR), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    if (a18 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a18.writeToParcel(parcel2, 1);
                    return true;
                case 21005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a19 = a(parcel.readInt() != 0 ? (GameRequestCluster) GameRequestCluster.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a19 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a19.writeToParcel(parcel2, 1);
                    return true;
                case 21006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent a20 = a(parcel.readInt() != 0 ? (ZInvitationCluster) ZInvitationCluster.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    if (a20 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a20.writeToParcel(parcel2, 1);
                    return true;
                case 21007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    l(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    m(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    n(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    o(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    p(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 21015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a34 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z38 = true;
                    }
                    j(m19936a34, z38);
                    parcel2.writeNoException();
                    return true;
                case 21016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 21017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a35 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z39 = true;
                    }
                    k(m19936a35, z39);
                    parcel2.writeNoException();
                    return true;
                case 21018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a36 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z40 = true;
                    }
                    l(m19936a36, z40);
                    parcel2.writeNoException();
                    return true;
                case 22001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 22003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    u(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    v(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a37 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    int readInt17 = parcel.readInt();
                    boolean z54 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z41 = true;
                    }
                    f(m19936a37, readInt17, z54, z41);
                    parcel2.writeNoException();
                    return true;
                case 22007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    e(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 22008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    g(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 22009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    w(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    x(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    y(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a38 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString21 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z42 = true;
                    }
                    g(m19936a38, readString21, z42);
                    parcel2.writeNoException();
                    return true;
                case 22013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    q(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    r(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    c(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    s(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    t(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a39 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    String readString22 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z43 = true;
                    }
                    h(m19936a39, readString22, z43);
                    parcel2.writeNoException();
                    return true;
                case 22020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a40 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    boolean z55 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z45 = true;
                    }
                    a(m19936a40, z55, z45);
                    parcel2.writeNoException();
                    return true;
                case 22021:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a41 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z44 = true;
                    }
                    m(m19936a41, z44);
                    parcel2.writeNoException();
                    return true;
                case 22022:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readInt() != 0 ? VideoConfiguration.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22023:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    u(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22024:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    b(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22025:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Account D = D();
                    parcel2.writeNoException();
                    if (D == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    D.writeToParcel(parcel2, 1);
                    return true;
                case 22026:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    f(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 22027:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    h(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 22028:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    v(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22029:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    d(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22030:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    boolean C = C();
                    parcel2.writeNoException();
                    if (C) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 22031:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    a(AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? VideoConfiguration.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22032:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    AbstractC5907i m19936a42 = AbstractC5907i.AbstractBinderC5908a.m19936a(parcel.readStrongBinder());
                    boolean z56 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(m19936a42, z56, z, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.games.internal.IGamesService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: A */
    Intent mo19827A();

    /* renamed from: B */
    Account mo19826B();

    /* renamed from: C */
    boolean mo19825C();

    /* renamed from: D */
    Account mo19824D();

    /* renamed from: a */
    int mo19760a(AbstractC5907i abstractC5907i, byte[] bArr, String str, String str2);

    /* renamed from: a */
    int mo19739a(byte[] bArr, String str, String[] strArr);

    /* renamed from: a */
    Intent mo19821a(int i, int i2, boolean z);

    /* renamed from: a */
    Intent mo19820a(int i, byte[] bArr, int i2, String str);

    /* renamed from: a */
    Intent mo19812a(PlayerEntity playerEntity);

    /* renamed from: a */
    Intent mo19811a(AchievementEntity achievementEntity);

    /* renamed from: a */
    Intent mo19754a(ZInvitationCluster zInvitationCluster, Account account, String str);

    /* renamed from: a */
    Intent mo19753a(ZInvitationCluster zInvitationCluster, String str, String str2);

    /* renamed from: a */
    Intent mo19752a(GameRequestCluster gameRequestCluster, Account account);

    /* renamed from: a */
    Intent mo19751a(GameRequestCluster gameRequestCluster, String str);

    /* renamed from: a */
    Intent mo19750a(RoomEntity roomEntity, int i);

    /* renamed from: a */
    Intent mo19747a(String str, int i, int i2);

    /* renamed from: a */
    Intent mo19741a(String str, boolean z, boolean z2, int i);

    /* renamed from: a */
    Intent mo19738a(int[] iArr);

    /* renamed from: a */
    Intent mo19737a(ParticipantEntity[] participantEntityArr, Account account, String str, Uri uri, Uri uri2, String str2);

    /* renamed from: a */
    Intent mo19736a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2);

    /* renamed from: a */
    Intent mo19735a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2, String str3);

    /* renamed from: a */
    ParcelFileDescriptor mo19815a(Uri uri);

    /* renamed from: a */
    String mo19823a();

    /* renamed from: a */
    String mo19749a(String str);

    /* renamed from: a */
    void mo19822a(int i);

    /* renamed from: a */
    void mo19819a(long j);

    /* renamed from: a */
    void mo19818a(long j, String str);

    /* renamed from: a */
    void mo19817a(Account account);

    /* renamed from: a */
    void mo19816a(Account account, byte[] bArr);

    /* renamed from: a */
    void mo19814a(IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo19813a(Contents contents);

    /* renamed from: a */
    void mo19810a(AbstractC5907i abstractC5907i);

    /* renamed from: a */
    void mo19809a(AbstractC5907i abstractC5907i, int i);

    /* renamed from: a */
    void mo19808a(AbstractC5907i abstractC5907i, int i, int i2, int i3);

    /* renamed from: a */
    void mo19807a(AbstractC5907i abstractC5907i, int i, int i2, boolean z, boolean z2);

    /* renamed from: a */
    void mo19806a(AbstractC5907i abstractC5907i, int i, int i2, String[] strArr, Bundle bundle);

    /* renamed from: a */
    void mo19805a(AbstractC5907i abstractC5907i, int i, String str, String[] strArr, boolean z);

    /* renamed from: a */
    void mo19804a(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo19803a(AbstractC5907i abstractC5907i, int i, int[] iArr);

    /* renamed from: a */
    void mo19802a(AbstractC5907i abstractC5907i, long j);

    /* renamed from: a */
    void mo19801a(AbstractC5907i abstractC5907i, long j, String str);

    /* renamed from: a */
    void mo19800a(AbstractC5907i abstractC5907i, Account account);

    /* renamed from: a */
    void mo19799a(AbstractC5907i abstractC5907i, Bundle bundle, int i, int i2);

    /* renamed from: a */
    void mo19798a(AbstractC5907i abstractC5907i, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j);

    /* renamed from: a */
    void mo19797a(AbstractC5907i abstractC5907i, IBinder iBinder, String str, boolean z, long j);

    /* renamed from: a */
    void mo19796a(AbstractC5907i abstractC5907i, VideoConfiguration videoConfiguration);

    /* renamed from: a */
    void mo19795a(AbstractC5907i abstractC5907i, String str);

    /* renamed from: a */
    void mo19794a(AbstractC5907i abstractC5907i, String str, int i);

    /* renamed from: a */
    void mo19793a(AbstractC5907i abstractC5907i, String str, int i, int i2, int i3, boolean z);

    /* renamed from: a */
    void mo19792a(AbstractC5907i abstractC5907i, String str, int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo19791a(AbstractC5907i abstractC5907i, String str, int i, boolean z);

    /* renamed from: a */
    void mo19790a(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo19789a(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    void mo19788a(AbstractC5907i abstractC5907i, String str, int i, int[] iArr);

    /* renamed from: a */
    void mo19787a(AbstractC5907i abstractC5907i, String str, long j);

    /* renamed from: a */
    void mo19786a(AbstractC5907i abstractC5907i, String str, long j, String str2);

    /* renamed from: a */
    void mo19785a(AbstractC5907i abstractC5907i, String str, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo19784a(AbstractC5907i abstractC5907i, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents);

    /* renamed from: a */
    void mo19783a(AbstractC5907i abstractC5907i, String str, VideoConfiguration videoConfiguration);

    /* renamed from: a */
    void mo19782a(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: a */
    void mo19781a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2);

    /* renamed from: a */
    void mo19780a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3);

    /* renamed from: a */
    void mo19779a(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3, boolean z);

    /* renamed from: a */
    void mo19778a(AbstractC5907i abstractC5907i, String str, String str2, int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo19777a(AbstractC5907i abstractC5907i, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents);

    /* renamed from: a */
    void mo19776a(AbstractC5907i abstractC5907i, String str, String str2, VideoConfiguration videoConfiguration);

    /* renamed from: a */
    void mo19775a(AbstractC5907i abstractC5907i, String str, String str2, boolean z);

    /* renamed from: a */
    void mo19774a(AbstractC5907i abstractC5907i, String str, String str2, int[] iArr, int i, boolean z);

    /* renamed from: a */
    void mo19773a(AbstractC5907i abstractC5907i, String str, String str2, String[] strArr);

    /* renamed from: a */
    void mo19772a(AbstractC5907i abstractC5907i, String str, String str2, String[] strArr, boolean z);

    /* renamed from: a */
    void mo19771a(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: a */
    void mo19770a(AbstractC5907i abstractC5907i, String str, boolean z, int i);

    /* renamed from: a */
    void mo19769a(AbstractC5907i abstractC5907i, String str, boolean z, String str2, boolean z2, boolean z3);

    /* renamed from: a */
    void mo19768a(AbstractC5907i abstractC5907i, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr);

    /* renamed from: a */
    void mo19767a(AbstractC5907i abstractC5907i, String str, byte[] bArr, ParticipantResult[] participantResultArr);

    /* renamed from: a */
    void mo19766a(AbstractC5907i abstractC5907i, String str, int[] iArr);

    /* renamed from: a */
    void mo19765a(AbstractC5907i abstractC5907i, String str, String[] strArr, int i, byte[] bArr, int i2);

    /* renamed from: a */
    void mo19764a(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: a */
    void mo19763a(AbstractC5907i abstractC5907i, boolean z, boolean z2);

    /* renamed from: a */
    void mo19762a(AbstractC5907i abstractC5907i, boolean z, boolean z2, Bundle bundle);

    /* renamed from: a */
    void mo19761a(AbstractC5907i abstractC5907i, boolean z, String[] strArr);

    /* renamed from: a */
    void mo19759a(AbstractC5907i abstractC5907i, int[] iArr);

    /* renamed from: a */
    void mo19758a(AbstractC5907i abstractC5907i, int[] iArr, int i, boolean z);

    /* renamed from: a */
    void mo19757a(AbstractC5907i abstractC5907i, String[] strArr);

    /* renamed from: a */
    void mo19756a(AbstractC5907i abstractC5907i, String[] strArr, boolean z);

    /* renamed from: a */
    void mo19755a(AbstractC5910j abstractC5910j, long j);

    /* renamed from: a */
    void mo19748a(String str, int i);

    /* renamed from: a */
    void mo19746a(String str, Account account);

    /* renamed from: a */
    void mo19745a(String str, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo19744a(String str, AbstractC5907i abstractC5907i);

    /* renamed from: a */
    void mo19743a(String str, String str2);

    /* renamed from: a */
    void mo19742a(String str, String str2, int i);

    /* renamed from: a */
    void mo19740a(boolean z);

    /* renamed from: a */
    void mo19734a(String[] strArr);

    /* renamed from: b */
    Intent mo19732b(int i, int i2, boolean z);

    /* renamed from: b */
    Bundle mo19733b();

    /* renamed from: b */
    String mo19709b(String str);

    /* renamed from: b */
    void mo19731b(long j);

    /* renamed from: b */
    void mo19730b(long j, String str);

    /* renamed from: b */
    void mo19729b(Account account);

    /* renamed from: b */
    void mo19728b(AbstractC5907i abstractC5907i);

    /* renamed from: b */
    void mo19727b(AbstractC5907i abstractC5907i, int i);

    /* renamed from: b */
    void mo19726b(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: b */
    void mo19725b(AbstractC5907i abstractC5907i, long j);

    /* renamed from: b */
    void mo19724b(AbstractC5907i abstractC5907i, long j, String str);

    /* renamed from: b */
    void mo19723b(AbstractC5907i abstractC5907i, String str);

    /* renamed from: b */
    void mo19722b(AbstractC5907i abstractC5907i, String str, int i);

    /* renamed from: b */
    void mo19721b(AbstractC5907i abstractC5907i, String str, int i, int i2, int i3, boolean z);

    /* renamed from: b */
    void mo19720b(AbstractC5907i abstractC5907i, String str, int i, IBinder iBinder, Bundle bundle);

    /* renamed from: b */
    void mo19719b(AbstractC5907i abstractC5907i, String str, int i, boolean z);

    /* renamed from: b */
    void mo19718b(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: b */
    void mo19717b(AbstractC5907i abstractC5907i, String str, IBinder iBinder, Bundle bundle);

    /* renamed from: b */
    void mo19716b(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: b */
    void mo19715b(AbstractC5907i abstractC5907i, String str, String str2, int i, int i2, int i3, boolean z);

    /* renamed from: b */
    void mo19714b(AbstractC5907i abstractC5907i, String str, String str2, int i, boolean z, boolean z2);

    /* renamed from: b */
    void mo19713b(AbstractC5907i abstractC5907i, String str, String str2, boolean z);

    /* renamed from: b */
    void mo19712b(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: b */
    void mo19711b(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: b */
    void mo19710b(AbstractC5907i abstractC5907i, String[] strArr);

    /* renamed from: b */
    void mo19708b(String str, int i);

    /* renamed from: b */
    void mo19707b(String str, String str2);

    /* renamed from: b */
    void mo19706b(String str, String str2, int i);

    /* renamed from: b */
    void mo19705b(boolean z);

    /* renamed from: c */
    void mo19704c();

    /* renamed from: c */
    void mo19703c(long j);

    /* renamed from: c */
    void mo19702c(long j, String str);

    /* renamed from: c */
    void mo19701c(AbstractC5907i abstractC5907i);

    /* renamed from: c */
    void mo19700c(AbstractC5907i abstractC5907i, int i);

    /* renamed from: c */
    void mo19699c(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: c */
    void mo19698c(AbstractC5907i abstractC5907i, long j);

    /* renamed from: c */
    void mo19697c(AbstractC5907i abstractC5907i, long j, String str);

    /* renamed from: c */
    void mo19696c(AbstractC5907i abstractC5907i, String str);

    /* renamed from: c */
    void mo19695c(AbstractC5907i abstractC5907i, String str, int i);

    /* renamed from: c */
    void mo19694c(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: c */
    void mo19693c(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: c */
    void mo19692c(AbstractC5907i abstractC5907i, String str, String str2, boolean z);

    /* renamed from: c */
    void mo19691c(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: c */
    void mo19690c(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: c */
    void mo19689c(AbstractC5907i abstractC5907i, String[] strArr);

    /* renamed from: c */
    void mo19688c(String str);

    /* renamed from: c */
    void mo19687c(String str, int i);

    /* renamed from: c */
    void mo19686c(boolean z);

    /* renamed from: d */
    int mo19672d(String str);

    /* renamed from: d */
    String mo19685d();

    /* renamed from: d */
    void mo19684d(long j);

    /* renamed from: d */
    void mo19683d(long j, String str);

    /* renamed from: d */
    void mo19682d(AbstractC5907i abstractC5907i);

    /* renamed from: d */
    void mo19681d(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: d */
    void mo19680d(AbstractC5907i abstractC5907i, long j);

    /* renamed from: d */
    void mo19679d(AbstractC5907i abstractC5907i, long j, String str);

    /* renamed from: d */
    void mo19678d(AbstractC5907i abstractC5907i, String str);

    /* renamed from: d */
    void mo19677d(AbstractC5907i abstractC5907i, String str, int i);

    /* renamed from: d */
    void mo19676d(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: d */
    void mo19675d(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: d */
    void mo19674d(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: d */
    void mo19673d(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: d */
    void mo19671d(String str, int i);

    /* renamed from: e */
    Uri mo19660e(String str);

    /* renamed from: e */
    String mo19670e();

    /* renamed from: e */
    void mo19669e(long j);

    /* renamed from: e */
    void mo19668e(AbstractC5907i abstractC5907i);

    /* renamed from: e */
    void mo19667e(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: e */
    void mo19666e(AbstractC5907i abstractC5907i, long j);

    /* renamed from: e */
    void mo19665e(AbstractC5907i abstractC5907i, String str);

    /* renamed from: e */
    void mo19664e(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: e */
    void mo19663e(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: e */
    void mo19662e(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: e */
    void mo19661e(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: e */
    void mo19659e(String str, int i);

    /* renamed from: f */
    Intent mo19647f(String str, int i);

    /* renamed from: f */
    DataHolder mo19658f();

    /* renamed from: f */
    void mo19657f(long j);

    /* renamed from: f */
    void mo19656f(AbstractC5907i abstractC5907i);

    /* renamed from: f */
    void mo19655f(AbstractC5907i abstractC5907i, int i, boolean z, boolean z2);

    /* renamed from: f */
    void mo19654f(AbstractC5907i abstractC5907i, long j);

    /* renamed from: f */
    void mo19653f(AbstractC5907i abstractC5907i, String str);

    /* renamed from: f */
    void mo19652f(AbstractC5907i abstractC5907i, String str, int i, boolean z, boolean z2);

    /* renamed from: f */
    void mo19651f(AbstractC5907i abstractC5907i, String str, String str2);

    /* renamed from: f */
    void mo19650f(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: f */
    void mo19649f(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: f */
    void mo19648f(String str);

    /* renamed from: g */
    Intent mo19640g(String str);

    /* renamed from: g */
    void mo19645g(long j);

    /* renamed from: g */
    void mo19644g(AbstractC5907i abstractC5907i);

    /* renamed from: g */
    void mo19643g(AbstractC5907i abstractC5907i, String str);

    /* renamed from: g */
    void mo19642g(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: g */
    void mo19641g(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: g */
    boolean mo19646g();

    /* renamed from: h */
    ParcelFileDescriptor mo19633h(String str);

    /* renamed from: h */
    DataHolder mo19639h();

    /* renamed from: h */
    RoomEntity mo19636h(AbstractC5907i abstractC5907i, String str);

    /* renamed from: h */
    void mo19638h(long j);

    /* renamed from: h */
    void mo19637h(AbstractC5907i abstractC5907i);

    /* renamed from: h */
    void mo19635h(AbstractC5907i abstractC5907i, String str, boolean z);

    /* renamed from: h */
    void mo19634h(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: i */
    int mo19632i();

    /* renamed from: i */
    Intent mo19628i(String str);

    /* renamed from: i */
    void mo19631i(AbstractC5907i abstractC5907i);

    /* renamed from: i */
    void mo19630i(AbstractC5907i abstractC5907i, String str);

    /* renamed from: i */
    void mo19629i(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: j */
    Account mo19623j(String str);

    /* renamed from: j */
    void mo19627j();

    /* renamed from: j */
    void mo19626j(AbstractC5907i abstractC5907i);

    /* renamed from: j */
    void mo19625j(AbstractC5907i abstractC5907i, String str);

    /* renamed from: j */
    void mo19624j(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: k */
    Intent mo19622k();

    /* renamed from: k */
    void mo19621k(AbstractC5907i abstractC5907i);

    /* renamed from: k */
    void mo19620k(AbstractC5907i abstractC5907i, String str);

    /* renamed from: k */
    void mo19619k(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: l */
    Intent mo19618l();

    /* renamed from: l */
    void mo19617l(AbstractC5907i abstractC5907i);

    /* renamed from: l */
    void mo19616l(AbstractC5907i abstractC5907i, String str);

    /* renamed from: l */
    void mo19615l(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: m */
    Intent mo19614m();

    /* renamed from: m */
    void mo19613m(AbstractC5907i abstractC5907i);

    /* renamed from: m */
    void mo19612m(AbstractC5907i abstractC5907i, String str);

    /* renamed from: m */
    void mo19611m(AbstractC5907i abstractC5907i, boolean z);

    /* renamed from: n */
    Intent mo19610n();

    /* renamed from: n */
    void mo19609n(AbstractC5907i abstractC5907i);

    /* renamed from: n */
    void mo19608n(AbstractC5907i abstractC5907i, String str);

    /* renamed from: o */
    Intent mo19607o();

    /* renamed from: o */
    void mo19606o(AbstractC5907i abstractC5907i);

    /* renamed from: o */
    void mo19605o(AbstractC5907i abstractC5907i, String str);

    /* renamed from: p */
    Intent mo19604p();

    /* renamed from: p */
    void mo19603p(AbstractC5907i abstractC5907i);

    /* renamed from: p */
    void mo19602p(AbstractC5907i abstractC5907i, String str);

    /* renamed from: q */
    Intent mo19601q();

    /* renamed from: q */
    void mo19600q(AbstractC5907i abstractC5907i);

    /* renamed from: q */
    void mo19599q(AbstractC5907i abstractC5907i, String str);

    /* renamed from: r */
    int mo19598r();

    /* renamed from: r */
    void mo19597r(AbstractC5907i abstractC5907i);

    /* renamed from: r */
    void mo19596r(AbstractC5907i abstractC5907i, String str);

    /* renamed from: s */
    int mo19595s();

    /* renamed from: s */
    void mo19594s(AbstractC5907i abstractC5907i);

    /* renamed from: s */
    void mo19593s(AbstractC5907i abstractC5907i, String str);

    /* renamed from: t */
    int mo19592t();

    /* renamed from: t */
    void mo19591t(AbstractC5907i abstractC5907i);

    /* renamed from: t */
    void mo19590t(AbstractC5907i abstractC5907i, String str);

    /* renamed from: u */
    Intent mo19589u();

    /* renamed from: u */
    void mo19588u(AbstractC5907i abstractC5907i);

    /* renamed from: u */
    void mo19587u(AbstractC5907i abstractC5907i, String str);

    /* renamed from: v */
    void mo19586v();

    /* renamed from: v */
    void mo19585v(AbstractC5907i abstractC5907i);

    /* renamed from: v */
    void mo19584v(AbstractC5907i abstractC5907i, String str);

    /* renamed from: w */
    int mo19583w();

    /* renamed from: w */
    void mo19582w(AbstractC5907i abstractC5907i, String str);

    /* renamed from: x */
    int mo19581x();

    /* renamed from: x */
    void mo19580x(AbstractC5907i abstractC5907i, String str);

    /* renamed from: y */
    void mo19578y(AbstractC5907i abstractC5907i, String str);

    /* renamed from: y */
    boolean mo19579y();

    /* renamed from: z */
    void mo19577z();
}
