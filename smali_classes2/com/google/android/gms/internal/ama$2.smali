.class Lcom/google/android/gms/internal/ama$2;
.super Lcom/google/android/gms/internal/akv$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ama;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akv$a",
        "<",
        "Lcom/google/android/gms/fitness/result/SessionStopResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/ama;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ama;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ama$2;->c:Lcom/google/android/gms/internal/ama;

    iput-object p3, p0, Lcom/google/android/gms/internal/ama$2;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ama$2;->b:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akv$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/SessionStopResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ama$2;->a(Lcom/google/android/gms/internal/akv;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akv;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/ama$b;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ama$b;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ama$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alk;

    new-instance v2, Lcom/google/android/gms/fitness/request/SessionStopRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/ama$2;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ama$2;->b:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/fitness/request/SessionStopRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/alp;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alk;->a(Lcom/google/android/gms/fitness/request/SessionStopRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ama$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;

    move-result-object v0

    return-object v0
.end method
