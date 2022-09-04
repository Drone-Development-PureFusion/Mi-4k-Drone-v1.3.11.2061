.class Lcom/google/android/gms/games/internal/a/e$1;
.super Lcom/google/android/gms/games/internal/a/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/e;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/games/internal/a/e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/e;Lcom/google/android/gms/common/api/g;I)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/e$1;->b:Lcom/google/android/gms/games/internal/a/e;

    iput p3, p0, Lcom/google/android/gms/games/internal/a/e$1;->a:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/e$a;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/e$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/e$1;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/a/e$1;->a:I

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;I)V

    return-void
.end method
