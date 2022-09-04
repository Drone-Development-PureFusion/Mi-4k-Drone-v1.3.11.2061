.class public abstract Lcom/google/android/gms/tagmanager/ak$a;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/google/android/gms/tagmanager/ak;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/ak$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-virtual {p0, p0, v0}, Lcom/google/android/gms/tagmanager/ak$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/ak;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/tagmanager/ak;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/tagmanager/ak;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/ak$a$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/ak$a$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v6, 0x1

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    const-string v0, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    move v0, v6

    goto :goto_0

    :sswitch_1
    const-string v0, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/aj$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/aj;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/af$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/af;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/tagmanager/ak$a;->initialize(Lcom/google/android/gms/c/e;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v6

    goto :goto_0

    :sswitch_2
    const-string v1, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/c/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/tagmanager/ak$a;->preview(Landroid/content/Intent;Lcom/google/android/gms/c/e;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v6

    goto :goto_0

    :sswitch_3
    const-string v1, "com.google.android.gms.tagmanager.ITagManagerApi"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    move-object v1, v0

    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/c/e;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aj$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/aj;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/af$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/af;

    move-result-object v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/ak$a;->previewIntent(Landroid/content/Intent;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v6

    goto/16 :goto_0

    :cond_1
    move-object v1, v0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
