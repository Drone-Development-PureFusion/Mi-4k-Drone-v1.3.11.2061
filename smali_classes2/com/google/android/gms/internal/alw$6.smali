.class Lcom/google/android/gms/internal/alw$6;
.super Lcom/google/android/gms/internal/akr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataReadRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akr$a",
        "<",
        "Lcom/google/android/gms/fitness/result/DataReadResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/DataReadRequest;

.field final synthetic b:Lcom/google/android/gms/internal/alw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataReadRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alw$6;->b:Lcom/google/android/gms/internal/alw;

    iput-object p3, p0, Lcom/google/android/gms/internal/alw$6;->a:Lcom/google/android/gms/fitness/request/DataReadRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akr$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataReadResult;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/alw$6;->a:Lcom/google/android/gms/fitness/request/DataReadRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/DataReadRequest;->a()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/alw$6;->a:Lcom/google/android/gms/fitness/request/DataReadRequest;

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/request/DataReadRequest;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/fitness/result/DataReadResult;->a(Lcom/google/android/gms/common/api/Status;Ljava/util/List;Ljava/util/List;)Lcom/google/android/gms/fitness/result/DataReadResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alw$6;->a(Lcom/google/android/gms/internal/akr;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akr;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/alw$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/alw$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alw$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akr;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alf;

    new-instance v2, Lcom/google/android/gms/fitness/request/DataReadRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alw$6;->a:Lcom/google/android/gms/fitness/request/DataReadRequest;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Lcom/google/android/gms/fitness/request/DataReadRequest;Lcom/google/android/gms/internal/akx;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alf;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alw$6;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataReadResult;

    move-result-object v0

    return-object v0
.end method
