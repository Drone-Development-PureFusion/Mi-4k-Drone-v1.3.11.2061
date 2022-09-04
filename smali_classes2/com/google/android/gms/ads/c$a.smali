.class public final Lcom/google/android/gms/ads/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/e$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/e$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    sget-object v1, Lcom/google/android/gms/ads/c;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/c$a;)Lcom/google/android/gms/ads/internal/client/e$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(I)V

    return-object p0
.end method

.method public a(Landroid/location/Location;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Landroid/location/Location;)V

    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/mediation/m;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Lcom/google/android/gms/ads/mediation/m;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/c$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/b;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/c$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "_emulatorLiveAds"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    sget-object v1, Lcom/google/android/gms/ads/c;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/e$a;->c(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Ljava/util/Date;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Ljava/util/Date;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Z)V

    return-object p0
.end method

.method public a()Lcom/google/android/gms/ads/c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/c;-><init>(Lcom/google/android/gms/ads/c$a;Lcom/google/android/gms/ads/c$1;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/c$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/customevent/a;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/c$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->c(Z)V

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;
    .locals 6

    const/16 v5, 0x200

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "Content URL must be non-null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Content URL must be non-empty."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v5, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Content URL must not exceed %d in length.  Provided length was %d."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->d(Ljava/lang/String;)V

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->f(Ljava/lang/String;)V

    return-object p0
.end method
