.class public Lcom/fimi/soul/utils/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(FLjava/lang/String;)F
    .locals 4

    const-wide/16 v0, 0x0

    const-string v2, "m"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    float-to-double v0, p0

    const-wide v2, 0x400a3f28fd4f4b98L    # 3.2808399

    mul-double/2addr v0, v2

    :cond_0
    :goto_0
    new-instance v2, Ljava/math/BigDecimal;

    invoke-direct {v2, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-virtual {v2, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0

    :cond_1
    const-string v2, "ft"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    float-to-double v0, p0

    const-wide v2, 0x3fd381d7dbf487fdL    # 0.3048

    mul-double/2addr v0, v2

    goto :goto_0

    :cond_2
    const-string v2, "mph"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    float-to-double v0, p0

    const-wide v2, 0x4001e53eb399f5e0L    # 2.236936

    mul-double/2addr v0, v2

    goto :goto_0
.end method

.method public static a(DLjava/lang/String;)Ljava/lang/String;
    .locals 4

    const-wide/16 v0, 0x0

    const-string v2, "m"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide v0, 0x400a3f28fd4f4b98L    # 3.2808399

    mul-double/2addr v0, p0

    :cond_0
    :goto_0
    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "###.00"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v2, "ft"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide v0, 0x3fd381d7dbf487fdL    # 0.3048

    mul-double/2addr v0, p0

    goto :goto_0

    :cond_2
    const-string v2, "mph"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide v0, 0x4001e53eb399f5e0L    # 2.236936

    mul-double/2addr v0, p0

    goto :goto_0
.end method

.method public static a(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
