.class public Lcom/google/android/gms/location/places/y;
.super Lcom/google/android/gms/location/places/internal/i$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/y$f;,
        Lcom/google/android/gms/location/places/y$a;,
        Lcom/google/android/gms/location/places/y$e;,
        Lcom/google/android/gms/location/places/y$c;,
        Lcom/google/android/gms/location/places/y$d;,
        Lcom/google/android/gms/location/places/y$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/google/android/gms/location/places/y$d;

.field private final c:Lcom/google/android/gms/location/places/y$a;

.field private final d:Lcom/google/android/gms/location/places/y$e;

.field private final e:Lcom/google/android/gms/location/places/y$f;

.field private final f:Lcom/google/android/gms/location/places/y$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/location/places/y;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/y$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/i$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    iput-object p1, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->d:Lcom/google/android/gms/location/places/y$e;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->e:Lcom/google/android/gms/location/places/y$f;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->f:Lcom/google/android/gms/location/places/y$c;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/y$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/i$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->d:Lcom/google/android/gms/location/places/y$e;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->e:Lcom/google/android/gms/location/places/y$f;

    iput-object p1, p0, Lcom/google/android/gms/location/places/y;->f:Lcom/google/android/gms/location/places/y$c;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/y$d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/i$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->d:Lcom/google/android/gms/location/places/y$e;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->e:Lcom/google/android/gms/location/places/y$f;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->f:Lcom/google/android/gms/location/places/y$c;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/y$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/i$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->d:Lcom/google/android/gms/location/places/y$e;

    iput-object p1, p0, Lcom/google/android/gms/location/places/y;->e:Lcom/google/android/gms/location/places/y$f;

    iput-object v0, p0, Lcom/google/android/gms/location/places/y;->f:Lcom/google/android/gms/location/places/y$c;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->e:Lcom/google/android/gms/location/places/y$f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/places/y$f;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "placeEstimator cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    if-nez p1, :cond_3

    sget-object v0, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const-string v2, "onPlaceEstimated received null DataHolder: "

    invoke-static {}, Lcom/google/android/gms/common/util/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/y$d;->c(Lcom/google/android/gms/common/api/Status;)V

    :goto_2
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->f()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_4

    const/16 v0, 0x64

    :goto_3
    new-instance v1, Lcom/google/android/gms/location/places/h;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/location/places/h;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->b:Lcom/google/android/gms/location/places/y$d;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/y$d;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lcom/google/android/gms/location/places/h;->a(Landroid/os/Bundle;)I

    move-result v0

    goto :goto_3
.end method

.method public b(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 4

    if-nez p1, :cond_2

    sget-object v0, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const-string v2, "onAutocompletePrediction received null DataHolder: "

    invoke-static {}, Lcom/google/android/gms/common/util/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/y$a;->c(Lcom/google/android/gms/common/api/Status;)V

    :goto_1
    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/location/places/y;->c:Lcom/google/android/gms/location/places/y$a;

    new-instance v1, Lcom/google/android/gms/location/places/b;

    invoke-direct {v1, p1}, Lcom/google/android/gms/location/places/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/y$a;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_1
.end method

.method public c(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 5

    const/4 v4, 0x0

    if-nez p1, :cond_2

    sget-object v0, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/location/places/y;->a:Ljava/lang/String;

    const-string v2, "onPlaceUserDataFetched received null DataHolder: "

    invoke-static {}, Lcom/google/android/gms/common/util/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/location/places/y$e;->c(Lcom/google/android/gms/common/api/Status;)V

    :goto_1
    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/location/places/personalized/e;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/places/personalized/e;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v4, v0}, Lcom/google/android/gms/location/places/y$e;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_1
.end method

.method public d(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/e;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/places/e;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/y;->f:Lcom/google/android/gms/location/places/y$c;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/places/y$c;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
