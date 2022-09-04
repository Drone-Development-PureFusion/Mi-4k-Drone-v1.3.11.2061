.class Lcom/google/android/gms/internal/alz$1;
.super Lcom/google/android/gms/internal/aku$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aku$a",
        "<",
        "Lcom/google/android/gms/fitness/result/DataSourcesResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/DataSourcesRequest;

.field final synthetic b:Lcom/google/android/gms/internal/alz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alz$1;->b:Lcom/google/android/gms/internal/alz;

    iput-object p3, p0, Lcom/google/android/gms/internal/alz$1;->a:Lcom/google/android/gms/fitness/request/DataSourcesRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aku$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataSourcesResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/DataSourcesResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataSourcesResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aku;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alz$1;->a(Lcom/google/android/gms/internal/aku;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aku;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/alz$b;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/alz$b;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alz$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aku;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alj;

    new-instance v2, Lcom/google/android/gms/fitness/request/DataSourcesRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alz$1;->a:Lcom/google/android/gms/fitness/request/DataSourcesRequest;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Lcom/google/android/gms/internal/aky;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alj;->a(Lcom/google/android/gms/fitness/request/DataSourcesRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alz$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataSourcesResult;

    move-result-object v0

    return-object v0
.end method
