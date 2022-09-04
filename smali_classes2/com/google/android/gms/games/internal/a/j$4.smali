.class Lcom/google/android/gms/games/internal/a/j$4;
.super Lcom/google/android/gms/games/internal/a/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/j;->a(Lcom/google/android/gms/common/api/g;Z[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:[Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/games/internal/a/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/j;Lcom/google/android/gms/common/api/g;Z[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/j$4;->c:Lcom/google/android/gms/games/internal/a/j;

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/a/j$4;->a:Z

    iput-object p4, p0, Lcom/google/android/gms/games/internal/a/j$4;->b:[Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/j$c;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/j$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/j$4;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/a/j$4;->a:Z

    iget-object v1, p0, Lcom/google/android/gms/games/internal/a/j$4;->b:[Ljava/lang/String;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ahl$b;Z[Ljava/lang/String;)V

    return-void
.end method
