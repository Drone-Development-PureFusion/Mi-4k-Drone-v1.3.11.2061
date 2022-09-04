.class final Lcom/google/android/gms/internal/ft$m;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "m"
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


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$m;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$m;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$m;->c:Lcom/google/firebase/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$m;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/go;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$m;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$m;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/gj;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V

    new-instance v0, Lcom/google/android/gms/internal/gl;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gl;-><init>(Lcom/google/android/gms/internal/go;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft$m;->b(Ljava/lang/Object;)V

    return-void
.end method
