.class public final Landroid/support/v7/graphics/Palette$Swatch;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/graphics/Palette;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Swatch"
.end annotation


# instance fields
.field private final mBlue:I

.field private mBodyTextColor:I

.field private mGeneratedTextColors:Z

.field private final mGreen:I

.field private mHsl:[F

.field private final mPopulation:I

.field private final mRed:I

.field private final mRgb:I

.field private mTitleTextColor:I


# direct methods
.method public constructor <init>(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRed:I

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGreen:I

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBlue:I

    iput p1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    iput p2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    return-void
.end method

.method constructor <init>(IIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRed:I

    iput p2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGreen:I

    iput p3, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBlue:I

    invoke-static {p1, p2, p3}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    iput p4, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    return-void
.end method

.method constructor <init>([FI)V
    .locals 1

    invoke-static {p1}, Landroid/support/v4/graphics/ColorUtils;->HSLToColor([F)I

    move-result v0

    invoke-direct {p0, v0, p2}, Landroid/support/v7/graphics/Palette$Swatch;-><init>(II)V

    iput-object p1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mHsl:[F

    return-void
.end method

.method private ensureTextColorsGenerated()V
    .locals 8

    const/high16 v3, 0x40900000    # 4.5f

    const/high16 v7, 0x40400000    # 3.0f

    const/4 v6, 0x1

    const/high16 v5, -0x1000000

    const/4 v4, -0x1

    iget-boolean v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGeneratedTextColors:Z

    if-nez v0, :cond_0

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    invoke-static {v4, v0, v3}, Landroid/support/v4/graphics/ColorUtils;->calculateMinimumAlpha(IIF)I

    move-result v0

    iget v1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    invoke-static {v4, v1, v7}, Landroid/support/v4/graphics/ColorUtils;->calculateMinimumAlpha(IIF)I

    move-result v1

    if-eq v0, v4, :cond_1

    if-eq v1, v4, :cond_1

    invoke-static {v4, v0}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBodyTextColor:I

    invoke-static {v4, v1}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mTitleTextColor:I

    iput-boolean v6, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGeneratedTextColors:Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    invoke-static {v5, v2, v3}, Landroid/support/v4/graphics/ColorUtils;->calculateMinimumAlpha(IIF)I

    move-result v2

    iget v3, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    invoke-static {v5, v3, v7}, Landroid/support/v4/graphics/ColorUtils;->calculateMinimumAlpha(IIF)I

    move-result v3

    if-eq v2, v4, :cond_2

    if-eq v2, v4, :cond_2

    invoke-static {v5, v2}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBodyTextColor:I

    invoke-static {v5, v3}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mTitleTextColor:I

    iput-boolean v6, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGeneratedTextColors:Z

    goto :goto_0

    :cond_2
    if-eq v0, v4, :cond_3

    invoke-static {v4, v0}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    :goto_1
    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBodyTextColor:I

    if-eq v1, v4, :cond_4

    invoke-static {v4, v1}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    :goto_2
    iput v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mTitleTextColor:I

    iput-boolean v6, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGeneratedTextColors:Z

    goto :goto_0

    :cond_3
    invoke-static {v5, v2}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    goto :goto_1

    :cond_4
    invoke-static {v5, v3}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    goto :goto_2
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Landroid/support/v7/graphics/Palette$Swatch;

    iget v2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    iget v3, p1, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    iget v3, p1, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    if-eq v2, v3, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public getBodyTextColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    invoke-direct {p0}, Landroid/support/v7/graphics/Palette$Swatch;->ensureTextColorsGenerated()V

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBodyTextColor:I

    return v0
.end method

.method public getHsl()[F
    .locals 4

    iget-object v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mHsl:[F

    if-nez v0, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mHsl:[F

    :cond_0
    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRed:I

    iget v1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mGreen:I

    iget v2, p0, Landroid/support/v7/graphics/Palette$Swatch;->mBlue:I

    iget-object v3, p0, Landroid/support/v7/graphics/Palette$Swatch;->mHsl:[F

    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/graphics/ColorUtils;->RGBToHSL(III[F)V

    iget-object v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mHsl:[F

    return-object v0
.end method

.method public getPopulation()I
    .locals 1

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    return v0
.end method

.method public getRgb()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    return v0
.end method

.method public getTitleTextColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    invoke-direct {p0}, Landroid/support/v7/graphics/Palette$Swatch;->ensureTextColorsGenerated()V

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mTitleTextColor:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroid/support/v7/graphics/Palette$Swatch;->mRgb:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/16 v2, 0x5d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " [RGB: #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/graphics/Palette$Swatch;->getRgb()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [HSL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/graphics/Palette$Swatch;->getHsl()[F

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [Population: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/graphics/Palette$Swatch;->mPopulation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [Title Text: #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/graphics/Palette$Swatch;->getTitleTextColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [Body Text: #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/graphics/Palette$Swatch;->getBodyTextColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
