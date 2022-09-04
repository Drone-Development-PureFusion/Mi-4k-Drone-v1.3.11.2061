.class Lcom/google/android/gms/games/internal/a/c$3;
.super Lcom/google/android/gms/games/internal/a/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/c;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/games/internal/a/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/c;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/c$3;->c:Lcom/google/android/gms/games/internal/a/c;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/c$3;->a:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/games/internal/a/c$3;->b:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/c$b;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/c$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/c$3;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/c$3;->a:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/games/internal/a/c$3;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/games/internal/d;->a(Ljava/lang/String;I)V

    return-void
.end method
