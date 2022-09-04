.class Lcom/google/android/gms/games/internal/a/i$12;
.super Lcom/google/android/gms/games/internal/a/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/i;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/games/internal/a/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/i;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/i$12;->c:Lcom/google/android/gms/games/internal/a/i;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/i$12;->a:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/a/i$12;->b:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/a/i$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/i$12;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/i$12;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/a/i$12;->b:Z

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Z)V

    return-void
.end method
