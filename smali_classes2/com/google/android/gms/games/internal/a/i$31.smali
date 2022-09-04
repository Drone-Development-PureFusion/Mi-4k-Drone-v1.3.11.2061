.class Lcom/google/android/gms/games/internal/a/i$31;
.super Lcom/google/android/gms/games/internal/a/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/i;->b(Lcom/google/android/gms/common/api/g;IZ)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/games/internal/a/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/i;Lcom/google/android/gms/common/api/g;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/i$31;->c:Lcom/google/android/gms/games/internal/a/i;

    iput p3, p0, Lcom/google/android/gms/games/internal/a/i$31;->a:I

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/a/i$31;->b:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/a/i$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/i$31;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 6

    const-string v2, "played_with"

    iget v3, p0, Lcom/google/android/gms/games/internal/a/i$31;->a:I

    const/4 v4, 0x0

    iget-boolean v5, p0, Lcom/google/android/gms/games/internal/a/i$31;->b:Z

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;IZZ)V

    return-void
.end method
