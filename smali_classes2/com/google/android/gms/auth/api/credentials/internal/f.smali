.class abstract Lcom/google/android/gms/auth/api/credentials/internal/f;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahl$a",
        "<TR;",
        "Lcom/google/android/gms/auth/api/credentials/internal/g;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/auth/api/a;->e:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/k;)V
.end method

.method protected final a(Lcom/google/android/gms/auth/api/credentials/internal/g;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/internal/g;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/internal/g;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/credentials/internal/k;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/auth/api/credentials/internal/f;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/k;)V

    return-void
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/auth/api/credentials/internal/g;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/f;->a(Lcom/google/android/gms/auth/api/credentials/internal/g;)V

    return-void
.end method
