.class Lcom/google/android/gms/games/internal/a/c$2;
.super Lcom/google/android/gms/games/internal/a/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/games/internal/a/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/c;Lcom/google/android/gms/common/api/g;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/c$2;->b:Lcom/google/android/gms/games/internal/a/c;

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/a/c$2;->a:Z

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/c$a;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/c$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/c$2;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/a/c$2;->a:Z

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->d(Lcom/google/android/gms/internal/ahl$b;Z)V

    return-void
.end method
