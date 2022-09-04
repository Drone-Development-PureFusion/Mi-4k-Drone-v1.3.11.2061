.class final Lcom/google/android/gms/internal/ft$d;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Lcom/google/firebase/auth/o;",
        "Lcom/google/android/gms/internal/gj;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    const-string v0, "refresh token cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ft$d;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$d;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$d;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$d;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ga;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$d;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$d;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$d;->d:Lcom/google/firebase/auth/n;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/gj;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V

    new-instance v0, Lcom/google/firebase/auth/o;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/firebase/auth/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft$d;->b(Ljava/lang/Object;)V

    return-void
.end method
