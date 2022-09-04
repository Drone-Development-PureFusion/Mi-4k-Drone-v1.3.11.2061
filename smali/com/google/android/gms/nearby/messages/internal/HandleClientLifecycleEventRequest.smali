.class public final Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/h;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;-><init>(ILcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->b:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    iput p3, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->c:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/h;->a(Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;Landroid/os/Parcel;I)V

    return-void
.end method
