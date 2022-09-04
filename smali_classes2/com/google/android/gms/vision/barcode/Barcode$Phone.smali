.class public Lcom/google/android/gms/vision/barcode/Barcode$Phone;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Phone"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/k;

.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4


# instance fields
.field final f:I

.field public g:I

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/k;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->CREATOR:Lcom/google/android/gms/vision/barcode/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->f:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->f:I

    iput p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->g:I

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->CREATOR:Lcom/google/android/gms/vision/barcode/k;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/k;->a(Lcom/google/android/gms/vision/barcode/Barcode$Phone;Landroid/os/Parcel;I)V

    return-void
.end method
