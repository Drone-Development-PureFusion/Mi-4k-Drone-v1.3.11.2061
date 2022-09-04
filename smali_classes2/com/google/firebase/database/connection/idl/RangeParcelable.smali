.class Lcom/google/firebase/database/connection/idl/RangeParcelable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/firebase/database/connection/idl/k;


# instance fields
.field final a:I

.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/k;

    invoke-direct {v0}, Lcom/google/firebase/database/connection/idl/k;-><init>()V

    sput-object v0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->CREATOR:Lcom/google/firebase/database/connection/idl/k;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->a:I

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->c:Ljava/util/List;

    return-void
.end method

.method public static a(Lcom/google/firebase/database/connection/idl/RangeParcelable;Ljava/lang/Object;)Lcom/google/android/gms/internal/ht;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ht;

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/google/firebase/database/connection/idl/RangeParcelable;->c:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ht;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ht;)Lcom/google/firebase/database/connection/idl/RangeParcelable;
    .locals 4

    new-instance v0, Lcom/google/firebase/database/connection/idl/RangeParcelable;

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ht;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ht;->b()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/database/connection/idl/RangeParcelable;-><init>(ILjava/util/List;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/database/connection/idl/k;->a(Lcom/google/firebase/database/connection/idl/RangeParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
