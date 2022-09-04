.class public final Lcom/google/android/gms/games/internal/request/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/request/b$a;
    }
.end annotation


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private final b:I

.field private final c:Ljava/util/HashMap;
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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "requestId"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "outcome"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/request/b;->a:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(ILjava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/request/b;->b:I

    iput-object p2, p0, Lcom/google/android/gms/games/internal/request/b;->c:Ljava/util/HashMap;

    return-void
.end method

.method synthetic constructor <init>(ILjava/util/HashMap;Lcom/google/android/gms/games/internal/request/b$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/games/internal/request/b;-><init>(ILjava/util/HashMap;)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/internal/request/b;
    .locals 6

    new-instance v1, Lcom/google/android/gms/games/internal/request/b$a;

    invoke-direct {v1}, Lcom/google/android/gms/games/internal/request/b$a;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/internal/request/b$a;->a(I)Lcom/google/android/gms/games/internal/request/b$a;

    invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->g()I

    move-result v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/data/DataHolder;->a(I)I

    move-result v3

    const-string v4, "requestId"

    invoke-virtual {p0, v4, v0, v3}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "outcome"

    invoke-virtual {p0, v5, v0, v3}, Lcom/google/android/gms/common/data/DataHolder;->b(Ljava/lang/String;II)I

    move-result v3

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/games/internal/request/b$a;->a(Ljava/lang/String;I)Lcom/google/android/gms/games/internal/request/b$a;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/internal/request/b$a;->a()Lcom/google/android/gms/games/internal/request/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/request/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2e

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Request "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " was not part of the update operation!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/games/internal/request/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/request/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
