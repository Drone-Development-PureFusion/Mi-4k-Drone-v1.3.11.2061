.class Lcom/google/android/gms/auth/api/signin/internal/b$1$1;
.super Lcom/google/android/gms/auth/api/signin/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/signin/internal/b$1;->a(Lcom/google/android/gms/auth/api/signin/internal/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/signin/internal/j;

.field final synthetic b:Lcom/google/android/gms/auth/api/signin/internal/b$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/b$1;Lcom/google/android/gms/auth/api/signin/internal/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;->b:Lcom/google/android/gms/auth/api/signin/internal/b$1;

    iput-object p2, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;->a:Lcom/google/android/gms/auth/api/signin/internal/j;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;->a:Lcom/google/android/gms/auth/api/signin/internal/j;

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;->b:Lcom/google/android/gms/auth/api/signin/internal/b$1;

    iget-object v1, v1, Lcom/google/android/gms/auth/api/signin/internal/b$1;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/auth/api/signin/internal/j;->b(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/b$1$1;->b:Lcom/google/android/gms/auth/api/signin/internal/b$1;

    new-instance v1, Lcom/google/android/gms/auth/api/signin/b;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/auth/api/signin/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/b$1;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
