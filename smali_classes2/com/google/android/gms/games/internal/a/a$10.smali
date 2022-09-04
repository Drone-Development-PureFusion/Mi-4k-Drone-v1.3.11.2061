.class Lcom/google/android/gms/games/internal/a/a$10;
.super Lcom/google/android/gms/games/internal/a/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/a;->d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/games/internal/a/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/a$10;->c:Lcom/google/android/gms/games/internal/a/a;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/a/a$10;->a:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/games/internal/a/a$10;->b:I

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/games/internal/a/a$b;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/a$10;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/a$10;->a:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/games/internal/a/a$10;->b:I

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;I)V

    return-void
.end method
