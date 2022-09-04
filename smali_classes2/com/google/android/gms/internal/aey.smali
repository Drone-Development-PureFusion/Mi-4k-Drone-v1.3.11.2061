.class abstract Lcom/google/android/gms/internal/aey;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/auth/api/proxy/b$a;",
        "Lcom/google/android/gms/internal/aev;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/auth/api/b;->b:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/proxy/b$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/afa;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/afa;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected abstract a(Landroid/content/Context;Lcom/google/android/gms/internal/aex;)V
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aev;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aey;->a(Lcom/google/android/gms/internal/aev;)V

    return-void
.end method

.method protected final a(Lcom/google/android/gms/internal/aev;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aev;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aev;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aex;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/aey;->a(Landroid/content/Context;Lcom/google/android/gms/internal/aex;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aey;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/proxy/b$a;

    move-result-object v0

    return-object v0
.end method
