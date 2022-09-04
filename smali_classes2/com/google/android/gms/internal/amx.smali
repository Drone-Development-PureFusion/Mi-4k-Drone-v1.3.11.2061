.class public Lcom/google/android/gms/internal/amx;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/anc;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;)V
    .locals 7

    const/16 v3, 0x45

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anc;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/anc$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anc;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START"

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/amx;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anc;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService"

    return-object v0
.end method
