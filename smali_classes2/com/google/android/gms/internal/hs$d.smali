.class Lcom/google/android/gms/internal/hs$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;

.field private final d:Lcom/google/android/gms/internal/hu;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hs$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/hs$d;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/hs$d;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/android/gms/internal/hs$d;->d:Lcom/google/android/gms/internal/hu;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/hs$d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs$d;)Lcom/google/android/gms/internal/hu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$d;->d:Lcom/google/android/gms/internal/hu;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$d;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$d;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/hu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs$d;->d:Lcom/google/android/gms/internal/hu;

    return-object v0
.end method
