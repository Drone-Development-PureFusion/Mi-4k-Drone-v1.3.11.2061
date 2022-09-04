.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$c;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$d;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$a;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field b:Landroid/os/Bundle;

.field c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/fragment/i;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonAppearanceDefault"

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoImageTypeDefault"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    iput p3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c:I

    return-void
.end method

.method private static a(JLandroid/util/DisplayMetrics;)I
    .locals 4

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    long-to-int v0, v0

    long-to-int v1, p0

    sparse-switch v0, :sswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected unit or type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_0
    move v0, v1

    :goto_0
    return v0

    :sswitch_1
    invoke-static {v1, p2}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v0, v1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x2

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x3

    goto :goto_1

    :sswitch_6
    const/4 v0, 0x4

    goto :goto_1

    :sswitch_7
    const/4 v0, 0x5

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
        0x3 -> :sswitch_5
        0x4 -> :sswitch_6
        0x5 -> :sswitch_7
        0x80 -> :sswitch_1
        0x81 -> :sswitch_0
    .end sparse-switch
.end method

.method private static a(II)J
    .locals 6

    int-to-long v0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private static a(Landroid/util/TypedValue;)J
    .locals 4

    iget v0, p0, Landroid/util/TypedValue;->type:I

    sparse-switch v0, :sswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget v1, p0, Landroid/util/TypedValue;->type:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected dimension type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    iget v0, p0, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->o(I)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :sswitch_1
    const/16 v0, 0x80

    iget v1, p0, Landroid/util/TypedValue;->data:I

    invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(II)J

    move-result-wide v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method private a(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/util/TypedValue;)J

    move-result-wide v2

    invoke-virtual {v1, p3, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method private a(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Landroid/util/TypedValue;->type:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    iget v1, v0, Landroid/util/TypedValue;->type:I

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, p3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v1, p4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, p3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private static c(IF)J
    .locals 3

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unrecognized unit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-static {p0, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(II)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static o(I)J
    .locals 3

    if-gez p0, :cond_2

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 v0, -0x2

    if-ne p0, v0, :cond_1

    :cond_0
    const/16 v0, 0x81

    invoke-static {v0, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(II)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unexpected dimension value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    int-to-float v1, p0

    invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c(IF)J

    move-result-wide v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(JLandroid/util/DisplayMetrics;)I

    move-result p3

    :cond_0
    return p3
.end method

.method public a(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c:I

    return-object p0
.end method

.method public a(IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonHeight"

    invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c(IF)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c:I

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/gms/R$style;->WalletFragmentDefaultStyle:I

    :goto_0
    sget-object v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle:[I

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonWidth:I

    const-string v2, "buyButtonWidth"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonHeight:I

    const-string v2, "buyButtonHeight"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonText:I

    const-string v2, "buyButtonText"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonAppearance:I

    const-string v2, "buyButtonAppearance"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsTextAppearance:I

    const-string v2, "maskedWalletDetailsTextAppearance"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I

    const-string v2, "maskedWalletDetailsHeaderTextAppearance"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsBackground:I

    const-string v2, "maskedWalletDetailsBackgroundColor"

    const-string v3, "maskedWalletDetailsBackgroundResource"

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I

    const-string v2, "maskedWalletDetailsButtonTextAppearance"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonBackground:I

    const-string v2, "maskedWalletDetailsButtonBackgroundColor"

    const-string v3, "maskedWalletDetailsButtonBackgroundResource"

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I

    const-string v2, "maskedWalletDetailsLogoTextColor"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoImageType:I

    const-string v2, "maskedWalletDetailsLogoImageType"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_0
    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c:I

    goto :goto_0
.end method

.method public b(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonText"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public b(IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonWidth"

    invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->c(IF)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonHeight"

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->o(I)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonWidth"

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->o(I)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public e(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "buyButtonAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public f(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public g(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsHeaderTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public h(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundResource"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public i(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundColor"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundResource"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public j(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public k(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundResource"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public l(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundColor"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundResource"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public m(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoImageType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public n(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoTextColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/i;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;Landroid/os/Parcel;I)V

    return-void
.end method
