.class public Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DriverLicense"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/g;


# instance fields
.field final a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/g;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->CREATOR:Lcom/google/android/gms/vision/barcode/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->a:I

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->j:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->k:Ljava/lang/String;

    iput-object p12, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->l:Ljava/lang/String;

    iput-object p13, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->m:Ljava/lang/String;

    iput-object p14, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->n:Ljava/lang/String;

    iput-object p15, p0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->CREATOR:Lcom/google/android/gms/vision/barcode/g;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/g;->a(Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;Landroid/os/Parcel;I)V

    return-void
.end method
