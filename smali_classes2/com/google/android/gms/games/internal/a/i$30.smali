.class Lcom/google/android/gms/games/internal/a/i$30;
.super Lcom/google/android/gms/games/internal/a/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/i;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/games/internal/a/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/i;Lcom/google/android/gms/common/api/g;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/i$30;->b:Lcom/google/android/gms/games/internal/a/i;

    iput p3, p0, Lcom/google/android/gms/games/internal/a/i$30;->a:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/a/i$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/i$30;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/games/internal/a/i$30;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;IZZ)V

    return-void
.end method
