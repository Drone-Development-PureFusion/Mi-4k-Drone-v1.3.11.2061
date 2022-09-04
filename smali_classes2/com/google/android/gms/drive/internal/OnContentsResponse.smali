.class public Lcom/google/android/gms/drive/internal/OnContentsResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OnContentsResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/drive/Contents;

.field final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/u;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/Contents;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->b:Lcom/google/android/gms/drive/Contents;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->b:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->c:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/drive/internal/OnContentsResponse;Landroid/os/Parcel;I)V

    return-void
.end method
