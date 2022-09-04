.class public final Lcom/google/ads/b;
.super Ljava/lang/Object;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final a:I = -0x1

.field public static final b:I = -0x2

.field public static final c:I = 0x20

.field public static final d:I = 0x32

.field public static final e:I = 0x5a

.field public static final f:Lcom/google/ads/b;

.field public static final g:Lcom/google/ads/b;

.field public static final h:Lcom/google/ads/b;

.field public static final i:Lcom/google/ads/b;

.field public static final j:Lcom/google/ads/b;

.field public static final k:Lcom/google/ads/b;


# instance fields
.field private final l:Lcom/google/android/gms/ads/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/ads/b;

    const/4 v1, -0x1

    const/4 v2, -0x2

    const-string v3, "mb"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->f:Lcom/google/ads/b;

    new-instance v0, Lcom/google/ads/b;

    const/16 v1, 0x140

    const/16 v2, 0x32

    const-string v3, "mb"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->g:Lcom/google/ads/b;

    new-instance v0, Lcom/google/ads/b;

    const/16 v1, 0x12c

    const/16 v2, 0xfa

    const-string v3, "as"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->h:Lcom/google/ads/b;

    new-instance v0, Lcom/google/ads/b;

    const/16 v1, 0x1d4

    const/16 v2, 0x3c

    const-string v3, "as"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->i:Lcom/google/ads/b;

    new-instance v0, Lcom/google/ads/b;

    const/16 v1, 0x2d8

    const/16 v2, 0x5a

    const-string v3, "as"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->j:Lcom/google/ads/b;

    new-instance v0, Lcom/google/ads/b;

    const/16 v1, 0xa0

    const/16 v2, 0x258

    const-string v3, "as"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/b;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/google/ads/b;->k:Lcom/google/ads/b;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/d;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/ads/d;-><init>(II)V

    invoke-direct {p0, v0}, Lcom/google/ads/b;-><init>(Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method private constructor <init>(IILjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/d;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/ads/d;-><init>(II)V

    invoke-direct {p0, v0}, Lcom/google/ads/b;-><init>(Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->b()I

    move-result v0

    return v0
.end method

.method public a(Landroid/content/Context;)I
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/d;->b(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public varargs a([Lcom/google/ads/b;)Lcom/google/ads/b;
    .locals 11

    const/4 v3, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    if-nez p1, :cond_1

    :cond_0
    return-object v3

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/ads/b;->a()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/ads/b;->b()I

    move-result v6

    array-length v7, p1

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v7, :cond_0

    aget-object v2, p1, v4

    invoke-virtual {v2}, Lcom/google/ads/b;->a()I

    move-result v0

    invoke-virtual {v2}, Lcom/google/ads/b;->b()I

    move-result v8

    invoke-virtual {p0, v0, v8}, Lcom/google/ads/b;->a(II)Z

    move-result v9

    if-eqz v9, :cond_3

    mul-int/2addr v0, v8

    int-to-float v0, v0

    mul-int v8, v5, v6

    int-to-float v8, v8

    div-float/2addr v0, v8

    cmpl-float v8, v0, v10

    if-lez v8, :cond_2

    div-float v0, v10, v0

    :cond_2
    cmpl-float v8, v0, v1

    if-lez v8, :cond_3

    move-object v1, v2

    :goto_1
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v3, v1

    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    move-object v1, v3

    goto :goto_1
.end method

.method public a(II)Z
    .locals 6

    const/high16 v5, 0x3fa00000    # 1.25f

    const v4, 0x3f4ccccd    # 0.8f

    invoke-virtual {p0}, Lcom/google/ads/b;->a()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/ads/b;->b()I

    move-result v1

    int-to-float v2, p1

    int-to-float v3, v0

    mul-float/2addr v3, v5

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    int-to-float v2, p1

    int-to-float v0, v0

    mul-float/2addr v0, v4

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_0

    int-to-float v0, p2

    int-to-float v2, v1

    mul-float/2addr v2, v5

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    int-to-float v0, p2

    int-to-float v1, v1

    mul-float/2addr v1, v4

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->a()I

    move-result v0

    return v0
.end method

.method public b(Landroid/content/Context;)I
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/d;->a(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->d()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->c()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/ads/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lcom/google/ads/b;

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    iget-object v1, p1, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/b;->l:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
