.class public Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/wearable/internal/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/ai;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/ai;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->a:I

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/wearable/internal/x$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/x;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->b:Lcom/google/android/gms/wearable/internal/x;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->b:Lcom/google/android/gms/wearable/internal/x;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/wearable/internal/x;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->b:Lcom/google/android/gms/wearable/internal/x;

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->b:Lcom/google/android/gms/wearable/internal/x;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;->b:Lcom/google/android/gms/wearable/internal/x;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/internal/x;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ai;->a(Lcom/google/android/gms/wearable/internal/RemoveListenerRequest;Landroid/os/Parcel;I)V

    return-void
.end method
