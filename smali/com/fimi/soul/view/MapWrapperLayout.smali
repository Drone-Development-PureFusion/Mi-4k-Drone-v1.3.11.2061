.class public Lcom/fimi/soul/view/MapWrapperLayout;
.super Landroid/widget/RelativeLayout;


# instance fields
.field private a:Lcom/google/android/gms/maps/c;

.field private b:I

.field private c:Lcom/google/android/gms/maps/model/g;

.field private d:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/c;I)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->a:Lcom/google/android/gms/maps/c;

    iput p2, p0, Lcom/fimi/soul/view/MapWrapperLayout;->b:I

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/g;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->c:Lcom/google/android/gms/maps/model/g;

    iput-object p2, p0, Lcom/fimi/soul/view/MapWrapperLayout;->d:Landroid/view/View;

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->c:Lcom/google/android/gms/maps/model/g;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->c:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->a:Lcom/google/android/gms/maps/c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->d:Landroid/view/View;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->a:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/view/MapWrapperLayout;->c:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/h;->a(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v1

    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v2

    iget v3, v1, Landroid/graphics/Point;->x:I

    neg-int v3, v3

    iget-object v4, p0, Lcom/fimi/soul/view/MapWrapperLayout;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x3

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v1, v1, Landroid/graphics/Point;->y:I

    neg-int v1, v1

    iget-object v4, p0, Lcom/fimi/soul/view/MapWrapperLayout;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v1, v4

    iget v4, p0, Lcom/fimi/soul/view/MapWrapperLayout;->b:I

    add-int/2addr v1, v4

    int-to-float v1, v1

    invoke-virtual {v2, v3, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget-object v1, p0, Lcom/fimi/soul/view/MapWrapperLayout;->d:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    move v1, v0

    goto :goto_0
.end method
