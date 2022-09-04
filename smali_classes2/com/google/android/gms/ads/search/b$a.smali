.class public final Lcom/google/android/gms/ads/search/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/search/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/e$a;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/e$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/search/b$a;->h:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->b:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->c:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->d:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->e:I

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->f:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->g:I

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->h:I

    return v0
.end method

.method static synthetic h(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->i:I

    return v0
.end method

.method static synthetic i(Lcom/google/android/gms/ads/search/b$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->k:I

    return v0
.end method

.method static synthetic k(Lcom/google/android/gms/ads/search/b$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->m:I

    return v0
.end method

.method static synthetic m(Lcom/google/android/gms/ads/search/b$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/b$a;->n:I

    return v0
.end method

.method static synthetic n(Lcom/google/android/gms/ads/search/b$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/google/android/gms/ads/search/b$a;)Lcom/google/android/gms/ads/internal/client/e$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->b:I

    return-object p0
.end method

.method public a(II)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/b$a;->c:I

    iput p2, p0, Lcom/google/android/gms/ads/search/b$a;->d:I

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->e:I

    return-object p0
.end method

.method public a(Landroid/location/Location;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Landroid/location/Location;)V

    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/mediation/m;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Lcom/google/android/gms/ads/mediation/m;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/b;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/b$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/e$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Z)V

    return-object p0
.end method

.method public a()Lcom/google/android/gms/ads/search/b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/search/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/search/b;-><init>(Lcom/google/android/gms/ads/search/b$a;Lcom/google/android/gms/ads/search/b$1;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 2

    const/4 v1, 0x0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->c:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/b$a;->d:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/b$a;->e:I

    return-object p0
.end method

.method public b(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/b$a;
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
            "Lcom/google/android/gms/ads/search/b$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/e$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/search/b$a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->f:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/search/b$a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->g:I

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/search/b$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->h:I

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/android/gms/ads/search/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/b$a;->a:Lcom/google/android/gms/ads/internal/client/e$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e$a;->f(Ljava/lang/String;)V

    return-object p0
.end method

.method public f(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->i:I

    return-object p0
.end method

.method public g(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->k:I

    return-object p0
.end method

.method public h(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->m:I

    return-object p0
.end method

.method public i(I)Lcom/google/android/gms/ads/search/b$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/search/b$a;->n:I

    return-object p0
.end method
