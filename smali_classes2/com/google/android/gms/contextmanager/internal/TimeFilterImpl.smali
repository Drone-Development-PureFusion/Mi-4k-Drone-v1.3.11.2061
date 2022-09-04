.class public Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;",
            ">;"
        }
    .end annotation
.end field

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/q;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/ArrayList;[I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;",
            ">;[I)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->c:[I

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->a:I

    return v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->c:[I

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->b:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->b:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->c:[I

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->c:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->b:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->c:[I

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/q;->a(Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;Landroid/os/Parcel;I)V

    return-void
.end method
