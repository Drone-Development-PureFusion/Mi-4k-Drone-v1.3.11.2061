.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private b:I

.field private c:I

.field private d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/fragment/h;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b:I

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-void
.end method

.method constructor <init>(IIILcom/google/android/gms/wallet/fragment/WalletFragmentStyle;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a:I

    iput p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b:I

    iput p3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c:I

    iput-object p4, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    iput p5, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->e:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b:I

    return p1
.end method

.method public static a()Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$1;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget-object v0, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_appTheme:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_environment:I

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    sget v3, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_fragmentStyle:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    sget v4, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_fragmentMode:I

    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V

    iput v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c:I

    iput v2, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b:I

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    iget-object v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/Context;)V

    iput v4, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->e:I

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c:I

    return p1
.end method

.method static synthetic c(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->e:I

    return p1
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c:I

    return v0
.end method

.method public d()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->d:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->e:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/h;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Landroid/os/Parcel;I)V

    return-void
.end method
