.class public final Lcom/google/android/gms/maps/model/TileOverlayOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/ac;


# instance fields
.field private final a:I

.field private b:Lcom/google/android/gms/maps/model/a/j;

.field private c:Lcom/google/android/gms/maps/model/l;

.field private d:Z

.field private e:F

.field private f:Z

.field private g:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/ac;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/ac;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->CREATOR:Lcom/google/android/gms/maps/model/ac;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean v1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->d:Z

    iput-boolean v1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->g:F

    iput v1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->a:I

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;ZFZF)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->d:Z

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->g:F

    iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->a:I

    invoke-static {p2}, Lcom/google/android/gms/maps/model/a/j$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/j;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->b:Lcom/google/android/gms/maps/model/a/j;

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->b:Lcom/google/android/gms/maps/model/a/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->c:Lcom/google/android/gms/maps/model/l;

    iput-boolean p3, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->d:Z

    iput p4, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->e:F

    iput-boolean p5, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->f:Z

    iput p6, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->g:F

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/TileOverlayOptions$1;-><init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/a/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->b:Lcom/google/android/gms/maps/model/a/j;

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->a:I

    return v0
.end method

.method public a(F)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->e:F

    return-object p0
.end method

.method public a(Lcom/google/android/gms/maps/model/l;)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->c:Lcom/google/android/gms/maps/model/l;

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->c:Lcom/google/android/gms/maps/model/l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->b:Lcom/google/android/gms/maps/model/a/j;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;-><init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;Lcom/google/android/gms/maps/model/l;)V

    goto :goto_0
.end method

.method public a(Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->d:Z

    return-object p0
.end method

.method b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->b:Lcom/google/android/gms/maps/model/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/j;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public b(F)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Transparency must be in the range [0..1]"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->g:F

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->f:Z

    return-object p0
.end method

.method public c()Lcom/google/android/gms/maps/model/l;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->c:Lcom/google/android/gms/maps/model/l;

    return-object v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->e:F

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->d:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->f:Z

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->g:F

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/ac;->a(Lcom/google/android/gms/maps/model/TileOverlayOptions;Landroid/os/Parcel;I)V

    return-void
.end method
