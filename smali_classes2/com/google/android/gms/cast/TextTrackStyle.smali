.class public final Lcom/google/android/gms/cast/TextTrackStyle;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/TextTrackStyle;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:F = 1.0f

.field public static final b:I = 0x0

.field public static final c:I = -0x1

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x3

.field public static final h:I = 0x4

.field public static final i:I = -0x1

.field public static final j:I = 0x0

.field public static final k:I = 0x1

.field public static final l:I = 0x2

.field public static final m:I = -0x1

.field public static final n:I = 0x0

.field public static final o:I = 0x1

.field public static final p:I = 0x2

.field public static final q:I = 0x3

.field public static final r:I = 0x4

.field public static final s:I = 0x5

.field public static final t:I = 0x6

.field public static final u:I = -0x1

.field public static final v:I = 0x0

.field public static final w:I = 0x1

.field public static final x:I = 0x2

.field public static final y:I = 0x3


# instance fields
.field private final A:I

.field private B:F

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Ljava/lang/String;

.field private K:I

.field private L:I

.field private M:Lorg/json/JSONObject;

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/r;

    invoke-direct {v0}, Lcom/google/android/gms/cast/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/TextTrackStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    const/4 v10, 0x0

    const/4 v5, -0x1

    const/4 v3, 0x0

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v0, p0

    move v4, v3

    move v6, v3

    move v7, v5

    move v8, v3

    move v9, v3

    move v11, v5

    move v12, v5

    move-object v13, v10

    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/cast/TextTrackStyle;-><init>(IFIIIIIIILjava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method constructor <init>(IFIIIIIIILjava/lang/String;IILjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->A:I

    iput p2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    iput p3, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    iput p4, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    iput p5, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    iput p6, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    iput p7, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    iput p8, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    iput p9, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    iput-object p10, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    iput p11, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    iput p12, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    iput-object p13, p0, Lcom/google/android/gms/cast/TextTrackStyle;->z:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->z:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->z:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/cast/TextTrackStyle;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v1, Lcom/google/android/gms/cast/TextTrackStyle;

    invoke-direct {v1}, Lcom/google/android/gms/cast/TextTrackStyle;-><init>()V

    invoke-static {}, Lcom/google/android/gms/common/util/s;->h()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/CaptioningManager;

    invoke-virtual {v0}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->a(F)V

    invoke-virtual {v0}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object v0

    iget v2, v0, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->backgroundColor:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->b(I)V

    iget v2, v0, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->foregroundColor:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->a(I)V

    iget v2, v0, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeType:I

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/TextTrackStyle;->c(I)V

    :goto_1
    iget v2, v0, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeColor:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->d(I)V

    invoke-virtual {v0}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v2, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v0}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v4}, Lcom/google/android/gms/cast/TextTrackStyle;->h(I)V

    :goto_2
    invoke-virtual {v0}, Landroid/graphics/Typeface;->isBold()Z

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Typeface;->isItalic()Z

    move-result v0

    if-eqz v2, :cond_5

    if-eqz v0, :cond_5

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->i(I)V

    :cond_1
    :goto_3
    move-object v0, v1

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1, v4}, Lcom/google/android/gms/cast/TextTrackStyle;->c(I)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {v1, v5}, Lcom/google/android/gms/cast/TextTrackStyle;->c(I)V

    goto :goto_1

    :cond_2
    sget-object v2, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v0}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/TextTrackStyle;->h(I)V

    goto :goto_2

    :cond_3
    sget-object v2, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v0}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1, v5}, Lcom/google/android/gms/cast/TextTrackStyle;->h(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/TextTrackStyle;->h(I)V

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v1, v4}, Lcom/google/android/gms/cast/TextTrackStyle;->i(I)V

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {v1, v5}, Lcom/google/android/gms/cast/TextTrackStyle;->i(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/TextTrackStyle;->i(I)V

    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/lang/String;)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x3

    :try_start_0
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x5

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x7

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, 0x7

    const/16 v5, 0x9

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v4, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private j(I)Ljava/lang/String;
    .locals 4

    const-string v0, "#%02X%02X%02X%02X"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->A:I

    return v0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    return-void
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x2

    const/4 v4, 0x0

    const-string v0, "fontScale"

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    const-string v0, "foregroundColor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    const-string v0, "backgroundColor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    const-string v0, "edgeType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "edgeType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NONE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iput v4, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    :cond_0
    :goto_0
    const-string v0, "edgeColor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    const-string v0, "windowType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "windowType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NONE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    iput v4, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    :cond_1
    :goto_1
    const-string v0, "windowColor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    if-ne v0, v5, :cond_2

    const-string v0, "windowRoundedCornerRadius"

    invoke-virtual {p1, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    :cond_2
    const-string v0, "fontFamily"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    const-string v0, "fontGenericFamily"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "fontGenericFamily"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SANS_SERIF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iput v4, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    :cond_3
    :goto_2
    const-string v0, "fontStyle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "fontStyle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NORMAL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iput v4, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    :cond_4
    :goto_3
    const-string v0, "customData"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    return-void

    :cond_5
    const-string v1, "OUTLINE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iput v6, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    goto/16 :goto_0

    :cond_6
    const-string v1, "DROP_SHADOW"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iput v5, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    goto/16 :goto_0

    :cond_7
    const-string v1, "RAISED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iput v7, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    goto/16 :goto_0

    :cond_8
    const-string v1, "DEPRESSED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v8, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    goto/16 :goto_0

    :cond_9
    const-string v1, "NORMAL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iput v6, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    goto/16 :goto_1

    :cond_a
    const-string v1, "ROUNDED_CORNERS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput v5, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    goto/16 :goto_1

    :cond_b
    const-string v1, "MONOSPACED_SANS_SERIF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    iput v6, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto :goto_2

    :cond_c
    const-string v1, "SERIF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iput v5, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto :goto_2

    :cond_d
    const-string v1, "MONOSPACED_SERIF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iput v7, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto/16 :goto_2

    :cond_e
    const-string v1, "CASUAL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iput v8, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto/16 :goto_2

    :cond_f
    const-string v1, "CURSIVE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v0, 0x5

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto/16 :goto_2

    :cond_10
    const-string v1, "SMALL_CAPITALS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x6

    iput v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    goto/16 :goto_2

    :cond_11
    const-string v1, "BOLD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    iput v6, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    goto/16 :goto_3

    :cond_12
    const-string v1, "ITALIC"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    iput v5, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    goto/16 :goto_3

    :cond_13
    const-string v1, "BOLD_ITALIC"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iput v7, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    goto/16 :goto_3
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    return v0
.end method

.method public c(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x4

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid edgeType"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    return v0
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    return-void
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    return v0
.end method

.method public e(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid windowType"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, p1, :cond_1

    move v2, v1

    :cond_0
    :goto_0
    return v2

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/cast/TextTrackStyle;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/TextTrackStyle;

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-nez v3, :cond_4

    move v3, v1

    :goto_2
    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    iget-object v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    invoke-static {v0, v3}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    cmpl-float v0, v0, v3

    if-nez v0, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    if-ne v0, v3, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    iget v3, p1, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    if-ne v0, v3, :cond_5

    :goto_3
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    move v1, v2

    goto :goto_3
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    return v0
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    return-void
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    return v0
.end method

.method public g(I)V
    .locals 2

    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid windowCornerRadius"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    return-void
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    return v0
.end method

.method public h(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x6

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid fontGenericFamily"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    return-void
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    return v0
.end method

.method public i(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid fontStyle"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    return v0
.end method

.method public m()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    return-object v0
.end method

.method public n()Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "fontScale"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->B:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    if-eqz v1, :cond_0

    const-string v1, "foregroundColor"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->C:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    if-eqz v1, :cond_1

    const-string v1, "backgroundColor"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->D:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->E:I

    packed-switch v1, :pswitch_data_0

    :goto_0
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    if-eqz v1, :cond_2

    const-string v1, "edgeColor"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->F:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    packed-switch v1, :pswitch_data_1

    :goto_1
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    if-eqz v1, :cond_3

    const-string v1, "windowColor"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->H:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/TextTrackStyle;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->G:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    const-string v1, "windowRoundedCornerRadius"

    iget v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->I:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v1, "fontFamily"

    iget-object v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->J:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->K:I

    packed-switch v1, :pswitch_data_2

    :goto_2
    iget v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->L:I

    packed-switch v1, :pswitch_data_3

    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-eqz v1, :cond_6

    const-string v1, "customData"

    iget-object v2, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_4
    return-object v0

    :pswitch_0
    const-string v1, "edgeType"

    const-string v2, "NONE"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_4

    :pswitch_1
    const-string v1, "edgeType"

    const-string v2, "OUTLINE"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_2
    const-string v1, "edgeType"

    const-string v2, "DROP_SHADOW"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_3
    const-string v1, "edgeType"

    const-string v2, "RAISED"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_4
    const-string v1, "edgeType"

    const-string v2, "DEPRESSED"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :pswitch_5
    const-string v1, "windowType"

    const-string v2, "NONE"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :pswitch_6
    const-string v1, "windowType"

    const-string v2, "NORMAL"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :pswitch_7
    const-string v1, "windowType"

    const-string v2, "ROUNDED_CORNERS"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :pswitch_8
    const-string v1, "fontGenericFamily"

    const-string v2, "SANS_SERIF"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :pswitch_9
    const-string v1, "fontGenericFamily"

    const-string v2, "MONOSPACED_SANS_SERIF"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :pswitch_a
    const-string v1, "fontGenericFamily"

    const-string v2, "SERIF"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :pswitch_b
    const-string v1, "fontGenericFamily"

    const-string v2, "MONOSPACED_SERIF"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :pswitch_c
    const-string v1, "fontGenericFamily"

    const-string v2, "CASUAL"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :pswitch_d
    const-string v1, "fontGenericFamily"

    const-string v2, "CURSIVE"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_2

    :pswitch_e
    const-string v1, "fontGenericFamily"

    const-string v2, "SMALL_CAPITALS"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_2

    :pswitch_f
    const-string v1, "fontStyle"

    const-string v2, "NORMAL"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    :pswitch_10
    const-string v1, "fontStyle"

    const-string v2, "BOLD"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    :pswitch_11
    const-string v1, "fontStyle"

    const-string v2, "ITALIC"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    :pswitch_12
    const-string v1, "fontStyle"

    const-string v2, "BOLD_ITALIC"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->z:Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/r;->a(Lcom/google/android/gms/cast/TextTrackStyle;Landroid/os/Parcel;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/TextTrackStyle;->M:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
