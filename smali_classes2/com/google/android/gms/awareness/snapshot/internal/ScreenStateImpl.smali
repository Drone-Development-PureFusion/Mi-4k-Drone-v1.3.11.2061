.class public final Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/i;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->a:I

    iput p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->b:I

    return v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "ScreenState: SCREEN_OFF"

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "ScreenState: SCREEN_ON"

    goto :goto_0

    :cond_1
    const-string v0, "ScreenState: UNKNOWN"

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/i;->a(Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;Landroid/os/Parcel;I)V

    return-void
.end method
