.class Lcom/google/android/gms/internal/ama$4;
.super Lcom/google/android/gms/internal/akv$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ama;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/SessionReadRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akv$a",
        "<",
        "Lcom/google/android/gms/fitness/result/SessionReadResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/SessionReadRequest;

.field final synthetic b:Lcom/google/android/gms/internal/ama;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ama;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/SessionReadRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ama$4;->b:Lcom/google/android/gms/internal/ama;

    iput-object p3, p0, Lcom/google/android/gms/internal/ama$4;->a:Lcom/google/android/gms/fitness/request/SessionReadRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akv$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionReadResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/SessionReadResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionReadResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ama$4;->a(Lcom/google/android/gms/internal/akv;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akv;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/ama$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ama$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ama$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alk;

    new-instance v2, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/ama$4;->a:Lcom/google/android/gms/fitness/request/SessionReadRequest;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionReadRequest;Lcom/google/android/gms/internal/alo;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alk;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ama$4;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionReadResult;

    move-result-object v0

    return-object v0
.end method
