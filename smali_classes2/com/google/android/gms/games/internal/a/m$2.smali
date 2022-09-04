.class Lcom/google/android/gms/games/internal/a/m$2;
.super Lcom/google/android/gms/games/internal/a/m$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:Lcom/google/android/gms/games/internal/a/m;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/m$2;->d:Lcom/google/android/gms/games/internal/a/m;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/m$2;->a:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/a/m$2;->b:Z

    iput p5, p0, Lcom/google/android/gms/games/internal/a/m$2;->c:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/m$d;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/m$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/m$2;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/m$2;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/a/m$2;->b:Z

    iget v2, p0, Lcom/google/android/gms/games/internal/a/m$2;->c:I

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;ZI)V

    return-void
.end method
