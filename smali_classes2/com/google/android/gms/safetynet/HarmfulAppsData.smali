.class public Lcom/google/android/gms/safetynet/HarmfulAppsData;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/safetynet/HarmfulAppsData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/safetynet/f;

    invoke-direct {v0}, Lcom/google/android/gms/safetynet/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/safetynet/HarmfulAppsData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;[BI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/safetynet/HarmfulAppsData;->a:I

    iput-object p2, p0, Lcom/google/android/gms/safetynet/HarmfulAppsData;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/safetynet/HarmfulAppsData;->c:[B

    iput p4, p0, Lcom/google/android/gms/safetynet/HarmfulAppsData;->d:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/safetynet/f;->a(Lcom/google/android/gms/safetynet/HarmfulAppsData;Landroid/os/Parcel;I)V

    return-void
.end method
