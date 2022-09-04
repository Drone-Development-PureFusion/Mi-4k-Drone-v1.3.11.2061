.class public final Lcom/google/android/gms/games/internal/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/achievement/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/a$b;,
        Lcom/google/android/gms/games/internal/a/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->l()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/achievement/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/a$1;-><init>(Lcom/google/android/gms/games/internal/a/a;Lcom/google/android/gms/common/api/g;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$3;

    invoke-direct {v0, p0, p2, p1, p2}, Lcom/google/android/gms/games/internal/a/a$3;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 6

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$7;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/a$7;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/achievement/c$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$4;

    invoke-direct {v0, p0, p2, p1, p2}, Lcom/google/android/gms/games/internal/a/a$4;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/achievement/c$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$8;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/a$8;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$5;

    invoke-direct {v0, p0, p2, p1, p2}, Lcom/google/android/gms/games/internal/a/a$5;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 6

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$9;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/a$9;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/achievement/c$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$6;

    invoke-direct {v0, p0, p2, p1, p2}, Lcom/google/android/gms/games/internal/a/a$6;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/achievement/c$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/a$10;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/a$10;-><init>(Lcom/google/android/gms/games/internal/a/a;Ljava/lang/String;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
