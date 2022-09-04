.class Lcom/google/android/gms/games/internal/a/f$9;
.super Lcom/google/android/gms/games/internal/a/f$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/f;->b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;JLjava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/games/internal/a/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/f;Lcom/google/android/gms/common/api/g;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/f$9;->d:Lcom/google/android/gms/games/internal/a/f;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/f$9;->a:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/games/internal/a/f$9;->b:J

    iput-object p6, p0, Lcom/google/android/gms/games/internal/a/f$9;->c:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/a/f$d;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/f$9;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 7

    iget-object v3, p0, Lcom/google/android/gms/games/internal/a/f$9;->a:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/games/internal/a/f$9;->b:J

    iget-object v6, p0, Lcom/google/android/gms/games/internal/a/f$9;->c:Ljava/lang/String;

    move-object v1, p1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method
