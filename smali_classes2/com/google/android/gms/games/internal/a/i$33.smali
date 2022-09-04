.class Lcom/google/android/gms/games/internal/a/i$33;
.super Lcom/google/android/gms/games/internal/a/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/i;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/games/internal/a/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/i;Lcom/google/android/gms/common/api/g;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/i$33;->b:Lcom/google/android/gms/games/internal/a/i;

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/a/i$33;->a:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/a/i$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/i$33;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/a/i$33;->a:Z

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Z)V

    return-void
.end method
