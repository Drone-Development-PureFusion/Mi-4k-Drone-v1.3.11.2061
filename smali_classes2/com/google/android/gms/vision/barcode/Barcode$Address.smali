.class public Lcom/google/android/gms/vision/barcode/Barcode$Address;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Address"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/b;

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2


# instance fields
.field final a:I

.field public e:I

.field public f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/b;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->CREATOR:Lcom/google/android/gms/vision/barcode/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->a:I

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->a:I

    iput p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->e:I

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->f:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Address;->CREATOR:Lcom/google/android/gms/vision/barcode/b;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/b;->a(Lcom/google/android/gms/vision/barcode/Barcode$Address;Landroid/os/Parcel;I)V

    return-void
.end method
