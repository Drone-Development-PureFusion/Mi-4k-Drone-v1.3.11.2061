.class public final Lcom/google/android/gms/ads/formats/b;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/formats/b$b;,
        Lcom/google/android/gms/ads/formats/b$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x3


# instance fields
.field private final h:Z

.field private final i:I

.field private final j:Z

.field private final k:I

.field private final l:Lcom/google/android/gms/ads/i;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/ads/formats/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/formats/b$b;->a(Lcom/google/android/gms/ads/formats/b$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/formats/b;->h:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/formats/b$b;->b(Lcom/google/android/gms/ads/formats/b$b;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/formats/b;->i:I

    invoke-static {p1}, Lcom/google/android/gms/ads/formats/b$b;->c(Lcom/google/android/gms/ads/formats/b$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/formats/b;->j:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/formats/b$b;->d(Lcom/google/android/gms/ads/formats/b$b;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/formats/b;->k:I

    invoke-static {p1}, Lcom/google/android/gms/ads/formats/b$b;->e(Lcom/google/android/gms/ads/formats/b$b;)Lcom/google/android/gms/ads/i;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/formats/b;->l:Lcom/google/android/gms/ads/i;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/formats/b$b;Lcom/google/android/gms/ads/formats/b$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/formats/b;-><init>(Lcom/google/android/gms/ads/formats/b$b;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/b;->h:Z

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/formats/b;->i:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/b;->j:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/formats/b;->k:I

    return v0
.end method

.method public e()Lcom/google/android/gms/ads/i;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/formats/b;->l:Lcom/google/android/gms/ads/i;

    return-object v0
.end method
