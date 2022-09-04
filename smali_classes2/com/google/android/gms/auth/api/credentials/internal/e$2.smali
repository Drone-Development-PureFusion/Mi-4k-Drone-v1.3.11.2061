.class Lcom/google/android/gms/auth/api/credentials/internal/e$2;
.super Lcom/google/android/gms/auth/api/credentials/internal/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/api/credentials/internal/e;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/credentials/internal/f",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/credentials/Credential;

.field final synthetic b:Lcom/google/android/gms/auth/api/credentials/internal/e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/e;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$2;->b:Lcom/google/android/gms/auth/api/credentials/internal/e;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$2;->a:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {p0, p2}, Lcom/google/android/gms/auth/api/credentials/internal/f;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected a(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/k;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/e$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/auth/api/credentials/internal/e$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    new-instance v1, Lcom/google/android/gms/auth/api/credentials/internal/SaveRequest;

    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/internal/e$2;->a:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {v1, v2}, Lcom/google/android/gms/auth/api/credentials/internal/SaveRequest;-><init>(Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/k;->a(Lcom/google/android/gms/auth/api/credentials/internal/j;Lcom/google/android/gms/auth/api/credentials/internal/SaveRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/e$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
