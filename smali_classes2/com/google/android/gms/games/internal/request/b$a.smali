.class public final Lcom/google/android/gms/games/internal/request/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/request/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/request/b$a;->a:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/games/internal/request/b$a;->b:I

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/games/internal/request/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/games/internal/request/b$a;->b:I

    return-object p0
.end method

.method public a(Ljava/lang/String;I)Lcom/google/android/gms/games/internal/request/b$a;
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/games/internal/b/s;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/request/b$a;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public a()Lcom/google/android/gms/games/internal/request/b;
    .locals 4

    new-instance v0, Lcom/google/android/gms/games/internal/request/b;

    iget v1, p0, Lcom/google/android/gms/games/internal/request/b$a;->b:I

    iget-object v2, p0, Lcom/google/android/gms/games/internal/request/b$a;->a:Ljava/util/HashMap;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/request/b;-><init>(ILjava/util/HashMap;Lcom/google/android/gms/games/internal/request/b$1;)V

    return-object v0
.end method
