.class public Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/f;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/f;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/f;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;->a:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/f;->a(Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;Landroid/os/Parcel;I)V

    return-void
.end method
