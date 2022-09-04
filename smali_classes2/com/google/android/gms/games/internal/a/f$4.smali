.class Lcom/google/android/gms/games/internal/a/f$4;
.super Lcom/google/android/gms/games/internal/a/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/f;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/games/internal/a/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/f;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/f$4;->c:Lcom/google/android/gms/games/internal/a/f;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/f$4;->a:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/a/f$4;->b:Z

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/f$a;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/f$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/f$4;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/f$4;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/a/f$4;->b:Z

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Z)V

    return-void
.end method
