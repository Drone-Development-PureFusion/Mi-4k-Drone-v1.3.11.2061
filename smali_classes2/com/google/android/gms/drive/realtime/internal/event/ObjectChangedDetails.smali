.class public Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:I

.field final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/realtime/internal/event/b;

    invoke-direct {v0}, Lcom/google/android/gms/drive/realtime/internal/event/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;->a:I

    iput p2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;->b:I

    iput p3, p0, Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;->c:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/b;->a(Lcom/google/android/gms/drive/realtime/internal/event/ObjectChangedDetails;Landroid/os/Parcel;I)V

    return-void
.end method
