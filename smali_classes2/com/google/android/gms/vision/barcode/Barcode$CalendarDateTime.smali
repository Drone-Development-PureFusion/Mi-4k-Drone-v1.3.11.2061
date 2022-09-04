.class public Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CalendarDateTime"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/d;


# instance fields
.field final a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/d;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->CREATOR:Lcom/google/android/gms/vision/barcode/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->a:I

    return-void
.end method

.method public constructor <init>(IIIIIIIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->a:I

    iput p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->b:I

    iput p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->c:I

    iput p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->d:I

    iput p5, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->e:I

    iput p6, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->f:I

    iput p7, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->g:I

    iput-boolean p8, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->h:Z

    iput-object p9, p0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;->CREATOR:Lcom/google/android/gms/vision/barcode/d;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/d;->a(Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;Landroid/os/Parcel;I)V

    return-void
.end method
