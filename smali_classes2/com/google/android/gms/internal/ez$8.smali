.class Lcom/google/android/gms/internal/ez$8;
.super Lcom/google/android/gms/wallet/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ez;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/IsReadyToPayRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wallet/d$b",
        "<",
        "Lcom/google/android/gms/common/api/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

.field final synthetic b:Lcom/google/android/gms/internal/ez;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/IsReadyToPayRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ez$8;->b:Lcom/google/android/gms/internal/ez;

    iput-object p3, p0, Lcom/google/android/gms/internal/ez$8;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/d$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/e;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/fa;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ez$8;->a(Lcom/google/android/gms/internal/fa;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/fa;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ez$8;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/fa;->a(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ez$8;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/e;

    move-result-object v0

    return-object v0
.end method
