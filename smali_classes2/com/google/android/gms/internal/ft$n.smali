.class final Lcom/google/android/gms/internal/ft$n;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Lcom/google/firebase/auth/b;",
        "Lcom/google/android/gms/internal/gj;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/a;)V
    .locals 1
    .param p1    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    const-string v0, "credential cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/internal/gk;->a(Lcom/google/firebase/auth/a;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ft$n;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$n;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$n;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$n;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$n;->c:Lcom/google/firebase/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$n;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$n;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$n;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/gj;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V

    new-instance v0, Lcom/google/android/gms/internal/gl;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gl;-><init>(Lcom/google/android/gms/internal/go;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft$n;->b(Ljava/lang/Object;)V

    return-void
.end method
