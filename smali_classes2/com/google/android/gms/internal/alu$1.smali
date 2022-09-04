.class Lcom/google/android/gms/internal/alu$1;
.super Lcom/google/android/gms/internal/akp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alu;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akp$a",
        "<",
        "Lcom/google/android/gms/fitness/result/DataTypeResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

.field final synthetic b:Lcom/google/android/gms/internal/alu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alu;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alu$1;->b:Lcom/google/android/gms/internal/alu;

    iput-object p3, p0, Lcom/google/android/gms/internal/alu$1;->a:Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akp$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataTypeResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/DataTypeResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataTypeResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alu$1;->a(Lcom/google/android/gms/internal/akp;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akp;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/alu$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/alu$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alu$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akp;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ald;

    new-instance v2, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alu$1;->a:Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;Lcom/google/android/gms/internal/akz;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ald;->a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alu$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataTypeResult;

    move-result-object v0

    return-object v0
.end method
