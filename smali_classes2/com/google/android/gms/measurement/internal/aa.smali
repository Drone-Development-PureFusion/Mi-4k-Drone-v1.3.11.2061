.class public Lcom/google/android/gms/measurement/internal/aa;
.super Lcom/google/android/gms/common/internal/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/p",
        "<",
        "Lcom/google/android/gms/measurement/internal/y;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/p$b;Lcom/google/android/gms/common/internal/p$c;)V
    .locals 7

    const/16 v3, 0x5d

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/p;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/p$b;Lcom/google/android/gms/common/internal/p$c;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Lcom/google/android/gms/measurement/internal/y;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/y$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.measurement.START"

    return-object v0
.end method

.method public synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/aa;->a(Landroid/os/IBinder;)Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.measurement.internal.IMeasurementService"

    return-object v0
.end method
