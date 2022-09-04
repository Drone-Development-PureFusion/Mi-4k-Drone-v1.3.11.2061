.class public abstract Lcom/google/android/gms/contextmanager/internal/c$a;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/awareness/fence/c;",
        "Lcom/google/android/gms/contextmanager/internal/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/contextmanager/c;->d:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/awareness/fence/c;
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/c$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/contextmanager/internal/c$a$1;-><init>(Lcom/google/android/gms/contextmanager/internal/c$a;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/contextmanager/internal/c$a;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/awareness/fence/c;

    move-result-object v0

    return-object v0
.end method
