.class public Lcom/google/android/gms/vision/barcode/Barcode$Sms;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Sms"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/l;


# instance fields
.field final a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/l;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->CREATOR:Lcom/google/android/gms/vision/barcode/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->a:I

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->CREATOR:Lcom/google/android/gms/vision/barcode/l;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/l;->a(Lcom/google/android/gms/vision/barcode/Barcode$Sms;Landroid/os/Parcel;I)V

    return-void
.end method
