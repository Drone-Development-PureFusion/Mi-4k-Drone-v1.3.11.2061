.class Lcom/google/android/gms/games/internal/a/f$7;
.super Lcom/google/android/gms/games/internal/a/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/f;->b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Z

.field final synthetic f:Lcom/google/android/gms/games/internal/a/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/f;Lcom/google/android/gms/common/api/g;Ljava/lang/String;IIIZ)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/f$7;->f:Lcom/google/android/gms/games/internal/a/f;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/f$7;->a:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/games/internal/a/f$7;->b:I

    iput p5, p0, Lcom/google/android/gms/games/internal/a/f$7;->c:I

    iput p6, p0, Lcom/google/android/gms/games/internal/a/f$7;->d:I

    iput-boolean p7, p0, Lcom/google/android/gms/games/internal/a/f$7;->e:Z

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/f$c;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/f$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/f$7;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 7

    iget-object v2, p0, Lcom/google/android/gms/games/internal/a/f$7;->a:Ljava/lang/String;

    iget v3, p0, Lcom/google/android/gms/games/internal/a/f$7;->b:I

    iget v4, p0, Lcom/google/android/gms/games/internal/a/f$7;->c:I

    iget v5, p0, Lcom/google/android/gms/games/internal/a/f$7;->d:I

    iget-boolean v6, p0, Lcom/google/android/gms/games/internal/a/f$7;->e:Z

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;IIIZ)V

    return-void
.end method
