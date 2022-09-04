.class final Lcom/google/android/gms/internal/ft$t;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Ljava/lang/Void;",
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

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    const-string v0, "password cannot be null or empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ft$t;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$t;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$t;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v1}, Lcom/google/firebase/auth/n;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$t;->n:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ft$t;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ga;->b(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$t;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$t;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$t;->c:Lcom/google/firebase/b;

    iget-object v3, p0, Lcom/google/android/gms/internal/ft$t;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/gj;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ft$t;->c()V

    return-void
.end method
