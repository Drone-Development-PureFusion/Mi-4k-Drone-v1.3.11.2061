.class Lcom/google/android/gms/games/internal/a/l$3;
.super Lcom/google/android/gms/games/internal/a/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/l;->a(Lcom/google/android/gms/common/api/g;III)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/google/android/gms/games/internal/a/l;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/l;Lcom/google/android/gms/common/api/g;III)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/l$3;->d:Lcom/google/android/gms/games/internal/a/l;

    iput p3, p0, Lcom/google/android/gms/games/internal/a/l$3;->a:I

    iput p4, p0, Lcom/google/android/gms/games/internal/a/l$3;->b:I

    iput p5, p0, Lcom/google/android/gms/games/internal/a/l$3;->c:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/l$b;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/l$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/l$3;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/games/internal/a/l$3;->a:I

    iget v1, p0, Lcom/google/android/gms/games/internal/a/l$3;->b:I

    iget v2, p0, Lcom/google/android/gms/games/internal/a/l$3;->c:I

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;III)V

    return-void
.end method
