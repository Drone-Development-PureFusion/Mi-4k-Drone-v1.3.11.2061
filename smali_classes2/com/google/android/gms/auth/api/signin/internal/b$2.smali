.class Lcom/google/android/gms/auth/api/signin/internal/b$2;
.super Lcom/google/android/gms/auth/api/signin/internal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/signin/internal/b;->c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/signin/internal/b$a",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/signin/internal/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$2;->a:Lcom/google/android/gms/auth/api/signin/internal/b;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/auth/api/signin/internal/b$a;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected a(Lcom/google/android/gms/auth/api/signin/internal/c;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/g;

    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/b$2$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/auth/api/signin/internal/b$2$1;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b$2;)V

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->n_()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/internal/g;->b(Lcom/google/android/gms/auth/api/signin/internal/f;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$2;->a(Lcom/google/android/gms/auth/api/signin/internal/c;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
