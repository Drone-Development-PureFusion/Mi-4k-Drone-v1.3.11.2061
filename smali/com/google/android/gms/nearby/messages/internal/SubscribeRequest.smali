.class public final Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/j;

.field public final c:Lcom/google/android/gms/nearby/messages/Strategy;

.field public final d:Lcom/google/android/gms/nearby/messages/internal/k;

.field public final e:Lcom/google/android/gms/nearby/messages/MessageFilter;

.field public final f:Landroid/app/PendingIntent;

.field public final g:I

.field public final h:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final j:[B

.field public final k:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final l:Lcom/google/android/gms/nearby/messages/internal/o;

.field public final m:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final n:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/y;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;[BZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;Z)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/j$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/j;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->c:Lcom/google/android/gms/nearby/messages/Strategy;

    invoke-static {p4}, Lcom/google/android/gms/nearby/messages/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/k;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->d:Lcom/google/android/gms/nearby/messages/internal/k;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->e:Lcom/google/android/gms/nearby/messages/MessageFilter;

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->f:Landroid/app/PendingIntent;

    iput p7, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->g:I

    iput-object p8, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->j:[B

    iput-boolean p11, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->k:Z

    if-nez p12, :cond_0

    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lcom/google/android/gms/nearby/messages/internal/o;

    iput-boolean p13, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->m:Z

    move-object/from16 v0, p14

    invoke-static {v0, p9, p8, p13}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->a(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->n:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move/from16 v0, p15

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->o:Z

    return-void

    :cond_0
    invoke-static {p12}, Lcom/google/android/gms/nearby/messages/internal/o$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/o;

    move-result-object v1

    goto :goto_0
.end method

.method public constructor <init>(Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;I[BLandroid/os/IBinder;Z)V
    .locals 16

    const/4 v1, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v10, p7

    move-object/from16 v12, p8

    move/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;[BZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;Z)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->d:Lcom/google/android/gms/nearby/messages/internal/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->d:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/j;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lcom/google/android/gms/nearby/messages/internal/o;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lcom/google/android/gms/nearby/messages/internal/o;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/o;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->c:Lcom/google/android/gms/nearby/messages/Strategy;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->d:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->e:Lcom/google/android/gms/nearby/messages/MessageFilter;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->f:Landroid/app/PendingIntent;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->g:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->j:[B

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lcom/google/android/gms/nearby/messages/internal/o;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v0, p0

    iget-boolean v9, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->m:Z

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->n:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v0, p0

    iget-boolean v11, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->o:Z

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->h:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->i:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-boolean v14, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->k:Z

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x127

    move/from16 v16, v0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v16, v16, v17

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v16, "SubscribeRequest{messageListener="

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v15, ", strategy="

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", callback="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", filter="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", pendingIntent="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", messageListenerKey="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", hint="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", subscribeCallback="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", useRealClientApiKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", clientAppContext="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", isDiscardPendingIntent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", zeroPartyPackageName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", realClientPackageName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", isIgnoreNearbyPermission="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->j:[B

    array-length v1, v1

    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v9, 0x13

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v9, "<"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v8, " bytes>"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/y;->a(Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;Landroid/os/Parcel;I)V

    return-void
.end method
