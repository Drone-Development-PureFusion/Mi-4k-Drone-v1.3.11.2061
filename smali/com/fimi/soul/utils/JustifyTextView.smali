.class public Lcom/fimi/soul/utils/JustifyTextView;
.super Landroid/widget/TextView;


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p1, p0, Lcom/fimi/soul/utils/JustifyTextView;->c:Landroid/content/Context;

    return-void
.end method

.method private a(Landroid/graphics/Canvas;ILjava/lang/String;F)V
    .locals 8

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3}, Lcom/fimi/soul/utils/JustifyTextView;->a(ILjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "  "

    iget v2, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    int-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/StaticLayout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v1

    add-float/2addr v0, v1

    const/4 v1, 0x3

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    :cond_0
    iget v1, p0, Lcom/fimi/soul/utils/JustifyTextView;->b:I

    int-to-float v1, v1

    sub-float/2addr v1, p4

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v1, v2

    const/4 v1, 0x0

    move v7, v1

    move v1, v0

    move v0, v7

    :goto_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/StaticLayout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v4

    iget v5, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v6

    invoke-virtual {p1, v3, v1, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-float v3, v4, v2

    add-float/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(ILjava/lang/String;)Z
    .locals 5

    const/16 v4, 0x20

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x3

    if-le v2, v3, :cond_0

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_0

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_0

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getCurrentTextColor()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/text/TextPaint;->setColor(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getDrawableState()[I

    move-result-object v0

    iput-object v0, v2, Landroid/text/TextPaint;->drawableState:[I

    iget-object v0, p0, Lcom/fimi/soul/utils/JustifyTextView;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/utils/JustifyTextView;->b:I

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput v1, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    iget v3, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getTextSize()F

    move-result v4

    add-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getLayout()Landroid/text/Layout;

    move-result-object v3

    :goto_0
    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v4

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v7

    invoke-static {v0, v4, v5, v7}, Landroid/text/StaticLayout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v5

    invoke-direct {p0, v6}, Lcom/fimi/soul/utils/JustifyTextView;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-eq v1, v7, :cond_0

    invoke-direct {p0, p1, v4, v6, v5}, Lcom/fimi/soul/utils/JustifyTextView;->a(Landroid/graphics/Canvas;ILjava/lang/String;F)V

    :goto_1
    iget v4, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    invoke-virtual {p0}, Lcom/fimi/soul/utils/JustifyTextView;->getLineHeight()I

    move-result v5

    add-int/2addr v4, v5

    iput v4, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    iget v5, p0, Lcom/fimi/soul/utils/JustifyTextView;->a:I

    int-to-float v5, v5

    const/high16 v7, 0x40a00000    # 5.0f

    sub-float/2addr v5, v7

    invoke-virtual {p1, v6, v4, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    return-void
.end method
