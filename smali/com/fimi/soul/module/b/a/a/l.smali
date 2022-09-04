.class public Lcom/fimi/soul/module/b/a/a/l;
.super Landroid/view/View;


# instance fields
.field private a:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    const/4 v7, 0x1

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/l;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/l;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const v1, -0x5f5f60

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v6

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/l;->getWidth()I

    move-result v3

    int-to-float v3, v3

    int-to-float v4, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v0, 0x40400000    # 3.0f

    iget v1, p0, Lcom/fimi/soul/module/b/a/a/l;->a:F

    mul-float/2addr v0, v1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x41000000    # 8.0f

    iget v1, p0, Lcom/fimi/soul/module/b/a/a/l;->a:F

    mul-float v2, v0, v1

    int-to-float v0, v6

    add-float v1, v0, v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/l;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v3, v0, v2

    int-to-float v0, v6

    sub-float v4, v0, v2

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    int-to-float v0, v6

    add-float v7, v0, v2

    int-to-float v0, v6

    sub-float v8, v0, v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/l;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v9, v0, v2

    move-object v6, p1

    move v10, v2

    move-object v11, v5

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setRatio(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/b/a/a/l;->a:F

    return-void
.end method
