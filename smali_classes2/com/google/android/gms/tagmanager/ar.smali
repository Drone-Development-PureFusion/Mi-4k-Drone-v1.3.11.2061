.class public Lcom/google/android/gms/tagmanager/ar;
.super Lcom/google/android/gms/tagmanager/t;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/eg;->v:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/ar;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/tagmanager/ar;->a:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/t;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lcom/google/android/gms/internal/hj$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;)",
            "Lcom/google/android/gms/internal/hj$a;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/tagmanager/cw;->g()Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/tagmanager/cw;->g()Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic b()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/tagmanager/t;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Ljava/util/Set;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/tagmanager/t;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
