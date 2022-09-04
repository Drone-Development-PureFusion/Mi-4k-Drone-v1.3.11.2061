.class public Lcom/google/android/gms/contextmanager/fence/internal/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/awareness/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/FenceQueryRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/awareness/fence/FenceQueryRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/fence/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/c$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/c$2;-><init>(Lcom/google/android/gms/contextmanager/fence/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/FenceQueryRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/e;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/awareness/fence/e;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/c$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/c$1;-><init>(Lcom/google/android/gms/contextmanager/fence/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/e;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
