.class Lcom/google/android/gms/auth/api/signin/internal/b$1;
.super Lcom/google/android/gms/auth/api/signin/internal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/signin/internal/b;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/common/api/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/signin/internal/b$a",
        "<",
        "Lcom/google/android/gms/auth/api/signin/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

.field final synthetic b:Lcom/google/android/gms/auth/api/signin/internal/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1;->b:Lcom/google/android/gms/auth/api/signin/internal/b;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/auth/api/signin/internal/b$a;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/signin/b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/signin/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/auth/api/signin/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/auth/api/signin/internal/c;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->B()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/g;

    new-instance v2, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b$1;Lcom/google/android/gms/auth/api/signin/internal/j;)V

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/auth/api/signin/internal/g;->a(Lcom/google/android/gms/auth/api/signin/internal/f;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$1;->a(Lcom/google/android/gms/auth/api/signin/internal/c;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/signin/b;

    move-result-object v0

    return-object v0
.end method
