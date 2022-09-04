.class public abstract Lcom/google/android/gms/contextmanager/internal/i$a;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/google/android/gms/contextmanager/internal/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/internal/i$a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/i;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/contextmanager/internal/i;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/i;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/contextmanager/internal/i$a$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/contextmanager/internal/i$a$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 10

    const/4 v9, 0x1

    const/4 v8, 0x0

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    move v0, v9

    goto :goto_0

    :sswitch_1
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;

    move-object v5, v0

    :goto_1
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto :goto_0

    :cond_0
    move-object v5, v8

    goto :goto_1

    :sswitch_2
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    move-object v5, v0

    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;

    move-object v6, v0

    :goto_3
    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto :goto_0

    :cond_1
    move-object v5, v8

    goto :goto_2

    :cond_2
    move-object v6, v8

    goto :goto_3

    :sswitch_3
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    move-object v5, v0

    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;

    move-object v6, v0

    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/g$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/g;

    move-result-object v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;Lcom/google/android/gms/contextmanager/internal/g;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_3
    move-object v5, v8

    goto :goto_4

    :cond_4
    move-object v6, v8

    goto :goto_5

    :sswitch_4
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/g$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/g;

    move-result-object v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/g;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    move-object v5, v0

    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;

    move-object v6, v0

    :goto_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/g$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/g;

    move-result-object v7

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    move-object v8, v0

    :cond_5
    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;Lcom/google/android/gms/contextmanager/internal/g;Landroid/app/PendingIntent;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_6
    move-object v5, v8

    goto :goto_6

    :cond_7
    move-object v6, v8

    goto :goto_7

    :sswitch_6
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/g$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/g;

    move-result-object v5

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    move-object v6, v0

    :goto_8
    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/g;Landroid/app/PendingIntent;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_8
    move-object v6, v8

    goto :goto_8

    :sswitch_7
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl;

    move-object v5, v0

    :goto_9
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_9
    move-object v5, v8

    goto :goto_9

    :sswitch_8
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;

    move-object v5, v0

    :goto_a
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_a
    move-object v5, v8

    goto :goto_a

    :sswitch_9
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    move-object v5, v0

    :goto_b
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_b
    move-object v5, v8

    goto :goto_b

    :sswitch_a
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;

    move-object v5, v0

    :goto_c
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_c
    move-object v5, v8

    goto :goto_c

    :sswitch_b
    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/h$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/h;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;

    move-object v5, v0

    :goto_d
    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v9

    goto/16 :goto_0

    :cond_d
    move-object v5, v8

    goto :goto_d

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0xc -> :sswitch_7
        0xd -> :sswitch_8
        0xe -> :sswitch_9
        0xf -> :sswitch_a
        0x10 -> :sswitch_b
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
