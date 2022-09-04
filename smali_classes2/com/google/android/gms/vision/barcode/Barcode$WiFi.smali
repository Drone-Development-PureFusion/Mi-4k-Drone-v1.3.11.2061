.class public Lcom/google/android/gms/vision/barcode/Barcode$WiFi;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WiFi"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/n;

.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x3


# instance fields
.field final d:I

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/n;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->CREATOR:Lcom/google/android/gms/vision/barcode/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->d:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->d:I

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->f:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->g:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->CREATOR:Lcom/google/android/gms/vision/barcode/n;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/n;->a(Lcom/google/android/gms/vision/barcode/Barcode$WiFi;Landroid/os/Parcel;I)V

    return-void
.end method
