.class Lcom/google/android/gms/internal/alu$3;
.super Lcom/google/android/gms/internal/akp$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alu;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/alu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alu;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alu$3;->a:Lcom/google/android/gms/internal/alu;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akp$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alu$3;->a(Lcom/google/android/gms/internal/akp;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akp;)V
    .locals 3

    new-instance v1, Lcom/google/android/gms/internal/amb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/amb;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akp;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ald;

    new-instance v2, Lcom/google/android/gms/fitness/request/DisableFitRequest;

    invoke-direct {v2, v1}, Lcom/google/android/gms/fitness/request/DisableFitRequest;-><init>(Lcom/google/android/gms/internal/alq;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ald;->a(Lcom/google/android/gms/fitness/request/DisableFitRequest;)V

    return-void
.end method
