.class Lcom/google/android/gms/auth/api/credentials/internal/e$1$1;
.super Lcom/google/android/gms/auth/api/credentials/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/credentials/internal/e$1;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/credentials/internal/e$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/e$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$1$1;->a:Lcom/google/android/gms/auth/api/credentials/internal/e$1;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/credentials/internal/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$1$1;->a:Lcom/google/android/gms/auth/api/credentials/internal/e$1;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/internal/d;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/credentials/internal/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/e$1;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$1$1;->a:Lcom/google/android/gms/auth/api/credentials/internal/e$1;

    new-instance v1, Lcom/google/android/gms/auth/api/credentials/internal/d;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/e$1;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
