.class final Lcom/google/android/gms/games/internal/d$cv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cv"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/h;",
        ">;"
    }
.end annotation


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/h;->a(Lcom/google/android/gms/games/Player;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/h;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$cv;->a(Lcom/google/android/gms/games/h;)V

    return-void
.end method
