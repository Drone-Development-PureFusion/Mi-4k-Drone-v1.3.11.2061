.class Lcom/google/android/gms/tagmanager/v;
.super Lcom/google/android/gms/tagmanager/bm;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/eg;->ar:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/v;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/v;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/bm;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/tagmanager/cv;Lcom/google/android/gms/tagmanager/cv;Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/cv;",
            "Lcom/google/android/gms/tagmanager/cv;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tagmanager/cv;->a(Lcom/google/android/gms/tagmanager/cv;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
