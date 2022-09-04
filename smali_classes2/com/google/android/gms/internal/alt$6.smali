.class Lcom/google/android/gms/internal/alt$6;
.super Lcom/google/android/gms/internal/ako$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alt;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ako$a",
        "<",
        "Lcom/google/android/gms/fitness/result/BleDevicesResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/alt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alt;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alt$6;->a:Lcom/google/android/gms/internal/alt;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ako$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/BleDevicesResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/BleDevicesResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/BleDevicesResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ako;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alt$6;->a(Lcom/google/android/gms/internal/ako;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/ako;)V
    .locals 3

    new-instance v1, Lcom/google/android/gms/internal/alt$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/alt$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alt$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ako;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alc;

    new-instance v2, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;

    invoke-direct {v2, v1}, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;-><init>(Lcom/google/android/gms/internal/amd;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alc;->a(Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alt$6;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/BleDevicesResult;

    move-result-object v0

    return-object v0
.end method
