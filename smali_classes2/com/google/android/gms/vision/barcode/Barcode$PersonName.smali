.class public Lcom/google/android/gms/vision/barcode/Barcode$PersonName;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PersonName"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/j;


# instance fields
.field final a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/j;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->CREATOR:Lcom/google/android/gms/vision/barcode/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->a:I

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$PersonName;->CREATOR:Lcom/google/android/gms/vision/barcode/j;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/j;->a(Lcom/google/android/gms/vision/barcode/Barcode$PersonName;Landroid/os/Parcel;I)V

    return-void
.end method
