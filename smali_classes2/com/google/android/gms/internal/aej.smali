.class public Lcom/google/android/gms/internal/aej;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/aem;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;)V
    .locals 7

    const/16 v3, 0x4d

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    invoke-virtual {p5}, Lcom/google/android/gms/common/internal/s;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aej;->a:Ljava/lang/String;

    return-void
.end method

.method private h()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "authPackage"

    iget-object v2, p0, Lcom/google/android/gms/internal/aej;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aem;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/aem$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aem;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appinvite.service.START"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ael;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aej;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aem;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aem;->a(Lcom/google/android/gms/internal/ael;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ael;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aej;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aem;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/aem;->b(Lcom/google/android/gms/internal/ael;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aej;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aem;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appinvite.internal.IAppInviteService"

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ael;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aej;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aem;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/aem;->a(Lcom/google/android/gms/internal/ael;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/aej;->h()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
