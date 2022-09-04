.class Lcom/google/android/gms/internal/hs$f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/hu;

.field private d:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hs$f;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/hs$f;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/hs$f;->c:Lcom/google/android/gms/internal/hu;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/hs$f;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs$f;)Lcom/google/android/gms/internal/hu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$f;->c:Lcom/google/android/gms/internal/hu;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$f;->b:Ljava/util/Map;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/hu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$f;->c:Lcom/google/android/gms/internal/hu;

    return-object v0
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs$f;->d:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hs$f;->d:Z

    return v0
.end method
