.class final Lcom/google/android/gms/games/c$4;
.super Lcom/google/android/gms/games/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 1

    iput-object p2, p0, Lcom/google/android/gms/games/c$4;->a:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/games/c$d;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/c$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/c$4;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/c$4;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/games/internal/d;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method
