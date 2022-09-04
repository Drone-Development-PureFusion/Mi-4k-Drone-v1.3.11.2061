.class public Lcom/google/android/gms/config/internal/d;
.super Lcom/google/android/gms/common/api/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/u",
        "<",
        "Lcom/google/android/gms/common/api/a$a$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ajq;->c:Lcom/google/android/gms/common/api/a;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/common/api/u;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ajr$a;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ajr$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/internal/ajr$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ajq;->d:Lcom/google/android/gms/internal/ajr;

    invoke-virtual {p0}, Lcom/google/android/gms/config/internal/d;->g()Lcom/google/android/gms/common/api/g;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ajr;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ajr$a;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
