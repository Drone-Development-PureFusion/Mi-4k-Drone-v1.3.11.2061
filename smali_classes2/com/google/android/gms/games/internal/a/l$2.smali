.class Lcom/google/android/gms/games/internal/a/l$2;
.super Lcom/google/android/gms/games/internal/a/l$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/l;->b(Lcom/google/android/gms/common/api/g;Ljava/util/List;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/l;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/l;Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/l$2;->b:Lcom/google/android/gms/games/internal/a/l;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/l$2;->a:[Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/l$d;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/l$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/l$2;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/l$2;->a:[Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->c(Lcom/google/android/gms/internal/ahl$b;[Ljava/lang/String;)V

    return-void
.end method
