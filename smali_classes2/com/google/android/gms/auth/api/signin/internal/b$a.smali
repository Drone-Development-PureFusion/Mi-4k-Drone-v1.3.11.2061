.class abstract Lcom/google/android/gms/auth/api/signin/internal/b$a;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/signin/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahl$a",
        "<TR;",
        "Lcom/google/android/gms/auth/api/signin/internal/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/gms/auth/api/signin/internal/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/b$a;->c:Lcom/google/android/gms/auth/api/signin/internal/b;

    sget-object v0, Lcom/google/android/gms/auth/api/a;->f:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method
