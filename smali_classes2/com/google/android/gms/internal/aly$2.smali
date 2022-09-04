.class Lcom/google/android/gms/internal/aly$2;
.super Lcom/google/android/gms/internal/akt$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aly;->c(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akt$a",
        "<",
        "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/data/DataType;

.field final synthetic b:Lcom/google/android/gms/internal/aly;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aly$2;->b:Lcom/google/android/gms/internal/aly;

    iput-object p3, p0, Lcom/google/android/gms/internal/aly$2;->a:Lcom/google/android/gms/fitness/data/DataType;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akt$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aly$2;->a(Lcom/google/android/gms/internal/akt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akt;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/aly$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/aly$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/aly$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akt;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alh;

    new-instance v2, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/aly$2;->a:Lcom/google/android/gms/fitness/data/DataType;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;-><init>(Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/internal/all;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alh;->a(Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aly$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;

    move-result-object v0

    return-object v0
.end method
