.class public Lcom/google/android/gms/vision/barcode/Barcode$Email;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Email"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/h;

.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2


# instance fields
.field final d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/h;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->CREATOR:Lcom/google/android/gms/vision/barcode/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->d:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->d:I

    iput p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->e:I

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->f:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->g:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Email;->CREATOR:Lcom/google/android/gms/vision/barcode/h;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/h;->a(Lcom/google/android/gms/vision/barcode/Barcode$Email;Landroid/os/Parcel;I)V

    return-void
.end method
