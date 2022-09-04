.class public Lcom/google/android/gms/vision/barcode/Barcode;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;,
        Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;,
        Lcom/google/android/gms/vision/barcode/Barcode$Address;,
        Lcom/google/android/gms/vision/barcode/Barcode$PersonName;,
        Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;,
        Lcom/google/android/gms/vision/barcode/Barcode$CalendarDateTime;,
        Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;,
        Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;,
        Lcom/google/android/gms/vision/barcode/Barcode$WiFi;,
        Lcom/google/android/gms/vision/barcode/Barcode$Sms;,
        Lcom/google/android/gms/vision/barcode/Barcode$Phone;,
        Lcom/google/android/gms/vision/barcode/Barcode$Email;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/c;

.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x4

.field public static final e:I = 0x8

.field public static final f:I = 0x10

.field public static final g:I = 0x20

.field public static final h:I = 0x40

.field public static final i:I = 0x80

.field public static final j:I = 0x100

.field public static final k:I = 0x200

.field public static final l:I = 0x400

.field public static final m:I = 0x800

.field public static final n:I = 0x1000

.field public static final o:I = 0x1

.field public static final p:I = 0x2

.field public static final q:I = 0x3

.field public static final r:I = 0x4

.field public static final s:I = 0x5

.field public static final t:I = 0x6

.field public static final u:I = 0x7

.field public static final v:I = 0x8

.field public static final w:I = 0x9

.field public static final x:I = 0xa

.field public static final y:I = 0xb

.field public static final z:I = 0xc


# instance fields
.field final A:I

.field public B:I

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:I

.field public F:[Landroid/graphics/Point;

.field public G:Lcom/google/android/gms/vision/barcode/Barcode$Email;

.field public H:Lcom/google/android/gms/vision/barcode/Barcode$Phone;

.field public I:Lcom/google/android/gms/vision/barcode/Barcode$Sms;

.field public J:Lcom/google/android/gms/vision/barcode/Barcode$WiFi;

.field public K:Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;

.field public L:Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;

.field public M:Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;

.field public N:Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;

.field public O:Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/c;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode;->CREATOR:Lcom/google/android/gms/vision/barcode/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode;->A:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;I[Landroid/graphics/Point;Lcom/google/android/gms/vision/barcode/Barcode$Email;Lcom/google/android/gms/vision/barcode/Barcode$Phone;Lcom/google/android/gms/vision/barcode/Barcode$Sms;Lcom/google/android/gms/vision/barcode/Barcode$WiFi;Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode;->A:I

    iput p2, p0, Lcom/google/android/gms/vision/barcode/Barcode;->B:I

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode;->C:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/vision/barcode/Barcode;->D:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/vision/barcode/Barcode;->E:I

    iput-object p6, p0, Lcom/google/android/gms/vision/barcode/Barcode;->F:[Landroid/graphics/Point;

    iput-object p7, p0, Lcom/google/android/gms/vision/barcode/Barcode;->G:Lcom/google/android/gms/vision/barcode/Barcode$Email;

    iput-object p8, p0, Lcom/google/android/gms/vision/barcode/Barcode;->H:Lcom/google/android/gms/vision/barcode/Barcode$Phone;

    iput-object p9, p0, Lcom/google/android/gms/vision/barcode/Barcode;->I:Lcom/google/android/gms/vision/barcode/Barcode$Sms;

    iput-object p10, p0, Lcom/google/android/gms/vision/barcode/Barcode;->J:Lcom/google/android/gms/vision/barcode/Barcode$WiFi;

    iput-object p11, p0, Lcom/google/android/gms/vision/barcode/Barcode;->K:Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;

    iput-object p12, p0, Lcom/google/android/gms/vision/barcode/Barcode;->L:Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;

    iput-object p13, p0, Lcom/google/android/gms/vision/barcode/Barcode;->M:Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;

    iput-object p14, p0, Lcom/google/android/gms/vision/barcode/Barcode;->N:Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;

    iput-object p15, p0, Lcom/google/android/gms/vision/barcode/Barcode;->O:Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Rect;
    .locals 7

    const v2, 0x7fffffff

    const/high16 v1, -0x80000000

    const/4 v0, 0x0

    move v3, v1

    move v4, v2

    :goto_0
    iget-object v5, p0, Lcom/google/android/gms/vision/barcode/Barcode;->F:[Landroid/graphics/Point;

    array-length v5, v5

    if-ge v0, v5, :cond_0

    iget-object v5, p0, Lcom/google/android/gms/vision/barcode/Barcode;->F:[Landroid/graphics/Point;

    aget-object v5, v5, v0

    iget v6, v5, Landroid/graphics/Point;->x:I

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v6, v5, Landroid/graphics/Point;->x:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v6, v5, Landroid/graphics/Point;->y:I

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v5, v5, Landroid/graphics/Point;->y:I

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v4, v2, v3, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode;->CREATOR:Lcom/google/android/gms/vision/barcode/c;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/c;->a(Lcom/google/android/gms/vision/barcode/Barcode;Landroid/os/Parcel;I)V

    return-void
.end method
