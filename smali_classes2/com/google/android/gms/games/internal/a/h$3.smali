.class Lcom/google/android/gms/games/internal/a/h$3;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/g$c;",
        ">;"
    }
.end annotation


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/g$c;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/h$3$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/h$3$1;-><init>(Lcom/google/android/gms/games/internal/a/h$3;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/h$3;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->n(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/h$3;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/g$c;

    move-result-object v0

    return-object v0
.end method
