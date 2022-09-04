.class Lcom/google/android/gms/games/internal/a/p$13;
.super Lcom/google/android/gms/games/internal/a/p$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/p;->a(Lcom/google/android/gms/common/api/g;I[I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:[I

.field final synthetic c:Lcom/google/android/gms/games/internal/a/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/p;Lcom/google/android/gms/common/api/g;I[I)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/p$13;->c:Lcom/google/android/gms/games/internal/a/p;

    iput p3, p0, Lcom/google/android/gms/games/internal/a/p$13;->a:I

    iput-object p4, p0, Lcom/google/android/gms/games/internal/a/p$13;->b:[I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/p$e;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/p$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/p$13;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/games/internal/a/p$13;->a:I

    iget-object v1, p0, Lcom/google/android/gms/games/internal/a/p$13;->b:[I

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;I[I)V

    return-void
.end method
