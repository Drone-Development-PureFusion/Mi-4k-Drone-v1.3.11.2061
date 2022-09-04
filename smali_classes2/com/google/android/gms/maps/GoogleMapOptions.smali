.class public final Lcom/google/android/gms/maps/GoogleMapOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/k;


# instance fields
.field private final a:I

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/lang/Boolean;

.field private d:I

.field private e:Lcom/google/android/gms/maps/model/CameraPosition;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/Boolean;

.field private k:Ljava/lang/Boolean;

.field private l:Ljava/lang/Boolean;

.field private m:Ljava/lang/Boolean;

.field private n:Ljava/lang/Boolean;

.field private o:Ljava/lang/Float;

.field private p:Ljava/lang/Float;

.field private q:Lcom/google/android/gms/maps/model/LatLngBounds;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/k;

    invoke-direct {v0}, Lcom/google/android/gms/maps/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/GoogleMapOptions;->CREATOR:Lcom/google/android/gms/maps/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->d:I

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->o:Ljava/lang/Float;

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->p:Ljava/lang/Float;

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->q:Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->a:I

    return-void
.end method

.method constructor <init>(IBBILcom/google/android/gms/maps/model/CameraPosition;BBBBBBBBBLjava/lang/Float;Ljava/lang/Float;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->d:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->o:Ljava/lang/Float;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->p:Ljava/lang/Float;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->q:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->a:I

    invoke-static {p2}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->b:Ljava/lang/Boolean;

    invoke-static {p3}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->c:Ljava/lang/Boolean;

    iput p4, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->d:I

    iput-object p5, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->e:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-static {p6}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->f:Ljava/lang/Boolean;

    invoke-static {p7}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->g:Ljava/lang/Boolean;

    invoke-static {p8}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->h:Ljava/lang/Boolean;

    invoke-static {p9}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->i:Ljava/lang/Boolean;

    invoke-static {p10}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->j:Ljava/lang/Boolean;

    invoke-static {p11}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->k:Ljava/lang/Boolean;

    invoke-static {p12}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->l:Ljava/lang/Boolean;

    invoke-static {p13}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->m:Ljava/lang/Boolean;

    invoke-static/range {p14 .. p14}, Lcom/google/android/gms/maps/a/m;->a(B)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->n:Ljava/lang/Boolean;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->o:Ljava/lang/Float;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->p:Ljava/lang/Float;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->q:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/R$styleable;->MapAttrs:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/GoogleMapOptions;-><init>()V

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_mapType:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_mapType:I

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(I)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_1
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_zOrderOnTop:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_zOrderOnTop:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_2
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_useViewLifecycle:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_3

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_useViewLifecycle:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->b(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_3
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiCompass:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_4

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiCompass:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->d(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_4
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiRotateGestures:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_5

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiRotateGestures:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->h(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_5
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiScrollGestures:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_6

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiScrollGestures:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->e(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_6
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiTiltGestures:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_7

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiTiltGestures:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->g(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_7
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomGestures:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_8

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomGestures:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->f(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_8
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomControls:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_9

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomControls:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->c(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_9
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_liteMode:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_a

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_liteMode:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->i(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_a
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiMapToolbar:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_b

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiMapToolbar:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->j(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_b
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_ambientEnabled:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_c

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_ambientEnabled:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->k(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_c
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraMinZoomPreference:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_d

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraMinZoomPreference:I

    const/high16 v3, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(F)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_d
    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraMinZoomPreference:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_e

    sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraMaxZoomPreference:I

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->b(F)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_e
    invoke-static {p0, p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-static {p0, p1}, Lcom/google/android/gms/maps/model/CameraPosition;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_0
.end method


# virtual methods
.method public A()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->p:Ljava/lang/Float;

    return-object v0
.end method

.method public B()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->q:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->a:I

    return v0
.end method

.method public a(F)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->o:Ljava/lang/Float;

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->d:I

    return-object p0
.end method

.method public a(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->e:Lcom/google/android/gms/maps/model/CameraPosition;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->q:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method b()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->b:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public b(F)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->p:Ljava/lang/Float;

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method c()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->c:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public c(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->f:Ljava/lang/Boolean;

    return-object p0
.end method

.method d()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->f:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public d(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method e()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->g:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public e(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method f()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->h:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public f(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method g()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->i:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public g(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->j:Ljava/lang/Boolean;

    return-object p0
.end method

.method h()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->j:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public h(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->k:Ljava/lang/Boolean;

    return-object p0
.end method

.method i()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->k:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public i(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->l:Ljava/lang/Boolean;

    return-object p0
.end method

.method j()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->l:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public j(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->m:Ljava/lang/Boolean;

    return-object p0
.end method

.method k()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->m:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public k(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->n:Ljava/lang/Boolean;

    return-object p0
.end method

.method l()B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->n:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/m;->a(Ljava/lang/Boolean;)B

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public n()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->d:I

    return v0
.end method

.method public p()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->e:Lcom/google/android/gms/maps/model/CameraPosition;

    return-object v0
.end method

.method public q()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method public r()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public s()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public t()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->i:Ljava/lang/Boolean;

    return-object v0
.end method

.method public u()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->j:Ljava/lang/Boolean;

    return-object v0
.end method

.method public v()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method public w()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->l:Ljava/lang/Boolean;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/k;->a(Lcom/google/android/gms/maps/GoogleMapOptions;Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->m:Ljava/lang/Boolean;

    return-object v0
.end method

.method public y()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->n:Ljava/lang/Boolean;

    return-object v0
.end method

.method public z()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->o:Ljava/lang/Float;

    return-object v0
.end method
