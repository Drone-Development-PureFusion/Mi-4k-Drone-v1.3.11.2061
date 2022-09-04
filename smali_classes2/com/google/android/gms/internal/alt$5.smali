.class Lcom/google/android/gms/internal/alt$5;
.super Lcom/google/android/gms/internal/ako$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alt;->b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/alt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alt;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alt$5;->b:Lcom/google/android/gms/internal/alt;

    iput-object p3, p0, Lcom/google/android/gms/internal/alt$5;->a:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ako$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ako;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alt$5;->a(Lcom/google/android/gms/internal/ako;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/ako;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/amb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/amb;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ako;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alc;

    new-instance v2, Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alt$5;->a:Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/alq;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alc;->a(Lcom/google/android/gms/fitness/request/UnclaimBleDeviceRequest;)V

    return-void
.end method
